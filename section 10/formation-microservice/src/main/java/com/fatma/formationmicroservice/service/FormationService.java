package com.fatma.formationmicroservice.service;


import com.fatma.formationmicroservice.dto.APIResponseDto;
import com.fatma.formationmicroservice.dto.FormationDto;

public interface FormationService {
    APIResponseDto getFormationById(Long id);
}
