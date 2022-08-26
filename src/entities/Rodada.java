/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Bruno
 */
@Entity
public class Rodada {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Double valorApostado;
    private Boolean statusDaRodada;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Aposta aposta;
    
    public Rodada() {
    }

    public Aposta getAposta() {
        return aposta;
    }

    public void setAposta(Aposta aposta) {
        this.aposta = aposta;
    }
    
    public Double getValorApostado() {
        return valorApostado;
    }

    public void setValorApostado(Double valorApostado) {
        this.valorApostado = valorApostado;
    }

    public Boolean getStatusDaRodada() {
        return statusDaRodada;
    }

    public void setStatusDaRodada(Boolean statusDaRodada) {
        this.statusDaRodada = statusDaRodada;
    }

}
