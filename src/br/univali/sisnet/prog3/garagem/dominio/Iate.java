/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.univali.sisnet.prog3.garagem.dominio;

/**
 *
 * @author 1978233
 */
public class Iate implements Veiculo{
    private final String nome;
    private String capitao;

    public Iate(String nome) {
        this.nome = nome;
    }

    public void setCapitao(String nome) {
        this.capitao = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String obterDescricaoVeiculo() {
        return this.nome+" "+this.capitao;
    }
    
    
    
    
    
    
    
    
}
