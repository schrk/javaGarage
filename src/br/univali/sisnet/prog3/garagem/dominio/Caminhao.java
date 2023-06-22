/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.univali.sisnet.prog3.garagem.dominio;

/**
 *
 * @author 1978233
 */
public class Caminhao extends VeiculoTerrestre{
    private double capacidadeCarga;

    public Caminhao(double capacidadeCarga, String modelo, String placa) {
        super(modelo, placa);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public String getDescricao() {
        return this.getPlaca()+" carga "+this.capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }
    
    
}
