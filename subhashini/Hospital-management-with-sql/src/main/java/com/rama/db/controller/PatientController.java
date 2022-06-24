package com.rama.db.controller;

import com.rama.db.model.Patient;
import com.rama.db.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Properties;

@Controller
@RequestMapping(value = "/patient")
public class PatientController {

    @Autowired
    PatientRepository patientRepository;

    @GetMapping(value = "/read")
    public @ResponseBody
    Iterable<Patient> getAll() {
        return patientRepository.findAll();
    }

    @PostMapping(value = "/create")
    public @ResponseBody
    String store(@RequestBody final Patient users) {

        patientRepository.save(users);
        return "saved";
    }
}
