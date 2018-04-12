/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.if3000.biblioteca.gui;

import cr.ac.ucr.if3000.biblioteca.domain.Biblioteca;
import cr.ac.ucr.if3000.biblioteca.domain.Persona;
import cr.ac.ucr.if3000.biblioteca.domain.Usuario;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public class MantenimentoUsuarios extends javax.swing.JFrame {

    Biblioteca biblioteca;
    DefaultTableModel tablaUsuarios;

    public MantenimentoUsuarios() {
        tablaUsuarios = new DefaultTableModel();
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        biblioteca = new Biblioteca();

        tablaUsuarios.addColumn("NombreUnico");
        tablaUsuarios.addColumn("Contraseña");
        tablaUsuarios.addColumn("Nombre Completo");
        tablaUsuarios.addColumn("Tipo de identificacion");
        tablaUsuarios.addColumn("Identificacion");

        for (int i = 0; i < biblioteca.getPersonas().size(); i++) {
            Persona persona = biblioteca.getPersonas().get(i);
            if (persona instanceof Usuario) {
                tablaUsuarios.addRow(new Object[]{persona.getNombreUnico(), persona.getContraseña(), persona.getNombreCompleto(), persona.getTipoIdentificacion(), persona.getIdentificacion()});
                this.jTableListaUsuarios.setModel(tablaUsuarios);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelMantenimientoUsuarios = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonVerLibrosPrestados = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaUsuarios = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mantenimiento Autores");

        jLabelMantenimientoUsuarios.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabelMantenimientoUsuarios.setForeground(new java.awt.Color(0, 51, 255));
        jLabelMantenimientoUsuarios.setText("Mantenimiento Usuarios");

        jButtonRegistrar.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jButtonRegistrar.setForeground(new java.awt.Color(0, 51, 255));
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jButtonModificar.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jButtonModificar.setForeground(new java.awt.Color(0, 51, 255));
        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonEliminar.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jButtonEliminar.setForeground(new java.awt.Color(0, 51, 255));
        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        jButtonVerLibrosPrestados.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jButtonVerLibrosPrestados.setForeground(new java.awt.Color(0, 51, 255));
        jButtonVerLibrosPrestados.setText("Ver libros Prestados");
        jButtonVerLibrosPrestados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerLibrosPrestadosActionPerformed(evt);
            }
        });

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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cr/ac/ucr/if3000/biblioteca/Imagenes/sign-out.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonRegistrar)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonVerLibrosPrestados)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonEliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMantenimientoUsuarios)
                .addGap(302, 302, 302))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelMantenimientoUsuarios)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrar)
                    .addComponent(jButtonVerLibrosPrestados)
                    .addComponent(jButtonModificar)
                    .addComponent(jButtonEliminar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVerLibrosPrestadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerLibrosPrestadosActionPerformed
        Persona personaLibrosPrestados = null;
        personaLibrosPrestados = biblioteca.buscarPersonaPorIdentificacion((String) tablaUsuarios.getValueAt(jTableListaUsuarios.getSelectedRow(), 4));

        LibrosPrestados librosPrestados = new LibrosPrestados(personaLibrosPrestados, "MantenimientoUsuarios");

        librosPrestados.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVerLibrosPrestadosActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        AgregarUsuario agregarUsuario = new AgregarUsuario("Usuario");
        agregarUsuario.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        Persona personaModificar = null;
        personaModificar = biblioteca.buscarPersonaPorIdentificacion((String) tablaUsuarios.getValueAt(jTableListaUsuarios.getSelectedRow(), 4));
        System.out.println(personaModificar.toString());

        ModificarUsuario modificarUsuario = new ModificarUsuario(personaModificar, "Usuario");
        modificarUsuario.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        Persona personaBorrada = null;
        personaBorrada = biblioteca.buscarPersonaPorIdentificacion((String) tablaUsuarios.getValueAt(jTableListaUsuarios.getSelectedRow(), 4));
        biblioteca.borrarPersona(personaBorrada);
        MantenimentoUsuarios mantenimentoUsuarios = new MantenimentoUsuarios();
        mantenimentoUsuarios.setVisible(true);
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MenuBibliotecologo menuBibliotecologo = new MenuBibliotecologo();
        menuBibliotecologo.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MantenimentoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenimentoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenimentoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenimentoUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenimentoUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonVerLibrosPrestados;
    private javax.swing.JLabel jLabelMantenimientoUsuarios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListaUsuarios;
    // End of variables declaration//GEN-END:variables
}
