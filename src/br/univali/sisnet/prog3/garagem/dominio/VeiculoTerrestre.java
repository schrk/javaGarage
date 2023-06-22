/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.univali.sisnet.prog3.garagem.dominio;

/**
 *
 * @author 1978233
 */
abstract public class VeiculoTerrestre implements Veiculo{
    private String modelo;
    private String placa;
    private String motorista;

    public VeiculoTerrestre(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
    }

    public void setMotorista(String nome) {
        this.motorista = nome;
    }

    public String getPlaca() {
        return placa;
    }
    
    abstract public String getDescricao();

    @Override
    public String obterDescricaoVeiculo() {
        return getDescricao();
    }
    
    
    
    
    
    
    
    
    
    
}
