package org.example;

public abstract class Funcionario {

    private Funcionario superior;

    public Funcionario(Funcionario superior) {
        this.superior = superior;
    }

    public abstract double getLimite();

    public abstract String getCargo();

    public String liberarEmprestimo(Emprestimo emprestimo) {
        if (emprestimo.getValor() <= getLimite()) {
            return getCargo();
        }
        else {
            if (superior != null) {
                return superior.liberarEmprestimo(emprestimo);
            }
            else {
                return "Sem liberação";
            }
        }
    }
}
