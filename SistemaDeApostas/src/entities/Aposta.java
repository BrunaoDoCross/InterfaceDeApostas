/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bruno
 */
public class Aposta {
    private Boolean status;
    private Double saldoFinalDaAposta;
    private Integer quantidadeDeRodadas;
    
    List<Rodada> listaDeRodadas = new ArrayList<>();

    public Aposta(Boolean status, Double saldoFinalDaAposta, Integer quantidadeDeRodadas) {
        this.status = status;
        this.saldoFinalDaAposta = saldoFinalDaAposta;
        this.quantidadeDeRodadas = quantidadeDeRodadas;
    }

    public Aposta() {
    }
    

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Double getSaldoFinalDaAposta() {
        return saldoFinalDaAposta;
    }

    public void setSaldoFinalDaAposta(Double saldoFinalDaAposta) {
        this.saldoFinalDaAposta = saldoFinalDaAposta;
    }

    public Integer getQuantidadeDeRodadas() {
        return quantidadeDeRodadas;
    }

    public void setQuantidadeDeRodadas(Integer quantidadeDeRodadas) {
        this.quantidadeDeRodadas = quantidadeDeRodadas;
    }

    public List<Rodada> getListaDeRodadas() {
        return listaDeRodadas;
    }

    public void setListaDeRodadas(ArrayList<Rodada> listaDeRodadas) {
        this.listaDeRodadas = listaDeRodadas;
    }
    
    public void addRodada(Rodada rodada){
        listaDeRodadas.add(rodada);
    }
    
}
