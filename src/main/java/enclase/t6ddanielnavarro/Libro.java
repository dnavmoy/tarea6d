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
public class Libro extends Producto implements Comparable<Libro> {

    private String ISBN;

    public Libro(String ISBN, int codigo, double precio, double iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public final int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.ISBN);
        return hash;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        return Objects.equals(this.ISBN, other.ISBN);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Libro{");
        sb.append("ISBN=").append(ISBN);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Libro o) {
        return this.getISBN().compareTo(o.getISBN());
    }

    
    

    

    
    

}
