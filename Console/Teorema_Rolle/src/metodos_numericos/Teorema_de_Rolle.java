
package metodos_numericos;
import java.util.*;
import javax.swing.JOptionPane;

public class Teorema_de_Rolle extends javax.swing.JFrame {

 
    public Teorema_de_Rolle() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lTitulo = new javax.swing.JLabel();
        pFondoBlanco = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        lbTexto = new javax.swing.JLabel();
        txtSexta = new javax.swing.JTextField();
        txtQuinta = new javax.swing.JTextField();
        txtCuarta = new javax.swing.JTextField();
        txtTercera = new javax.swing.JTextField();
        txtSegunda = new javax.swing.JTextField();
        txtPrimera = new javax.swing.JTextField();
        lbPrimera = new javax.swing.JLabel();
        lbSexta = new javax.swing.JLabel();
        lbQuinta = new javax.swing.JLabel();
        lbCuarta = new javax.swing.JLabel();
        lbTercera = new javax.swing.JLabel();
        lbSegunda = new javax.swing.JLabel();
        lbIntervalo = new javax.swing.JLabel();
        lbPorcentaje = new javax.swing.JLabel();
        txtPorcentaje = new javax.swing.JTextField();
        lbDecimales = new javax.swing.JLabel();
        cbDecimales = new javax.swing.JComboBox();
        txtA = new javax.swing.JTextField();
        lbA = new javax.swing.JLabel();
        lbB = new javax.swing.JLabel();
        txtB = new javax.swing.JTextField();
        txtConstante = new javax.swing.JTextField();
        lbConstante = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        pFondoAzul = new javax.swing.JPanel();
        pFondoAmarillo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lTitulo.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lTitulo.setText("METODO DE BISECCION");
        getContentPane().add(lTitulo);
        lTitulo.setBounds(10, 11, 480, 30);

        pFondoBlanco.setBackground(new java.awt.Color(255, 255, 255));
        pFondoBlanco.setForeground(new java.awt.Color(204, 0, 204));
        pFondoBlanco.setLayout(null);

