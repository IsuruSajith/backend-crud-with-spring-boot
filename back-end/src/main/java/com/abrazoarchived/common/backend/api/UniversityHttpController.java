package com.abrazoarchived.common.backend.api;

import com.abrazoarchived.common.backend.dto.UniversityDTO;
import com.abrazoarchived.common.backend.service.CrudService;
import com.abrazoarchived.common.backend.service.UniversityService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/university")
public class UniversityHttpController {
    private final UniversityService universityService;

    private final CrudService crudService;
    public UniversityHttpController(UniversityService universityService, CrudService crudService) {
        this.universityService = universityService;
        this.crudService = crudService;
    }

    @PostMapping(consumes = "application/json")
    public String save(@RequestBody UniversityDTO universityDTO) {
        String message = universityService.save(universityDTO);
        return message;

    }

    @GetMapping(
            path = "/{pk}"
    )
    public Optional findById(@PathVariable("pk") int pk) throws Exception {

        Optional universityDTO = crudService.findById(pk);
        return universityDTO;
    }
}
