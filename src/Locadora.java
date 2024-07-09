import model.*;

import java.util.ArrayList;
import java.util.List;

public class Locadora {


    public static void main(String[] args) {
        List<Aluguel> listaDeAlugueis = new ArrayList<>();
        DVD dvd1 = new DVD("Filme A", TipoDVD.NORMAL, false);
        DVD dvd2 = new DVD("Filme B", TipoDVD.LANCAMENTO, true);
        Aluguel aluguel1 = new Aluguel(dvd1, 3);
        Aluguel aluguel2 = new Aluguel(dvd2, 2);
        listaDeAlugueis.add(aluguel1);
        listaDeAlugueis.add(aluguel2);

        Cliente cliente = new Cliente("João");
        cliente.adicionaAluguel(aluguel1);
        cliente.adicionaAluguel(aluguel2);

        Extrato extratoHtml = new HTMLExtrato(cliente);
        cliente.setExtrato(extratoHtml);

        String resultadoExtrato = cliente.getExtrato();
        System.out.println(resultadoExtrato);
    }
}
