package com.example.ktp_crud.controller;

import com.example.ktp_crud.model.dto.KtpAddRequest;
import com.example.ktp_crud.model.dto.KtpDto;
import com.example.ktp_crud.service.KtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class KtpController {

    @Autowired
    private KtpService ktpService;


}