package com.kristx.super_kassa.controller;

import com.kristx.super_kassa.dto.RequestAddValueDto;
import com.kristx.super_kassa.dto.ResponseAddValueDto;
import com.kristx.super_kassa.service.ExampleServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/sk")
public class ExampleController {
    private final ExampleServiceImpl service;

    @PostMapping(value = "/modify")
    public ResponseEntity<ResponseAddValueDto>postSk(
            @RequestBody RequestAddValueDto requestDto){
        return ResponseEntity.ok(service.addValue(requestDto));
    }
}
