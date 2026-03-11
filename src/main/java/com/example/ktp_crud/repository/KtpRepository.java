package com.example.ktp_crud.repository;

import com.example.ktp_crud.model.entity.Ktp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface KtpRepository extends JpaRepository<Ktp, Integer> {
    Optional<Ktp> findByNomorKtp(String nomorKtp);
}