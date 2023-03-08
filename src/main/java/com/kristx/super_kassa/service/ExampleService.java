package com.kristx.super_kassa.service;

import com.kristx.super_kassa.dto.RequestAddValueDto;
import com.kristx.super_kassa.dto.ResponseAddValueDto;

public interface ExampleService {

    ResponseAddValueDto addValue(RequestAddValueDto requestDto);
}
