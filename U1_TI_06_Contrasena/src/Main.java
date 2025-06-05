import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        UsuarioSeguro usuario = new UsuarioSeguro();
        String nombreUsuario= JOptionPane.showInputDialog("Ingresa usuario");
        usuario.setNombreUsuario(nombreUsuario);
        String contrasena = JOptionPane.showInputDialog("Ingresa contrasena");
        usuario.setContrasena(contrasena);

         if (usuario.getNombreUsuario() == null || usuario.getContrasena() == null) {
            JOptionPane.showMessageDialog(null, "No se pudo crear el usuario.");
            return;
        }

        String intento1 = JOptionPane.showInputDialog("Ingrese la contraseña para autenticarse:");
        if (usuario.autenticar(intento1)) {
            JOptionPane.showMessageDialog(null, "Acceso concedido");
        } else {
            JOptionPane.showMessageDialog(null, "Acceso denegado");
        }
        

    }
}