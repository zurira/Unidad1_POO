import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class UsuarioSeguro {

    private String nombreUsuario = getNombreUsuario();
    private String contrasena = getContrasena();

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario == null || nombreUsuario.isEmpty()) {
           String nombreN = JOptionPane.showInputDialog(null, "El nombre del usuario no puede estar vacio, ingrese usuario");
        }
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        boolean mayusculas=false;
        boolean minusculas=false;
        if (contrasena == null || contrasena.length() < 8) {
            if (Character.isUpperCase(Integer.parseInt(contrasena)) || Character.isLowerCase(Integer.parseInt(contrasena))) {
             mayusculas=true;
             minusculas=true;
            }else {
                contrasena=JOptionPane.showInputDialog("Ingrese una contraseña valida");
            }
            String contrasenaN = JOptionPane.showInputDialog("La contraseña debe tener 8 caracteres");
        }

        this.contrasena = contrasena;
    }

    public boolean autenticar(boolean mayusculas, boolean minusculas, String intentContrasena) {
        if (mayusculas==true || minusculas==true){
            System.out.println("Acceso concedido");
        }else {
            System.out.println("Acceso denegado");
        }
    return mayusculas || minusculas;
    }
}