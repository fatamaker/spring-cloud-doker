package com.fatma.formationmicroservice.service;


import com.fatma.formationmicroservice.dto.*;
import com.fatma.formationmicroservice.entites.Formation;
import com.fatma.formationmicroservice.repos.FormationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class FormationServiceImpl implements FormationService {

    private FormationRepository formationRepository;
    private APIClient apiClient;

    @Override
    public APIResponseDto getFormationById(Long id) {
        Formation formation = formationRepository.findById(id).get();

        ThemeDto themeDto = apiClient.getThemeByCode(formation.getThemeCode());

        FormationDto formationDto = new FormationDto(
                formation.getId(),
                formation.getNomFormation(),
                formation.getModeFormation(),
                formation.getThemeCode()
        );

        return new APIResponseDto(formationDto, themeDto);
    }
}
