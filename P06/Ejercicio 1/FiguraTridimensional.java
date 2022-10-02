/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejericicio1;

/**
 *
 * @author Usuario
 */
public abstract class FiguraTridimensional implements Figura {
    public String objetoFiguraT;
    public String tipoFiguraT;

    public FiguraTridimensional(String objetoFiguraT, String tipoFiguraT) {
        this.objetoFiguraT = objetoFiguraT;
        this.tipoFiguraT = tipoFiguraT;
    }

    public String getObjetoFiguraT() {
        return objetoFiguraT;
    }

    public String getTipoFiguraT() {
        return tipoFiguraT;
    }

    public void setObjetoFiguraT(String objetoFiguraT) {
        this.objetoFiguraT = objetoFiguraT;
    }

    public void setTipoFiguraT(String tipoFiguraT) {
        this.tipoFiguraT = tipoFiguraT;
    }

    
    
}
