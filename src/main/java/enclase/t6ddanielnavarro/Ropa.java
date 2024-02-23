/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enclase.t6ddanielnavarro;

import java.util.Objects;

/**
 *
 * @author daniel
 */
public abstract class Ropa extends Producto implements SeEnvia{
    
    
    private String marca;

    public Ropa(String marca, int codigo, double precio, double iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.marca);
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
        final Ropa other = (Ropa) obj;
        return Objects.equals(this.marca, other.marca);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ropa{");
        sb.append("marca=").append(marca);
        sb.append('}');
        return sb.toString();
    }

     @Override
    public void enviar(String direccion) {
        System.out.println("enviando : " + this.getDescripcion() + " ,se envia a:   " + direccion);
    }
    
    
            
    
}
