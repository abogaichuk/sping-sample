package app.entity;

import org.springframework.stereotype.Component;

@Component
public class MagicHealer implements Healer {
    @Override
    public void heal(Patient patient) {
        System.out.println("i'm a magic healer!!");
    }

    @Override
    public String myType() {
        return "magic";
    }
}
