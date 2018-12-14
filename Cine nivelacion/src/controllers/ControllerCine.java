
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelCine;
import views.ViewCine;


public class ControllerCine {

    ModelCine modelCine;
    ViewCine viewCine;

    /**
     * Objeto de tipo ActionListener para atrapar los eventos actionPerformed y
     * llamar a los metodos para ver los registros almacenados en la bd.
     */
    ActionListener actionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == viewCine.jbtn_primero) {
                jbtn_primero_actionPerformed();
            }
            else if (e.getSource() == viewCine.jbtn_anterior) {
                jbtn_anterior_actionPerformed();
            }
            else if (e.getSource() == viewCine.jbtn_siguiente) {
                jbtn_siguiente_actionPerformed();
            }
            else if (e.getSource() == viewCine.jbtn_ultimo) {
                jbtn_ultimo_actionPerformed();
            }
            else if (e.getSource() == viewCine.jbtn_nuevo) {
                jbtn_nuevo_actionPerformed();
            }
            else if (e.getSource() == viewCine.jbtn_insertar) {
                jbtn_insertar_actionPerformed();
            }
            else if (e.getSource() == viewCine.jbtn_modificar) {
                jbtn_modificar_actionPerformed();
            }
            else if (e.getSource() == viewCine.jbtn_eliminar) {
                jbtn_eliminar_actionPerformed();
            }
        }

    };

    /**
     * Constructor de Controlador para unir el ModelAgenda y ViewAgenda
     *
     * @param modelCine objeto de tipo ModelCine
     * @param viewCine objeto de tipo ViewCine
     */
    public ControllerCine(ModelCine modelCine, ViewCine viewCine) {
        this.modelCine = modelCine;
        this.viewCine = viewCine;
        initComponents();
        setActionListener();
        initDB();
    }

    /**
     * Método que llama al método conectarBD del modelo y muestra el nombre y
     * email del primer registro en las cajas de texto de ViewCine.
     */
    public void initDB(){
        modelCine.conectarDB();
        viewCine.jtf_nombre.setText(modelCine.getNombre());
        viewCine.jtf_Genero.setText(modelCine.getGenero());
    }
    /**
     * Metodo para inicializar la ViewAgenda
     */
    public void initComponents() {
        viewCine.setLocationRelativeTo(null);
        viewCine.setTitle("Cine MVC");
        viewCine.setVisible(true);
    }

    /**
     * Método para agregar el actionListener a cada boton de la vista
     */
    public void setActionListener() {
        viewCine.jbtn_primero.addActionListener(actionListener);
        viewCine.jbtn_anterior.addActionListener(actionListener);
        viewCine.jbtn_siguiente.addActionListener(actionListener);
        viewCine.jbtn_ultimo.addActionListener(actionListener);
        viewCine.jbtn_nuevo.addActionListener(actionListener);
        viewCine.jbtn_insertar.addActionListener(actionListener);
        viewCine.jbtn_modificar.addActionListener(actionListener);
        viewCine.jbtn_eliminar.addActionListener(actionListener);
    }

    /**
     * Método para ver el primer registro de la tabla Pelicula
     */
    private void jbtn_primero_actionPerformed() {
        modelCine.moverPrimerRegistro(); //invocar al metodo moverPrimerRegistro
        viewCine.jtf_nombre.setText(modelCine.getNombre()); //mostrar nombre en la vista
        viewCine.jtf_Genero.setText(modelCine.getGenero()); //mostar Genero en la vista
    }

    /**
     * Método para ver el registro anterior de la tabla contactos
     */
    private void jbtn_anterior_actionPerformed() {
        modelCine.moverAnteriorRegistro(); //invocar al metodo moverAnteriorRegistro
        viewCine.jtf_nombre.setText(modelCine.getNombre()); //mostrar nombre en la vista
        viewCine.jtf_Genero.setText(modelCine.getGenero()); //mostar Genero en la vista
    }

    /**
     * Método para ver el siguiente registro de la tabla contactos
     */
    private void jbtn_siguiente_actionPerformed() {
        modelCine.moverSiguienteRegistro(); //invocar al metodo moverSiguienteRegistro
        viewCine.jtf_nombre.setText(modelCine.getNombre()); //mostrar nombre en la vista
        viewCine.jtf_Genero.setText(modelCine.getGenero()); //mostar Genero en la vista
    }
    
    /**
     * Método para ver el último registro de la tabla contactos
     */
    private void jbtn_ultimo_actionPerformed() {
        modelCine.moverUltimoRegistro(); //invocar al metodo moverUltimoRegistro
        viewCine.jtf_nombre.setText(modelCine.getNombre()); //mostrar nombre en la vista
        viewCine.jtf_Genero.setText(modelCine.getGenero()); //mostar Genero en la vista
    }
    
    /**
     * Método para preparar la interfaz para colocar un nuevo registro en la tabla contactos
     */
    public void jbtn_nuevo_actionPerformed() {
        viewCine.jtf_nombre.setText(""); // Limpia los campos de texto de la vista. (2)
        viewCine.jtf_Genero.setText("");
    }
    
    /**
     * Método para guardar un nuevo registro en la tabla contactos
     */
    public void jbtn_insertar_actionPerformed() {
        modelCine.setNombre(viewCine.jtf_nombre.getText()); // Asigna el valor de "Nombre" de la vista a la variable.
        modelCine.setGenero(viewCine.jtf_Genero.getText()); // Asigna el valor de "Genero" de la vista a la variable.
        modelCine.insertarRegistro(); // Invoca al método para Guardar o Insertar un nuevo registro.
    }
    
    /**
     * Método para modificar un registro de la tabla contactos
     */
    public void jbtn_modificar_actionPerformed() {
        modelCine.setNombre(viewCine.jtf_nombre.getText()); // Asigna el nuevo valor de "Genero" de la vista a la variable.
        modelCine.setGenero(viewCine.jtf_Genero.getText()); // Asigna el nuevo valor de "Genero" de la vista a la variable.
        modelCine.modificarRegistro(); // Invoca al método para Modificar (actualizar) un registro.
    }
    
    /**
     * Método para eliminar un registro de la tabla contactos
     */
    public void jbtn_eliminar_actionPerformed() {
        modelCine.eliminarRegistro(); // Invoca al método para Eliminar un registro.
    }
    
}
