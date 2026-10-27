package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmprestimoTest {

    FuncionarioAtendente atendente;

    @BeforeEach
    void setUp() {
        FuncionarioSuperintendente superintendente = new FuncionarioSuperintendente(null);
        FuncionarioGerente gerente = new FuncionarioGerente(superintendente);
        atendente = new FuncionarioAtendente(gerente);
    }

    @Test
    void deveRetornarAtendenteParaEmprestimoAteCincoMil() {
        assertEquals("Atendente", atendente.liberarEmprestimo(new Emprestimo(5000.0)));
    }

    @Test
    void deveRetornarGerenteParaEmprestimoAteCinquentaMil() {
        assertEquals("Gerente", atendente.liberarEmprestimo(new Emprestimo(5000.01)));
    }

    @Test
    void deveRetornarSuperintendenteParaEmprestimoAteQuinhentosMil() {
        assertEquals("Superintendente", atendente.liberarEmprestimo(new Emprestimo(500000.0)));
    }

    @Test
    void deveRetornarSemLiberacaoParaEmprestimoAcimaDeQuinhentosMil() {
        assertEquals("Sem liberação", atendente.liberarEmprestimo(new Emprestimo(500000.01)));
    }
}
