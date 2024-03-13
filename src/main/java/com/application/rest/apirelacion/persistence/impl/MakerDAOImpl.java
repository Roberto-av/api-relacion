package com.application.rest.apirelacion.persistence.impl;

import com.application.rest.apirelacion.entities.MakerEntity;
import com.application.rest.apirelacion.persistence.IMakerDAO;
import com.application.rest.apirelacion.repository.MakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

import java.util.List;
import java.util.Optional;

@Component
public class MakerDAOImpl implements IMakerDAO {

    private static final Logger logger = Logger.getLogger(MakerDAOImpl.class.getName());

    @Autowired
    private MakerRepository makerRepository;
    @Override
    public List<MakerEntity> findAll() {
        return (List<MakerEntity>) makerRepository.findAll();
    }

    @Override
    public Optional<MakerEntity> findById(Long id) {
        logger.info("Se llama al método findById con el ID: " + id);
        return makerRepository.findById(id);
    }

    @Override
    public void save(MakerEntity maker) {
        makerRepository.save(maker);
    }

    @Override
    public void deleteById(Long id) {
        makerRepository.deleteById(id);
    }
}
