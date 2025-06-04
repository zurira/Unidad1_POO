import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        UsuarioSeguro usuario = new UsuarioSeguro();
        String nombre= JOptionPane.showInputDialog("Ingresa usuario");
        String contrasena = JOptionPane.showInputDialog("Ingresa contrasena");
        usuario.setNombreUsuario(nombre);
        usuario.setContrasena(contrasena);

    }
}