package mariangelamarasciuolo.menupizze.entities;

import lombok.Data;

@Data
public class Tavolo {
    private int numero;
    private int coperti;
    private double costoCoperto;
    private StatoTavolo statoTavolo;
    private double costoTotale = costoCoperto * coperti;

    public Tavolo(int numero, int coperti, double costoCoperto, StatoTavolo statoTavolo) {
        this.numero = numero;
        this.coperti = coperti;
        this.costoCoperto = costoCoperto;
        this.statoTavolo = statoTavolo;
    }
}
