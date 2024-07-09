package model;

public class Aluguel {
    private final DVD dvd;
    private final int diasAlugado;

    private final double precoDVDNormal = 2.0;
    private final double precoDVDLancamento = 3.0;
    private final double precoDVDInfantil = 1.5;
    private final double acrescimo = 1.5;

    public Aluguel(DVD dvd, int diasAlugado) {
        this.dvd = dvd;
        this.diasAlugado = diasAlugado;
    }

    public DVD getDVD() {
        return dvd;
    }

    public double calcularAluguel() {
        double valorAluguel = 0.0;

        switch (dvd.getTipo()) {
            case NORMAL -> {
                valorAluguel += precoDVDNormal;
                if (this.diasAlugado > 2) {
                    valorAluguel += (this.diasAlugado - 2) * acrescimo;
                }
                break;
            }
            case LANCAMENTO -> {
                valorAluguel += this.diasAlugado * precoDVDLancamento;
                break;
            }
            case INFANTIL -> {
                valorAluguel += precoDVDInfantil;
                if (diasAlugado > 3) {
                    valorAluguel += (diasAlugado - 3) * acrescimo;
                }
                break;
            }
        }
        return valorAluguel;
    }

    public boolean ehDVDBonus() {
        return this.dvd.ehBonus();
    }

    public int getDiasAlugado() {
        return diasAlugado;
    }
}
