package app.entity;

import app.annotations.InjectList;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Doctor implements Healer {

    @InjectList({Pills.class, Vitamins.class})
    private List<Treatment> treatments;

    @Override
    public void heal(Patient patient) {
        System.out.println("let me find a treatment");
        treatments.forEach(treatment -> treatment.apply(patient));
    }

    @Override
    public String myType() {
        return Healer.TRADITIONAL;
    }
}
