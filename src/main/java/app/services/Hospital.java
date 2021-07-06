package app.services;

import app.entity.Healer;
import app.entity.Patient;

public interface Hospital {
    void register(String type, Healer healer);

    void processPatient(Patient patient);
}
