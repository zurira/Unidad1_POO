import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();
        System.out.println("Ingrese su altura");
        double altura = sc.nextDouble();
        System.out.println("Ingrese su peso");
        double peso = sc.nextDouble();

        persona.setNombre(nombre);
        persona.setAltura(altura);
        persona.setPeso(peso);

        double imc= persona.calcularIMC();

        System.out.println("Clasificación: " +persona.clasificarIMC(imc) );
    }
}