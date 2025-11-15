package com.fatma.formationmicroservice.restControllers;

import com.fatma.formationmicroservice.dto.APIResponseDto;
import com.fatma.formationmicroservice.service.FormationService;
import lombok.AllArgsConstructor;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/formations")
@AllArgsConstructor
public class FormationController {

    private FormationService formationService;

    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getFormationById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(
                formationService.getFormationById(id),
                HttpStatus.OK
        );
    }
}
