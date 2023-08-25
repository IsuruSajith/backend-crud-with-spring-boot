package com.abrazoarchived.common.backend.api;

import com.abrazoarchived.common.backend.dto.UniversityDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/university")
public class UniversityHttpController {
    @PostMapping(consumes = "application/json")
    public String save(@RequestBody UniversityDTO universityDTO) {
        return null;
    }
}
