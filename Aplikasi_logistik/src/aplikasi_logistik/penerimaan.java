/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasi_logistik;
    import java.time.LocalDate;
    import java.time.format.DateTimeFormatter;
    import java.sql.Connection; // Digunakan untuk membuat koneksi ke database
    import java.sql.ResultSet; // Digunakan untuk menyimpan hasil eksekusi query SQL
    import java.sql.Statement; // Digunakan untuk menjalankan query SQL
    import java.sql.PreparedStatement; // Digunakan untuk menjalankan query SQL dengan parameter yang bisa di ganti
    import javax.swing.table.DefaultTableModel; // Digunakan untuk memodelkan data tabel dalam GUI
    import javax.swing.*; // Paket untuk elemen-elemen GUI

public class penerimaan extends javax.swing.JFrame {
    Connection con; // Objek koneksi ke database
    Statement stat; // Objek untuk menjalankan perintah SQL
    ResultSet rs; // Menyimpan hasil query SQL
    String sql; // Menyimpan perintah SQL
    
    public penerimaan() {
        initComponents();
        koneksi DB = new koneksi(); // Membuat instance koneksi
        DB.config(); // Mengkonfigurasi koneksi
        con = DB.con; // Mendapatkan objek Connection dari koneksi
        stat = DB.stm; // Mendapatkan objek statement dari koneksi
    }
    
    private void populateTable(){
        DefaultTableModel tb = (DefaultTableModel) table_produk.getModel(); // Untuk menambahkan kolom-kolom ke dalam tabel
        tb.setRowCount(0);
        
        try{
            sql = "SELECT * FROM produk_m"; // Untuk mengambil semua data dari tabel 'produk'
            rs = stat.executeQuery(sql); // Untuk mneyimpan hasilnya dalam 'Resultset'
            
            while(rs.next()){ // Untuk mengintegrasi melalui hasil dari query yang dieksekusi pada sebuah database
                tb.addRow(new Object[]{
                    rs.getString("id"),
                    rs.getString("nama_produk"),
                    rs.getString("satuan"),
                    rs.getString("harga")
                });
            }
            rs.close();
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
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

        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TFnopenerimaan = new javax.swing.JTextField();
        TFqty = new javax.swing.JTextField();
        TFtanggal = new javax.swing.JTextField();
        Bsimpan = new javax.swing.JButton();
        Bclear = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_produk = new javax.swing.JTable();
        TFidproduk = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Bisitanggal = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jRadioButtonMenuItem4 = new javax.swing.JRadioButtonMenuItem();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("No. Penerimaan");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 99, -1));

        jLabel3.setText("QTY");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 37, -1));

        jLabel4.setText("Tanggal Penerimaan");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 120, -1));
        jPanel1.add(TFnopenerimaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 200, -1));

        TFqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFqtyActionPerformed(evt);
            }
        });
        jPanel1.add(TFqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 200, -1));
        jPanel1.add(TFtanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 200, -1));

        Bsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi_logistik/icon/diskette.png"))); // NOI18N
        Bsimpan.setText("Simpan");
        Bsimpan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Bsimpan.setIconTextGap(10);
        Bsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsimpanActionPerformed(evt);
            }
        });
        jPanel1.add(Bsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        Bclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi_logistik/icon/broom.png"))); // NOI18N
        Bclear.setText("Clear");
        Bclear.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Bclear.setIconTextGap(7);
        Bclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BclearActionPerformed(evt);
            }
        });
        jPanel1.add(Bclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 90, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi_logistik/icon/ic penerimaan.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, -1, -1));

        jLabel2.setText("Produk");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        table_produk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No Penerimaan", "Produk", "QTY", "Tanggal Penerimaan"
            }
        ));
        table_produk.setShowGrid(true);
        table_produk.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                table_produkAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        table_produk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_produkMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_produk);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 590, 120));
        jPanel1.add(TFidproduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 200, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi_logistik/icon/penerimaan.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        Bisitanggal.setText("Isi Tanggal Sekarang");
        Bisitanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BisitanggalActionPerformed(evt);
            }
        });
        jPanel1.add(Bisitanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jMenu1.setText("E-logist");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Master");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("Master Produk");
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jRadioButtonMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Persediaan");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("Persediaan");
        jRadioButtonMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jRadioButtonMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Penerimaan");

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("Penerimaan");
        jRadioButtonMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jRadioButtonMenuItem3);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Pengiriman");

        jRadioButtonMenuItem4.setSelected(true);
        jRadioButtonMenuItem4.setText("Pengiriman");
        jRadioButtonMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jRadioButtonMenuItem4);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BclearActionPerformed
        TFnopenerimaan.setText("");
