package app.entity;

import org.springframework.stereotype.Component;

@Component
public class Mushrooms implements Treatment {
    @Override
    public void apply(Patient patient) {
        System.out.println("drink mushrooms tea today");
    }
}
