package com.fatma.formationmicroservice.dto;



import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FormationDto {
    private Long id;
    private String nomFormation;
    private String modeFormation;
    private String themeCode;
}
