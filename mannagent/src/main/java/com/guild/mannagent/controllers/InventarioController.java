package com.guild.mannagent.controllers;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guild.mannagent.dto.InventarioDTO;
import com.guild.mannagent.entity.Inventario;
import com.guild.mannagent.services.InventarioService;

import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/inventarios")
@AllArgsConstructor
@Api(description = "Inventario Services HTTP methods", tags = "Inventario Services")
public class InventarioController {
    InventarioService inventarioService;
    ModelMapper modelMapper;

    
    public List<InventarioDTO> convertListDTO(List<Inventario> inventarios){
        List<InventarioDTO> save = new ArrayList();
        inventarios.forEach(inventario ->{
            save.add(convertDTO(inventario));
        });

        return save;
    }

    public InventarioDTO convertDTO(Inventario inventario){
        return modelMapper.map(inventario, InventarioDTO.class);
    }

    public Inventario convertEntity(InventarioDTO inventarioDTO){
        return modelMapper.map(inventarioDTO, Inventario.class);
    }

}
