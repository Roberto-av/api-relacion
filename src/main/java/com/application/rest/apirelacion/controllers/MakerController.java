package com.application.rest.apirelacion.controllers;

import com.application.rest.apirelacion.controllers.dto.MakerDTO;
import com.application.rest.apirelacion.entities.MakerEntity;
import com.application.rest.apirelacion.service.IMakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/maker")
public class MakerController {
    private static final Logger logger = Logger.getLogger(MakerController.class.getName());

    @Autowired
    private IMakerService makerService;

    @GetMapping("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Long id){
        logger.info("Se recibió una solicitud para buscar el fabricante con el ID: " + id);
        Optional<MakerEntity> makerEntityOptional = makerService.findById(id);

        if(makerEntityOptional.isPresent()){
            MakerEntity maker = makerEntityOptional.get();
            MakerDTO makerDTO = MakerDTO.builder()
                    .id(maker.getId())
                    .name(maker.getName())
                    .productEntityList(maker.getProductEntityList())
                    .build();
            return ResponseEntity.ok(makerDTO);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/findAll")
    public ResponseEntity<?> findAll(){
        List<MakerDTO> makerDTOList = makerService.findAll()
                .stream()
                .map(maker -> MakerDTO.builder()
                        .id(maker.getId())
                        .name(maker.getName())
                        .productEntityList(maker.getProductEntityList())
                        .build())
                .toList();
        return ResponseEntity.ok(makerDTOList);
    }

}
