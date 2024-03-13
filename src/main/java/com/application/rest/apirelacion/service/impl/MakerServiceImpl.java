package com.application.rest.apirelacion.service.impl;

import com.application.rest.apirelacion.entities.MakerEntity;
import com.application.rest.apirelacion.persistence.IMakerDAO;
import com.application.rest.apirelacion.service.IMakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;
import java.util.List;
import java.util.Optional;

@Service
public class MakerServiceImpl implements IMakerService {

    private static final Logger logger = Logger.getLogger(MakerServiceImpl.class.getName());

    @Autowired
    private IMakerDAO makerDAO;

    @Override
    public List<MakerEntity> findAll() {
        return makerDAO.findAll();
    }

    @Override
    public Optional<MakerEntity> findById(Long id) {
        logger.info("Se llama al método findById con el ID: " + id);
        return makerDAO.findById(id);
    }

    @Override
    public void save(MakerEntity maker) {
        makerDAO.save(maker);
    }

    @Override
    public void deleteById(Long id) {
        makerDAO.deleteById(id);
    }
}
