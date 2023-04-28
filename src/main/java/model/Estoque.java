
package model;
import com.mycompany.observer.Observer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;



public class Estoque extends Observable{
    private String produto;
    private BigDecimal valor; 
    private BigDecimal desconto;
    private List<Observer> observers = new ArrayList<>(); 
    
    public Estoque() {}; 

    public Estoque(String produto, BigDecimal valor, BigDecimal desconto) {
        this.produto = produto;
        this.valor = valor;
        this.desconto = desconto;
    }
    
   public void attach(Observer observer) {
       observers.add(observer);
   }
   
    public void notifyObservers() {
       for(Observer observer:observers) {
           observer.update(this); 
       }
   }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

   
   
}
