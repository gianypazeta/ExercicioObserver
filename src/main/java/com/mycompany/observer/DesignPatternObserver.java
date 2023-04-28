
package com.mycompany.observer;

import java.math.BigDecimal;
import java.util.Observer;
import model.Estoque;
import model.Gerente;


public class DesignPatternObserver {

    public static void main(String[] args) {
       BigDecimal valorInicial = new BigDecimal("200.0");
       BigDecimal desconto = new BigDecimal("5.0");
       Gerente gerente = new Gerente("teste");
       Estoque estoque = new Estoque("camisa", valorInicial, desconto);
       estoque.attach((com.mycompany.observer.Observer) (Observer) gerente); 
       estoque.setValor(valorInicial);
       

    }
}
