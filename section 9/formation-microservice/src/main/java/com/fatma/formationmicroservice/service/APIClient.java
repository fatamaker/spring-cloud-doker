package com.fatma.formationmicroservice.service;



import com.fatma.formationmicroservice.dto.ThemeDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url = "http://localhost:8091", value = "THEME")
@FeignClient(name = "THEME")
public interface APIClient {

    @GetMapping("api/themes/{theme-code}")
    ThemeDto getThemeByCode(@PathVariable("theme-code") String themeCode);
}
