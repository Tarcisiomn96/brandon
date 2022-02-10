package com.testes.unitarios.model.cargo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DesenvolvedorPleno implements Cargo {

    @Override
    public Cargo getProximoCargo() {
        return null;
    }

    @Override
    public String getSalario() {
        return "6000.00";
    }

    @Override
    public String toString() {
        return "DesenvolvedorPleno";
    }
}
