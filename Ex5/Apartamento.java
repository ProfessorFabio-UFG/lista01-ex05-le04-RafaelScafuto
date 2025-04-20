package Ex5;

import java.util.ArrayList;

class Apartamento {
    private int numero;
    private int andar;
    private double metragem;
    private String situacao; // alugado, financiado, quitado
    private ArrayList<Morador> moradores;

    public Apartamento(int numero, int andar, double metragem, String situacao) {
        this.numero = numero;
        this.andar = andar;
        this.metragem = metragem;
        this.situacao = situacao;
        this.moradores = new ArrayList<>();
    }

    public void adicionarMorador(Morador morador) {
        moradores.add(morador);
    }

    @Override
    public String toString() {
        return "Apartamento nº: " + numero + ", Andar: " + andar + ", Metragem: " + metragem +
                "m², Situação: " + situacao + "\nMoradores: " + moradores;
    }
}