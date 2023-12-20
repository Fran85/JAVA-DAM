/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package youtubecoche;

/**
 *
 * @author Fran
 */
public class Coche {

    private String patente;
    private String marca;
    private String modelo;

    private Motor motor;
    private Deposito deposito;
    private Boolean estado;

    public Coche() {
    }

    public Coche(String patente, String marca, String modelo, Motor motor, Deposito deposito, Boolean estado) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.deposito = deposito;
        this.estado = estado;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Deposito getDeposito() {
        return deposito;
    }

    public void setDeposito(Deposito deposito) {
        this.deposito = deposito;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public String encender() {
        if (true == estado) {
            return "El coche ya estaba arrancado";
        } else {
            estado = true;
            return "Arrancado correctamente";
        }
    }

    public String apagar() {
        if (getEstado()) {
            estado = false;
            return "Apagado correctamente";
        } else {
            return "El coche ya estaba apagado";
        }
    }

    public String recargarCombustible(int lts) {
        if (getEstado()) {
            return "No se puede recargar combuistible con el coche arrancado";
        } else {
            return deposito.recargarCombustible(lts);
        }
    }

    public String conducir(int kms) {
        if (getEstado()) {
            int ltsConsumo = (int) (kms / motor.calcularRendimiento());
            if (deposito.getContenido() >= ltsConsumo) {
                deposito.setContenido(deposito.getContenido() - ltsConsumo);
                return "Hay combustible para el viaje, ahora quedan " + deposito.getContenido() + " Litros";
            }
            if (deposito.getContenido() + deposito.getReserva().getContenido() >= ltsConsumo) {

                ltsConsumo = ltsConsumo - deposito.getContenido();
                deposito.setContenido(0);
                deposito.getReserva().setContenido(deposito.getReserva().getContenido()-ltsConsumo);
                return "Viaje realizado, se utilizo todo el deposito y una parte de la reserva";
            }else{
                int contenidos = deposito.getContenido()+deposito.getReserva().getContenido();
                deposito.setContenido(0);
                deposito.getReserva().setContenido(0);
                return "Viaje incompleto "+(ltsConsumo-contenidos)+ "litros para el viaje";
            }
        } else {
            return "No puedes conducir con el coche apagado";
        }
    }

}
