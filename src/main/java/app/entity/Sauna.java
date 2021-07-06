package app.entity;

import org.springframework.stereotype.Component;

@Component
public class Sauna implements Treatment {
    @Override
    public void apply(Patient patient) {
        System.out.println("get sauna twice a week");
    }
}
