package app.entity;

import app.annotations.InjectList;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Shaman implements Healer {
    @InjectList({Horilka.class, Sauna.class})
    private List<Treatment> treatments;

    @Override
    public void heal(Patient patient) {
        System.out.println("let me find a treatment");
        treatments.forEach(treatment -> treatment.apply(patient));
    }

    @Override
    public String myType() {
        return Healer.FOLK;
    }
}
