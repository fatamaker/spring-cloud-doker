package com.fatma.formationmicroservice.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class APIResponseDto {
    private FormationDto formationDto;
    private ThemeDto themeDto;
}
