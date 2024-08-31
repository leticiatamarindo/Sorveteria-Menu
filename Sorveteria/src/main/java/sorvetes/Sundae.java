
package sorvetes;

/**
 *
 * @author Letícia
 */

public class Sundae extends Sorvete implements Venda {

    private boolean frutas;

    public Sundae(String sabor) { //construtor
        super(sabor);
        this.frutas = true;
    }
    
    @Override //sobrescrita de venda
    public void comprar() {
        System.out.println("Sundae de " + getSabor() + (frutas ? " com frutas" : " sem frutas") + " - R$" + getValor());
    }
    
    @Override //sobrescrita de sorvete
    public String toString() {
        return getSabor() + " - Sundae";
    }
    
    @Override //Sobrescrita de venda
    public double getValor() {
        return 5.80; //preço fixo
    }

    //get  e set de frutas
    public boolean isFrutas() {
        return frutas;
    }

    public void setFrutas(boolean frutas) {
        this.frutas = frutas;
    }
    
    
   
}