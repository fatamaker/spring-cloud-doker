package com.fatma.theme;

import com.fatma.theme.entities.Theme;
import com.fatma.theme.repos.ThemeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ThemeMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThemeMicroserviceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(ThemeRepository themeRepository) {
        return args -> {
            themeRepository.save(Theme.builder()
                    .nomTheme("Informatique")
                    .codeTheme("INFO")
                    .build());
            themeRepository.save(Theme.builder()
                    .nomTheme("Gestion")
                    .codeTheme("GEST")
                    .build());
        };
    }

}
