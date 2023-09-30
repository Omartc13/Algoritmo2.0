package modelo;

import config.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Omar Tc
 */
public class Registro_Gerente {
    
    private String dni;
    private String Nombre;
    private String Apellido;
    private String Usuario;
    private String contraseña;

    public Registro_Gerente(String dni, String Nombre, String Apellido, String Usuario, String contraseña) {
        this.dni = dni;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Usuario = Usuario;
        this.contraseña = contraseña;
    }

    public Registro_Gerente(String Usuario, String contraseña) {
        this.Usuario = Usuario;
        this.contraseña = contraseña;
    }
    
    public Registro_Gerente() {
    }
    
    //metodo para agregar gerente a BDD
    
    public void guardarusuario(String dni, String Nombre, String Apellido, String Usuario, String contraseña){
        Conexion db = new Conexion();
        String in= "insert into usuario(DNI,Nombre,Apellido,Usuario,Contraseña) values('"+dni+"','"+Nombre+"','"+Apellido+"','"+Usuario+"','"+contraseña+"')";
        Statement st;
        Connection conexion= db.conectar();
        try{
            st= conexion.createStatement();
            int rs= st.executeUpdate(in);
            JOptionPane.showMessageDialog(null, "Guardado correctamente");
        }catch(SQLException e){
            System.out.println(e);
        }
    }
        
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}