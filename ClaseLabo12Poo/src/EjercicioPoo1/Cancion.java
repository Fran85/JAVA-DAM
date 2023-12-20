 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPoo1;

/**
 *
 * @author Fran
 */
public class Cancion {
    private String titulo;
    private String autor;
    
    public Cancion(String titulo, String autor){
    this.titulo=titulo;
    this.autor=autor;
}
    public Cancion(){
        titulo ="";
        autor="";
    }
    
    //este es un metodo get, si devuelve no se pone void
    public String dameTitulo(){
        return titulo;
    }
    public String dameAutor(){
        return autor;
    }
    //si cambia algo, atrubuito o lo que sea se pone void, serian los set
    public void ponTitulo(String titulo){
        this.titulo=titulo;
    }
    public void ponAutor(String autor){
        this.autor=autor;
    }
    
}