        jButton1.setText("Generar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pFondoBlanco.add(jButton1);
        jButton1.setBounds(530, 260, 73, 30);

        lbTexto.setText("Llena los campos que necesites para operar(Si no necesitas alguno llenalo con un cero):");
        pFondoBlanco.add(lbTexto);
        lbTexto.setBounds(20, 10, 630, 14);

        txtSexta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSextaActionPerformed(evt);
            }
        });
        txtSexta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSextaKeyTyped(evt);
            }
        });
        pFondoBlanco.add(txtSexta);
        txtSexta.setBounds(20, 40, 40, 30);

        txtQuinta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuintaKeyTyped(evt);
            }
        });
        pFondoBlanco.add(txtQuinta);
        txtQuinta.setBounds(110, 40, 40, 30);

        txtCuarta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCuartaKeyTyped(evt);
            }
        });
        pFondoBlanco.add(txtCuarta);
        txtCuarta.setBounds(200, 40, 40, 30);

        txtTercera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTerceraKeyTyped(evt);
            }
        });
        pFondoBlanco.add(txtTercera);
        txtTercera.setBounds(290, 40, 40, 30);

        txtSegunda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSegundaKeyTyped(evt);
            }
        });
        pFondoBlanco.add(txtSegunda);
        txtSegunda.setBounds(380, 40, 40, 30);

        txtPrimera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrimeraKeyTyped(evt);
            }
        });
        pFondoBlanco.add(txtPrimera);
        txtPrimera.setBounds(470, 40, 40, 30);

        lbPrimera.setText("x");
        pFondoBlanco.add(lbPrimera);
        lbPrimera.setBounds(520, 50, 34, 14);

        lbSexta.setText("x^6");
        pFondoBlanco.add(lbSexta);
        lbSexta.setBounds(70, 50, 20, 14);

        lbQuinta.setText("x^5");
        pFondoBlanco.add(lbQuinta);
        lbQuinta.setBounds(160, 50, 34, 14);

        lbCuarta.setText("x^4");
        pFondoBlanco.add(lbCuarta);
        lbCuarta.setBounds(250, 50, 34, 14);

        lbTercera.setText("x^3");
        pFondoBlanco.add(lbTercera);
        lbTercera.setBounds(340, 50, 34, 14);

        lbSegunda.setText("x^2");
        pFondoBlanco.add(lbSegunda);
        lbSegunda.setBounds(430, 50, 34, 14);

        lbIntervalo.setText("Intervalo");
        pFondoBlanco.add(lbIntervalo);
        lbIntervalo.setBounds(50, 100, 180, 14);

        lbPorcentaje.setText("Porcentaje de error:");
        pFondoBlanco.add(lbPorcentaje);
        lbPorcentaje.setBounds(10, 180, 170, 14);

        txtPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPorcentajeActionPerformed(evt);
            }
        });
        txtPorcentaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPorcentajeKeyTyped(evt);
            }
        });
        pFondoBlanco.add(txtPorcentaje);
        txtPorcentaje.setBounds(140, 170, 70, 30);

        lbDecimales.setText("Numero de decimales:");
        pFondoBlanco.add(lbDecimales);
        lbDecimales.setBounds(50, 220, 160, 14);

        cbDecimales.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        pFondoBlanco.add(cbDecimales);
        cbDecimales.setBounds(50, 250, 50, 30);

        txtA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAActionPerformed(evt);
            }
        });
        txtA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAKeyTyped(evt);
            }
        });
        pFondoBlanco.add(txtA);
        txtA.setBounds(40, 120, 40, 30);

        lbA.setText("A");
        pFondoBlanco.add(lbA);
        lbA.setBounds(20, 130, 20, 14);

        lbB.setText("B");
        pFondoBlanco.add(lbB);
        lbB.setBounds(90, 130, 34, 14);

        txtB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBKeyTyped(evt);
            }
        });
        pFondoBlanco.add(txtB);
        txtB.setBounds(110, 120, 40, 30);

        txtConstante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConstanteKeyTyped(evt);
            }
        });
        pFondoBlanco.add(txtConstante);
        txtConstante.setBounds(550, 40, 40, 30);

        lbConstante.setText("C");
        pFondoBlanco.add(lbConstante);
        lbConstante.setBounds(600, 50, 30, 14);
        pFondoBlanco.add(jSeparator2);
        jSeparator2.setBounds(0, 90, 660, 10);

        getContentPane().add(pFondoBlanco);
        pFondoBlanco.setBounds(0, 60, 660, 350);

        pFondoAzul.setBackground(new java.awt.Color(0, 0, 153));

        pFondoAmarillo.setBackground(new java.awt.Color(255, 204, 51));

        javax.swing.GroupLayout pFondoAmarilloLayout = new javax.swing.GroupLayout(pFondoAmarillo);
        pFondoAmarillo.setLayout(pFondoAmarilloLayout);
        pFondoAmarilloLayout.setHorizontalGroup(
            pFondoAmarilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        pFondoAmarilloLayout.setVerticalGroup(
            pFondoAmarilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pFondoAzulLayout = new javax.swing.GroupLayout(pFondoAzul);
        pFondoAzul.setLayout(pFondoAzulLayout);
        pFondoAzulLayout.setHorizontalGroup(
            pFondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pFondoAmarillo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pFondoAzulLayout.setVerticalGroup(
            pFondoAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pFondoAzulLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(pFondoAmarillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        getContentPane().add(pFondoAzul);
        pFondoAzul.setBounds(0, 0, 660, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    double dIntervaloA =0;
    double dIntervaloB =0;
    int plus=0;
    double dSexta;
    double dQuinta = 0;
    double dCuarta = 0;
    double dTercera = 0;
    double dSegunda = 0;
    double dPrimera = 0;
    double dPorcentajeError = 0;
    int iDecimales = 0;
    double dConstate = 0;
    double dFuncionA = 0;
    double dFuncionB = 0;
    double dFuncionPm = 0;
    double dFunciones = 0;
    double auxcoordenadainicial =0 ;
    double auxcoordenadafinal = 0;
    double pm = 0;
    double pendiente = 0 ;
    double coordenadainicial = 0;
    double coordenadafinal = 0;
    double Tanteta=0;
    double valorteta=0;
    double error=100;
    boolean finn = false;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
                dSexta = Double.parseDouble(txtSexta.getText().trim());
            dQuinta = Double.parseDouble(txtQuinta.getText().trim());
            dCuarta = Double.parseDouble(txtCuarta.getText().trim());
            dTercera = Double.parseDouble(txtTercera.getText().trim());
            dSegunda = Double.parseDouble(txtSegunda.getText().trim());
            dPrimera = Double.parseDouble(txtPrimera.getText().trim());
            dConstate = Double.parseDouble(txtConstante.getText().trim());

            dIntervaloA = (Double.parseDouble(txtA.getText().trim()));
            dIntervaloB = (Double.parseDouble(txtB.getText().trim()));
            iDecimales = Integer.parseInt(cbDecimales.getSelectedItem().toString());

            dPorcentajeError = Double.parseDouble(txtPorcentaje.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hay un error en tus datos o hay un campo vacio");
        }
//funciones para los intervalos
        
        coordenadainicial = (coordenadainicial + dIntervaloA);
        coordenadafinal = (coordenadafinal + dIntervaloB);
        auxcoordenadainicial = coordenadainicial;
        auxcoordenadafinal = coordenadafinal;
        System.out.println("intervalo A: "+ coordenadainicial);//2
        System.out.println("intervalo B: "+ coordenadafinal);//8
        dFuncionA = (dSexta * (Math.pow(dIntervaloA, 6))) + (dQuinta * (Math.pow(dIntervaloA, 5))) + (dCuarta * (Math.pow(dIntervaloA, 4))) + (dTercera * (Math.pow(dIntervaloA, 3))) + (dSegunda * (Math.pow(dIntervaloA, 2))) + (dPrimera * dIntervaloA) + (dConstate);
        System.out.println("f(a) = " + dFuncionA);//-2
        dFuncionB = (dSexta * (Math.pow(dIntervaloB, 6))) + (dQuinta * (Math.pow(dIntervaloB, 5))) + (dCuarta * (Math.pow(dIntervaloB, 4))) + (dTercera * (Math.pow(dIntervaloB, 3))) + (dSegunda * (Math.pow(dIntervaloB, 2))) + (dPrimera * dIntervaloB) + (dConstate);
        System.out.println("f(b) = " + dFuncionB);//28
        pm = (coordenadainicial + coordenadafinal) / 2;
        System.out.println("Punto medio: "+pm);
        pendiente = ((dFuncionB) - (dFuncionA)) / (coordenadafinal - coordenadainicial);
        System.out.println("Pendiente: "+pendiente);
        Tanteta = Math.atan(pendiente);
        valorteta = Math.toDegrees(Tanteta);
        System.out.println("Tangente de teta: "+valorteta);
        System.out.println("Error: "+error+" %");//el que debe disminuir
        System.out.println("Termina la iteracion numero : "+plus++);
        coordenadafinal = pm;
        dIntervaloB =pm;
        //2da iteracion
           while(error>dPorcentajeError){
        System.out.println("intervalo A: "+ coordenadainicial);//2
        System.out.println("intervalo B: "+ coordenadafinal);//8
        dFuncionA = (dSexta * (Math.pow(dIntervaloA, 6))) + (dQuinta * (Math.pow(dIntervaloA, 5))) + (dCuarta * (Math.pow(dIntervaloA, 4))) + (dTercera * (Math.pow(dIntervaloA, 3))) + (dSegunda * (Math.pow(dIntervaloA, 2))) + (dPrimera * dIntervaloA) + (dConstate);
        System.out.println("f(a) = " + dFuncionA);//-2
        dFuncionB = (dSexta * (Math.pow(dIntervaloB, 6))) + (dQuinta * (Math.pow(dIntervaloB, 5))) + (dCuarta * (Math.pow(dIntervaloB, 4))) + (dTercera * (Math.pow(dIntervaloB, 3))) + (dSegunda * (Math.pow(dIntervaloB, 2))) + (dPrimera * dIntervaloB) + (dConstate);
        System.out.println("f(b) = " + dFuncionB);//28
        if(dFuncionA<0&&dFuncionB<0){
            coordenadainicial = coordenadafinal;
            coordenadafinal = pm;
        }
       pm = (coordenadainicial + coordenadafinal) / 2;
        System.out.println("Punto medio: "+pm);
        pendiente = ((dFuncionB) - (dFuncionA)) / (coordenadafinal - coordenadainicial);
        System.out.println("Pendiente: "+pendiente);
        Tanteta = Math.atan(pendiente);
        valorteta = Math.toDegrees(Tanteta);
        System.out.println("Tangente de teta: "+valorteta);
        error = ((pm - coordenadafinal) / pm) *100; 
        error = Math.abs(error);
        System.out.println("Error: "+error+" %");//el que debe disminuir
        System.out.println("Termina la iteracion numero : "+plus++);
           }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtSextaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSextaActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txtSextaActionPerformed

    private void txtSextaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSextaKeyTyped
        char numero = evt.getKeyChar();
        if (Character.isLetter(numero) || Character.isSpaceChar(numero)) {
            evt.consume();
        }           // TODO add your handling code here:
    }//GEN-LAST:event_txtSextaKeyTyped

    private void txtQuintaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuintaKeyTyped
        char numero = evt.getKeyChar();
        if (Character.isLetter(numero) || Character.isSpaceChar(numero)) {
            evt.consume();
        }           // TODO add your handling code here:
    }//GEN-LAST:event_txtQuintaKeyTyped

    private void txtCuartaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCuartaKeyTyped
        char numero = evt.getKeyChar();
        if (Character.isLetter(numero) || Character.isSpaceChar(numero)) {
            evt.consume();
        }           // TODO add your handling code here:
    }//GEN-LAST:event_txtCuartaKeyTyped

    private void txtTerceraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTerceraKeyTyped
        char numero = evt.getKeyChar();
        if (Character.isLetter(numero) || Character.isSpaceChar(numero)) {
            evt.consume();
        }           // TODO add your handling code here:
    }//GEN-LAST:event_txtTerceraKeyTyped

    private void txtSegundaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegundaKeyTyped
        char numero = evt.getKeyChar();
        if (Character.isLetter(numero) || Character.isSpaceChar(numero)) {
            evt.consume();
        }           // TODO add your handling code here:
    }//GEN-LAST:event_txtSegundaKeyTyped

    private void txtPrimeraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrimeraKeyTyped
        char numero = evt.getKeyChar();
        if (Character.isLetter(numero) || Character.isSpaceChar(numero)) {
            evt.consume();
        }           // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimeraKeyTyped

    private void txtPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPorcentajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPorcentajeActionPerformed

    private void txtPorcentajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPorcentajeKeyTyped
        char numero = evt.getKeyChar();
        if (Character.isLetter(numero) || Character.isSpaceChar(numero)) {
            evt.consume();
        }           // TODO add your handling code here:
    }//GEN-LAST:event_txtPorcentajeKeyTyped

    private void txtAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAKeyTyped
        char numero = evt.getKeyChar();
        if (Character.isLetter(numero) || Character.isSpaceChar(numero)) {
            evt.consume();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_txtAKeyTyped

    private void txtBKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBKeyTyped
        char numero = evt.getKeyChar();
        if (Character.isLetter(numero) || Character.isSpaceChar(numero)) {
            evt.consume();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_txtBKeyTyped

    private void txtConstanteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConstanteKeyTyped

        char numero = evt.getKeyChar();
        if (Character.isLetter(numero) || Character.isSpaceChar(numero)) {
            evt.consume();
        } // TODO add your handling code here:
    }//GEN-LAST:event_txtConstanteKeyTyped

    private void txtAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAActionPerformed
     
    }//GEN-LAST:event_txtAActionPerformed

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
            java.util.logging.Logger.getLogger(Teorema_de_Rolle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teorema_de_Rolle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teorema_de_Rolle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teorema_de_Rolle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teorema_de_Rolle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbDecimales;
    private javax.swing.JButton jButton1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JLabel lbA;
    private javax.swing.JLabel lbB;
    private javax.swing.JLabel lbConstante;
    private javax.swing.JLabel lbCuarta;
    private javax.swing.JLabel lbDecimales;
    private javax.swing.JLabel lbIntervalo;
    private javax.swing.JLabel lbPorcentaje;
    private javax.swing.JLabel lbPrimera;
    private javax.swing.JLabel lbQuinta;
    private javax.swing.JLabel lbSegunda;
    private javax.swing.JLabel lbSexta;
    private javax.swing.JLabel lbTercera;
    private javax.swing.JLabel lbTexto;
    private javax.swing.JPanel pFondoAmarillo;
    private javax.swing.JPanel pFondoAzul;
    private javax.swing.JPanel pFondoBlanco;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtConstante;
    private javax.swing.JTextField txtCuarta;
    private javax.swing.JTextField txtPorcentaje;
    private javax.swing.JTextField txtPrimera;
    private javax.swing.JTextField txtQuinta;
    private javax.swing.JTextField txtSegunda;
    private javax.swing.JTextField txtSexta;
    private javax.swing.JTextField txtTercera;
    // End of variables declaration//GEN-END:variables
}
