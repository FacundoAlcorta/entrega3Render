package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.MaterialComunalDeposit;
import com.example.demo.models.enums.Material;

import java.util.List;

@Repository
public interface MaterialComunalDepositRepository extends JpaRepository<MaterialComunalDeposit, Long> {

    List<MaterialComunalDeposit> findByMaterial(Material material);

    List<MaterialComunalDeposit> findByMaterialAndComunalDepositId(Material material, Long comunalDepositId);


}