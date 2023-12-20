/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package youtubecoche;

/**
 *
 * @author Fran
 */
public class Motor {
    private String codigo;
    private int cCubicos;
    private int caballos;

    public Motor() {
    }

    
    
    public Motor(String codigo, int cCubicos, int caballos) {
        this.codigo = codigo;
        this.cCubicos = cCubicos;
        this.caballos = caballos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getcCubicos() {
        return cCubicos;
    }

    public void setcCubicos(int cCubicos) {
        this.cCubicos = cCubicos;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }
   
    public float calcularRendimiento(){
        return cCubicos/caballos;
    }
    
    
}
