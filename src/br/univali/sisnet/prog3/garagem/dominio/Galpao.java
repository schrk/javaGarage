/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.univali.sisnet.prog3.garagem.dominio;

/**
 *
 * @author 1978233
 */
public class Galpao {
    
    private Veiculo[] veiculos;

    public Galpao() {
        this.veiculos = new Veiculo[999];
    }
   
    public void adicionarVeiculo(Veiculo veiculo) {
        for (int x=0; x < veiculos.length; x++) {
            if (veiculos[x] == null) {
                veiculos[x] = veiculo;
                break;
            }
        }
    }
    
    public String imprimirRelacaoVeiculos() {
        String relacao = "";
        for(Veiculo veiculo:veiculos) {
            if (veiculo == null) {
                break;
            }
            relacao += "\n"+veiculo.obterDescricaoVeiculo();
        }
        return relacao;
    }
    
    
    
   
    
    

    
}
