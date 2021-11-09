package com.tharusha.vaccinationcenterservice.services;

import com.tharusha.vaccinationcenterservice.models.Citizen;
import com.tharusha.vaccinationcenterservice.models.VaccinatedCitizens;
import com.tharusha.vaccinationcenterservice.models.VaccinationCenter;
import com.tharusha.vaccinationcenterservice.repositories.VaccinationCenterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class VaccinationCenterService {

    @Autowired
    VaccinationCenterRepo vaccinationCenterRepo;

    @Autowired
    RestTemplate restTemplate;

    public VaccinationCenter saveVaccinationCenter(VaccinationCenter vaccinationCenter){
        return vaccinationCenterRepo.save(vaccinationCenter);
    }

    public VaccinatedCitizens fetchVccinatedCitizens(Integer id){
        VaccinatedCitizens vaccinatedCitizens = new VaccinatedCitizens();

        VaccinationCenter vaccinationCenter = vaccinationCenterRepo.findById(id).get();
        vaccinatedCitizens.setVaccinationCenter(vaccinationCenter);

        List<Citizen> listOfCitizen = restTemplate.getForObject("http://CITIZEN-SERVICE/citizen/id/"+id, List.class);
        vaccinatedCitizens.setCitizenList(listOfCitizen);

        return vaccinatedCitizens;
    }
}
