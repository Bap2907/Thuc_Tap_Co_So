/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package JFrameQuanLyKyTucXa;

/**
 *
 * @author Dell
 */
public class QuanLySVDangTrongKTX extends javax.swing.JPanel {

    /**
     * Creates new form QuanLySVDangTrongKTX
     */
    public QuanLySVDangTrongKTX() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        loadSV = new javax.swing.JLabel();
        addSV = new javax.swing.JLabel();
        viewSV = new javax.swing.JLabel();
        updateSV = new javax.swing.JLabel();
        deleteSV = new javax.swing.JLabel();
        cbbtrangthai = new javax.swing.JComboBox<>();
        ScrollPaneSV = new javax.swing.JScrollPane();
        tableSV = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(19, 90, 118));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Quản lý sinh viên đang ở trong KTX");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));

        loadSV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loadSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loading.png"))); // NOI18N
        loadSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadSVMouseClicked(evt);
            }
        });

        addSV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        addSV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addSVMouseClicked(evt);
            }
        });

        viewSV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/magnifyingglass.png"))); // NOI18N
        viewSV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        viewSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewSVMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewSVMouseEntered(evt);
            }
        });

        updateSV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/copywriting.png"))); // NOI18N
        updateSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateSVMouseClicked(evt);
            }
        });

        deleteSV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteSV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        deleteSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteSVMouseClicked(evt);
            }
        });

        cbbtrangthai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả", "Đang chờ duyệt", "Đang ở", "Đã rời đi" }));
        cbbtrangthai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbtrangthaiActionPerformed(evt);
            }
        });

        ScrollPaneSV.setBackground(new java.awt.Color(255, 255, 255));
        ScrollPaneSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ScrollPaneSVMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ScrollPaneSVMouseExited(evt);
            }
        });

        tableSV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sinh viên", "Tên sinh viên", "Mã phòng", "Giới tính", "Ngày HDBD", "Ngày HDKT", "Tình trạng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableSV.setFocusable(false);
        tableSV.setGridColor(new java.awt.Color(255, 255, 255));
        tableSV.setRowHeight(25);
        tableSV.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tableSV.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSVMouseClicked(evt);
            }
        });
        ScrollPaneSV.setViewportView(tableSV);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(loadSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(viewSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(deleteSV, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbbtrangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(426, 426, 426))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ScrollPaneSV, javax.swing.GroupLayout.PREFERRED_SIZE, 1053, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1215, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(cbbtrangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loadSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteSV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(ScrollPaneSV, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 159, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1227, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 752, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loadSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadSVMouseClicked
        //        showTable();
        //        count = -1;
    }//GEN-LAST:event_loadSVMouseClicked

    private void addSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addSVMouseClicked
        //        QuanLyThongTinSV.setVisible(false);
        //        AddSV.setVisible(true);
    }//GEN-LAST:event_addSVMouseClicked

    private void viewSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewSVMouseClicked
        //        count = tableSV.getSelectedRow();
        //        if (count == -1) {
            //            JOptionPane.showMessageDialog(null, "Vui lòng chọn sinh viên để xem!");
            //        } else {
            //            QuanLyThongTinSV.setVisible(false);
            //            AddSV.setVisible(false);
            //            ViewSV.setVisible(true);
            //            LayThongTinSinhVienView(count);
            //        }
        //        showTable();
    }//GEN-LAST:event_viewSVMouseClicked

    private void viewSVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewSVMouseEntered

    }//GEN-LAST:event_viewSVMouseEntered

    private void updateSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateSVMouseClicked
        //        count = tableSV.getSelectedRow();
        //        if (count == -1) {
            //            JOptionPane.showMessageDialog(null, "Vui lòng chọn sinh viên để update!");
            //        } else {
            //            UpdateSV.setVisible(true);
            //            QuanLyThongTinSV.setVisible(false);
            //            AddSV.setVisible(false);
            //            ViewSV.setVisible(false);
            //            LayThongTinSinhVienUp(count);
            //            LayMaSinhVien(count);
            //        }
    }//GEN-LAST:event_updateSVMouseClicked

    private void deleteSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteSVMouseClicked
        //        count = tableSV.getSelectedRow();
        //        if (count == -1) {
            //            JOptionPane.showMessageDialog(null, "Vui lòng chọn sinh viên để xóa!");
            //        } else {
            //            int test = JOptionPane.showConfirmDialog(null, "Bạn chắc có muốn xóa sinh viên hay không !", "Thông báo", JOptionPane.YES_NO_OPTION);
            //            if (test == JOptionPane.YES_OPTION) {
                //                LayMaSinhVien(count);
                //                new TaiKhoanDAO().XoaTaiKhoan(email);
                //                JOptionPane.showMessageDialog(null, "Xoá sinh viên thành công!");
                //            } else if (test == JOptionPane.NO_OPTION) {
                //                JOptionPane.showMessageDialog(null, "Bạn đã hủy xóa sinh viên thành công");
                //            }
            //        }
        //        showTable();
    }//GEN-LAST:event_deleteSVMouseClicked

    private void cbbtrangthaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbtrangthaiActionPerformed
        //        String trangthai = "";
        //        evcbbtt = cbbtrangthai.getSelectedIndex();
        //        int k = cbbtrangthai.getSelectedIndex();
        //        QuanLySinhVienDAO svd = new QuanLySinhVienDAO();
        //        if (k == 0) {
            //            showTable();
            //        } else if (k == 1) {
            //            showTableTT(1);
            //        } else if (k == 2) {
            //            showTableTT(3);
            //        } else if (k == 3) {
            //            showTableTT(2);
            //        } else if (k == 4) {
            //            showTableTT(0);
            //        }
    }//GEN-LAST:event_cbbtrangthaiActionPerformed

    private void tableSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSVMouseClicked
        //        count = tableSV.getSelectedRow();
        //        LayMaSinhVien(count);
    }//GEN-LAST:event_tableSVMouseClicked

    private void ScrollPaneSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScrollPaneSVMouseClicked

    }//GEN-LAST:event_ScrollPaneSVMouseClicked

    private void ScrollPaneSVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScrollPaneSVMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ScrollPaneSVMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPaneSV;
    private javax.swing.JLabel addSV;
    private javax.swing.JComboBox<String> cbbtrangthai;
    private javax.swing.JLabel deleteSV;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loadSV;
    private javax.swing.JTable tableSV;
    private javax.swing.JLabel updateSV;
    private javax.swing.JLabel viewSV;
    // End of variables declaration//GEN-END:variables
}