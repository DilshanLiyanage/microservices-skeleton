package com.tharusha.vaccinationcenterservice.repositories;


import com.tharusha.vaccinationcenterservice.models.VaccinatedCitizens;
import com.tharusha.vaccinationcenterservice.models.VaccinationCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccinationCenterRepo extends JpaRepository<VaccinationCenter, Integer>{

}
