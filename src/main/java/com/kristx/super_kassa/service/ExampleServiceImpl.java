package com.kristx.super_kassa.service;

import com.kristx.super_kassa.dto.RequestAddValueDto;
import com.kristx.super_kassa.dto.ResponseAddValueDto;
import com.kristx.super_kassa.entity.Example;
import com.kristx.super_kassa.exception.EntityNotFoundException;
import com.kristx.super_kassa.repository.ExampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExampleServiceImpl implements ExampleService {

    private final ExampleRepository exampleRepository;

    @Override
    public ResponseAddValueDto addValue(RequestAddValueDto requestDto) {
        Example example = exampleRepository.findById(requestDto.getId()).orElseThrow(EntityNotFoundException::new);
        int newObjValue = example.addObj(requestDto.getAdd());
        exampleRepository.save(example);
        return new ResponseAddValueDto(newObjValue);
    }
}
