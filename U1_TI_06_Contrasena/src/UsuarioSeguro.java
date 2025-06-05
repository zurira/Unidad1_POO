import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class UsuarioSeguro {

    private String nombreUsuario;
    private String contrasena;

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario == null || nombreUsuario.isEmpty()) {
           nombreUsuario = JOptionPane.showInputDialog(null, "El nombre del usuario no puede estar vacio, ingrese usuario");
        }
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        boolean mayusculas=false;
        boolean minusculas=false;
        boolean numero=false;
        if (contrasena == null || contrasena.length() < 8) {
            contrasena = JOptionPane.showInputDialog("La contraseña debe tener 8 caracteres");
        }
        for (int i = 0; i < contrasena.length(); i++) {
        char c = contrasena.charAt(i);

        if (Character.isUpperCase(c)) {
            mayusculas = true;
        } else if (Character.isLowerCase(c)) {
            minusculas = true;
        } else if (Character.isDigit(c)) {
            numero = true;
        }
        }
        if (!mayusculas) {
            JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos una letra mayúscula.");
            return;
        }

        if (!minusculas) {
            JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos una letra minúscula.");
            return;
        }

        if (!numero) {
            JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos un número.");
            return;
        }
        this.contrasena = contrasena;
    }

    public boolean autenticar(String intentPassword) {

    return contrasena!= null && contrasena.equals(intentPassword);
    }
}