package mariangelamarasciuolo.menupizze.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
public class Ordine {
    private List<Pizze> pizze;
    private List<Bevande> bevande;
    private int coperti;
    private double costoCoperto;
    private StatoOrdine statoOrdine;
    private int numero;
    private LocalDateTime acquisizione;


    public double totaleOrdine() {
        double pizzeTot = pizze.stream().mapToDouble(Pizze::getPrice).sum();
        double bevandeTot = bevande.stream().mapToDouble(Bevande::getPrice).sum();
        double totCoperti = coperti + costoCoperto;
        double tot = pizzeTot + bevandeTot + totCoperti;
        return tot;
    }
}
