
package sorvetes;

/**
 *
 * @author Letícia
 */

public class Milkshake extends Sorvete implements Venda {

    public Milkshake(String sabor) { //construtor
        super(sabor);
    }

    @Override //Sobrescrita de venda
    public void comprar() {
        System.out.println("Milkshake " + getSabor() + " - R$" + getValor());
    }
    
    @Override //Sobrescrita de sorvete
    public String toString() {
        return getSabor() + " - Milkshake";
    }
    
    @Override //Sobrescrita de venda
    public double getValor() { 
        return 12.00; //preço fixo
    }
}
 
    
    

