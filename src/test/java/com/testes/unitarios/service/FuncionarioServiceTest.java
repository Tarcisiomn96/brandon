package com.testes.unitarios.service;

import com.testes.unitarios.model.Funcionario;
import com.testes.unitarios.model.cargo.Cargo;
import com.testes.unitarios.model.cargo.DesenvolvedorJunior;
import com.testes.unitarios.model.cargo.DesenvolvedorPleno;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioServiceTest {

    private FuncionarioService service;

    private Funcionario funcionario;
    private Cargo cargo;


    @BeforeEach
    public void before(){

        service = new FuncionarioService();
        funcionario =  new Funcionario();
        cargo = new DesenvolvedorJunior();
    }

    @Test
    void funcionarioDeveriaSerPromovido() {

        funcionario.setNome("Faride");
        funcionario.setSalario(cargo.getSalario());
        funcionario.setCargo(cargo);
        funcionario.setAnosCompletosDeCasa(2);

        Funcionario funcionarioPromovido = service.promocaoDeCargo(funcionario);

        Cargo cargoPromovido = funcionarioPromovido.getCargo();

        Assertions.assertEquals(new DesenvolvedorPleno().toString(), cargoPromovido.toString());

    }

    @Test
    void funcionarioNaoDeveriaSerPromovido() {

        funcionario.setNome("Faride");
        funcionario.setSalario(cargo.getSalario());
        funcionario.setCargo(cargo);
        funcionario.setAnosCompletosDeCasa(1);

        Funcionario funcionarioNaoPromovido = service.promocaoDeCargo(funcionario);

        Cargo cargoNaoPromovido = funcionarioNaoPromovido.getCargo();

        Assertions.assertEquals(new DesenvolvedorJunior().toString(), cargoNaoPromovido.toString());

    }
}