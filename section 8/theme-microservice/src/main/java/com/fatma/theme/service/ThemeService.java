package com.fatma.theme.service;

import com.fatma.theme.dto.ThemeDto;

public interface ThemeService {
    ThemeDto getThemeByCode(String code);
}
