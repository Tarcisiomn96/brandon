package com.testes.unitarios.model.cargo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class DesenvolvedorJunior implements Cargo {

    @Override
    public Cargo getProximoCargo() {
        return new DesenvolvedorPleno();
    }

    @Override
    public String getSalario() {
        return "3400.00";
    }

    @Override
    public String toString() {
        return "DesenvolvedorJunior";
    }
}
