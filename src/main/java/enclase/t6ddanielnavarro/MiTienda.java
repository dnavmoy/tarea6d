/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package enclase.t6ddanielnavarro;

import java.util.ArrayList;
import java.util.Comparator;


/**
 *
 * @author daniel
 */
public class MiTienda {

    public static void main(String[] args) {
    
        ArrayList<Producto> listaProductos = new ArrayList<>();
        
        listaProductos.add(new Pantalon(40, "Nike", 1000, 15, 0.21, "Pantalon Nike"));
        listaProductos.add(new Pantalon(42, "Carrefour", 1001, 8, 0.18, "Pantalon Carrefour"));
        listaProductos.add(new LibroPapel(450, "8888", 1002, 15, 0.21, "Libro papel 1"))       ;
        listaProductos.add(new LibroPapel(200, "9999", 1003, 7, 0.07, "LIbro Papel 2"));
        listaProductos.add(new LibroDigital(157, "4444", 1004, 4.57, 0.05, "Libro Digital 1"));
        listaProductos.add(new LibroDigital(411, "5555", 1005, 75, 0.21, "Libro Digital 2"));
        listaProductos.add(new Musica("los manolos", 1111, 57, 0.21, "Disco 1"));
        listaProductos.add(new Musica("Grupo Falso", 2222, 15, 0.21, "Disco 2"));
        
        listaProductos.forEach((t) -> {
            System.out.println(t.getDescripcion() + " " + t.getPrecio());  
        });
        
        Comparator<Producto> comparadorPrecio = ((Producto p1, Producto p2)->
                    Double.compare(p1.getPrecio(), p2.getPrecio()));
        listaProductos.sort(comparadorPrecio);
        System.out.println("ordenado por precio");
         listaProductos.forEach((t) -> {
            System.out.println(t.getDescripcion() + " " + t.getPrecio());  
        });
        
                
        Comparator<Producto> comparadorCodigo =(Producto p1, Producto p2)->
                Integer.compare(p1.getCodigo(), p2.getCodigo());
        System.out.println("ordenador por codigo");
        listaProductos.forEach((t) -> {
            System.out.println(t.getDescripcion() + " " + t.getCodigo());  
        });
    }   
}
