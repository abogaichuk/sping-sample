package app;

import app.annotations.InjectListBPP;
import app.controllers.CoronaControllerAdvice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//https://www.youtube.com/watch?v=GL1txFxswHA
//mvn spring-boot:run
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

//    @Bean("healers")
//    public Map<String, Healer> healers(List<Healer> list) {
//        return list.stream().collect(Collectors.toMap(Healer::myType, Function.identity()));
//    }

    @Bean
    public InjectListBPP injectListBPP() {
        return new InjectListBPP();
    }

    @Bean
    public CoronaControllerAdvice coronaControllerAdvice() {
        return new CoronaControllerAdvice();
    }
}
