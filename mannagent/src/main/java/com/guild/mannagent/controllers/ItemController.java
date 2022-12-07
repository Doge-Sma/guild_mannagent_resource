package com.guild.mannagent.controllers;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guild.mannagent.dto.ItemDTO;
import com.guild.mannagent.entity.Item;
import com.guild.mannagent.services.ItemService;

import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/itens")
@AllArgsConstructor
@Api(description = "Item Services HTTP methods", tags = "Item Services")
public class ItemController {
    ItemService itemService;
    ModelMapper modelMapper;


    public List<ItemDTO> convertListDTO(List<Item> itens){
        List<ItemDTO> save = new ArrayList();
        itens.forEach(item ->{
            save.add(convertDTO(item));
        });

        return save;
    }

    public ItemDTO convertDTO(Item item){
        return modelMapper.map(item, ItemDTO.class);
    }

    public Item convertEntity(ItemDTO itemDTO){
        return modelMapper.map(itemDTO, Item.class);
    }
}
