/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Bruno
 */
@Entity
public class Aposta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Boolean statusDaAposta;
    private Double saldoFinalDaAposta;
    private Integer quantidadeDeRodadas;
    
    @ManyToOne(cascade = CascadeType.ALL)
    private Cliente cliente;
    
    @OneToMany(cascade=CascadeType.ALL, mappedBy="aposta", fetch = FetchType.LAZY)
    private List<Rodada> listaDeRodadas = new ArrayList<>();
    
    
    public Aposta() {
        listaDeRodadas = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Rodada> getListaDeRodadas() {
        return listaDeRodadas;
    }

    public void setListaDeRodadas(List<Rodada> listaDeRodadas) {
        this.listaDeRodadas = listaDeRodadas;
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
    
    public Boolean getStatusDaAposta() {
        return statusDaAposta;
    }

    public void setStatusDaAposta(Boolean statusDaAposta) {
        this.statusDaAposta = statusDaAposta;
    }
    
    
    
    public void verificarSeGanhou(){
        if (this.saldoFinalDaAposta<=0){
            this.setStatusDaAposta(false);
        }else{
            this.setStatusDaAposta(true);
        }
    }
    
    public void adicionarRodada(Rodada rodada){
        this.listaDeRodadas.add(rodada);
        rodada.setAposta(this);
    }
}
