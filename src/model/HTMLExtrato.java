package model;

public class HTMLExtrato extends Extrato {

    public HTMLExtrato(Cliente cliente) {
        super(cliente);
    }

    @Override
    protected String getHeader(String nomeCliente) {
        return "<H1>Registro de Alugueis de <EM>" + nomeCliente + "</EM></H1><P>" + this.getLineSeparator();
    }

    @Override
    protected String getLineSeparator() {
        return System.getProperty("line.separator");
    }

    @Override
    protected String alugelFormater(String dvdTitulo, double valor) {
        return dvdTitulo + ": R$ " + valor + "<BR>" + this.getLineSeparator();
    }

    @Override
    protected String getFooter(double valorTotal, int pontosTotais) {
        String s = "<P>Valor total pago: <EM>R$ " + valorTotal + "</EM>" + this.getLineSeparator();
        s += "<P>Voce acumulou <EM>" + pontosTotais + " pontos </EM> de alugador frequente";
        return s;
    }
}
