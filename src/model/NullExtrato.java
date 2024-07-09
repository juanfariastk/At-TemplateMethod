package model;

public class NullExtrato extends Extrato {

    public NullExtrato(Cliente cliente) {
        super(cliente);
    }

    @Override
    protected String getHeader(String nomeCliente) {
        return "Registro de Alugueis de " + nomeCliente;
    }

    @Override
    protected String getLineSeparator() {
        return System.getProperty("line.separator");
    }

    @Override
    protected String alugelFormater(String dvdTitulo, double valor) {
        return "  ";
    }

    @Override
    protected String getFooter(double valorTotal, int pontosTotais) {
        return "Extrato inválido.";
    }

}
