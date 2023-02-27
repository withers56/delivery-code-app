package com.example.deliverycode.web;

import com.example.deliverycode.data.Code;
import com.example.deliverycode.data.CodeRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@AllArgsConstructor
@RequestMapping(value = "/api/codes", headers = "Accept=application/json")
public class CodeController {

    private final CodeRepository codeRepository;

    @GetMapping
    private List<Code> getAllCodes() {
        return codeRepository.findAll();
    }
}
