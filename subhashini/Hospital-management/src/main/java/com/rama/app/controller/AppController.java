package com.rama.app.controller;

import com.rama.app.data.Employee;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.List;


@RestController
public class AppController {

    private final Hospital hospital;

    public AppController(Hospital hospital){ this.hospital = hospital;}
    @GetMapping("/details")
    public String getDetails(@RequestParam(name = "a", required = true) String a)
    {
        String name = hospital.details(a);
        return name;
    }

    @GetMapping("/patAddre")
    public String getAddress(@RequestParam(name = "b", required = true) String b)
    {
        String address = hospital.patAddre(b);
        return address;
    }

    @GetMapping("/id")
    public int getId(@RequestParam(name = "c", required = true) int c) {
        int id = hospital.id(c);
        return id;
    }

    @PostMapping("/post")
    Employee postEmployee(@RequestBody Employee newEmployee) {
        return newEmployee;
    }

    @PutMapping("/put/{name}")
    String putEmployee(@RequestBody Employee newEmployee, @PathVariable String name) {
        return newEmployee.toString() + ":Updated with name:" + name;
    }

    @DeleteMapping("/delete/{name}")
    String deleteEmployee(@PathVariable String name) {
        return name;
    }

    @GetMapping("/path/{name}")
    public String getPathVar(@PathVariable("name") String name) {
        return "Path Variable:" + name;
    }

    @GetMapping("/request")
    public String getRequestparam(@RequestParam(name = "name", required = true, defaultValue = "rama") String name) {
        return "Request Param:" + name;
    }

    @GetMapping("/request/params")
    public String getRequestparams(@RequestParam List<String> id) {
        return "Request Param:" + id;
    }


    @GetMapping("/header")
    public ResponseEntity<String> getRequestparam(@RequestHeader HttpHeaders header) {

        if (isHeaderMissing(header, "name")) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        HttpHeaders responseHeader = new HttpHeaders();
        responseHeader.setExpires(ZonedDateTime.now()
                .plusDays(1));
        String response = "Valid Header";
        return ResponseEntity.ok()
                .headers(responseHeader)
                .body(response);
    }

    private boolean isHeaderMissing(final HttpHeaders header, final String headerKey) {

        if (!header.containsKey(headerKey)) {
            return true;
        }
        return false;
    }

}
