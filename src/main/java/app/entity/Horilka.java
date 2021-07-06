package app.entity;

import org.springframework.stereotype.Component;

@Component
public class Horilka implements Treatment {
    @Override
    public void apply(Patient patient) {
        System.out.println("drink 0.5 of horilka!!!");
    }
}
