package com.br.capgemini.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;

    private String nomeCliente;

    private Integer tipoCliente;

    private String numContato;

    private String nrDocumento;

    public Cliente(Long idCliente, String nomeCliente, Integer tipoCliente, String numContato, String nrDocumento) {
        this.idCliente = idCliente;
        this.nomeCliente = nomeCliente;
        this.tipoCliente = tipoCliente;
        this.numContato = numContato;
        this.nrDocumento = nrDocumento;
    }
}
