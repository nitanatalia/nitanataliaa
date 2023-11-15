
package nitanataliaaa;


public class kalkulatorrrr extends javax.swing.JFrame {
    String angka;
    double jumlah,angka1,angka2;
    int pilih;

    
    public kalkulatorrrr() {
        initComponents();
        angka = "";
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tampil = new javax.swing.JTextField();
        hapus = new javax.swing.JButton();
        no7 = new javax.swing.JButton();
        no8 = new javax.swing.JButton();
        sisabagi = new javax.swing.JButton();
        bagi = new javax.swing.JButton();
        no9 = new javax.swing.JButton();
        no4 = new javax.swing.JButton();
        kali = new javax.swing.JButton();
        no5 = new javax.swing.JButton();
        no6 = new javax.swing.JButton();
        kurang = new javax.swing.JButton();
        no0 = new javax.swing.JButton();
        no2 = new javax.swing.JButton();
        no3 = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        no1 = new javax.swing.JButton();
        titik = new javax.swing.JButton();
        samadengan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tampilActionPerformed(evt);
            }
        });

        hapus.setText("c");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        no7.setText("7");
        no7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no7ActionPerformed(evt);
            }
        });

        no8.setText("8");
        no8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no8ActionPerformed(evt);
            }
        });

        sisabagi.setText("%");
        sisabagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sisabagiActionPerformed(evt);
            }
        });

        bagi.setText("/");
        bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagiActionPerformed(evt);
            }
        });

        no9.setText("9");
        no9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no9ActionPerformed(evt);
            }
        });

        no4.setText("4");
        no4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no4ActionPerformed(evt);
            }
        });

        kali.setText("x");
        kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliActionPerformed(evt);
            }
        });

        no5.setText("5");
        no5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no5ActionPerformed(evt);
            }
        });

        no6.setText("6");
        no6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no6ActionPerformed(evt);
            }
        });

        kurang.setText("-");
        kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangActionPerformed(evt);
            }
        });

        no0.setText("0");
        no0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no0ActionPerformed(evt);
            }
        });

        no2.setText("2");
        no2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no2ActionPerformed(evt);
            }
        });

        no3.setText("3");
        no3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no3ActionPerformed(evt);
            }
        });

        tambah.setText("+");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        no1.setText("1");
        no1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no1ActionPerformed(evt);
            }
        });

        titik.setText(",");
        titik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titikActionPerformed(evt);
            }
        });

        samadengan.setText("=");
        samadengan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                samadenganActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tampil, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(hapus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(no7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(no8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sisabagi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bagi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(no9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kali, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(no4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(no5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(no6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kurang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(no0, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titik, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(samadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(no1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(no2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(no3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tampil, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sisabagi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bagi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(no7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kali, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(no4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kurang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(no1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(no0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titik, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(samadengan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        angka1 = Double.parseDouble(angka);
        tampil.setText("+");
        angka = "";
        pilih=1;
    }//GEN-LAST:event_tambahActionPerformed

    private void no0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no0ActionPerformed
        angka += "0";
        tampil.setText (angka);
    }//GEN-LAST:event_no0ActionPerformed

    private void no1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no1ActionPerformed
        angka += "1";
        tampil.setText (angka);
    }//GEN-LAST:event_no1ActionPerformed

    private void no2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no2ActionPerformed
        angka += "2";
        tampil.setText (angka);
    }//GEN-LAST:event_no2ActionPerformed

    private void no3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no3ActionPerformed
        angka += "3";
        tampil.setText (angka);
    }//GEN-LAST:event_no3ActionPerformed

    private void no4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no4ActionPerformed
        angka += "4";
        tampil.setText (angka);
    }//GEN-LAST:event_no4ActionPerformed

    private void no5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no5ActionPerformed
        angka += "5";
        tampil.setText (angka);
    }//GEN-LAST:event_no5ActionPerformed

    private void no6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no6ActionPerformed
        angka += "6";
        tampil.setText (angka);
    }//GEN-LAST:event_no6ActionPerformed

    private void no7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no7ActionPerformed
        angka += "7";
        tampil.setText (angka);
    }//GEN-LAST:event_no7ActionPerformed

    private void no8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no8ActionPerformed
        angka += "8";
        tampil.setText (angka);
    }//GEN-LAST:event_no8ActionPerformed

    private void no9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no9ActionPerformed
        angka += "9";
        tampil.setText (angka);
    }//GEN-LAST:event_no9ActionPerformed

    private void titikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titikActionPerformed
        angka += ".";
        tampil.setText (angka);
    }//GEN-LAST:event_titikActionPerformed

    private void kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangActionPerformed
        angka1 = Double.parseDouble(angka);
        tampil.setText("-");
        angka = "";
        pilih=2;
    }//GEN-LAST:event_kurangActionPerformed

    private void kaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaliActionPerformed
        angka1 = Double.parseDouble(angka);
        tampil.setText("*");
        angka = "";
        pilih=3;
    }//GEN-LAST:event_kaliActionPerformed

    private void bagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagiActionPerformed
        angka1 = Double.parseDouble(angka);
        tampil.setText("/");
        angka = "";
        pilih=4;
    }//GEN-LAST:event_bagiActionPerformed

    private void sisabagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sisabagiActionPerformed
        angka1 = Double.parseDouble(angka);
        tampil.setText("%");
        angka = "";
        pilih=5;
    }//GEN-LAST:event_sisabagiActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        tampil.setText (angka);
        angka1 = 0.0;
        angka2 = 0.0;
        jumlah = 0.0;
        angka = "";
    }//GEN-LAST:event_hapusActionPerformed

    private void samadenganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_samadenganActionPerformed
        switch(pilih){
            case 1:
                angka2 = Double.parseDouble(angka);
                jumlah = angka1+angka2;
                angka = Double.toString(jumlah);
                tampil.setText(angka);
                break;
            case 2:
                angka2 = Double.parseDouble(angka);
                jumlah = angka1-angka2;
                angka = Double.toString(jumlah);
                tampil.setText(angka);
                break;
            case 3:
                angka2 = Double.parseDouble(angka);
                jumlah = angka1*angka2;
                angka = Double.toString(jumlah);
                tampil.setText(angka);
                break;
            case 4:
                angka2 = Double.parseDouble(angka);
                jumlah = angka1/angka2;
                angka = Double.toString(jumlah);
                tampil.setText(angka);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_samadenganActionPerformed

    private void tampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tampilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tampilActionPerformed

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
            java.util.logging.Logger.getLogger(kalkulatorrrr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalkulatorrrr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalkulatorrrr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalkulatorrrr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kalkulatorrrr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bagi;
    private javax.swing.JButton hapus;
    private javax.swing.JButton kali;
    private javax.swing.JButton kurang;
    private javax.swing.JButton no0;
    private javax.swing.JButton no1;
    private javax.swing.JButton no2;
    private javax.swing.JButton no3;
    private javax.swing.JButton no4;
    private javax.swing.JButton no5;
    private javax.swing.JButton no6;
    private javax.swing.JButton no7;
    private javax.swing.JButton no8;
    private javax.swing.JButton no9;
    private javax.swing.JButton samadengan;
    private javax.swing.JButton sisabagi;
    private javax.swing.JButton tambah;
    private javax.swing.JTextField tampil;
    private javax.swing.JButton titik;
    // End of variables declaration//GEN-END:variables
}
