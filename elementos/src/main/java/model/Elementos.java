
package model;


public class Elementos {
    
    private String fogo;
    private String agua;
    private String grama;

    public Elementos() {
    }

    public Elementos(String fogo, String agua, String grama) {
        this.fogo = fogo;
        this.agua = agua;
        this.grama = grama;
    }

    public String getFogo() {
        return fogo;
    }

    public void setFogo(String fogo) {
        this.fogo = fogo;
    }

    public String getAgua() {
        return agua;
    }

    public void setAgua(String agua) {
        this.agua = agua;
    }

    public String getGrama() {
        return grama;
    }

    public void setGrama(String grama) {
        this.grama = grama;
    }
    
    
}
