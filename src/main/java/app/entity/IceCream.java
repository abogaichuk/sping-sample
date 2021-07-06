package app.entity;

import org.springframework.stereotype.Component;

@Component
public class IceCream implements Treatment {
    @Override
    public void apply(Patient patient) {
        System.out.println("eat icecream");
    }
}
