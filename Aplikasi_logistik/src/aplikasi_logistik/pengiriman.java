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

public class pengiriman extends javax.swing.JFrame {
    Connection con; // Objek koneksi ke database
    Statement stat; // Objek untuk menjalankan perintah SQL
    ResultSet rs; // Menyimpan hasil query SQL
    String sql; // Menyimpan perintah SQL
    
    public pengiriman() {
        initComponents();
        koneksi DB = new koneksi(); // Membuat instance koneksi
        DB.config(); // Mengkonfigurasi koneksi
        con = DB.con; // Mendapatkan objek Connection dari koneksi
        stat = DB.stm; // Mendapatkan objek statement dari koneksi
    }
    
    private void populateTable(){
        DefaultTableModel tb = (DefaultTableModel) table_produk1.getModel(); // Untuk menambahkan kolom-kolom ke dalam tabel
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TFnopengiriman = new javax.swing.JTextField();
        TFidproduk = new javax.swing.JTextField();
        TFqty = new javax.swing.JTextField();
        TFtujuan = new javax.swing.JTextField();
        Bkirim = new javax.swing.JButton();
        Bclear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_produk1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        TFtanggal = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("No. Pengiriman");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, -1));

        jLabel2.setText("ID Produk");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 83, -1));

        jLabel3.setText("Quantity");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 60, -1));

        jLabel4.setText("Tanggal Pengiriman");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, -1, -1));

        jLabel5.setText("Tujuan");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 82, -1));
        jPanel1.add(TFnopengiriman, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 204, -1));

        TFidproduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFidprodukActionPerformed(evt);
            }
        });
        jPanel1.add(TFidproduk, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 204, -1));

        TFqty.setText("-");
        TFqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFqtyActionPerformed(evt);
            }
        });
        jPanel1.add(TFqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 204, -1));
        jPanel1.add(TFtujuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 205, -1));

        Bkirim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi_logistik/icon/send.png"))); // NOI18N
        Bkirim.setText("Kirim");
        Bkirim.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Bkirim.setIconTextGap(10);
        Bkirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BkirimActionPerformed(evt);
            }
        });
        jPanel1.add(Bkirim, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, -1, 30));

        Bclear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi_logistik/icon/broom.png"))); // NOI18N
        Bclear.setText("Clear");
        Bclear.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Bclear.setIconTextGap(10);
        Bclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BclearActionPerformed(evt);
            }
        });
        jPanel1.add(Bclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 110, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi_logistik/icon/ic pengiriman.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        table_produk1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No Pengiriman", "ID Produk", "Quantity", "Tanggal Pengiriman", "Tujuan"
            }
        ));
        table_produk1.setName(""); // NOI18N
        table_produk1.setShowGrid(true);
        table_produk1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                table_produk1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        table_produk1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_produk1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_produk1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 730, 130));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi_logistik/icon/pengiriman2.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        TFtanggal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        TFtanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFtanggalActionPerformed(evt);
            }
        });
        jPanel1.add(TFtanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 200, -1));

        jButton1.setText("Tanggal Sekarang");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, -1, -1));

        jMenu1.setText("E-logist");
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi_logistik/icon/M.Master.png"))); // NOI18N
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

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi_logistik/icon/M.persediaan.png"))); // NOI18N
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

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi_logistik/icon/penerimaanlog.png"))); // NOI18N
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

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aplikasi_logistik/icon/pengirimanlog.png"))); // NOI18N
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BkirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BkirimActionPerformed
        int qty = Integer.parseInt(TFqty.getText());
        int result = qty * -1;
        try{
            sql = "INSERT INTO stokproduk_t (norec, produkfk, qty, tanggaltransaksi, tujuan) VALUE(?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1, TFnopengiriman.getText());
            pst.setString(2, TFidproduk.getText());
            pst.setString(3, TFqty.getText());
            pst.setString(4, TFtanggal.getText());
            pst.setString(5, TFtujuan.getText());
            int affectedRow = pst.executeUpdate();
            
            if(affectedRow>0){
                JOptionPane.showMessageDialog(null, "Data berhasil dikirim");
            }else{
                JOptionPane.showMessageDialog(null, "Data gagal dikirim");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_BkirimActionPerformed

    private void TFqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFqtyActionPerformed
        
    }//GEN-LAST:event_TFqtyActionPerformed

    private void jRadioButtonMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem1ActionPerformed
        // TODO add your handling code here:
        new master_Produk().setVisible(true);
        dispose();
    }//GEN-LAST:event_jRadioButtonMenuItem1ActionPerformed

    private void jRadioButtonMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem2ActionPerformed
        // TODO add your handling code here:
        new persediaan().setVisible(true);
        dispose();
    }//GEN-LAST:event_jRadioButtonMenuItem2ActionPerformed

    private void jRadioButtonMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem3ActionPerformed
        // TODO add your handling code here:
        new penerimaan().setVisible(true);
        dispose();
    }//GEN-LAST:event_jRadioButtonMenuItem3ActionPerformed

    private void jRadioButtonMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem4ActionPerformed
        // TODO add your handling code here:
        new pengiriman().setVisible(true);
        dispose();
    }//GEN-LAST:event_jRadioButtonMenuItem4ActionPerformed

    private void table_produk1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_table_produk1AncestorAdded
        populateTable();
    }//GEN-LAST:event_table_produk1AncestorAdded

    private void table_produk1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_produk1MouseClicked
        try{
            int row  = table_produk1.getSelectedRow();
            String table_klik = table_produk1.getModel().getValueAt(row, 0).toString();
            stat = con.createStatement();
            sql = "SELECT * FROM produk_m WHERE id = '"+table_klik+"'";
            rs = stat.executeQuery(sql);
        
            if(rs.next()){
                String id = rs.getString("id");
                TFidproduk.setText(id);
        }
        } catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_table_produk1MouseClicked

    private void BclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BclearActionPerformed
        // TODO add your handling code here:
        TFnopengiriman.setText("");
        TFidproduk.setText("");
        TFqty.setText("");
        TFtanggal.setText("");
        TFtujuan.setText("");
    }//GEN-LAST:event_BclearActionPerformed

    private void TFidprodukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFidprodukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFidprodukActionPerformed

    private void TFtanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFtanggalActionPerformed
    }//GEN-LAST:event_TFtanggalActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LocalDate functanggal = LocalDate.now();
        DateTimeFormatter formatt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        String tanggal = functanggal.format(formatt);
        TFtanggal.setText(tanggal);
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
            java.util.logging.Logger.getLogger(pengiriman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pengiriman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pengiriman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pengiriman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pengiriman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bclear;
    private javax.swing.JButton Bkirim;
    private javax.swing.JTextField TFidproduk;
    private javax.swing.JTextField TFnopengiriman;
    private javax.swing.JTextField TFqty;
    private javax.swing.JFormattedTextField TFtanggal;
    private javax.swing.JTextField TFtujuan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_produk1;
    // End of variables declaration//GEN-END:variables
}
