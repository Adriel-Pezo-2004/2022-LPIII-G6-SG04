
package actividad1;

public class Goodies implements Contenedora{
    private int id;
    private String description;
    private float price;

    public Goodies(int id, String description, float price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }
    
    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(float price) {
        this.price = price;
    }
   
    public boolean contiene(Object valor) {
        int i = (int) valor;
        if (i == this.id){
            return true;
        }
        else{
            return false;
        }
    }
    
}
