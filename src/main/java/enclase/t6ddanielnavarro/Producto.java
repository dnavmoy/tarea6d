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
public abstract class Producto {
    
    private final int codigo;
    private double precio;
    private double iva;
    private String descripcion;

    public Producto(int codigo, double precio, double iva, String descripcion) {
        this.codigo = codigo;
        this.precio = precio;
        this.iva = iva;
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.codigo;
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
        final Producto other = (Producto) obj;
        return this.codigo == other.codigo;
    }

    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("codigo=").append(codigo);
        sb.append(", precio=").append(precio);
        sb.append(", iva=").append(iva);
        sb.append(", descripcion=").append(descripcion);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}
