/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.univali.sisnet.prog3.garagem.dominio;

/**
 *
 * @author 1978233
 */
public class Carro extends VeiculoTerrestre{

    private double potencia;

    public Carro(double potencia, String modelo, String placa) {
        super(modelo, placa);
        this.potencia = potencia;
    }
    
    

    @Override
    public String getDescricao() {
        return this.getPlaca()+" potencia "+this.potencia;
    }

    public double getPotencia() {
        return potencia;
    }
    
    
    
}
