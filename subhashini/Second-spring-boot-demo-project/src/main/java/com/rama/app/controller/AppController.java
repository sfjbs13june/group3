package com.rama.app.controller;

import com.rama.app.data.Patient;
import com.rama.app.data.Patient;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.List;


@RestController
public class AppController {
    @GetMapping("/get/patient/{name}")
    public String getDetail(@PathVariable String name) {
        return name;
    }

    @PostMapping("/post/patientdetails/")
    Patient postEmployee(@RequestBody Patient newEmployee) {
        return newEmployee;
    }

    @PutMapping("/put/{name}")
    String putEmployee(@RequestBody Patient newEmployee, @PathVariable String name) {
        return newEmployee.toString() + ":Updated with name:" + name;
    }

    @DeleteMapping("/delete/{name}")
    String deleteEmployee(@PathVariable String name) {
        return name;
    }




    private boolean isHeaderMissing(final HttpHeaders header, final String headerKey) {

        if (!header.containsKey(headerKey)) {
            return true;
        }
        return false;
    }

}
