package app.entity;

import org.springframework.stereotype.Component;

@Component
public class Pills implements Treatment {
    @Override
    public void apply(Patient patient) {
        System.out.println("drink pills 1 week");
    }
}
