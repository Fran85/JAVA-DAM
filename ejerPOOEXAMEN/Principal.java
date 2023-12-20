package ejerPOOEXAMEN;

public class Principal {

    public static void main(String[] args) {

        Coche cochecito = new Coche("audi", "A3", 46.5, 140.000);
        Coche co2 = new Coche("er", "sd", 3535, 23423);
        Coche co3 = new Coche("rf", "reg", 3453453, 4345, "dfg", "diese;");

        co2.setColor("verdeee");
        System.out.println(co2.getColor());
        co3.setColor("amarillo");
        co3.setPrecio(100);
        System.out.println(co3.getBitCoin());

    }

}
