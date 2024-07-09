package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Aluguel> dvdsAlugados = new ArrayList<>();
    private Extrato extrato;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setExtrato(Extrato extrato) {
        this.extrato = extrato;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        dvdsAlugados.add(aluguel);
    }

    public String getExtrato() {
        return extrato.mostrarExtrato();
    }

    public List<Aluguel> getDvdsAlugados() {
        return this.dvdsAlugados;
    }

    public double getValorTotalAluguel() {
        return this.dvdsAlugados.stream()
                .mapToDouble(Aluguel::calcularAluguel)
                .sum();
    }
}
