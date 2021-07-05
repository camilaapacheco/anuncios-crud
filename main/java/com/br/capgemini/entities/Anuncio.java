package com.br.capgemini.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Table(name = "anuncio")
public class Anuncio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeAnuncio;

    private Date dataInicio;

    private Date dataFim;

    private float investimentoDia;

    private Cliente cliente;

}
