
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Herrera
 */
public class Principal4 extends javax.swing.JFrame {

    /**
     * Creates new form Principal4
     */
    double v[];
    double v1[];
    double vresta[];
     double vsuma[];
     double b[];
 
   
    public Principal4() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtVectorV = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdLlenado = new javax.swing.JButton();
        cmdLlenarAuto = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        cmdSuma = new javax.swing.JButton();
        cmdResta = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("JasmineUPC", 3, 24)); // NOI18N
        jLabel1.setText("VECTOR V Y VECTOR V1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Iniciales"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Vector V");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 27, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, 80));

        txtVectorV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVectorVActionPerformed(evt);
            }
        });
        txtVectorV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtVectorVKeyTyped(evt);
            }
        });
        getContentPane().add(txtVectorV, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 80, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel2.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 100, -1));

        cmdLlenado.setText("Llenar Manual");
        cmdLlenado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenadoActionPerformed(evt);
            }
        });
        jPanel2.add(cmdLlenado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        cmdLlenarAuto.setText("Llenar Auto");
        jPanel2.add(cmdLlenarAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 100, -1));

        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 100, -1));

        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel2.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 100, -1));

        cmdSuma.setText("Suma de vectores");
        cmdSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSumaActionPerformed(evt);
            }
        });
        jPanel2.add(cmdSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 120, -1));

        cmdResta.setText("Resta de vectores");
        cmdResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRestaActionPerformed(evt);
            }
        });
        jPanel2.add(cmdResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 180, 240));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane3.setViewportView(txtResultado);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        // TODO add your handling code here:
        int vector;
        if (txtVectorV.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(this,"Digite el vector v","ERROR",JOptionPane.ERROR_MESSAGE);
        
        txtVectorV.requestFocusInWindow();
        } else if (Integer.parseInt(txtVectorV.getText().trim())==0){
        JOptionPane.showMessageDialog(this, "el vector no puede ser cero","ERROR",JOptionPane.ERROR_MESSAGE);
        txtVectorV.requestFocusInWindow();
        txtVectorV.selectAll();
        
        }else{
        vector = Integer.parseInt(txtVectorV.getText().trim());
        v= new double [vector];
        JOptionPane.showMessageDialog (this, "El vector se ha creado exitosamente");
        
        
        }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void txtVectorVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVectorVActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtVectorVActionPerformed

    private void txtVectorVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtVectorVKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
          if (!Character.isDigit(c)){
          
          getToolkit().beep();
          evt.consume();
          }
    }//GEN-LAST:event_txtVectorVKeyTyped

    private void cmdLlenadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenadoActionPerformed
        // TODO add your handling code here:
        double s;
        for (int i=0; i<v.length; i++) {
        s= Double.parseDouble(JOptionPane.showInputDialog(this, "Digite el elemento en la posicion"+i));
        v[i]=s;
        
        }
      
        
    }//GEN-LAST:event_cmdLlenadoActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        // TODO add your handling code here:
        
        for (int i=0; i<v.length; i++) {
        txtResultado.append(v[i]+ " ");
        
        }
        
      

    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSumaActionPerformed
        // TODO add your handling code here:
        int longitud;
                if (txtVectorV.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog (this,"Digite la longitud de los vectores");
                txtVectorV.requestFocusInWindow();
                }
                
                else{
                longitud = Integer.parseInt(txtVectorV.getText().trim());
                v= new double [longitud];
                for (int i=0; i<v.length; i++) {
                    b[i] =(v[i]+v1[i]);
                }
                for (int i = 0; i<b.length;i++){
                txtResultado.append ("Suma de la posición"+i+"="+v[i]+"\n");
                
                }
                
                }
    }//GEN-LAST:event_cmdSumaActionPerformed

    private void cmdRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRestaActionPerformed
        // TODO add your handling code here:
        int longitud;
                if (txtVectorV.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog (this,"Digite la longitud de los vectores");
                txtVectorV.requestFocusInWindow();
                }
                
                else{
                longitud = Integer.parseInt(txtVectorV.getText().trim());
                v= new double [longitud];
                for (int i=0; i<v.length; i++) {
                    b[i] =(v[i]-v1[i]);
                }
                for (int i = 0; i<b.length;i++){
                txtResultado.append ("Resta de la posición"+i+"="+v[i]+"\n");
                
                }
                
                }
    }//GEN-LAST:event_cmdRestaActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
        // TODO add your handling code here:
         txtVectorV.setText("");
        txtResultado.setText("");
        
        v = null;
        txtVectorV.requestFocusInWindow();
        
    }//GEN-LAST:event_cmdBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLlenado;
    private javax.swing.JButton cmdLlenarAuto;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JButton cmdResta;
    private javax.swing.JButton cmdSuma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtResultado;
    private javax.swing.JTextField txtVectorV;
    // End of variables declaration//GEN-END:variables
}
