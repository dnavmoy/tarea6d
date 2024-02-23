/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enclase.t6ddanielnavarro;

/**
 *
 * @author daniel
 */
public final class Pantalon extends Ropa{
    
    private int talla;

    public Pantalon(int talla, String marca, int codigo, double precio, double iva, String descripcion) {
        super(marca, codigo, precio, iva, descripcion);
        this.talla = talla;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.talla;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pantalon other = (Pantalon) obj;
        return this.talla == other.talla;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pantalon{");
        sb.append("talla=").append(talla);
        sb.append('}');
        return sb.toString();
    }

  
    
    
    
}
