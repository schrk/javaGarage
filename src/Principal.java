
import br.univali.sisnet.prog3.garagem.dominio.Caminhao;
import br.univali.sisnet.prog3.garagem.dominio.Carro;
import br.univali.sisnet.prog3.garagem.dominio.Galpao;
import br.univali.sisnet.prog3.garagem.dominio.Helicoptero;
import br.univali.sisnet.prog3.garagem.dominio.Iate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 1978233
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Iate iate = new Iate("katia Flavia");
        iate.setCapitao("Joao");
        
        Galpao galpao = new Galpao();
        galpao.adicionarVeiculo(iate);
        
        galpao.adicionarVeiculo(new Helicoptero("falcao", "xpto"));
        galpao.adicionarVeiculo(new Carro(1250, "Ferrari", "XXX-1234"));
        galpao.adicionarVeiculo(new Caminhao(2500, "Volvo", "YYY-1235"));
        
        System.out.println(galpao.imprimirRelacaoVeiculos());
                
    }
    
}
