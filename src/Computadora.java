public class Computadora {

    private String marca = "DELL";
    private String modelo;
    private boolean encendida ;

    public void encender() {
        if (!encendida) {
            encendida=true;
            System.out.println("Encendiendo...");
        }
    }

    public void apagar() {
        if (encendida) {
            encendida= false;
            System.out.println("Apagando...");
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isEncendida() {
        return encendida;
    }
}

