package views;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Ricardo
 */
public class ViewCine extends javax.swing.JFrame {

    /**
     * Creates new form ViewAgenda
     */
    public ViewCine() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jl_nombre = new javax.swing.JLabel();
        jl_Genero = new javax.swing.JLabel();
        jtf_nombre = new javax.swing.JTextField();
        jtf_Genero = new javax.swing.JTextField();
        jbtn_primero = new javax.swing.JButton();
        jbtn_anterior = new javax.swing.JButton();
        jbtn_siguiente = new javax.swing.JButton();
        jbtn_ultimo = new javax.swing.JButton();
        jl_titulo = new javax.swing.JLabel();
        jbtn_nuevo = new javax.swing.JButton();
        jbtn_insertar = new javax.swing.JButton();
        jbtn_modificar = new javax.swing.JButton();
        jbtn_eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jl_nombre.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jl_nombre.setText("Nombre de pelicula :");

        jl_Genero.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jl_Genero.setText("Genero de peliculas:");

        jtf_nombre.setBackground(new java.awt.Color(0, 204, 0));
        jtf_nombre.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        jtf_Genero.setBackground(new java.awt.Color(0, 204, 0));
        jtf_Genero.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N

        jbtn_primero.setBackground(new java.awt.Color(255, 51, 0));
        jbtn_primero.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jbtn_primero.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_primero.setText("|<");

        jbtn_anterior.setBackground(new java.awt.Color(255, 51, 0));
        jbtn_anterior.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jbtn_anterior.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_anterior.setText("<<");

        jbtn_siguiente.setBackground(new java.awt.Color(255, 51, 0));
        jbtn_siguiente.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jbtn_siguiente.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_siguiente.setText(">>");

        jbtn_ultimo.setBackground(new java.awt.Color(255, 51, 0));
        jbtn_ultimo.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jbtn_ultimo.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_ultimo.setText(">|");

        jl_titulo.setBackground(new java.awt.Color(0, 51, 204));
        jl_titulo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jl_titulo.setForeground(new java.awt.Color(255, 0, 0));
        jl_titulo.setText(" peliculas:");

        jbtn_nuevo.setBackground(new java.awt.Color(255, 0, 0));
        jbtn_nuevo.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jbtn_nuevo.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_nuevo.setText("Nueva pelicula");

        jbtn_insertar.setBackground(new java.awt.Color(255, 0, 0));
        jbtn_insertar.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jbtn_insertar.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_insertar.setText("Insertar pelicula");

        jbtn_modificar.setBackground(new java.awt.Color(255, 0, 0));
        jbtn_modificar.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jbtn_modificar.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_modificar.setText("Modificar pelicula");

        jbtn_eliminar.setBackground(new java.awt.Color(255, 0, 0));
        jbtn_eliminar.setFont(new java.awt.Font("Century Gothic", 1, 11)); // NOI18N
        jbtn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbtn_eliminar.setText("Eliminar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jbtn_primero))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jbtn_nuevo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn_anterior)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtn_siguiente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtn_ultimo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn_insertar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(jbtn_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbtn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(173, 173, 173))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(151, 151, 151)))))
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jl_titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jl_Genero))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jl_nombre)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jl_titulo)
                .addGap(18, 18, 18)
                .addComponent(jl_nombre)
                .addGap(3, 3, 3)
                .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jl_Genero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_primero)
                    .addComponent(jbtn_anterior)
                    .addComponent(jbtn_siguiente)
                    .addComponent(jbtn_ultimo))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_insertar)
                    .addComponent(jbtn_modificar)
                    .addComponent(jbtn_nuevo))
                .addGap(18, 18, 18)
                .addComponent(jbtn_eliminar)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewCine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jbtn_anterior;
    public javax.swing.JButton jbtn_eliminar;
    public javax.swing.JButton jbtn_insertar;
    public javax.swing.JButton jbtn_modificar;
    public javax.swing.JButton jbtn_nuevo;
    public javax.swing.JButton jbtn_primero;
    public javax.swing.JButton jbtn_siguiente;
    public javax.swing.JButton jbtn_ultimo;
    public javax.swing.JLabel jl_Genero;
    public javax.swing.JLabel jl_nombre;
    private javax.swing.JLabel jl_titulo;
    public javax.swing.JTextField jtf_Genero;
    public javax.swing.JTextField jtf_nombre;
    // End of variables declaration//GEN-END:variables
}
