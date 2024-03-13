package com.application.rest.apirelacion.service;

import com.application.rest.apirelacion.entities.MakerEntity;

import java.util.List;
import java.util.Optional;

public interface IMakerService {
    List<MakerEntity> findAll();

    Optional<MakerEntity> findById(Long id);

    void save(MakerEntity maker);

    void deleteById(Long id);
}
