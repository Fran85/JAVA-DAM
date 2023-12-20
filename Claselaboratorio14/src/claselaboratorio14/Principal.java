/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claselaboratorio14;

import java.util.ArrayList;

/**
 *
 * @author Fran
 */
public class Principal {

    public static void main(String[] args) {
        JefeProyecto j1 = new JefeProyecto("Maria", 3, 20);
        Analista a1 = new Analista("Ana", 2, 20);
        Programador p1 = new Programador("Elena", 0);
        j1.visualizar();
        a1.visualizar();
        p1.visualizar();
        //System.out.println(Empresa.getEmpleados());

        ArrayList<JefeProyecto> jefes = new ArrayList();
        ArrayList<Analista> analistas = new ArrayList();
        ArrayList<Programador> programadores = new ArrayList();

        Empresa e = new Empresa("Zara", jefes, analistas, programadores);
        JefeProyecto j2 = new JefeProyecto("Juan", 3, 20);
        
        e.anyadirJefe(j1);
        e.anyadirJefe(j2);
        
        e.anyadirAnalista(a1);
           
        e.anyadirProgramador(p1);
        
        e.listarJefes();
        
    }
}
