package mariangelamarasciuolo.menupizze.entities;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Ordine {
    private List<Pizze> pizze;
    private List<Bevande> bevande;
    private int coperti;
    @Value("${costo.coperto}")
    private double costoCoperto;
    private StatoOrdine statoOrdine;
    private int numero;
    private LocalDateTime acquisizione;

    public Ordine(List<Pizze> pizze, List<Bevande> bevande, int coperti, StatoOrdine statoOrdine, int numero, LocalDateTime acquisizione) {
        this.pizze = pizze;
        this.bevande = bevande;
        this.coperti = coperti;
        this.statoOrdine = statoOrdine;
        this.numero = numero;
        this.acquisizione = acquisizione;
    }

    public double totaleOrdine() {
        double pizzeTot = pizze.stream().mapToDouble(Pizze::getPrice).sum();
        double bevandeTot = bevande.stream().mapToDouble(Bevande::getPrice).sum();
        double totCoperti = coperti + costoCoperto;
        double tot = pizzeTot + bevandeTot + totCoperti;
        return tot;
    }
}
