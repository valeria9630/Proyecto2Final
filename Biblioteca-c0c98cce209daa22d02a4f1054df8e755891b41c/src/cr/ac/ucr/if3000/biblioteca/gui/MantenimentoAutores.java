/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.if3000.biblioteca.gui;

import cr.ac.ucr.if3000.biblioteca.domain.Autor;
import cr.ac.ucr.if3000.biblioteca.domain.Biblioteca;
import cr.ac.ucr.if3000.biblioteca.domain.Persona;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public class MantenimentoAutores extends javax.swing.JFrame {

    DefaultTableModel tablaAutores;
    Biblioteca biblioteca;

    public MantenimentoAutores() {
        tablaAutores = new DefaultTableModel();
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);

        biblioteca = new Biblioteca();

        tablaAutores.addColumn("NombreUnico");
        tablaAutores.addColumn("Contraseña");
        tablaAutores.addColumn("Nombre Completo");
        tablaAutores.addColumn("Tipo de identificacion");
        tablaAutores.addColumn("Identificacion");

        for (int i = 0; i < biblioteca.getPersonas().size(); i++) {
            Persona persona = biblioteca.getPersonas().get(i);
            if (persona instanceof Autor) {
                tablaAutores.addRow(new Object[]{persona.getNombreUnico(), persona.getContraseña(), persona.getNombreCompleto(), persona.getTipoIdentificacion(), persona.getIdentificacion()});
                this.jTableListaAutores.setModel(tablaAutores);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelMantenimientoAutores = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonVerObrasEscritas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaAutores = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mantenimiento Autores");

        jLabelMantenimientoAutores.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabelMantenimientoAutores.setForeground(new java.awt.Color(0, 51, 255));
        jLabelMantenimientoAutores.setText("Mantenimiento Autores");

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

        jButtonVerObrasEscritas.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jButtonVerObrasEscritas.setForeground(new java.awt.Color(0, 51, 255));
        jButtonVerObrasEscritas.setText("Ver Obras Escritas");
        jButtonVerObrasEscritas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerObrasEscritasActionPerformed(evt);
            }
        });

        jTableListaAutores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255)));
        jTableListaAutores.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jTableListaAutores.setForeground(new java.awt.Color(0, 51, 255));
        jTableListaAutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableListaAutores);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMantenimientoAutores)
                .addGap(284, 284, 284))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonRegistrar)
                        .addGap(34, 34, 34)
                        .addComponent(jButtonVerObrasEscritas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonModificar)
                        .addGap(36, 36, 36)
                        .addComponent(jButtonEliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabelMantenimientoAutores)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistrar)
                    .addComponent(jButtonVerObrasEscritas)
                    .addComponent(jButtonModificar)
                    .addComponent(jButtonEliminar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        AgregarUsuario agregarUsuario = new AgregarUsuario("autor");
        agregarUsuario.setVisible(true);
        dispose();


    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonVerObrasEscritasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerObrasEscritasActionPerformed
        Persona autor = null;
        autor = biblioteca.buscarPersonaPorIdentificacion((String) tablaAutores.getValueAt(jTableListaAutores.getSelectedRow(), 4));

        BuscarObra buscarObra = new BuscarObra(autor, "MantenimientoAutores");
        buscarObra.setVisible(true);
        dispose();

    }//GEN-LAST:event_jButtonVerObrasEscritasActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        Persona personaModificar = null;
        personaModificar = biblioteca.buscarPersonaPorIdentificacion((String) tablaAutores.getValueAt(jTableListaAutores.getSelectedRow(), 4));
        System.out.println(personaModificar.toString());

        ModificarUsuario modificarUsuario = new ModificarUsuario(personaModificar, "Autor");
        modificarUsuario.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        Persona personaBorrada = null;
        personaBorrada = biblioteca.buscarPersonaPorIdentificacion((String) tablaAutores.getValueAt(jTableListaAutores.getSelectedRow(), 4));
        biblioteca.borrarPersona(personaBorrada);
        MantenimentoAutores mantenimentoAutores = new MantenimentoAutores();
        mantenimentoAutores.setVisible(true);


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
            java.util.logging.Logger.getLogger(MantenimentoAutores.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenimentoAutores.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenimentoAutores.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenimentoAutores.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenimentoAutores().setVisible(true);
            }
        });
//    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonVerObrasEscritas;
    private javax.swing.JLabel jLabelMantenimientoAutores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListaAutores;
    // End of variables declaration//GEN-END:variables

}
