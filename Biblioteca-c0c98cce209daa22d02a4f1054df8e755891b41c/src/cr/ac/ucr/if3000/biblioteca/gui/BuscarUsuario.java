/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.if3000.biblioteca.gui;

import cr.ac.ucr.if3000.biblioteca.domain.Autor;
import cr.ac.ucr.if3000.biblioteca.domain.Biblioteca;
import cr.ac.ucr.if3000.biblioteca.domain.Catalogo;
import cr.ac.ucr.if3000.biblioteca.domain.Libro;
import cr.ac.ucr.if3000.biblioteca.domain.Persona;
import cr.ac.ucr.if3000.biblioteca.domain.Usuario;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public class BuscarUsuario extends javax.swing.JFrame {

    DefaultTableModel tablaPersonas;
    TableRowSorter trs;
    Biblioteca biblioteca;
    int codigoLibro;
    String tipoInterfaz;
    String indicacion;
    Catalogo catalogo;

    public BuscarUsuario() {
        tablaPersonas = new DefaultTableModel();
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        biblioteca = new Biblioteca();
        tipoInterfaz = "";
        jButtonDevolverse.setVisible(false);

        tablaPersonas.addColumn("NombreUnico");
        tablaPersonas.addColumn("Contraseña");
        tablaPersonas.addColumn("Nombre Completo");
        tablaPersonas.addColumn("Tipo de identificacion");
        tablaPersonas.addColumn("Identificacion");

        for (int i = 0; i < biblioteca.getPersonas().size(); i++) {
            Persona persona = biblioteca.getPersonas().get(i);

            tablaPersonas.addRow(new Object[]{persona.getNombreUnico(), persona.getContraseña(), persona.getNombreCompleto(), persona.getTipoIdentificacion(), persona.getIdentificacion()});
            this.jTableListaUsuarios.setModel(tablaPersonas);

        }

    }

    BuscarUsuario(int codigoCatalogo) {
        tablaPersonas = new DefaultTableModel();
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        biblioteca = new Biblioteca();
        codigoLibro = codigoCatalogo;
        tipoInterfaz = "";
        jButtonDevolverse.setVisible(false);

        tablaPersonas.addColumn("NombreUnico");
        tablaPersonas.addColumn("Contraseña");
        tablaPersonas.addColumn("Nombre Completo");
        tablaPersonas.addColumn("Tipo de identificacion");
        tablaPersonas.addColumn("Identificacion");

        for (int i = 0; i < biblioteca.getPersonas().size(); i++) {
            Persona persona = biblioteca.getPersonas().get(i);
            if (persona instanceof Usuario) {

                tablaPersonas.addRow(new Object[]{persona.getNombreUnico(), persona.getContraseña(), persona.getNombreCompleto(), persona.getTipoIdentificacion(), persona.getIdentificacion()});
            }
//            this.jTableListaUsuarios.setModel(tablaPersonas);

        }
        this.jTableListaUsuarios.setModel(tablaPersonas);
    }

    BuscarUsuario(String tipo) {
        tablaPersonas = new DefaultTableModel();
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        biblioteca = new Biblioteca();
        tipoInterfaz = tipo;
        jButtonSeleccionar.setVisible(false);

        tablaPersonas.addColumn("NombreUnico");
        tablaPersonas.addColumn("Contraseña");
        tablaPersonas.addColumn("Nombre Completo");
        tablaPersonas.addColumn("Tipo de identificacion");
        tablaPersonas.addColumn("Identificacion");

        for (int i = 0; i < biblioteca.getPersonas().size(); i++) {
            Persona persona = biblioteca.getPersonas().get(i);

            tablaPersonas.addRow(new Object[]{persona.getNombreUnico(), persona.getContraseña(), persona.getNombreCompleto(), persona.getTipoIdentificacion(), persona.getIdentificacion()});
            this.jTableListaUsuarios.setModel(tablaPersonas);

        }
    }

    BuscarUsuario(String tipo, String buscar) {
        tablaPersonas = new DefaultTableModel();
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        biblioteca = new Biblioteca();
        tipoInterfaz = tipo;
        indicacion = buscar;

        tablaPersonas.addColumn("NombreUnico");
        tablaPersonas.addColumn("Contraseña");
        tablaPersonas.addColumn("Nombre Completo");
        tablaPersonas.addColumn("Tipo de identificacion");
        tablaPersonas.addColumn("Identificacion");

        for (int i = 0; i < biblioteca.getPersonas().size(); i++) {
            Persona persona = biblioteca.getPersonas().get(i);
            if (persona instanceof Autor) {
                tablaPersonas.addRow(new Object[]{persona.getNombreUnico(), persona.getContraseña(), persona.getNombreCompleto(), persona.getTipoIdentificacion(), persona.getIdentificacion()});
            }
            this.jTableListaUsuarios.setModel(tablaPersonas);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelBuscarUsuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaUsuarios = new javax.swing.JTable();
        jLabelNumeroIdentificacion = new javax.swing.JLabel();
        jTextFieldNumeroIdentificacionBuscar = new javax.swing.JTextField();
        jButtonSeleccionar = new javax.swing.JButton();
        jButtonDevolverse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buscar Usuario");

        jLabelBuscarUsuario.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabelBuscarUsuario.setForeground(new java.awt.Color(0, 51, 255));
        jLabelBuscarUsuario.setText("Buscar Usuario");

        jTableListaUsuarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        jTableListaUsuarios.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jTableListaUsuarios.setForeground(new java.awt.Color(0, 51, 255));
        jTableListaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Usuario", "Contraseña", "Nombre", "Tipo Identificación", "N° Identificación"
            }
        ));
        jScrollPane1.setViewportView(jTableListaUsuarios);

        jLabelNumeroIdentificacion.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabelNumeroIdentificacion.setForeground(new java.awt.Color(0, 51, 255));
        jLabelNumeroIdentificacion.setText("N°Identificación");

        jTextFieldNumeroIdentificacionBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        jTextFieldNumeroIdentificacionBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNumeroIdentificacionBuscarKeyTyped(evt);
            }
        });

        jButtonSeleccionar.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jButtonSeleccionar.setForeground(new java.awt.Color(0, 51, 255));
        jButtonSeleccionar.setText("Seleccionar");
        jButtonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeleccionarActionPerformed(evt);
            }
        });

        jButtonDevolverse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/ucr/if3000/biblioteca/Imagenes/sign-out.png"))); // NOI18N
        jButtonDevolverse.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        jButtonDevolverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDevolverseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelBuscarUsuario)
                .addGap(333, 333, 333))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonDevolverse, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addComponent(jLabelNumeroIdentificacion)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldNumeroIdentificacionBuscar)))
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jButtonSeleccionar)
                                .addContainerGap(112, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelNumeroIdentificacion)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldNumeroIdentificacionBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButtonSeleccionar)
                .addGap(170, 170, 170))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonDevolverse, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabelBuscarUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNumeroIdentificacionBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumeroIdentificacionBuscarKeyTyped

        jTextFieldNumeroIdentificacionBuscar.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent ke) {
                trs.setRowFilter(RowFilter.regexFilter(jTextFieldNumeroIdentificacionBuscar.getText(), 4));
            }

        });

        trs = new TableRowSorter(tablaPersonas);
        jTableListaUsuarios.setRowSorter(trs);

    }//GEN-LAST:event_jTextFieldNumeroIdentificacionBuscarKeyTyped

    private void jButtonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleccionarActionPerformed

        String identificacion;
        identificacion = ((String) tablaPersonas.getValueAt(jTableListaUsuarios.getSelectedRow(), 0));

        System.out.println(identificacion);
        if (tipoInterfaz.equalsIgnoreCase("")) {
            RegistrarPrestamo registrarPrestamo = new RegistrarPrestamo(codigoLibro, identificacion);
            registrarPrestamo.setVisible(true);
        }
        if (tipoInterfaz.equalsIgnoreCase("MenuBibliotecologo")) {
            MenuBibliotecologo menuBibliotecologo = new MenuBibliotecologo();
            menuBibliotecologo.setVisible(true);
        }

        if (tipoInterfaz.equalsIgnoreCase("LibrosPrestados")) {
            LibrosPrestados librosPrestados = new LibrosPrestados(biblioteca.buscarPersonaPorIdentificacion(identificacion));
            librosPrestados.setVisible(true);
        }
        if (tipoInterfaz.equalsIgnoreCase("Libro")) {
            AgregarLibro agregarLibro = new AgregarLibro((Autor) biblioteca.buscarPersonaPorIdentificacion(identificacion));
            agregarLibro.setVisible(true);
        }
        if (tipoInterfaz.equalsIgnoreCase("Memoria")) {
            AgregarMemoria agregarMemoria = new AgregarMemoria((Autor) biblioteca.buscarPersonaPorIdentificacion(identificacion));
            agregarMemoria.setVisible(true);
        }
        if (tipoInterfaz.equalsIgnoreCase("Otro")) {
            AgregarOtro agregarOtro = new AgregarOtro((Autor) biblioteca.buscarPersonaPorIdentificacion(identificacion));
            agregarOtro.setVisible(true);
        }
        if (tipoInterfaz.equalsIgnoreCase("Periodico")) {
            AgregarPeriodico agregarPeriodico = new AgregarPeriodico((Autor) biblioteca.buscarPersonaPorIdentificacion(identificacion));
            agregarPeriodico.setVisible(true);
        }
        if (tipoInterfaz.equalsIgnoreCase("Revista")) {
            AgregarRevista agregarRevista = new AgregarRevista((Autor) biblioteca.buscarPersonaPorIdentificacion(identificacion));
            agregarRevista.setVisible(true);
        }
        if (tipoInterfaz.equalsIgnoreCase("Tesis")) {
            AgregarRevista agregarRevista = new AgregarRevista((Autor) biblioteca.buscarPersonaPorIdentificacion(identificacion));
            agregarRevista.setVisible(true);
        }

        dispose();
    }//GEN-LAST:event_jButtonSeleccionarActionPerformed

    private void jButtonDevolverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDevolverseActionPerformed
        MenuBibliotecologo menuBibliotecologo = new MenuBibliotecologo();
        menuBibliotecologo.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonDevolverseActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDevolverse;
    private javax.swing.JButton jButtonSeleccionar;
    private javax.swing.JLabel jLabelBuscarUsuario;
    private javax.swing.JLabel jLabelNumeroIdentificacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListaUsuarios;
    private javax.swing.JTextField jTextFieldNumeroIdentificacionBuscar;
    // End of variables declaration//GEN-END:variables

}
