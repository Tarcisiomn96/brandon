package com.testes.unitarios.model;

import com.testes.unitarios.model.cargo.Cargo;
import lombok.Builder;
import lombok.Data;

@Data
public class Funcionario {

    private String nome;
    private Cargo cargo;
    private String salario;
    private Integer anosCompletosDeCasa;

}
