package mariangelamarasciuolo.menupizze.entities;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class Tavolo {
    private int numero;
    private int coperti;
    @Value("${costo.coperto}")
    private double costoCoperto;
    private StatoTavolo statoTavolo;

    public Tavolo(int numero, int coperti, StatoTavolo statoTavolo) {
        this.numero = numero;
        this.coperti = coperti;
        this.statoTavolo = statoTavolo;
    }

}
