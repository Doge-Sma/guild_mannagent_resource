package com.guild.mannagent.repository;

import com.guild.mannagent.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository <Item, Long>{
    
}
