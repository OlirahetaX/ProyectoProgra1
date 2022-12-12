package InicioSesion;

import java.awt.Color;

public class OlvidarContra extends javax.swing.JFrame {
    
    public OlvidarContra() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        PanelRegresar = new javax.swing.JPanel();
        regresar = new javax.swing.JLabel();
        identidad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        usuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Background.setBackground(new java.awt.Color(255, 0, 0));
        Background.setForeground(new java.awt.Color(255, 51, 51));

        PanelRegresar.setBackground(new java.awt.Color(255, 0, 0));

        regresar.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        regresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regresar.setText("<");
        regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                regresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                regresarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelRegresarLayout = new javax.swing.GroupLayout(PanelRegresar);
        PanelRegresar.setLayout(PanelRegresarLayout);
        PanelRegresarLayout.setHorizontalGroup(
            PanelRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegresarLayout.createSequentialGroup()
                .addComponent(regresar, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelRegresarLayout.setVerticalGroup(
            PanelRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(regresar)
        );

        identidad.setBackground(new java.awt.Color(255, 0, 0));
        identidad.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        identidad.setForeground(new java.awt.Color(204, 204, 204));
        identidad.setText("No. Identidad");
        identidad.setToolTipText("");
        identidad.setBorder(null);
        identidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                identidadMousePressed(evt);
            }
        });
        identidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                identidadActionPerformed(evt);
            }
        });

        usuario.setBackground(new java.awt.Color(255, 0, 0));
        usuario.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        usuario.setForeground(new java.awt.Color(204, 204, 204));
        usuario.setText("Ingrese su usuario");
        usuario.setBorder(null);
        usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                usuarioMousePressed(evt);
            }
        });
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("* Numero de identidad OBLIGATORIO");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("* Usuario NO es obliglatorio en caso de no saberselo");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(PanelRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addGap(0, 69, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(identidad)
                        .addComponent(usuario)
                        .addComponent(jSeparator1)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(PanelRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(identidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void identidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_identidadMousePressed
        if (identidad.getText().equals("No. Identidad")) {
            identidad.setText("");
            identidad.setForeground(Color.white);
        }
        
        if (usuario.getText().equals("")) {
            usuario.setText("Ingrese su usuario");
            usuario.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_identidadMousePressed

    private void regresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMouseExited
        PanelRegresar.setBackground(Color.red);
    }//GEN-LAST:event_regresarMouseExited

    private void regresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMouseEntered
        PanelRegresar.setBackground(Color.lightGray);
    }//GEN-LAST:event_regresarMouseEntered

    private void regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMouseClicked
        new Iniciosesion().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarMouseClicked

    private void identidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_identidadActionPerformed

    private void usuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMousePressed
        if (usuario.getText().equals("Ingrese su usuario")) {
            usuario.setText("");
            usuario.setForeground(Color.white);
        }
        
        if (identidad.getText().equals("")) {
            identidad.setText("No. Identidad");
            identidad.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_usuarioMousePressed

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usuarioActionPerformed
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OlvidarContra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel PanelRegresar;
    private javax.swing.JTextField identidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel regresar;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
