
package model;

import com.mycompany.observer.Observer;
import java.math.BigDecimal;


public class Gerente implements Observer  {
    private String nome; 

    public Gerente() {
    } 
    
    @Override
    public void update(Estoque estoque) {
        BigDecimal valor = estoque.getValor();
        BigDecimal limite = new BigDecimal("1000.0");
        if(valor.compareTo(limite)>0){
            System.out.println("Gerente " +nome+ ": Valor do produto " + estoque.getProduto()+ " é maior que 1000");
        }
    }
    
     public Gerente(String nome) {
        this.nome = nome;
    }
     
}
