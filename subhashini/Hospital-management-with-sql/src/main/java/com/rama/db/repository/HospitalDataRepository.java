package com.rama.db.repository;

import com.rama.db.model.Hospital;
import com.rama.db.model.Patient;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface HospitalDataRepository extends CrudRepository<Hospital, Integer> {
}

