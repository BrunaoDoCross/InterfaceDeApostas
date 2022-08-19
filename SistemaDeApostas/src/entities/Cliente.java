/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;


/**
 *
 * @author Bruno
 */
public class Cliente {
    private String nome;
    private Double saldoDaConta;
    private Aposta aposta;

    public Cliente() {
    }

    public Cliente(String nome, Double saldoDaConta, Aposta aposta) {
        this.nome = nome;
        this.saldoDaConta = saldoDaConta;
        this.aposta = aposta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldoDaConta() {
        return saldoDaConta;
    }

    public void setSaldoDaConta(Double saldoDaConta) {
        this.saldoDaConta = saldoDaConta;
    }

    public Aposta getAposta() {
        return aposta;
    }

    public void setAposta(Aposta aposta) {
        this.aposta = aposta;
    }


}
