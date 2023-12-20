/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Explicacion3;

/**
 *
 * @author Fran
 */
public class Libro {
    private String titulo;
    private int totalPaginas;
    private int paginaActual;

    public Libro(String titulo, int totalPaginas) {
        this.titulo = titulo;
        this.totalPaginas = totalPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaActual() {
        return paginaActual;
    }

    public void avanzaPagina(){
        paginaActual++;
    }
    
    //sobrecarga estatica, es crear un emtodo que se llama igual pasandole un
    //numero de paginas, con encapsulacion, cambiamos el public por private
    private void avanzarPagina(int paginas){
        paginaActual+=paginas;
    }
    
    public void avanzarCapitulo(){
        avanzarPagina(100);
    }
    
    
    
    
}
