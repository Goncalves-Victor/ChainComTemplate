package org.example;

public class FuncionarioGerente extends Funcionario {

    public FuncionarioGerente(Funcionario superior) {
        super(superior);
    }

    public double getLimite() {
        return 50000.0;
    }

    public String getCargo() {
        return "Gerente";
    }
}
