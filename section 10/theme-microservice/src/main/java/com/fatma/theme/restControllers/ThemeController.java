package com.fatma.theme.restControllers;

import com.fatma.theme.config.Configuration;
import com.fatma.theme.dto.ThemeDto;
import com.fatma.theme.service.ThemeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/themes")



public class ThemeController {

    private ThemeService themeService;
    @Value("${build.version}")
    private String buildVersion;

    public ThemeController(ThemeService themeService) {
        this.themeService = themeService;
    }

    @Autowired
    Configuration configuration;

    @GetMapping("{code}")
    public ResponseEntity<ThemeDto> getThemeByCode(@PathVariable("code") String code) {
        return new ResponseEntity<>(
                themeService.getThemeByCode(code),
                HttpStatus.OK
        );
    }

    @GetMapping("/version")
    public ResponseEntity<String> version()
    {
        return ResponseEntity.status(HttpStatus.OK).body(buildVersion);
    }

    @GetMapping("/author")
    public ResponseEntity<String> retrieveAuthorInfo() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(configuration.getName()+" "+configuration.getEmail() );
    }

}
