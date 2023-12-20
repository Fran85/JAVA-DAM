/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package youtubecoche;

/**
 *
 * @author Fran
 */
public class Deposito extends Contenedor {

    private ReservaDeposito reserva;

    public Deposito() {
    }

    public Deposito(ReservaDeposito reserva, int capacidad, int contenido) {
        super(capacidad, contenido);
        this.reserva = reserva;
    }

    public ReservaDeposito getReserva() {
        return reserva;
    }

    public void setReserva(ReservaDeposito reservaDeposito) {
        this.reserva = reserva;
    }

    public String recargarCombustible(int litros) {
        setContenido(getContenido() + litros);
        if (getContenido() <= getCapacidad()) {
            System.out.println("Recarga realizada " + getContenido() + " Litros");
        } else {
            int exceso = getContenido() - getCapacidad();
            setContenido(getCapacidad());
            reserva.setContenido(reserva.getContenido() + exceso);
            if (reserva.getContenido() <= reserva.getCapacidad()) {
                System.out.println("Deposito lleno, con reserva de " + reserva.getContenido() + " Litros");
            } else {
                int perdida = exceso-reserva.getCapacidad();
                reserva.setContenido(reserva.getContenido());
                System.out.println("Deposito y reserva completos, pero se perdieron "+perdida+" Litros");
            }

        }
        return null;
    }

}
