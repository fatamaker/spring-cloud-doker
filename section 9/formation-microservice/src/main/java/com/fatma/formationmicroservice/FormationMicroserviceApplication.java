package com.fatma.formationmicroservice;

import com.fatma.formationmicroservice.entites.Formation;
import com.fatma.formationmicroservice.repos.FormationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;



@SpringBootApplication
@EnableFeignClients
public class FormationMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FormationMicroserviceApplication.class, args);
    }

    @Bean
    public WebClient webClient(){
        return WebClient.builder().build();
    }

    @Bean
    CommandLineRunner commandLineRunner(FormationRepository formationRepository) {
        return args -> {
            formationRepository.save(Formation.builder()
                    .nomFormation("Spring Boot Avancé")
                    .modeFormation("Présentiel")
                    .themeCode("INFO")
                    .build());
        };
    }

}
