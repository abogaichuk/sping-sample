package app.entity;

import app.services.Hospital;
import org.springframework.beans.factory.annotation.Autowired;

public interface Healer {
    void heal(Patient patient);
    String myType();

    @Autowired
    default void regMe(Hospital hospital) {
        hospital.register(myType(), this);
    }

    String TRADITIONAL = "traditional";
    String FOLK = "folk";
    String WITCH = "witch";
    String DEFAULT = "default";
}
