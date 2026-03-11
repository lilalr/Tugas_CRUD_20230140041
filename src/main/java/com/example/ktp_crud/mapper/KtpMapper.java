package com.example.ktp_crud.mapper;

import com.example.ktp_crud.model.dto.KtpAddRequest;
import com.example.ktp_crud.model.dto.KtpDto;
import com.example.ktp_crud.model.entity.Ktp;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface KtpMapper {
    KtpMapper MAPPER = Mappers.getMapper(KtpMapper.class);
    KtpDto toKtpDto(Ktp ktp);
    Ktp toEntity(KtpAddRequest request);
}