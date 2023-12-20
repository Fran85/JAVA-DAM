package ejerPOOEXAMEN;

public class Coche {

    //atributos 
    private String marca;
    private String modelo;
    private double km;
    private String combustible;
    private String color;
    private double precio;

    private static final double BITCOIN = 43491.59;
    
    //constructores 
    public Coche() {

    }

    public Coche(String marca, String modelo, double km, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
        this.precio = precio;

    }

    public Coche(String marca, String modelo, double km, double precio, String color, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.km = km;
        this.precio = precio;
        this.color = color;
        this.combustible = combustible;

    }

    //metodos 
    //funcion
    public String getMarca() {
        return marca;
    }

    //procedimiento        
    public void setMarca(String marca) {
        this.marca = marca;

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;

    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public String getCombustible() {
        return combustible;
    }

    public String getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setValor(double precio) {
        this.precio = precio;
    }

    //metodos que me piden 
    public void pasarItv() {
        precio += 60;

    }

    public void pagarAveria(double precioAveria) {
        precio += precioAveria;

    }

    public double getBitCoin() {

        //final double VALOR = 43491.59;
        precio /= BITCOIN;
        return precio;
    }

}
