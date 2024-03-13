package com.application.rest.apirelacion.repository;

import com.application.rest.apirelacion.entities.MakerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MakerRepository extends CrudRepository<MakerEntity,Long> {
}
