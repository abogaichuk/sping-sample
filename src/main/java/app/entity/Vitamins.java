package app.entity;

import org.springframework.stereotype.Component;

@Component
public class Vitamins implements Treatment {
    @Override
    public void apply(Patient patient) {
        System.out.println("get vitamins everyday");
    }
}
