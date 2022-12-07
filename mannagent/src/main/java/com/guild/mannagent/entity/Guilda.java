package com.guild.mannagent.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Guilda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Guilda")
    private Long id;
    @Column
    private String nome;
    @Column
    private Long carteira;
    @Column
    private Long rank;

    @ManyToMany(mappedBy = "guildas")
    private Collection<Administrador> administradores;



}
