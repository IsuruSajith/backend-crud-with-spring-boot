package com.abrazoarchived.common.backend.api;

import com.abrazoarchived.common.backend.dto.SampleDTO;
import com.abrazoarchived.common.backend.service.SampleService;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/samples")
@CrossOrigin
public class SampleRestController1 {

    private final SampleService sampleService;

    public SampleRestController1(SampleService sampleService) {
        this.sampleService = sampleService;
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "application/json")
    public void saveSample(@RequestBody @Validated SampleDTO sampleDTO) {
        sampleService.saveSample(sampleDTO);
    }


    @ResponseStatus(HttpStatus.NOT_FOUND)
    @PatchMapping(value = "/{reg}")
    public void updateSample(@PathVariable String reg, @RequestBody @Validated SampleDTO sampleDTO) {
        sampleDTO.setReg(reg);
        sampleService.updateSample(sampleDTO);
    }

    @DeleteMapping
    public void deleteSample() {
        System.out.println("delete");
    }

    @GetMapping
    public void getSample() {
        System.out.println("get");
    }

}
