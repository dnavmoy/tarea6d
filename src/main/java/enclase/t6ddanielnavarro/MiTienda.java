/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package enclase.t6ddanielnavarro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author daniel
 */
public class MiTienda {

    public static void main(String[] args) {

        //1. Crea una lista de productos y añade dos objetos de cada tipo de producto distinto (de los posibles) a la misma.

        
        ArrayList<Producto> listaProductos = new ArrayList<>();
        // Es una conversion implicita: se añade un Producto(clase padre) pero se
        //declara como un objeto hijo:  pantalon,Libropapel, libroDigital... etc
        listaProductos.add(new Pantalon(40, "Nike", 1000, 15, 0.21, "Pantalon Nike"));
        listaProductos.add(new Pantalon(42, "Carrefour", 1001, 8, 0.18, "Pantalon Carrefour"));
        listaProductos.add(new LibroPapel(450, "8888", 1002, 15, 0.21, "Libro papel 1"));
        listaProductos.add(new LibroPapel(200, "9999", 1003, 7, 0.07, "LIbro Papel 2"));
        listaProductos.add(new LibroDigital(157, "4444", 1004, 4.57, 0.05, "Libro Digital 1"));
        listaProductos.add(new LibroDigital(411, "5555", 1005, 75, 0.21, "Libro Digital 2"));
        listaProductos.add(new Musica("los manolos", 1111, 57, 0.21, "Disco 1"));
        listaProductos.add(new Musica("Grupo Falso", 2222, 15, 0.21, "Disco 2"));

        //2. Muestra los datos de los productos usando un foreach. 

        listaProductos.forEach((t) -> {
            System.out.println(t.getDescripcion() + " " + t.getPrecio());
        });

        //3. Ordena la lista de productos según el precio, haciendo uso de 
        //<<Comparator>> y una expresión lambda. 
        //Muestra la lista de productos ordenados por precio.

        //Creamos el objeto comparator: 
        Comparator<Producto> comparadorPrecio = ((Producto p1, Producto p2)
                -> Double.compare(p1.getPrecio(), p2.getPrecio()));
        //el objeto comparadorPrecio podemos usarlo con en el sort o mas adelante 
        //en un binarySearch por ejemplo
        listaProductos.sort(comparadorPrecio);
        
        System.out.println("ordenado por precio");
        //mostramos el resultado con un forEach
        listaProductos.forEach((t) -> {
            System.out.println(t.getDescripcion() + " " + t.getPrecio());
        });

        //4. Ordena la lista de productos según el código, haciendo uso de
        //<<Comparator>> y una expresión lambda. Muestra la lista de productos ordenados por código.

        //mismo caso que el anterior pero usamos la ordenacion segun atributo
        //codigo
        Comparator<Producto> comparadorCodigo = (Producto p1, Producto p2)
                -> Integer.compare(p1.getCodigo(), p2.getCodigo());
        System.out.println("ordenador por codigo");
        listaProductos.sort(comparadorCodigo);
        listaProductos.forEach((t) -> {
            System.out.println(t.getDescripcion() + " " + t.getCodigo());
        });
        //5. Realiza la búsqueda binaria, según su código, de algún producto que
        //exista dentro de la lista y otro que no exista, mostrando la posición 
        //que ocupa en la lista.

        //como ya tenermos un comparator de codigo lo podemos usar en el binarySearch
        //creamos un objeto Librodigital con el codigo que queramos encontrar(en este
        //caso esta creado dentro de la misma expresion
        int encontrar = Collections.binarySearch(listaProductos,
                new LibroDigital(0, "", 1004, 0, 0, ""),
                comparadorCodigo);

        System.out.println(encontrar);

        //y aqui lo creamos aparte 
        LibroDigital libroAEncontrar = new LibroDigital(0, "", 1, 0, 0, "");
        encontrar = Collections.binarySearch(listaProductos,
                libroAEncontrar,
                comparadorCodigo);

        System.out.println(encontrar);

        
        //6. Recorre la lista de productos y guarda todos los libros en una lista de libros.
        ArrayList<Libro> listaLibros = new ArrayList<Libro>();
        for (Producto p : listaProductos) {
            if (p instanceof Libro) {
                
                // hay una conversion explicita ya que recorremos la lista de productos
                //que hay en la lista y los añadimos a una lista de libros, hay que 
                //convertir el objeto Producto a objeto Libro para poder añadirlo
                //a la listade libros
                
                
                listaLibros.add((Libro) p);
            }

        }

        //7. Muestra los datos de la lista de libros usando un objeto Iterator. 
        
        // crear un iterador de objetoLibro de la lista de libros: 
        Iterator<Libro> it = listaLibros.iterator();

        //y recorrer la lista del iterador mostrandolos:
        
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        // otra forma: 
        //for (Iterator<Libro> iterator = listaLibros.iterator(); iterator.hasNext();) {
        //    Libro next = iterator.next();
        //    System.out.println(next);
        //    
        //}

        //8. Ordena los libros según ISBN, haciendo uso de <<Comparable>>.
        //Muestra la lista de libros ordenada. 
        
        // como la clase libro ya tiene un comparador no hace falta crearlo, se puede 
        //usar directamente la lista en en el sort
        
        System.out.println("orden segun ISBN:");
        Collections.sort(listaLibros);

        for (Libro l : listaLibros) {
            System.out.println(l + "isbn: " + l.getISBN());
        }

        //9. Recorre de nuevo la lista de libros y en cada iteración, 
        //ejecuta enviar() o descargar() en función del tipo de libro.
        System.out.println("Enviar o descargar en funcion del libro:\n");
        for (Libro l : listaLibros) {
            if (l instanceof LibroDigital) {
                //otra conversion explicita, hay que transformar Libro a LibroDigital
                ((LibroDigital) l).descargar();
            }
            if (l instanceof LibroPapel) {
                //y aqui libroPapel
                ((LibroPapel) l).enviar("  direccion  ejemplo");
            }
        }

        //11. Utiliza el método contains(Object) sobre la lista de libros para
        //comprobar si existe un libro o no existe.
        
        //conversion explicita, creamos un LibroDigital dentro de la lista de Libros
        System.out.println(
                listaLibros.contains(new LibroDigital(157, "4444",
                        1004, 4.57, 0.05, "Libro Digital 1"))
        );

        //12.Usando la lista de productos inicial, crea una nueva lista con todos
        //los objetos que Se Envian.
        ArrayList<Producto> listaEnviar = new ArrayList<>();
        for (Producto p : listaProductos) {
            if (p instanceof SeEnvia) {
                listaEnviar.add(p);
            }
        }
              
        //13. Recorre la lista de objetos que Se Envian y llama al método de la interfaz.
        for (Producto p : listaEnviar) {
            System.out.println(p);
            if (p instanceof SeEnvia) {
                ((SeEnvia) p).enviar("direccion ejemplo");
            }
        }

        //14. Inventa un método abstracto en Libro que tenga comportamientos diferentes
        //en las subclases. Implementa los métodos en las clases hijas.
        for(Libro l:listaLibros ) {
           
            l.cambiarPrecioEnvio(10);
            System.out.println(l+" " + l.getPrecio());
        }
    }
}
