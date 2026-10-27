package org.example;

public class FuncionarioAtendente extends Funcionario {

    public FuncionarioAtendente(Funcionario superior) {
        super(superior);
    }

    public double getLimite() {
        return 5000.0;
    }

    public String getCargo() {
        return "Atendente";
    }
}
