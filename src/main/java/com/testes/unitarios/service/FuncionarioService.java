package com.testes.unitarios.service;

import com.testes.unitarios.model.Funcionario;
import com.testes.unitarios.model.cargo.Cargo;

public class FuncionarioService {

    public Funcionario promocaoDeCargo(Funcionario funcionario){

        Cargo cargoAtual = funcionario.getCargo();
        Cargo proximoCargo = cargoAtual.getProximoCargo();
        Integer anosCompletosDeCasa = funcionario.getAnosCompletosDeCasa();

        if(proximoCargo != null && anosCompletosDeCasa > 1){

            funcionario.setCargo(proximoCargo);
            funcionario.setSalario(proximoCargo.getSalario());

        }

        return funcionario;

    }

}
