package model;

import java.util.ArrayList;
import java.util.List;

public class DVD {

    private String titulo;
    private TipoDVD tipo;
    private boolean ehBonus;

    private static final List<TipoDVD> tiposDVDBonus = new ArrayList<>(List.of(TipoDVD.LANCAMENTO));

    public DVD(String titulo, TipoDVD tipo, boolean b) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.ehBonus = tiposDVDBonus.contains(tipo);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public TipoDVD getTipo() {
        return tipo;
    }

    public void setTipo(TipoDVD tipo) {
        this.tipo = tipo;
        this.ehBonus = tiposDVDBonus.contains(tipo);
    }

    public boolean ehBonus() {
        return ehBonus;
    }

    public void setEhBonus(boolean ehBonus) {
        this.ehBonus = ehBonus;
    }
}
