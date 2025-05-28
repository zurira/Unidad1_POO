public class Main {
    public static void main (String[] args) throws Exception {
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        Estudiante estudiante3 = new Estudiante();
        Estudiante estudiante4 = new Estudiante();
        Estudiante estudiante5 = new Estudiante();
        estudiante1.setNombre("Zuri");
        estudiante1.setMatricula("e001");
        estudiante1.setNota(0, 100);
        estudiante1.setNota(1, 100);
        estudiante1.setNota(2, 80);
        estudiante1.setNota(3, 70);
        estudiante1.setNota(4, 80);

        estudiante2.setNombre("Keren");
        estudiante2.setMatricula("e002");
        estudiante2.setNota(0, 90);
        estudiante2.setNota(1, 100);
        estudiante2.setNota(2, 80);
        estudiante2.setNota(3, 70);
        estudiante2.setNota(4, 80);

        estudiante3.setNombre("Viviana");
        estudiante3.setMatricula("e003");
        estudiante3.setNota(0, 90);
        estudiante3.setNota(1, 80);
        estudiante3.setNota(2, 80);
        estudiante3.setNota(3, 70);
        estudiante3.setNota(4, 80);

        estudiante4.setNombre("Tania");
        estudiante4.setMatricula("e004");
        estudiante4.setNota(0, 70);
        estudiante4.setNota(1, 100);
        estudiante4.setNota(2, 80);
        estudiante4.setNota(3, 70);
        estudiante4.setNota(4, 80);

        estudiante5.setNombre("Lizzete");
        estudiante5.setMatricula("e005");
        estudiante5.setNota(0, 90);
        estudiante5.setNota(1, 70);
        estudiante5.setNota(2, 80);
        estudiante5.setNota(3, 70);
        estudiante5.setNota(4, 80);

        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.printf("Promedio: %.2f\n", estudiante1.calcularPromedio());
        System.out.println("¿Aprobado?: " + (estudiante1.aprobado() ? "Sí" :"No"));

        System.out.println("Nombre: " + estudiante2.getNombre());
        System.out.printf("Promedio: %.2f\n", estudiante2.calcularPromedio());
        System.out.println("¿Aprobado?: " + (estudiante2.aprobado() ? "Sí" :"No"));

        System.out.println("Nombre: " + estudiante3.getNombre());
        System.out.printf("Promedio: %.2f\n", estudiante3.calcularPromedio());
        System.out.println("¿Aprobado?: " + (estudiante3.aprobado() ? "Sí" :"No"));

        System.out.println("Nombre: " + estudiante4.getNombre());
        System.out.printf("Promedio: %.2f\n", estudiante4.calcularPromedio());
        System.out.println("¿Aprobado?: " + (estudiante4.aprobado() ? "Sí" :"No"));

        System.out.println("Nombre: " + estudiante5.getNombre());
        System.out.printf("Promedio: %.2f\n", estudiante5.calcularPromedio());
        System.out.println("¿Aprobado?: " + (estudiante5.aprobado() ? "Sí" :"No"));
    }
}