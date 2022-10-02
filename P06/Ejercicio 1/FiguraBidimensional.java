/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicio1;

/**
 *
 * @author Usuario
 */
public abstract class FiguraBidimensional implements Figura{
    public String objetoFigura;
    public String tipoFigura;

    public FiguraBidimensional(String objetoFigura, String tipoFigura) {
        this.objetoFigura = objetoFigura;
        this.tipoFigura = tipoFigura;
    }

    public String getObjetoFigura() {
        return objetoFigura;
    }

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setObjetoFigura(String objetoFigura) {
        this.objetoFigura = objetoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    
    
}
