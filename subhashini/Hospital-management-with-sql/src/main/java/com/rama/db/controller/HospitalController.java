package com.rama.db.controller;

import com.rama.db.model.Hospital;
import com.rama.db.model.Patient;
import com.rama.db.repository.HospitalDataRepository;
import com.rama.db.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/message")
public class HospitalController {

    @Autowired
    HospitalDataRepository hospitalDataRepository;

    @GetMapping(value = "/read")
    public @ResponseBody
    Iterable<Hospital> getAll() {
        return hospitalDataRepository.findAll();
    }

    @PostMapping(value = "/create")
    public @ResponseBody
    String store(@RequestBody final Hospital message) {
        hospitalDataRepository.save(message);
        return "saved";
    }
}
