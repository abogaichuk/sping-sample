package app.controllers;

import app.annotations.CoronaController;
import app.entity.Patient;
import app.services.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@CoronaController
public class HospitalCtl {

    @Autowired
    private Hospital hospital;

    @PostMapping("/heal")
    public Patient process(@RequestBody Patient patient) {
        hospital.processPatient(patient);
        return patient;
    }
}
