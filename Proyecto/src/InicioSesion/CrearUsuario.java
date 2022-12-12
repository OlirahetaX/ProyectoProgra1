package InicioSesion;

import java.awt.Color;
import proyecto.InicioSesion;

public class CrearUsuario extends javax.swing.JFrame {

    /**
     * Creates new form CrearUsuario
     */
    public CrearUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Background = new javax.swing.JPanel();
        panelRegresar = new javax.swing.JPanel();
        regresar = new javax.swing.JLabel();
        NewUsuario = new javax.swing.JTextField();
        Contra1txt = new javax.swing.JPasswordField();
        Contra2txt = new javax.swing.JPasswordField();
        identidad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingrese Contaseña");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Background.setBackground(new java.awt.Color(255, 0, 0));

        panelRegresar.setBackground(new java.awt.Color(255, 0, 0));

        regresar.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        regresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regresar.setText("<");
        regresar.setToolTipText("");
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

        javax.swing.GroupLayout panelRegresarLayout = new javax.swing.GroupLayout(panelRegresar);
        panelRegresar.setLayout(panelRegresarLayout);
        panelRegresarLayout.setHorizontalGroup(
            panelRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(regresar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        panelRegresarLayout.setVerticalGroup(
            panelRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(regresar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        NewUsuario.setBackground(new java.awt.Color(255, 0, 0));
        NewUsuario.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        NewUsuario.setForeground(new java.awt.Color(204, 204, 204));
        NewUsuario.setText("* Ingrese nuevo usuario");
        NewUsuario.setBorder(null);
        NewUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NewUsuarioMousePressed(evt);
            }
        });

        Contra1txt.setBackground(new java.awt.Color(255, 0, 0));
        Contra1txt.setForeground(new java.awt.Color(204, 204, 204));
        Contra1txt.setText("1234");
        Contra1txt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Contra1txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Contra1txtMousePressed(evt);
            }
        });

        Contra2txt.setBackground(new java.awt.Color(255, 0, 0));
        Contra2txt.setForeground(new java.awt.Color(204, 204, 204));
        Contra2txt.setText("1234");
        Contra2txt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Contra2txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Contra2txtMousePressed(evt);
            }
        });

        identidad.setBackground(new java.awt.Color(255, 0, 0));
        identidad.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        identidad.setForeground(new java.awt.Color(204, 204, 204));
        identidad.setText("* Ingrese No. Identidad");
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

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("* Ingrese Contraseña");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("* Ingrese Contraseña");

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(panelRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(identidad, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NewUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Contra2txt, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Contra1txt, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(NewUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Contra1txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(panelRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(158, 158, 158)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Contra2txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(identidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMouseEntered
        panelRegresar.setBackground(Color.lightGray);
    }//GEN-LAST:event_regresarMouseEntered

    private void regresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMouseExited
        panelRegresar.setBackground(Color.red);
    }//GEN-LAST:event_regresarMouseExited

    private void regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regresarMouseClicked
        new Iniciosesion().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarMouseClicked

    private void identidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_identidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_identidadActionPerformed

    private void NewUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewUsuarioMousePressed
        if (NewUsuario.getText().equals("* Ingrese nuevo usuario")) {
            NewUsuario.setText("");
            NewUsuario.setForeground(Color.white);
        }
        if (Contra1txt.getText().equals("")) {
            Contra1txt.setText("1234");
            Contra1txt.setForeground(Color.lightGray);
        }
        if (Contra2txt.getText().equals("")) {
            Contra2txt.setText("1234");
            Contra2txt.setForeground(Color.lightGray);
        }
        if (identidad.getText().equals("")) {
            identidad.setText("* Ingrese No. Identidad");
            identidad.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_NewUsuarioMousePressed

    private void identidadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_identidadMousePressed
        if (identidad.getText().equals("* Ingrese No. Identidad")) {
            identidad.setText("");
            identidad.setForeground(Color.white);
        }
        if (NewUsuario.getText().equals("")) {
            NewUsuario.setText("* Ingrese nuevo usuario");
            NewUsuario.setForeground(Color.lightGray);
        }
        if (Contra2txt.getText().equals("")) {
            Contra2txt.setText("1234");
            Contra2txt.setForeground(Color.lightGray);
        }
        if (Contra1txt.getText().equals("")) {
            Contra1txt.setText("1234");
            Contra1txt.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_identidadMousePressed

    private void Contra1txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Contra1txtMousePressed
        if (Contra1txt.getText().equals("1234")) {
            Contra1txt.setText("");
            Contra1txt.setForeground(Color.white);
        }
        if (NewUsuario.getText().equals("")) {
            NewUsuario.setText("* Ingrese nuevo usuario");
            NewUsuario.setForeground(Color.lightGray);
        }
        if (Contra2txt.getText().equals("")) {
            Contra2txt.setText("1234");
            Contra2txt.setForeground(Color.lightGray);
        }
        if (identidad.getText().equals("")) {
            identidad.setText("* Ingrese No. Identidad");
            identidad.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_Contra1txtMousePressed

    private void Contra2txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Contra2txtMousePressed
        if (Contra2txt.getText().equals("1234")) {
            Contra2txt.setText("");
            Contra2txt.setForeground(Color.white);
        }
        if (NewUsuario.getText().equals("")) {
            NewUsuario.setText("* Ingrese nuevo usuario");
            NewUsuario.setForeground(Color.lightGray);
        }
        if (Contra1txt.getText().equals("")) {
            Contra1txt.setText("1234");
            Contra1txt.setForeground(Color.lightGray);
        }
        if (identidad.getText().equals("")) {
            identidad.setText("* Ingrese No. Identidad");
            identidad.setForeground(Color.lightGray);
        }    }//GEN-LAST:event_Contra2txtMousePressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPasswordField Contra1txt;
    private javax.swing.JPasswordField Contra2txt;
    private javax.swing.JTextField NewUsuario;
    private javax.swing.JTextField identidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel panelRegresar;
    private javax.swing.JLabel regresar;
    // End of variables declaration//GEN-END:variables
}
