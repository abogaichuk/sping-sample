package app;

import app.annotations.InjectListBPP;
import app.controllers.CoronaControllerAdvice;
import app.entity.Healer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//https://www.youtube.com/watch?v=GL1txFxswHA
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
