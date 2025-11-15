package com.fatma.theme.service;

import com.fatma.theme.dto.ThemeDto;
import com.fatma.theme.entities.Theme;
import com.fatma.theme.repos.ThemeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ThemeServiceImpl implements ThemeService {

    @Autowired
    ThemeRepository themeRepository;

    @Override
    public ThemeDto getThemeByCode(String code) {
        Theme theme = themeRepository.findByCodeTheme(code);
        return new ThemeDto(
                theme.getId(),
                theme.getNomTheme(),
                theme.getCodeTheme()
        );
    }
}
