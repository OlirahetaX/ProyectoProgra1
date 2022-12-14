package InicioSesion;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Iniciosesion extends javax.swing.JFrame {

    public static ArrayList<InfoUsuario> datosarray = new ArrayList<>();

    public Iniciosesion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelsalir = new javax.swing.JPanel();
        salirX = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        contrasena = new javax.swing.JLabel();
        contrasenafield = new javax.swing.JPasswordField();
        usuariofield = new javax.swing.JTextField();
        logo = new javax.swing.JLabel();
        deco = new javax.swing.JPanel();
        crearusuario = new javax.swing.JLabel();
        olvidarcontra = new javax.swing.JLabel();
        ingresar = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelsalir.setBackground(new java.awt.Color(221, 220, 220));

        salirX.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        salirX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salirX.setText("X");
        salirX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirXMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirXMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelsalirLayout = new javax.swing.GroupLayout(panelsalir);
        panelsalir.setLayout(panelsalirLayout);
        panelsalirLayout.setHorizontalGroup(
            panelsalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salirX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        panelsalirLayout.setVerticalGroup(
            panelsalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelsalirLayout.createSequentialGroup()
                .addComponent(salirX)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        getContentPane().add(panelsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 50, 50));

        usuario.setBackground(new java.awt.Color(204, 255, 51));
        usuario.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        usuario.setText("Usuario:");
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        contrasena.setFont(new java.awt.Font("Palatino Linotype", 1, 18)); // NOI18N
        contrasena.setText("Contraseña:");
        getContentPane().add(contrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        contrasenafield.setBackground(new java.awt.Color(255, 0, 0));
        contrasenafield.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        contrasenafield.setForeground(new java.awt.Color(255, 255, 255));
        contrasenafield.setToolTipText("");
        contrasenafield.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(contrasenafield, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 160, 30));

        usuariofield.setBackground(new java.awt.Color(255, 0, 0));
        usuariofield.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        usuariofield.setForeground(new java.awt.Color(255, 255, 255));
        usuariofield.setToolTipText("");
        usuariofield.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(usuariofield, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 160, 30));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BAC_Credomatic_Logo_old.jpg"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        deco.setBackground(new java.awt.Color(255, 0, 0));

        crearusuario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        crearusuario.setForeground(new java.awt.Color(255, 255, 255));
        crearusuario.setText("Crear Usuario");
        crearusuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearusuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crearusuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crearusuarioMouseExited(evt);
            }
        });

        olvidarcontra.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        olvidarcontra.setForeground(new java.awt.Color(255, 255, 255));
        olvidarcontra.setText("Olvido contraseña");
        olvidarcontra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        olvidarcontra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                olvidarcontraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                olvidarcontraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                olvidarcontraMouseExited(evt);
            }
        });

        ingresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ingresar.setForeground(new java.awt.Color(255, 255, 255));
        ingresar.setText("Ingresar");
        ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ingresar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingresarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout decoLayout = new javax.swing.GroupLayout(deco);
        deco.setLayout(decoLayout);
        decoLayout.setHorizontalGroup(
            decoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(decoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(decoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crearusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(olvidarcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        decoLayout.setVerticalGroup(
            decoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, decoLayout.createSequentialGroup()
                .addContainerGap(334, Short.MAX_VALUE)
                .addComponent(ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(crearusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(olvidarcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        getContentPane().add(deco, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 140, 440));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoblanco.jpg"))); // NOI18N
        fondo.setText("jLabel1");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 361, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirXMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirXMouseClicked

    private void salirXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirXMouseEntered
        panelsalir.setBackground(Color.red);
    }//GEN-LAST:event_salirXMouseEntered

    private void salirXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirXMouseExited
        panelsalir.setBackground(Color.lightGray);
    }//GEN-LAST:event_salirXMouseExited

    private void ingresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseEntered
        ingresar.setForeground(Color.BLUE);
    }//GEN-LAST:event_ingresarMouseEntered

    private void ingresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseExited
        ingresar.setForeground(Color.white);
    }//GEN-LAST:event_ingresarMouseExited

    private void crearusuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearusuarioMouseEntered
        crearusuario.setForeground(Color.BLUE);
    }//GEN-LAST:event_crearusuarioMouseEntered

    private void crearusuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearusuarioMouseExited
        crearusuario.setForeground(Color.white);
    }//GEN-LAST:event_crearusuarioMouseExited

    private void olvidarcontraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_olvidarcontraMouseEntered
        olvidarcontra.setForeground(Color.BLUE);
    }//GEN-LAST:event_olvidarcontraMouseEntered

    private void olvidarcontraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_olvidarcontraMouseExited
        olvidarcontra.setForeground(Color.white);
    }//GEN-LAST:event_olvidarcontraMouseExited

    private void olvidarcontraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_olvidarcontraMouseClicked
        OlvidarContra olvcon = new OlvidarContra(datosarray);
        olvcon.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_olvidarcontraMouseClicked

    private void ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseClicked
        if (!datosarray.isEmpty()) {
            String usuarioo = usuariofield.getText();
            String password = contrasenafield.getText();
            boolean x = true;
            int j=0;
            for (int i = 0; i < datosarray.size(); i++) {
                if (usuarioo.equals(datosarray.get(i).usuario) && password.equals(datosarray.get(i).password)) {
                    x = false;
                    j = i;
                }
            }
            if (x) {
                JOptionPane.showMessageDialog(this, "Acceso denegado");
            } else {
                Ingresar ingre = new Ingresar(datosarray,j);
                ingre.setVisible(true);
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Acceso denegado");
        }


    }//GEN-LAST:event_ingresarMouseClicked

    private void crearusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearusuarioMouseClicked
        //new CrearUsuario().setVisible(true);
        CrearUsuario newusu = new CrearUsuario(datosarray);
        newusu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_crearusuarioMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Iniciosesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel contrasena;
    private javax.swing.JPasswordField contrasenafield;
    private javax.swing.JLabel crearusuario;
    private javax.swing.JPanel deco;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel ingresar;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel olvidarcontra;
    private javax.swing.JPanel panelsalir;
    private javax.swing.JLabel salirX;
    private javax.swing.JLabel usuario;
    private javax.swing.JTextField usuariofield;
    // End of variables declaration//GEN-END:variables

}
