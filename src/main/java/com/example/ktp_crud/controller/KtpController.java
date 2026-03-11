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

    @PostMapping(
            path = "/ktp",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, Object>> addKtp(@RequestBody KtpAddRequest request) {
        KtpDto result = ktpService.addKtp(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of(
                "status", "success",
                "message", "Data KTP berhasil ditambahkan",
                "data", result
        ));
    }

    @GetMapping(
            path = "/ktp",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, Object>> getAllKtp() {
        List<KtpDto> result = ktpService.getAllKtp();
        return ResponseEntity.status(HttpStatus.OK).body(Map.of(
                "status", "success",
                "data", result
        ));
    }


}