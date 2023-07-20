package com.abrazoarchived.common.backend.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/samples")
@CrossOrigin
public class SampleRestController1 {
    @GetMapping
    public void getSample() {
        System.out.println("get");
    }

    @DeleteMapping
    public void deleteSample() {
        System.out.println("delete");
    }

    @PatchMapping
    public void updateSample() {
        System.out.println("patch");
    }

    @PostMapping
    public void saveSample() {
        System.out.println("post");
    }

}
