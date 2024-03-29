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
public final class Musica extends Producto{
    
    private String Grupo;

    public Musica(String Grupo, int codigo, double precio, double iva, String descripcion) {
        super(codigo, precio, iva, descripcion);
        this.Grupo = Grupo;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String Grupo) {
        this.Grupo = Grupo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.Grupo);
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
        final Musica other = (Musica) obj;
        return Objects.equals(this.Grupo, other.Grupo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Musica{");
        sb.append("Grupo=").append(Grupo);
        sb.append('}');
        return sb.toString();
    }

  
   
    
    
}
