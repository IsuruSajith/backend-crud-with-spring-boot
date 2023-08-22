package com.abrazoarchived.common.backend.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/student")
public class StudentHttpController {

    @PostMapping
    public String saveStudent() {
        return "saved";
    }
}
