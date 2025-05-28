//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Computadora computadora = new Computadora();
        computadora.encender();
        computadora.encender();

        computadora.setModelo("Inspiron 35");

        System.out.println("Marca:" +computadora.getMarca());
        System.out.println("Modelo:" +computadora.getModelo());

        computadora.apagar();
    }
}