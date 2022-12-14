package InicioSesion;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class OlvidarContra extends javax.swing.JFrame {
    
    public static ArrayList<InfoUsuario> datosarray = new ArrayList<>();
    
    public OlvidarContra(ArrayList datosarray) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.datosarray = datosarray;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        PanelRegresar = new javax.swing.JPanel();
        regresar = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Background.setBackground(new java.awt.Color(255, 0, 0));
        Background.setForeground(new java.awt.Color(255, 51, 51));

        PanelRegresar.setBackground(new java.awt.Color(255, 0, 0));

        regresar.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        regresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regresar.setText("<");
        regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        apellido.setBackground(new java.awt.Color(255, 0, 0));
        apellido.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        apellido.setForeground(new java.awt.Color(204, 204, 204));
        apellido.setText("* Apellido");
        apellido.setToolTipText("");
        apellido.setBorder(null);
        apellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                apellidoMousePressed(evt);
            }
        });

        nombre.setBackground(new java.awt.Color(255, 0, 0));
        nombre.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        nombre.setForeground(new java.awt.Color(204, 204, 204));
        nombre.setText("* Nombre");
        nombre.setBorder(null);
        nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreMousePressed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("* OBLIGATORIO");

        buscar.setBackground(new java.awt.Color(255, 0, 0));
        buscar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        buscar.setText("Buscar");
        buscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addGap(0, 69, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(apellido)
                                .addComponent(jSeparator1)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(PanelRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(PanelRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
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

    private void apellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellidoMousePressed
        if (apellido.getText().equals("* Apellido")) {
            apellido.setText("");
            apellido.setForeground(Color.white);
        }
        
        if (nombre.getText().equals("")) {
            nombre.setText("* Nombre");
            nombre.setForeground(Color.lightGray);
        }
    }//GEN-LAST:event_apellidoMousePressed

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

    private void buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseClicked
        boolean buscando= true;
        int i=0;
        String nombreolv = nombre.getText().toUpperCase();
        String apellidoolv = apellido.getText().toUpperCase();
        try{
        while (buscando) {
            
            if (nombreolv.equals(datosarray.get(i).nombre)&& apellidoolv.equals(datosarray.get(i).apellido)) {
                String celularolv = JOptionPane.showInputDialog("Ingrese numero de celular");
                
                if (celularolv.equals(datosarray.get(i).celular)) {
                    int codigorandom = new Random().nextInt((9999 - 1000) + 1) + 1000;
                    JOptionPane.showMessageDialog(null, """
                                                          -- BAC CREDOMTIC--
                                                        Su Codigo es:  """+ codigorandom );
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese codigo enviado a su numero celular"));
                
                    if (codigo==codigorandom) {
                        JOptionPane.showMessageDialog(null, """
                                                            Datos Recuperados!"""
                                                            +"\nTitular: "+datosarray.get(i).nombre+" "+datosarray.get(i).apellido
                                +"\nCuenta: "+datosarray.get(i).numcuenta
                                +"\nUsuario: "+datosarray.get(i).usuario
                                +"\nContraseña: "+datosarray.get(i).password);
                    }else{
                        JOptionPane.showMessageDialog(null, "Codigo Incorrecto");
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Numero Incorrecto");
                }
                buscando = false;
            }
            i++;
        }               
       }catch(Exception e){JOptionPane.showMessageDialog(null, "Usuario no encontrado");}
    }//GEN-LAST:event_buscarMouseClicked
    
    private void nombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMousePressed
        if (nombre.getText().equals("* Nombre")) {
            nombre.setText("");
            nombre.setForeground(Color.white);
        }
        
        if (apellido.getText().equals("")) {
            apellido.setText("* Apellido");
            apellido.setForeground(Color.LIGHT_GRAY);
        }
        
    }//GEN-LAST:event_nombreMousePressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OlvidarContra(datosarray).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel PanelRegresar;
    private javax.swing.JTextField apellido;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel regresar;
    // End of variables declaration//GEN-END:variables
}
