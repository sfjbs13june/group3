package com.rama.app.controller;

import org.springframework.stereotype.Component;

@Component
public class Hospital {
    private final Result result;

    public Hospital(Result result) {
        this.result = result;
    }
    public String details(String name) {

        return name;
    }

    public String patAddre(String address) {

        return address;
    }

    public int id(int id) {

        return id;
    }
    public String Result() {
        String data = result.doTheOperation();
        return data + ":" + "operation done";
    }

}
