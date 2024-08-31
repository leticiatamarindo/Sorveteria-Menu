package sorvetes;

/**
 *
 * @author Letícia
 */

public abstract class Sorvete {
    
    private String sabor;

    public Sorvete(String sabor) { //construtor
        this.sabor = sabor;
    }
    
    // getters e setters
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    

}



