import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class UsuarioSeguro {

    private String nombreUsuario = "";
    private String contrasena = "";

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
        if (contrasena == null || contrasena.length() < 8) {
            String contrasenaN = JOptionPane.showInputDialog("La contaseña debe tener 8 caracteres");
        }
        for (int i = 0; i < contrasena.length(); i++) {
            System.out.print(contrasena.charAt(i));
        }
        this.contrasena = contrasena;
    }

    public boolean autenticar(String intentPassword) {
    return contrasena.equals(intentPassword);
    }
}