package com.application.rest.apirelacion.persistence;

import com.application.rest.apirelacion.entities.MakerEntity;

import java.util.List;
import java.util.Optional;

public interface IMakerDAO {

    List<MakerEntity> findAll();

    Optional<MakerEntity> findById(Long id);

    void save(MakerEntity maker);

    void deleteById(Long id);
}
