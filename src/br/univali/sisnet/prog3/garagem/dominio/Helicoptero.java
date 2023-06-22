/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.univali.sisnet.prog3.garagem.dominio;

/**
 *
 * @author 1978233
 */
public class Helicoptero implements Veiculo{
    private String modelo;
    private String sigla;
    private String piloto;

    public Helicoptero(String modelo, String sigla) {
        this.modelo = modelo;
        this.sigla = sigla;
    }

    public void setPiloto(String nome) {
        this.piloto = nome;
    }
    
    public String getDescricao() {
        return this.sigla+" "+this.modelo+" "+this.piloto;
        //return String.format("%s %s %s", this.sigla, this.modelo, this.piloto);
    }

    @Override
    public String obterDescricaoVeiculo() {
        return this.getDescricao();
    }
    
    
}
