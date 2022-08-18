/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public class Aposta {
    private Cliente cliente;
    private Boolean status;
    private Double saldoFinalDaAposta;
    private Integer quantidadeDeRodadas;
    
    ArrayList<Rodada> listaDeRodadas = new ArrayList<>();

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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

    public ArrayList<Rodada> getListaDeRodadas() {
        return listaDeRodadas;
    }

    public void setListaDeRodadas(ArrayList<Rodada> listaDeRodadas) {
        this.listaDeRodadas = listaDeRodadas;
    }

    
}
