package org.example;

public class FuncionarioSuperintendente extends Funcionario {

    public FuncionarioSuperintendente(Funcionario superior) {
        super(superior);
    }

    public double getLimite() {
        return 500000.0;
    }

    public String getCargo() {
        return "Superintendente";
    }
}
