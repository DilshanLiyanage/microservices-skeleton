package com.tharusha.citizenservice.controllers;

import com.tharusha.citizenservice.models.Citizen;
import com.tharusha.citizenservice.services.CitizenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

@RestController
@RequestMapping("/citizen")
public class CitizenController {

    @Autowired
    CitizenService citizenService;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public ResponseEntity<Citizen> saveCitizen(@RequestBody Citizen citizen){
        Citizen citizenRes = citizenService.saveCitizen(citizen);
        return ResponseEntity.ok().body(citizenRes);
    }

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public ResponseEntity<List<Citizen>> fetchCitizens(@PathVariable Integer id){
        List<Citizen> citzens = citizenService.fetchCitizens(id);
        return ResponseEntity.ok().body(citzens);
    }
}
