package com.abrazoarchived.common.backend.api;

import com.abrazoarchived.common.backend.dto.UniversityDTO;
import com.abrazoarchived.common.backend.service.UniversityService;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/university")
public class UniversityHttpController {
    private final UniversityService universityService;

    public UniversityHttpController(UniversityService universityService) {
        this.universityService = universityService;
    }

    @PostMapping(consumes = "application/json")
    public String save(@RequestBody UniversityDTO universityDTO) {
        String message = universityService.save(universityDTO);
        return message;

    }
}
