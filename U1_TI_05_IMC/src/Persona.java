public class Persona {

    private String nombre;
    private double altura;
    private double peso;

    double calcularIMC() {
        double imc=0.0;
        imc = (peso)/(altura*altura);
        return imc;
    }

    String clasificarIMC(double imc) {
        String clasif = "";
        if(imc < 18.5){
            clasif="Bajo peso";
        }else if(imc >= 18.5 && imc < 25){
            clasif="Peso normal";
        }else if(imc >= 25 && imc < 30){
            clasif="Sobrepeso";
        }else if(imc >30){
            clasif="Obesidad";
        }
        return clasif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
