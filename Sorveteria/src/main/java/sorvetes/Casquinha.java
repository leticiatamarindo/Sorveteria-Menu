
package sorvetes;

/**
 *
 * @author Letícia
 */

public class Casquinha extends Sorvete implements Venda {

    public Casquinha(String sabor) { //construtor
        super(sabor); 
    }

    @Override //sobrescrita de venda
    public void comprar() {
        System.out.println("Casquinha " + getSabor() + " - R$" + getValor());
    }
    
    @Override // sobrescrita de sorvete
    public String toString() {
        return getSabor() + " - Casquinha";
    }
    
    @Override //Sobrescrita de venda
    public double getValor() {
        return 3.50; //preço fixo
    }

}

