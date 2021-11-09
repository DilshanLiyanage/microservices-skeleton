package com.tharusha.citizenservice.services;

import com.tharusha.citizenservice.models.Citizen;
import com.tharusha.citizenservice.repositories.CitizenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitizenService {

    @Autowired
    CitizenRepository citizenRepository;

    public Citizen saveCitizen(Citizen citizen){
        return citizenRepository.save(citizen);
    }

    public List<Citizen> fetchCitizens(Integer id){
        return citizenRepository.findByVaccinationCenterId(id);
    }

}
