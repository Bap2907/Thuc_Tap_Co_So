package JFrameQuanLyKyTucXa;

import Connector.KetNoiSQL;
import dao.QuanLySinhVienDAO;
import dao.DangKiPhongDAO;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.*;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import dao.PhongDAO;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class DangKiPhong extends javax.swing.JPanel {

    private KetNoiSQL ketNoiSQL;
    private String email;
    private String gioitinh, loaiphong;
    private JButton selectedButton = null;
    private int keyradiothang = 3;
    private String maPhongDuocChon;
    private boolean dataDisplayed = false;

    public DangKiPhong() {
        initComponents();
        ketNoiSQL = new KetNoiSQL();
        setEmail(email);
        //displayData(); 
        jDialog1.setLocationRelativeTo(null);
    }

    public DangKiPhong(String email) {
        this.email = email;
        setEmail(email);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void LayEmail(String email) {
        this.email = email;
        if (!dataDisplayed) {
            displayData();
            dataDisplayed = true; // Đặt cờ thành true sau khi displayData() chạy
        }
    }

    public String getEmail() {
        return this.email;
    }

    public void displayData() {
        gioitinh = new QuanLySinhVienDAO().layGTSinhVienTuEmail(email);
        String query = "SELECT * FROM Phong WHERE gioitinh = ?";
        JPanel panel = new JPanel();
        int cols = 3;
        int squareWidth = 300;  // Chiều rộng của mỗi ô
        int squareHeight = 200; // Chiều cao của mỗi ô

        try (PreparedStatement preparedStatement = ketNoiSQL.getConnection().prepareStatement(query)) {
            preparedStatement.setString(1, gioitinh);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                panel.setLayout(new GridBagLayout());
                panel.setBackground(Color.WHITE);
                GridBagConstraints gbc = new GridBagConstraints();
                gbc.insets = new Insets(10, 10, 10, 10); // khoảng cách giữa các ô

                int row = 0;
                int col = 0;

                // Duyệt qua kết quả truy vấn và hiển thị dữ liệu trong từng ô
                while (resultSet.next()) {
                    // Lấy dữ liệu từ cột cần hiển thị
                    String maPhong = resultSet.getString("maPhong");
                    String tenPhong = resultSet.getString("tenPhong");
                    int soLuongSVPhong = resultSet.getInt("soLuongSVPhong");
                    String loaiPhong = resultSet.getString("loaiPhong");
                    double tienPhong = resultSet.getDouble("tienPhong");
                    String gioiTinh = resultSet.getString("gioiTinh");

                    // Tạo chuỗi chứa thông tin hiển thị trong mỗi ô
                    String labelText = "Thông tin phòng "
                            + "<br/>Mã Phòng: " + maPhong
                            + "<br/>Tên Phòng: " + tenPhong
                            + "<br/>Giới tính: " + gioiTinh
                            + "<br/>Số lượng SV: " + soLuongSVPhong
                            + "<br/>Loại Phòng: " + loaiPhong
                            + "<br/>Tiền phòng: " + tienPhong;

                    // Tạo JButton để hiển thị dữ liệu
                    JButton button = new JButton("<html>" + labelText + "</html>");
                    button.setPreferredSize(new Dimension(squareWidth, squareHeight));
                    customizeButton(button, maPhong, gioiTinh);

                    // Thiết lập vị trí cho nút trong lưới
                    gbc.gridx = col;
                    gbc.gridy = row;
                    panel.add(button, gbc);

                    col++;
                    if (col >= cols) {
                        col = 0;
                        row++;
                    }
                }
            }

            // Tạo JScrollPane để bao bọc JPanel
            JScrollPane scrollPane = new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            scrollPane.setPreferredSize(new Dimension(400, 300)); // Kích thước ưa thích của JScrollPane

            // Tạo một JPanel chính để chứa JScrollPane và khoảng trống
            JPanel mainPanel = new JPanel(new BorderLayout());
            mainPanel.add(Box.createVerticalStrut(70), BorderLayout.NORTH); // Tạo khoảng cách 70px phía trên
            mainPanel.add(scrollPane, BorderLayout.CENTER);
            mainPanel.add(Box.createVerticalStrut(50), BorderLayout.SOUTH); // Tạo khoảng cách 50px phía dưới

            // Thêm JPanel chính vào JPanel chính
            setLayout(new BorderLayout());
            add(mainPanel, BorderLayout.CENTER);

            // Cập nhật giao diện
            revalidate();
            repaint();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void customizeButton(JButton button, String maPhong, String gioiTinh) {
        button.setFont(new Font("Segoe UI", Font.PLAIN, 12));

        button.setHorizontalAlignment(SwingConstants.CENTER);
        button.setVerticalAlignment(SwingConstants.CENTER);

        int borderWidth = 20;
        button.setBorder(BorderFactory.createLineBorder(Color.WHITE, borderWidth));
        button.setBorderPainted(true); // Ẩn viền của JButton
        button.setOpaque(true);
        button.setBackground(Color.getHSBColor(204, 204, 204));

        button.addActionListener(e -> handleButtonClick(button, maPhong, gioiTinh)); // Xử lý sự kiện khi nút được nhấp
    }

    private void handleButtonClick(JButton button, String maPhong, String gioiTinh) {
        String buttonText = button.getText();
        gioitinh = new QuanLySinhVienDAO().layGTSinhVienTuEmail(email);
        QuanLySinhVienDAO svd = new QuanLySinhVienDAO();
        String masv = new QuanLySinhVienDAO().layMaSinhVienTuEmail(email);
        int fl = new PhongDAO().CheckPhong(maPhong);
        int choice = JOptionPane.showConfirmDialog(null, "Bạn có muốn đăng ký phòng không?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            if (fl == 0) {
                JOptionPane.showMessageDialog(null, "Hiện tại không còn phòng trống loại này vui lòng chọn loại phòng khác");
            } else {
                //System.out.println("masv = "+ masv);
                int KTgioitinhhople = new PhongDAO().CheckGioiTinhHopLe(masv, gioiTinh);
                if (KTgioitinhhople == 0) {
                    JOptionPane.showMessageDialog(null, "Bạn đã chọn phòng có giới tính sai, vui lòng chọn phòng khác");
                } else {
                    //JOptionPane.showMessageDialog(null, maPhong + " " +  tenPhong + " " +  soLuongSVPhong + " " +  loaiPhong + " " +  tienPhong);
                    maPhongDuocChon = maPhong;
                    getjdialog();
                }
            }
        } else {
        }
        updateButtonColor(button);
    }

    private void updateButtonColor(JButton clickedButton) {
        // Nếu đã có JButton được chọn trước đó, đặt lại màu sắc
        if (selectedButton != null) {
            selectedButton.setBackground(Color.getHSBColor(204, 204, 204));
        }
        selectedButton = clickedButton;
    }

    public void getjdialog() {
        jDialog1.setModal(true);
        jDialog1.setVisible(true);
        jDialog1.getContentPane().setBackground(Color.WHITE);
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        jDialog1.getRootPane().setBorder(border);
    }

    public void rangbuotxacnhan() {
        Date ngayhientai = new Date();
        Date ngayvao = DateVao.getDate();
        if (ngayvao != null && cbdieukhoang.isSelected() == true) {
            btxacnhan.setEnabled(true);
        } else {
            btxacnhan.setEnabled(false);
        }
    }

    public void updateTrangThaiTheoTDN(String masv) {
        Connection con = KetNoiSQL.getConnection();
        String sql = "update SinhVien set trangThai=? where maSV='" + masv + "'";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "2");
            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(QuanLySinhVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtrd1thang = new javax.swing.JRadioButton();
        txtrd2thang = new javax.swing.JRadioButton();
        txtrd3thang = new javax.swing.JRadioButton();
        DateVao = new com.toedter.calendar.JDateChooser();
        cbdieukhoang = new javax.swing.JCheckBox();
        btxacnhan = new javax.swing.JButton();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        jDialog1.setBackground(new java.awt.Color(255, 255, 255));
        jDialog1.setSize(new java.awt.Dimension(861, 390));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(19, 90, 118));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Đăng ký ký túc xá");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(19, 90, 118)));
        jPanel1.setForeground(new java.awt.Color(19, 90, 118));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(19, 90, 118));
        jLabel2.setText("Thời gian dự kiến vào:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(19, 90, 118));
        jLabel6.setText("Thời gian ở:");

        txtrd1thang.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(txtrd1thang);
        txtrd1thang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtrd1thang.setForeground(new java.awt.Color(19, 90, 118));
        txtrd1thang.setSelected(true);
        txtrd1thang.setText("3 Tháng");
        txtrd1thang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtrd1thangMouseClicked(evt);
            }
        });

        txtrd2thang.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(txtrd2thang);
        txtrd2thang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtrd2thang.setForeground(new java.awt.Color(19, 90, 118));
        txtrd2thang.setText("6 tháng");
        txtrd2thang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtrd2thangMouseClicked(evt);
            }
        });

        txtrd3thang.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(txtrd3thang);
        txtrd3thang.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtrd3thang.setForeground(new java.awt.Color(19, 90, 118));
        txtrd3thang.setText("9 tháng");
        txtrd3thang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtrd3thangMouseClicked(evt);
            }
        });

        DateVao.setToolTipText("");
        DateVao.setDateFormatString("MM-yyyy");
        DateVao.setPreferredSize(new java.awt.Dimension(90, 22));
        DateVao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DateVaoMouseClicked(evt);
            }
        });
        DateVao.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DateVaoPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtrd1thang)
                        .addGap(33, 33, 33)
                        .addComponent(txtrd2thang)
                        .addGap(28, 28, 28)
                        .addComponent(txtrd3thang)
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(DateVao, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(DateVao, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtrd1thang)
                        .addComponent(txtrd2thang)
                        .addComponent(txtrd3thang)))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        cbdieukhoang.setBackground(new java.awt.Color(255, 255, 255));
        cbdieukhoang.setForeground(new java.awt.Color(19, 90, 118));
        cbdieukhoang.setText("Tôi đã đọc và đồng ý các điều khoản của ký túc xá");
        cbdieukhoang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbdieukhoangMouseClicked(evt);
            }
        });
        cbdieukhoang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbdieukhoangActionPerformed(evt);
            }
        });

        btxacnhan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btxacnhan.setForeground(new java.awt.Color(19, 90, 118));
        btxacnhan.setText("Xác nhận");
        btxacnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxacnhanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btxacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(142, 142, 142)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(181, 181, 181)
                            .addComponent(cbdieukhoang, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbdieukhoang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btxacnhan, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(237, 50, 55));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("ĐĂNG KÝ PHÒNG Ở KTX CHO SINH VIÊN");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(237, 50, 55));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(237, 50, 55));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 595, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void DateVaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DateVaoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DateVaoMouseClicked

    private void DateVaoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DateVaoPropertyChange
        // TODO add your handling code here:
        rangbuotxacnhan();
    }//GEN-LAST:event_DateVaoPropertyChange

    private void txtrd1thangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtrd1thangMouseClicked
        keyradiothang = 3;
    }//GEN-LAST:event_txtrd1thangMouseClicked

    private void txtrd2thangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtrd2thangMouseClicked
        keyradiothang = 6;
    }//GEN-LAST:event_txtrd2thangMouseClicked

    private void txtrd3thangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtrd3thangMouseClicked
        keyradiothang = 9;
    }//GEN-LAST:event_txtrd3thangMouseClicked

    private void cbdieukhoangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbdieukhoangMouseClicked
        rangbuotxacnhan();
    }//GEN-LAST:event_cbdieukhoangMouseClicked

    private void cbdieukhoangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbdieukhoangActionPerformed
        if (cbdieukhoang.isSelected()) {
            btxacnhan.setEnabled(true);
        } else {
            btxacnhan.setEnabled(false);
        }
        rangbuotxacnhan();
    }//GEN-LAST:event_cbdieukhoangActionPerformed

    private void btxacnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxacnhanActionPerformed
        try {
            SimpleDateFormat sp = new SimpleDateFormat("MM-yyyy");
            String d1 = sp.format(DateVao.getDate());
            Date d1n = sp.parse(d1);
            Date ngayhientai = new Date();

            if (d1n.compareTo(ngayhientai) > 0) {
                QuanLySinhVienDAO svd = new QuanLySinhVienDAO();
                String masv = new QuanLySinhVienDAO().layMaSinhVienTuEmail(email);
                System.out.println("ma sinh vien: " + masv);
                System.out.println("ma phong: " + maPhongDuocChon);
                int test = JOptionPane.showConfirmDialog(null, "Bạn chắc có muốn đăng ký hay không !", "Thông báo đăng ký", JOptionPane.YES_NO_OPTION);
                if (test == JOptionPane.YES_OPTION) {
                    svd.updateTrangThaiKhiSVDangKy(masv);
                    ThemThongTinSVDangKy(masv, maPhongDuocChon, keyradiothang, d1n);
                    JOptionPane.showMessageDialog(null, "Bạn đã đăng ký thành công");
                    jDialog1.dispose();
                } else if (test == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Bạn đã hủy đăng ký thành công");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ngày vào phải lớn hơn ngày hiện tại");
            }

        } catch (ParseException ex) {
            Logger.getLogger(DangKiPhong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btxacnhanActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateVao;
    private javax.swing.JButton btxacnhan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox cbdieukhoang;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton txtrd1thang;
    private javax.swing.JRadioButton txtrd2thang;
    private javax.swing.JRadioButton txtrd3thang;
    // End of variables declaration//GEN-END:variables

    void ThemThongTinSVDangKy(String masv, String maPhongDuocChon, int thang, Date ngayHDBD) {
        Connection con = KetNoiSQL.getConnection();
        QuanLySinhVienDAO svd = new QuanLySinhVienDAO();
        Date datesv;
        String datestr = "";
        SimpleDateFormat sp = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cld = Calendar.getInstance();
        Date date1 = DateVao.getDate();
        cld.setTime(date1);
        cld.add(Calendar.MONTH, thang);
        datesv = cld.getTime();
        datestr = sp.format(datesv);
        String sql = "insert into DangKyPhong (maSV, maPhong, ngayHDKT, ngayHDBD) values(?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, masv);
            ps.setString(2, maPhongDuocChon);
            ps.setString(3, datestr); // Convert to java.sql.Date
            ps.setDate(4, new java.sql.Date(ngayHDBD.getTime()));
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DangKiPhong.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
