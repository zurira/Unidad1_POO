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



        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.printf("Promedio: %.2f\n", estudiante1.calcularPromedio());
        System.out.println("¿Aprobado?: " + (estudiante1.aprobado() ? "Sí" :"No"));
    }
}