//        TFidproduk.setText("");
        TFqty.setText("");
        TFtanggal.setText("");
    }//GEN-LAST:event_BclearActionPerformed

    private void BsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsimpanActionPerformed
        try{
            sql = "INSERT INTO stokproduk_t (norec, produkfk, qty) VALUE ("
                    +TFnopenerimaan.getText()+","
                    +TFidproduk.getText()+","
                    +TFqty.getText()+")";
            PreparedStatement pst = con.prepareStatement(sql);

//            pst.setString(1, TFnopenerimaan.getText());
//            pst.setString(2, CBproduk.getItem());
//            pst.setString(3, TFqty.getText());
//            pst.setString(4, TFtanggal.getText());
            int affectedRow = pst.executeUpdate();

            if(affectedRow > 0 ){
                JOptionPane.showMessageDialog(null, "Data berhasil diterima");
            } else{
                JOptionPane.showMessageDialog(null, "Data gagal diterima");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BsimpanActionPerformed

    private void TFqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFqtyActionPerformed

    }//GEN-LAST:event_TFqtyActionPerformed

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
        new master_Produk().setVisible(true);
        dispose();
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void jRadioButtonMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem2ActionPerformed
        new persediaan().setVisible(true);
        dispose();
    }//GEN-LAST:event_jRadioButtonMenuItem2ActionPerformed

    private void jRadioButtonMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem3ActionPerformed
        new penerimaan().setVisible(true);
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMenuItem3ActionPerformed

    private void jRadioButtonMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem4ActionPerformed
        new pengiriman().setVisible(true);
        dispose();
    }//GEN-LAST:event_jRadioButtonMenuItem4ActionPerformed

    private void table_produkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_produkMouseClicked
        try{
            int row  = table_produk.getSelectedRow();
            String table_klik = table_produk.getModel().getValueAt(row, 0).toString();
            stat = con.createStatement();
            sql = "SELECT * FROM produk_m WHERE id = '"+table_klik+"'";
            rs = stat.executeQuery(sql);

            if(rs.next()){
                String id = rs.getString("id");
                TFidproduk.setText(id);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_table_produkMouseClicked

    private void table_produkAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_table_produkAncestorAdded
        populateTable();
    }//GEN-LAST:event_table_produkAncestorAdded

    private void BisitanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BisitanggalActionPerformed
        LocalDate fungsiTanggal = LocalDate.now();
        DateTimeFormatter formatTanggal = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        String tanggal = fungsiTanggal.format(formatTanggal);
        TFtanggal.setText(tanggal);
    }//GEN-LAST:event_BisitanggalActionPerformed

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
            java.util.logging.Logger.getLogger(penerimaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(penerimaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(penerimaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(penerimaan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new penerimaan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bclear;
    private javax.swing.JButton Bisitanggal;
    private javax.swing.JButton Bsimpan;
    private javax.swing.JTextField TFidproduk;
    private javax.swing.JTextField TFnopenerimaan;
    private javax.swing.JTextField TFqty;
    private javax.swing.JTextField TFtanggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable table_produk;
    // End of variables declaration//GEN-END:variables
}
