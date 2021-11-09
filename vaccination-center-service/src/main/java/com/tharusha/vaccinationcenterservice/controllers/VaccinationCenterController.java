package com.tharusha.vaccinationcenterservice.controllers;

import com.tharusha.vaccinationcenterservice.models.VaccinatedCitizens;
import com.tharusha.vaccinationcenterservice.models.VaccinationCenter;
import com.tharusha.vaccinationcenterservice.services.VaccinationCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vaccination")
public class VaccinationCenterController {

    @Autowired
    VaccinationCenterService vaccinationCenterService;

    @RequestMapping(value = "/center", method = RequestMethod.POST)
    public ResponseEntity<VaccinationCenter> saveVaccinationCenter(@RequestBody VaccinationCenter vaccinationCenter) {
        VaccinationCenter vaccinationCentRes = vaccinationCenterService.saveVaccinationCenter(vaccinationCenter);
        return ResponseEntity.ok().body(vaccinationCentRes);
    }

    @RequestMapping(value = "/center/{id}")
    public ResponseEntity<VaccinatedCitizens> fetchVccinatedCitizens(@PathVariable Integer id){
        VaccinatedCitizens vaccinatedCitizens = vaccinationCenterService.fetchVccinatedCitizens(id);
        return ResponseEntity.ok().body(vaccinatedCitizens);
    }
}