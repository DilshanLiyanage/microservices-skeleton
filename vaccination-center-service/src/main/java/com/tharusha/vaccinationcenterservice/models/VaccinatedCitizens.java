package com.tharusha.vaccinationcenterservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VaccinatedCitizens {

    private VaccinationCenter vaccinationCenter;
    private List<Citizen> citizenList;
}
