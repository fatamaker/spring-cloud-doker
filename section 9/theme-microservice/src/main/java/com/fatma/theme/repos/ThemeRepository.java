package com.fatma.theme.repos;

import com.fatma.theme.entities.Theme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThemeRepository extends JpaRepository<Theme, Long> {
    Theme findByCodeTheme(String code);
}