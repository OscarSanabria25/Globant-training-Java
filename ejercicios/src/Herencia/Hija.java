package Herencia;

public class Hija extends Padre {

    private String tipoCarro;
    private String transmicion;


    public Hija(String nombre, String modelo, String marca, String tipoCarro, String transmicion) {
        super(nombre, modelo, marca);
        this.tipoCarro = tipoCarro;
        this.transmicion = transmicion;
    }

    @Override
    public String toString() {
        return "Hija{" +
                "tipoCarro='" + tipoCarro + '\'' +
                ", transmicion='" + transmicion + '\'' +
                '}';
    }
}
