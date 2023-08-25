package com.abrazoarchived.common.backend.api;

import com.abrazoarchived.common.backend.dto.SampleDTO;
import com.abrazoarchived.common.backend.service.SampleService;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/samples")
@CrossOrigin
public class SampleRestController {

    private final SampleService sampleService;

    public SampleRestController(SampleService sampleService) {
        this.sampleService = sampleService;
    }


    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = "application/json")
    public void saveSample(@RequestBody @Validated SampleDTO sampleDTO) {
        sampleService.saveSample(sampleDTO);
    }


    @ResponseStatus(HttpStatus.NOT_FOUND)
    @PatchMapping(value = "/{reg}", consumes = "application/json")
    public void updateSample(@PathVariable String reg, @RequestBody @Validated SampleDTO sampleDTO) {
        sampleDTO.setReg(reg);
        sampleService.updateSample(sampleDTO);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{reg}")
    public void deleteSample(@PathVariable String reg) {
        sampleService.deleteSample(reg);
    }

    @GetMapping("/{reg}")
    public SampleDTO getSample(@PathVariable String reg) {
        return sampleService.getSample(reg);
    }

    @GetMapping("/find/{query}")
    public List<SampleDTO> findSample(@PathVariable String query) {
        List<SampleDTO> sample = sampleService.findSample(query);
        return sample;
    }

}
