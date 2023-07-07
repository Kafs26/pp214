package app.config;


import app.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

    @Bean (name="dog")
    public Dog dogBean(){
        return new Dog();
    }

    @Bean (name="cat")
    public Cat catBean(){
        return new Cat();
    }

    @Bean (name="timer")
    public Timer timerBean(){
        return new Timer();
    }
}
