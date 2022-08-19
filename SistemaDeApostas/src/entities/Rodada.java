/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Bruno
 */
public class Rodada {
    private Double valorApostado;

    public Rodada(Double valorApostado) {
        this.valorApostado = valorApostado;
    }

    public Rodada() {
    }
    
    public Double getValorApostado() {
        return valorApostado;
    }

    public void setValorApostado(Double valorApostado) {
        this.valorApostado = valorApostado;
    }   
}
