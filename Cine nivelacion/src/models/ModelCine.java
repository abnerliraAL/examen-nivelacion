
package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class ModelCine {

    private Connection conexion;
    private Statement st;
    private ResultSet rs;

    private String nombre;
    private String Genero;
    private int id;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return Genero;
    }
    public void setGenero(String Genero) {
        this.Genero = Genero;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método que realiza las siguietnes acciones:
     * 1.- Conecta con la base Cine_mvc.
     * 2.- Consulta todo los registros de la tabla contactos.
     * 3.- Obtiene el nombre y el email y los guarda en las variables globales
     * nombre y email.
     */
    public void conectarDB() {
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/Cine_mvc", "user_mvc", "pass_mvc.2018");
            st = conexion.createStatement();
            rs = st.executeQuery("SELECT * FROM Peliculas;");
            rs.next();
            nombre = rs.getString("nombre");
            Genero = rs.getString("Genero");
        } catch (SQLException err) {
            JOptionPane.showMessageDialog(null, "Error ModelCine 001: " + err.getMessage());
        }
    }
    
    /**
     * Método que realiza las siguiente acciones:
     * 1.- Moverse al primer registro
     * 2.- obtener el valor del nombre de rs y guardarlo en la variable nombre
     * 3.- obtener el valor del email de rs y guardarlo en la variable email
     */
    public void moverPrimerRegistro(){
        try {
            if (rs.isFirst() == false) {
                rs.first(); //Primer registro

                this.setNombre(rs.getString("nombre"));
                this.setGenero(rs.getString("Genero"));
            }
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Error " + err.getMessage());
        }
    }
    
    /**
     * Método que realiza las siguiente acciones:
     * 1.- Moverse al anterior registro
     * 2.- obtener el valor del nombre de rs y guardarlo en la variable nombre
     * 3.- obtener el valor del email de rs y guardarlo en la variable email
     */
    public void moverAnteriorRegistro(){
        try {
            if (rs.isFirst() == false) {
                rs.previous(); //Registro anterior

                this.setNombre(rs.getString("nombre"));
                this.setGenero(rs.getString("Genero"));
            }
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Error " + err.getMessage());
        }
    }
    
    /**
     * Método que realiza las siguiente acciones:
     * 1.- Moverse al siguiente registro
     * 2.- obtener el valor del nombre de rs y guardarlo en la variable nombre
     * 3.- obtener el valor del email de rs y guardarlo en la variable email
     */
    public void moverSiguienteRegistro(){
        try{
            if(rs.isLast()==false) {
                rs.next(); // Siguiente registro 
                
                this.setNombre(rs.getString("nombre"));
                this.setGenero(rs.getString("Genero"));
            }
        } catch(Exception err) {
            JOptionPane.showMessageDialog(null,"Error " + err.getMessage());
        }
    }
    
    /**
     * Método que realiza las siguiente acciones:
     * 1.- Moverse al ultimo registro
     * 2.- obtener el valor del nombre de rs y guardarlo en la variable nombre
     * 3.- obtener el valor del email de rs y guardarlo en la variable email
     */
    public void moverUltimoRegistro(){
        try {
            if (rs.isLast() == false) {
                rs.last(); //Último registro

                this.setNombre(rs.getString("nombre"));
                this.setGenero(rs.getString("Genero"));
            }
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Error " + err.getMessage());
        }
    }
    
    
    /**
     * Método que realiza las siguiente acciones:
     *  - Crea un nuevo registro y lo almacena en la base de datos.
     */
    public void insertarRegistro() {
        try {
            nombre = this.getNombre();
            Genero = this.getGenero();
            st.executeUpdate("INSERT INTO Pelicula (nombre, Genero)" + " VALUES ('"+ nombre +"','"+ Genero +"');");
            JOptionPane.showMessageDialog(null, "el registro se guardo");
            this.conectarDB();
            this.moverUltimoRegistro();
        }
        catch(SQLException err) { 
            JOptionPane.showMessageDialog(null,"Error "+err.getMessage()); 
        }
    }
    
    /**
     * Método que realiza las siguiente acciones:
     *  - Guarda los cambios realizados a un registro seleccionado.
     */
    public void modificarRegistro() {
        try {
            id = rs.getInt("id_Pelicula");
            nombre = this.getNombre();
            Genero = this.getGenero();
            st.executeUpdate("UPDATE Peliculas SET nombre = '"+ nombre +"', Genero = '"+ Genero +"' WHERE id_Pelicula = "+ id +"; ");
            JOptionPane.showMessageDialog(null, "registro modificado.");
            this.conectarDB();
            this.moverUltimoRegistro();
        }
        catch(SQLException err) { 
            JOptionPane.showMessageDialog(null,"Error "+err.getMessage()); 
        }
    }
    
    /**
     * Método que realiza las siguiente acciones:
     *  - Muestra un mensaje preguntando si el usuario desea borrar el registro. S
     *  - Si hace clic en si, se elimina el registro, en caso de hacer clic en no, no se elimina el registro.
     */
    public void eliminarRegistro() {
        try {
            int respuesta = JOptionPane.showConfirmDialog(null, "registro eliminado", "Borrar", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                id = rs.getInt("id_Pelicula");
                st.executeUpdate("DELETE FROM Peliculas WHERE id_Pelicula = "+ id +"; ");
                
                this.conectarDB();
                this.moverUltimoRegistro();
            }
            else {
                this.conectarDB();
                this.moverUltimoRegistro();
            }
        }
        catch(SQLException err) { 
            JOptionPane.showMessageDialog(null,"Error "+err.getMessage()); 
        }
    }
    
}
