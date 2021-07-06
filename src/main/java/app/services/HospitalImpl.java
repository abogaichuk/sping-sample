package app.services;

import app.entity.Healer;
import app.entity.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class HospitalImpl implements Hospital {
//    @Autowired
//    @Qualifier("healers")
    private Map<String, Healer> healers = new HashMap<>();


    @Override
    public void register(String type, Healer healer) {
        healers.put(type, healer);
    }

    @Override
    public void processPatient(Patient patient) {
        Healer healer = healers.get(patient.getMethod());
        if (healer == null)
            healer = healers.get(Healer.DEFAULT);
        healer.heal(patient);
    }
}
