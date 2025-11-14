package com.fatma.formationmicroservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ThemeDto {
    private Long id;
    private String nomTheme;
    private String codeTheme;
}
