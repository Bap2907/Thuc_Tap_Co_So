
package JFrameQuanLyKyTucXa;

import Connector.KetNoiSQL;
import dao.QuanLyNhanVienDAO;
import dao.SinhVienDAO;
import dao.TaiKhoanDAO;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ThongTinTaiKhoan;
import model.ThongTinNhanVien;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import textfield.SearchOptionEvent;
import textfield.SearchOption;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import static services.HashingPass.PasswordHash;

public class QuanLyNhanVien extends javax.swing.JPanel {

    private List<ThongTinNhanVien> listnhanvien;
    private List<ThongTinTaiKhoan> listtaikhoan;
    private DefaultTableModel Model;
    private DefaultTableModel Modeldelete;
    private int count = -1;
    private String email, cccd;
    private String email_account;
    private String selectedQueQuan = "An Giang", selectedUpQueQuan = "An Giang";
    private String selectedChucVu = "Quản lý", selectedUpChucVu = "Quản lý";
    private String selectedTrangThai, selectedUpTrangThai;
//    private String gioitinh;
    List<ThongTinNhanVien> filteredList = new ArrayList<>();
    private int currentPage = 1;
    private int rowsPerPage = 12;
    private int itemsPerPage = 12;
    
    public void setemail_account(String email_main){
        this.email_account = email_main;
    }
    
    public QuanLyNhanVien() {
        initComponents();

        this.hide_eye.setVisible(false);
        AddSearch();
        showTable(currentPage);
        Model = (DefaultTableModel) tableNV.getModel();
        Modeldelete = (DefaultTableModel) tableNV1.getModel();
        showTable();
        tableNV.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tableNV.getTableHeader().setOpaque(false);
        tableNV.getTableHeader().setBackground(new Color(0,102,102));
        tableNV.getTableHeader().setForeground(new Color(225, 225, 225));

        AutoCompleteDecorator.decorate(txtUpQueQuanNV);
        AutoCompleteDecorator.decorate(txtQueQuanNV);
        AutoCompleteDecorator.decorate(txtUpTrangThai);
    }
    void hidepanel(){
        QuanLyThongTinNV.setVisible(false);
        AddNhanVien.setVisible(false);
        UpdateNhanVien.setVisible(false);
        ViewNhanVien.setVisible(false);
        Bin.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        QuanLyThongTinNV = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableNV = new javax.swing.JTable();
        addNV = new javax.swing.JLabel();
        viewNV = new javax.swing.JLabel();
        editNV = new javax.swing.JLabel();
        deleteNV = new javax.swing.JLabel();
        PreviousButton = new java.awt.Button();
        NextButton = new java.awt.Button();
        bin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        loadNV = new javax.swing.JLabel();
        txtSearch = new textfield.TextFieldSearchOption();
        AddNhanVien = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txtCCCDNV = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        jLabel45 = new javax.swing.JLabel();
        txtTenNV = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtTenDangNhapNV = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtMatKhauNV = new javax.swing.JPasswordField();
        txtNhapLaiMatKhauNV = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        btnAddNV = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        txtSoDienThoaiNV = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        txtQueQuanNV = new javax.swing.JComboBox<>();
        show_eye = new javax.swing.JLabel();
        hide_eye = new javax.swing.JLabel();
        txtNgaySinh = new com.toedter.calendar.JDateChooser();
        ViewNhanVien = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        txtViewHoTenNV = new javax.swing.JLabel();
        txtViewCCCDNV = new javax.swing.JLabel();
        txtViewSoDienThoaiNV = new javax.swing.JLabel();
        txtViewEmailNV = new javax.swing.JLabel();
        txtViewQueQuan = new javax.swing.JLabel();
        txtViewChucVuNV = new javax.swing.JLabel();
        txtViewNgaySinhNV = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        txtViewGioiTinh = new javax.swing.JLabel();
        UpdateNhanVien = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUpEmail = new javax.swing.JTextField();
        rdUpNam = new javax.swing.JRadioButton();
        rdUpNu = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        txtUpTenNV = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtUpCCCD = new javax.swing.JTextField();
        btnUpdateSV = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtUpSoDienThoaiNV = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtUpQueQuanNV = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        txtUpTrangThai = new javax.swing.JComboBox<>();
        txtUpNgaySinh = new com.toedter.calendar.JDateChooser();
        Bin = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableNV1 = new javax.swing.JTable();
        jLabel61 = new javax.swing.JLabel();
        restore = new javax.swing.JLabel();
        deleteSV1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setLayout(new java.awt.CardLayout());

        QuanLyThongTinNV.setBackground(new java.awt.Color(255, 255, 255));
        QuanLyThongTinNV.setMaximumSize(new java.awt.Dimension(0, 0));
        QuanLyThongTinNV.setPreferredSize(new java.awt.Dimension(1109, 5));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseExited(evt);
            }
        });

        tableNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên nhân viên", "CCCD", "Giới tính", "Ngày sinh", "Số điện thoại", "Chức vụ", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableNV.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableNV.setFocusable(false);
        tableNV.setGridColor(new java.awt.Color(255, 255, 255));
        tableNV.setRowHeight(25);
        tableNV.setSelectionBackground(new java.awt.Color(19, 90, 118));
        tableNV.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableNV);

        addNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        addNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addNVMouseClicked(evt);
            }
        });

        viewNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/magnifyingglass.png"))); // NOI18N
        viewNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewNVMouseClicked(evt);
            }
        });

        editNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/copywriting.png"))); // NOI18N
        editNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editNVMouseClicked(evt);
            }
        });

        deleteNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        deleteNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteNVMouseClicked(evt);
            }
        });

        PreviousButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        PreviousButton.setForeground(new java.awt.Color(19, 90, 118));
        PreviousButton.setLabel("<<<<");
        PreviousButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreviousButtonActionPerformed(evt);
            }
        });

        NextButton.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NextButton.setForeground(new java.awt.Color(19, 90, 118));
        NextButton.setLabel(">>>>");
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });

        bin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/restore (2).png"))); // NOI18N
        bin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                binMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(19, 90, 118));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản lý thông tin nhân viên");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));

        loadNV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loadNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/loading.png"))); // NOI18N
        loadNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadNVMouseClicked(evt);
            }
        });

        txtSearch.setBorder(null);
        txtSearch.setForeground(new java.awt.Color(19, 90, 118));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout QuanLyThongTinNVLayout = new javax.swing.GroupLayout(QuanLyThongTinNV);
        QuanLyThongTinNV.setLayout(QuanLyThongTinNVLayout);
        QuanLyThongTinNVLayout.setHorizontalGroup(
            QuanLyThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuanLyThongTinNVLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PreviousButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(NextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(483, 483, 483))
            .addGroup(QuanLyThongTinNVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(QuanLyThongTinNVLayout.createSequentialGroup()
                .addGroup(QuanLyThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(QuanLyThongTinNVLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(loadNV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addNV, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewNV, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editNV, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteNV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bin, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, QuanLyThongTinNVLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        QuanLyThongTinNVLayout.setVerticalGroup(
            QuanLyThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuanLyThongTinNVLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(QuanLyThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QuanLyThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(loadNV, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(addNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(editNV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteNV, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(QuanLyThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NextButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PreviousButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.add(QuanLyThongTinNV, "card2");

        AddNhanVien.setBackground(new java.awt.Color(19, 90, 118));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Hệ thống quản lý ký túc xá sinh viên");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Thêm thông tin nhân viên quản lý ký túc xá");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("Ngày sinh :");

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Giới tính :");

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Email :");

        txtCCCDNV.setBackground(new java.awt.Color(19, 90, 118));
        txtCCCDNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtCCCDNV.setForeground(new java.awt.Color(255, 255, 255));
        txtCCCDNV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtCCCDNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCCCDNVjCanCuocSVActionPerformed(evt);
            }
        });

        txtEmail.setBackground(new java.awt.Color(19, 90, 118));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailjEmailSVActionPerformed(evt);
            }
        });

        rdNam.setBackground(new java.awt.Color(19, 90, 118));
        buttonGroup1.add(rdNam);
        rdNam.setForeground(new java.awt.Color(255, 255, 255));
        rdNam.setSelected(true);
        rdNam.setText("Nam");
        rdNam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdNamMouseClicked(evt);
            }
        });

        rdNu.setBackground(new java.awt.Color(19, 90, 118));
        buttonGroup1.add(rdNu);
        rdNu.setForeground(new java.awt.Color(255, 255, 255));
        rdNu.setText("Nữ");
        rdNu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdNuMouseClicked(evt);
            }
        });
        rdNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNujRadioButton2ActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Họ và tên nhân viên :");

        txtTenNV.setBackground(new java.awt.Color(19, 90, 118));
        txtTenNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTenNV.setForeground(new java.awt.Color(255, 255, 255));
        txtTenNV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtTenNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenNVjHoTenSVActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Căn cước công dân :");

        jPanel4.setBackground(new java.awt.Color(19, 90, 118));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 1, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 431, Short.MAX_VALUE)
        );

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Tên đăng nhập :");

        txtTenDangNhapNV.setBackground(new java.awt.Color(19, 90, 118));
        txtTenDangNhapNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtTenDangNhapNV.setForeground(new java.awt.Color(255, 255, 255));
        txtTenDangNhapNV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtTenDangNhapNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenDangNhapNVActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Mật khẩu :");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Nhập lại mật khẩu :");

        txtMatKhauNV.setBackground(new java.awt.Color(19, 90, 118));
        txtMatKhauNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMatKhauNV.setForeground(new java.awt.Color(255, 255, 255));
        txtMatKhauNV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtMatKhauNV.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        txtNhapLaiMatKhauNV.setBackground(new java.awt.Color(19, 90, 118));
        txtNhapLaiMatKhauNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtNhapLaiMatKhauNV.setForeground(new java.awt.Color(255, 255, 255));
        txtNhapLaiMatKhauNV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtNhapLaiMatKhauNV.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Thông tin của nhân viên");

        btnAddNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddNV.setForeground(new java.awt.Color(19, 90, 118));
        btnAddNV.setText("Lưu nhân viên");
        btnAddNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddNVMouseClicked(evt);
            }
        });
        btnAddNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNVActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Thông tin tài khoản của nhân viên");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_white.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Số điện thoại :");

        txtSoDienThoaiNV.setBackground(new java.awt.Color(19, 90, 118));
        txtSoDienThoaiNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtSoDienThoaiNV.setForeground(new java.awt.Color(255, 255, 255));
        txtSoDienThoaiNV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtSoDienThoaiNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoDienThoaiNVjMaLopSVActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Quê quán :");

        txtQueQuanNV.setForeground(new java.awt.Color(19, 90, 118));
        txtQueQuanNV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "An Giang", "Bà Rịa – Vũng Tàu", "Bắc Giang", "Bắc Kạn", "Bạc Liêu", "Bắc Ninh", "Bến Tre", "Bình Định", "Bình Dương", "Bình Phước", "Bình Thuận", "Cà Mau", "Cần Thơ", "Cao Bằng", "Đà Nẵng", "Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Nội", "Hà Tĩnh", "Hải Dương", "Hải Phòng", "Hậu Giang", "Hòa Bình", "Hưng Yên", "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lâm Đồng", "Lạng Sơn", "Lào Cai", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Phú Yên", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "Thừa Thiên Huế", "Tiền Giang", "TP Hồ Chí Minh", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái", "Khác" }));
        txtQueQuanNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQueQuanNVActionPerformed(evt);
            }
        });

        show_eye.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        show_eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/show_eye.png"))); // NOI18N
        show_eye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                show_eyeMousePressed(evt);
            }
        });

        hide_eye.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hide_eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hide_eye.png"))); // NOI18N
        hide_eye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide_eyeMousePressed(evt);
            }
        });

        javax.swing.GroupLayout AddNhanVienLayout = new javax.swing.GroupLayout(AddNhanVien);
        AddNhanVien.setLayout(AddNhanVienLayout);
        AddNhanVienLayout.setHorizontalGroup(
            AddNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddNhanVienLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(AddNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(186, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddNhanVienLayout.createSequentialGroup()
                .addGap(0, 156, Short.MAX_VALUE)
                .addGroup(AddNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(AddNhanVienLayout.createSequentialGroup()
                        .addGroup(AddNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(AddNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(AddNhanVienLayout.createSequentialGroup()
                                .addComponent(rdNam, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(rdNu, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSoDienThoaiNV, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(txtQueQuanNV, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(AddNhanVienLayout.createSequentialGroup()
                        .addGroup(AddNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45))
                        .addGroup(AddNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddNhanVienLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(AddNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTenNV)
                                    .addComponent(txtCCCDNV)))
                            .addGroup(AddNhanVienLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(30, 30, 30)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(AddNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddNhanVienLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddNhanVienLayout.createSequentialGroup()
                        .addGroup(AddNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AddNhanVienLayout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(txtTenDangNhapNV, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                            .addComponent(btnAddNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AddNhanVienLayout.createSequentialGroup()
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNhapLaiMatKhauNV, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AddNhanVienLayout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMatKhauNV, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AddNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hide_eye, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(show_eye, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(74, 74, 74))
        );
        AddNhanVienLayout.setVerticalGroup(
            AddNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddNhanVienLayout.createSequentialGroup()
                .addGroup(AddNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddNhanVienLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddNhanVienLayout.createSequentialGroup()
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(AddNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddNhanVienLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(AddNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTenDangNhapNV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(AddNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMatKhauNV, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(AddNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddNhanVienLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(AddNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNhapLaiMatKhauNV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(AddNhanVienLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(AddNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(hide_eye, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(show_eye, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(36, 36, 36)
                        .addComponent(btnAddNV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddNhanVienLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddNhanVienLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AddNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(AddNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCCCDNV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(AddNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(AddNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdNam)
                            .addComponent(rdNu))
                        .addGap(27, 27, 27)
                        .addGroup(AddNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoDienThoaiNV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(AddNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQueQuanNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(AddNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jPanel5.add(AddNhanVien, "card3");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(19, 90, 118));
        jLabel30.setText("Số điện thoại :");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(19, 90, 118));
        jLabel31.setText("Căn cước công dân :");

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(19, 90, 118));
        jLabel32.setText("Quê quán :");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(19, 90, 118));
        jLabel33.setText("Ngày sinh :");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(19, 90, 118));
        jLabel35.setText("Email :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(237, 50, 55));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Thông tin nhân viên");

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(19, 90, 118));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Hệ thống quản lý ký túc xá sinh viên");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(19, 90, 118));
        jLabel39.setText("Chức vụ :");

        jLabel53.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(19, 90, 118));
        jLabel53.setText("Họ và tên nhân viên :");

        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_main.png"))); // NOI18N
        jLabel55.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel55MouseClicked(evt);
            }
        });

        txtViewHoTenNV.setBackground(new java.awt.Color(255, 255, 255));
        txtViewHoTenNV.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtViewHoTenNV.setForeground(new java.awt.Color(19, 90, 118));
        txtViewHoTenNV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtViewCCCDNV.setBackground(new java.awt.Color(255, 255, 255));
        txtViewCCCDNV.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtViewCCCDNV.setForeground(new java.awt.Color(19, 90, 118));
        txtViewCCCDNV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtViewSoDienThoaiNV.setBackground(new java.awt.Color(255, 255, 255));
        txtViewSoDienThoaiNV.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtViewSoDienThoaiNV.setForeground(new java.awt.Color(19, 90, 118));
        txtViewSoDienThoaiNV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtViewEmailNV.setBackground(new java.awt.Color(255, 255, 255));
        txtViewEmailNV.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtViewEmailNV.setForeground(new java.awt.Color(19, 90, 118));
        txtViewEmailNV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtViewQueQuan.setBackground(new java.awt.Color(255, 255, 255));
        txtViewQueQuan.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtViewQueQuan.setForeground(new java.awt.Color(19, 90, 118));
        txtViewQueQuan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtViewChucVuNV.setBackground(new java.awt.Color(255, 255, 255));
        txtViewChucVuNV.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtViewChucVuNV.setForeground(new java.awt.Color(19, 90, 118));
        txtViewChucVuNV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtViewNgaySinhNV.setBackground(new java.awt.Color(255, 255, 255));
        txtViewNgaySinhNV.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtViewNgaySinhNV.setForeground(new java.awt.Color(19, 90, 118));
        txtViewNgaySinhNV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(19, 90, 118));
        jLabel37.setText("Giới tính :");

        txtViewGioiTinh.setBackground(new java.awt.Color(255, 255, 255));
        txtViewGioiTinh.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtViewGioiTinh.setForeground(new java.awt.Color(19, 90, 118));
        txtViewGioiTinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 974, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel53))
                            .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtViewGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtViewNgaySinhNV, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtViewHoTenNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtViewCCCDNV, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(76, 76, 76)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel39))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtViewSoDienThoaiNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtViewEmailNV, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtViewChucVuNV, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtViewQueQuan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtViewSoDienThoaiNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtViewHoTenNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtViewQueQuan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtViewCCCDNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtViewChucVuNV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(2, 2, 2)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel33)
                                        .addComponent(txtViewNgaySinhNV, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(27, 27, 27)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel37)
                                        .addComponent(txtViewGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtViewEmailNV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(1721, 1721, 1721))
        );

        javax.swing.GroupLayout ViewNhanVienLayout = new javax.swing.GroupLayout(ViewNhanVien);
        ViewNhanVien.setLayout(ViewNhanVienLayout);
        ViewNhanVienLayout.setHorizontalGroup(
            ViewNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ViewNhanVienLayout.setVerticalGroup(
            ViewNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViewNhanVienLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1117, 1117, 1117))
        );

        jPanel5.add(ViewNhanVien, "card5");

        UpdateNhanVien.setPreferredSize(new java.awt.Dimension(1066, 507));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(19, 90, 118));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Hệ thống quản lý ký túc xá sinh viên");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(237, 50, 55));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cập nhật thông tin nhân viên");

        txtUpEmail.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtUpEmail.setForeground(new java.awt.Color(19, 90, 118));
        txtUpEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));
        txtUpEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpEmailActionPerformed1(evt);
            }
        });

        rdUpNam.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rdUpNam);
        rdUpNam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdUpNam.setForeground(new java.awt.Color(19, 90, 118));
        rdUpNam.setSelected(true);
        rdUpNam.setText("Nam");
        rdUpNam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdUpNamMouseClicked(evt);
            }
        });
        rdUpNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdUpNamActionPerformed(evt);
            }
        });

        rdUpNu.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rdUpNu);
        rdUpNu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rdUpNu.setForeground(new java.awt.Color(19, 90, 118));
        rdUpNu.setText("Nữ");
        rdUpNu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdUpNuMouseClicked(evt);
            }
        });
        rdUpNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdUpNuActionPerformed1(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(19, 90, 118));
        jLabel13.setText("Họ và tên nhân viên :");

        txtUpTenNV.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtUpTenNV.setForeground(new java.awt.Color(19, 90, 118));
        txtUpTenNV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));
        txtUpTenNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpTenNVActionPerformed1(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(19, 90, 118));
        jLabel15.setText("Căn cước công dân :");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(19, 90, 118));
        jLabel16.setText("Ngày sinh :");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(19, 90, 118));
        jLabel17.setText("Giới tính :");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(19, 90, 118));
        jLabel18.setText("Email :");

        txtUpCCCD.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtUpCCCD.setForeground(new java.awt.Color(19, 90, 118));
        txtUpCCCD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));
        txtUpCCCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpCCCDActionPerformed1(evt);
            }
        });

        btnUpdateSV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdateSV.setForeground(new java.awt.Color(237, 50, 55));
        btnUpdateSV.setText("Lưu nhân viên");
        btnUpdateSV.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(237, 50, 55)));
        btnUpdateSV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateSVMouseClicked(evt);
            }
        });
        btnUpdateSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSVActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_main.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(19, 90, 118));
        jLabel28.setText("Số điện thoại :");

        txtUpSoDienThoaiNV.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txtUpSoDienThoaiNV.setForeground(new java.awt.Color(19, 90, 118));
        txtUpSoDienThoaiNV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));
        txtUpSoDienThoaiNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpSoDienThoaiNVActionPerformed1(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(19, 90, 118));
        jLabel29.setText("Quê quán :");

        txtUpQueQuanNV.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtUpQueQuanNV.setForeground(new java.awt.Color(19, 90, 118));
        txtUpQueQuanNV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "An Giang", "Bà Rịa – Vũng Tàu", "Bắc Giang", "Bắc Kạn", "Bạc Liêu", "Bắc Ninh", "Bến Tre", "Bình Định", "Bình Dương", "Bình Phước", "Bình Thuận", "Cà Mau", "Cần Thơ", "Cao Bằng", "Đà Nẵng", "Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Nội", "Hà Tĩnh", "Hải Dương", "Hải Phòng", "Hậu Giang", "Hòa Bình", "Hưng Yên", "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lâm Đồng", "Lạng Sơn", "Lào Cai", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Phú Yên", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "Thừa Thiên Huế", "Tiền Giang", "TP Hồ Chí Minh", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái", "Khác" }));
        txtUpQueQuanNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpQueQuanNVActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(19, 90, 118));
        jLabel25.setText("Trạng thái:");

        txtUpTrangThai.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtUpTrangThai.setForeground(new java.awt.Color(19, 90, 118));
        txtUpTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang làm việc", "Đã nghỉ việc" }));
        txtUpTrangThai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUpTrangThaiMouseClicked(evt);
            }
        });
        txtUpTrangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpTrangThaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 872, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUpCCCD, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtUpTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdUpNu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rdUpNam, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtUpNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtUpTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUpEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUpQueQuanNV, javax.swing.GroupLayout.Alignment.TRAILING, 0, 240, Short.MAX_VALUE)
                            .addComponent(btnUpdateSV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(txtUpSoDienThoaiNV, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(133, 133, 133))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUpTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtUpSoDienThoaiNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtUpCCCD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(txtUpNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUpQueQuanNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdUpNam)
                    .addComponent(rdUpNu))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUpTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateSV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(131, 131, 131))
        );

        javax.swing.GroupLayout UpdateNhanVienLayout = new javax.swing.GroupLayout(UpdateNhanVien);
        UpdateNhanVien.setLayout(UpdateNhanVienLayout);
        UpdateNhanVienLayout.setHorizontalGroup(
            UpdateNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateNhanVienLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        UpdateNhanVienLayout.setVerticalGroup(
            UpdateNhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateNhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.add(UpdateNhanVien, "card4");

        Bin.setPreferredSize(new java.awt.Dimension(900, 648));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jScrollPane2MouseExited(evt);
            }
        });

        tableNV1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableNV1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên nhân viên", "CCCD", "Giới tính", "Ngày sinh", "Số điện thoại", "Chức vụ", "Trạng thái"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableNV1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tableNV1.setFocusable(false);
        tableNV1.setGridColor(new java.awt.Color(255, 255, 255));
        tableNV1.setRowHeight(25);
        tableNV1.setSelectionBackground(new java.awt.Color(19, 90, 118));
        tableNV1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableNV1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableNV1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableNV1);

        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_main.png"))); // NOI18N
        jLabel61.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel61MouseClicked(evt);
            }
        });

        restore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backup.png"))); // NOI18N
        restore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restoreMouseClicked(evt);
            }
        });

        deleteSV1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteSV1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        deleteSV1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteSV1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BinLayout = new javax.swing.GroupLayout(Bin);
        Bin.setLayout(BinLayout);
        BinLayout.setHorizontalGroup(
            BinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BinLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(BinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BinLayout.createSequentialGroup()
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(restore, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(deleteSV1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))
                    .addGroup(BinLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 947, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(129, Short.MAX_VALUE))))
        );
        BinLayout.setVerticalGroup(
            BinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BinLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(BinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel61)
                    .addComponent(deleteSV1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(restore, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
                .addGap(107, 107, 107))
        );

        jPanel5.add(Bin, "card6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUpEmailActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpEmailActionPerformed1
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpEmailActionPerformed1

    private void rdUpNamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdUpNamMouseClicked

    }//GEN-LAST:event_rdUpNamMouseClicked

    private void rdUpNuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdUpNuMouseClicked
    }//GEN-LAST:event_rdUpNuMouseClicked

    private void rdUpNuActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdUpNuActionPerformed1
        // TODO add your handling code here:
    }//GEN-LAST:event_rdUpNuActionPerformed1

    private void txtUpTenNVActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpTenNVActionPerformed1
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpTenNVActionPerformed1

    private void txtUpCCCDActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpCCCDActionPerformed1
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpCCCDActionPerformed1

    private void btnUpdateSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateSVMouseClicked
        // TODO add your handling code here:

        String hotennv = txtUpTenNV.getText().trim();
        String cccdnv = txtUpCCCD.getText().trim();
        Date ngaysinhnv = txtUpNgaySinh.getDate();
        String sodienthoainv = txtUpSoDienThoaiNV.getText().trim();
        String emailnv = txtUpEmail.getText().trim();
        if (hotennv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống họ tên nhân viên. Vui lòng điền thông tin đầy đủ!");
        } else if (cccdnv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống căn cước công dân nhân viên. Vui lòng điền thông tin đầy đủ!");
        }else if (ngaysinhnv == null) {
            JOptionPane.showMessageDialog(this, "Không để trống ngày sinh sinh viên. Vui lòng điền thông tin đầy đủ!");
        }else if (!rdUpNam.isSelected() && !rdUpNu.isSelected()) {
            JOptionPane.showMessageDialog(null, "Hãy chọn giới tính !");
        } else if (sodienthoainv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống số điện thoại nhân viên. Vui lòng điền thông tin đầy đủ!");
        } else if (emailnv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống email nhân viên. Vui lòng điền thông tin đầy đủ!");
        }
        else{
        // Ràng buộc điều kiện chi tiết
        String ycsdt = "^[0]{1}[0-9]{9}";
        String yccccd = "^([0-9]{9})*([0-9]{12})*$";
        String ycmalop = "^[A-Z]{1}[0-9]{2}[A-Z]{4}[0-9]{2}";
        String yctandangnhap = "^[a-zA-Z0-9]+$";
        //Kiểm tra tài khoản, thông tin đã tồn tại hay chưa
        boolean kiemtracccd = new QuanLyNhanVienDAO().UpKiemTraCCCDNV(cccdnv, cccd);
        boolean kiemtracccdsv = new SinhVienDAO().UpKiemTraCCCDSV(cccdnv, cccd);
        boolean kiemtraemailsv = new SinhVienDAO().UpKiemTraEmailSV(emailnv, email);
        boolean kiemtraemail = new QuanLyNhanVienDAO().UpKiemTraEmailNV(emailnv, email);
        boolean kiemtrasdtnhanvien = new QuanLyNhanVienDAO().KiemTraSDTNV(sodienthoainv);
        boolean kiemtrasdtsv = new SinhVienDAO().KiemTraSDTSV(sodienthoainv);
        boolean kiemtrangaysinhnhanvien = new SinhVienDAO().KiemTrangaysinh(ngaysinhnv);
//
        if (!cccdnv.matches(yccccd)) {
            JOptionPane.showMessageDialog(this, "Định dạng căn cước công dân không đúng. Vui lòng nhập lại!");
        } else if (!sodienthoainv.matches(ycsdt)) {
            JOptionPane.showMessageDialog(this, "Định dạng số điện thoại không dúng. Ví dụ : 0827364857");
        } else if (kiemtrasdtsv || kiemtrasdtnhanvien) {
            JOptionPane.showMessageDialog(null, "Số điện thoại nhân viên đã được đăng ký!");
        }  else if (!emailnv.contains("@gmail.com")) {
            JOptionPane.showMessageDialog(null, "Định dạng gmail không đúng. Vui lòng nhập lại");
        } else if (kiemtracccd || kiemtracccdsv) {
            JOptionPane.showMessageDialog(null, "Căn cước nhân viên đã được đăng ký!");
        } else if (kiemtraemail || kiemtraemailsv) {
            JOptionPane.showMessageDialog(null, "Email nhân viên đã được đăng ký!");
        }else if (!kiemtrangaysinhnhanvien) {
            JOptionPane.showMessageDialog(this, "Nhân Viên chưa đủ 18 tuổi !");
        }  
        else {
            int test = JOptionPane.showConfirmDialog(null, "Bạn chắc có muốn cập nhật thông tin nhân viên hay không !", "Thông báo đăng ký", JOptionPane.YES_NO_OPTION);
            if (test == JOptionPane.YES_OPTION) {
                LayCCCDNhanVien(count);
                new TaiKhoanDAO().CapNhatEmail(email,emailnv);
                updateNV();
                JOptionPane.showMessageDialog(null, "Cập nhật nhân viên thành công!");
                showTable();
                QuanLyThongTinNV.setVisible(true);
                AddNhanVien.setVisible(false);
                ViewNhanVien.setVisible(false);
                UpdateNhanVien.setVisible(false);
            } else if (test == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Bạn đã hủy cập nhật thành công");
            }
        }
    }
    }//GEN-LAST:event_btnUpdateSVMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        hidepanel();
        QuanLyThongTinNV.setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void txtUpSoDienThoaiNVActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpSoDienThoaiNVActionPerformed1
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpSoDienThoaiNVActionPerformed1

    private void txtUpQueQuanNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpQueQuanNVActionPerformed
        // TODO add your handling code here:
        selectedUpQueQuan = (String) txtUpQueQuanNV.getSelectedItem();
    }//GEN-LAST:event_txtUpQueQuanNVActionPerformed

    private void txtCCCDNVjCanCuocSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCCCDNVjCanCuocSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCCCDNVjCanCuocSVActionPerformed

    private void txtEmailjEmailSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailjEmailSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailjEmailSVActionPerformed

    private void rdNamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdNamMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rdNamMouseClicked

    private void rdNuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdNuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rdNuMouseClicked

    private void rdNujRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNujRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdNujRadioButton2ActionPerformed

    private void txtTenNVjHoTenSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenNVjHoTenSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenNVjHoTenSVActionPerformed

    private void txtTenDangNhapNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenDangNhapNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenDangNhapNVActionPerformed

    private void btnAddNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddNVMouseClicked
        // TODO add your handling code here:

        String hotennv = txtTenNV.getText().trim();
        String cccdnv = txtCCCDNV.getText().trim();
        Date ngaysinhnv = txtNgaySinh.getDate();
        String sodienthoainv = txtSoDienThoaiNV.getText().trim();
        String emailnv = txtEmail.getText().trim();
        String tendangnhapnv = txtTenDangNhapNV.getText().trim();
        String matkhau = txtMatKhauNV.getText().trim();
        String nhaplaimatkhau = txtNhapLaiMatKhauNV.getText().trim();
        
        if (hotennv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống họ tên nhân viên. Vui lòng điền thông tin đầy đủ!");
        } else if (cccdnv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống căn cước công dân nhân viên. Vui lòng điền thông tin đầy đủ!");
        }else if (ngaysinhnv == null) {
            JOptionPane.showMessageDialog(this, "Không để trống ngày sinh sinh viên. Vui lòng điền thông tin đầy đủ!");
        }else if (!rdNam.isSelected() && !rdNu.isSelected()) {
            JOptionPane.showMessageDialog(null, "Hãy chọn giới tính !");
        } else if (sodienthoainv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống số điện thoại nhân viên. Vui lòng điền thông tin đầy đủ!");
        } else if (emailnv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống email nhân viên. Vui lòng điền thông tin đầy đủ!");
        } else if (tendangnhapnv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống tên đăng nhập. Vui lòng điền thông tin đầy đủ!");
        } else if (matkhau.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống mật khẩu. Vui lòng điền thông tin đầy đủ!");
        } else if (nhaplaimatkhau.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống nhập lại mật khẩu. Vui lòng điền thông tin đầy đủ!");
        }else{
        // Ràng buộc điều kiện chi tiết
        String ycsdt = "^[0]{1}[0-9]{9}";
        String yccccd = "^([0-9]{9})*([0-9]{12})*$";
        String yctandangnhap = "^[a-zA-Z0-9]+$";

        //Kiểm tra tài khoản, thông tin đã tồn tại hay chưa
        boolean kiemtracccdsv = new SinhVienDAO().KiemTraCCCDSV(cccdnv);
        boolean kiemtraemailsv = new SinhVienDAO().KiemTraEmailSV(emailnv);
        boolean kiemtrasdtsv = new SinhVienDAO().KiemTraSDTSV(sodienthoainv);
        boolean kiemtratendn = new TaiKhoanDAO().KiemTraTenDNTK(tendangnhapnv);
        boolean kiemtracccdnhanvien = new QuanLyNhanVienDAO().KiemTraCCCDNV(cccdnv);
        boolean kiemtraemailnhanvien = new QuanLyNhanVienDAO().KiemTraEmailNV(emailnv);
        boolean kiemtrasdtnhanvien = new QuanLyNhanVienDAO().KiemTraSDTNV(sodienthoainv);
        boolean kiemtrangaysinhnhanvien = new SinhVienDAO().KiemTrangaysinh(ngaysinhnv);

        if (!cccdnv.matches(yccccd)) {
            JOptionPane.showMessageDialog(this, "Định dạng căn cước công dân không đúng. Vui lòng nhập lại!");
        } else if (!sodienthoainv.matches(ycsdt)) {
            JOptionPane.showMessageDialog(null, "Định dạng số điện thoại không dúng. Ví dụ : 0827364857");
        } else if (!emailnv.contains("@gmail.com")) {
            JOptionPane.showMessageDialog(null, "Định dạng gmail không đúng. Vui lòng nhập lại");
        } else if (!matkhau.equals(nhaplaimatkhau)) {
            JOptionPane.showMessageDialog(null, "Mật khẩu nhập lại không trùng với mật khẩu. Vui lòng nhập lại!");
        } else if (kiemtracccdsv || kiemtracccdnhanvien) {
            JOptionPane.showMessageDialog(null, "Căn cước nhân viên đã được đăng ký!");
        } else if (kiemtraemailsv || kiemtraemailnhanvien) {
            JOptionPane.showMessageDialog(null, "Email nhân viên đã được đăng ký!");
        } else if (kiemtrasdtsv || kiemtrasdtnhanvien) {
            JOptionPane.showMessageDialog(null, "Số điện thoại nhân viên đã được đăng ký!");
        } else if (kiemtratendn) {
            JOptionPane.showMessageDialog(null, "Tên đăng nhập nhân viên đã tồn tại!");
        } else if (!tendangnhapnv.matches(yctandangnhap)) {
            JOptionPane.showMessageDialog(null, "Tên đăng nhập nhân viên chỉ có số và chữ trong alphabet");
        }else if (!kiemtrangaysinhnhanvien) {
            JOptionPane.showMessageDialog(this, "Nhân Viên chưa đủ 18 tuổi !");
        } else {
            int test = JOptionPane.showConfirmDialog(null, "Bạn chắc có muốn thêm nhân viên hay không !", "Thông báo đăng ký", JOptionPane.YES_NO_OPTION);
            if (test == JOptionPane.YES_OPTION) {
                AddTaiKhoan();
                AddNhanVien();
            } else if (test == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Bạn đã hủy thêm nhân viên thành công");
            }
        }
    }
    }//GEN-LAST:event_btnAddNVMouseClicked

    private void btnAddNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddNVActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        hidepanel();
        QuanLyThongTinNV.setVisible(true);
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void txtSoDienThoaiNVjMaLopSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoDienThoaiNVjMaLopSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoDienThoaiNVjMaLopSVActionPerformed

    private void txtQueQuanNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQueQuanNVActionPerformed
        // TODO add your handling code here:
        selectedQueQuan = (String) txtQueQuanNV.getSelectedItem();
    }//GEN-LAST:event_txtQueQuanNVActionPerformed

    private void show_eyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_show_eyeMousePressed
        // TODO add your handling code here:
        show_eye.setVisible(false);
        hide_eye.setVisible(true);
        txtMatKhauNV.setEchoChar((char) 0);
        txtNhapLaiMatKhauNV.setEchoChar((char) 0);
    }//GEN-LAST:event_show_eyeMousePressed

    private void hide_eyeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide_eyeMousePressed
        // TODO add your handling code here:
        hide_eye.setVisible(false);
        show_eye.setVisible(true);
        txtMatKhauNV.setEchoChar('*');
        txtNhapLaiMatKhauNV.setEchoChar('*');
    }//GEN-LAST:event_hide_eyeMousePressed

    private void btnUpdateSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateSVActionPerformed

    private void rdUpNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdUpNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdUpNamActionPerformed

    private void txtUpTrangThaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUpTrangThaiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpTrangThaiMouseClicked

    private void txtUpTrangThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpTrangThaiActionPerformed
        selectedUpTrangThai = (String) txtUpTrangThai.getSelectedItem();
    }//GEN-LAST:event_txtUpTrangThaiActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void deleteNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteNVMouseClicked
    if (count == -1) {
        JOptionPane.showMessageDialog(null, "Vui lòng chọn Nhân Viên để xóa!");
    } else {
        int test = JOptionPane.showConfirmDialog(null, "Bạn chắc có muốn xóa Nhân Viên hay không !", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (test == JOptionPane.YES_OPTION) {
            LayCCCDNhanVien(count);
            if (!email.equals(email_account)) {
                System.out.println("1>>> " + email_account);
                System.out.println("2>>> " + email);
                new TaiKhoanDAO().MoveToBinNV(email);
                // deleteTaiKhoan(email);
                showTable();
            } else {
                System.out.println("3>>> " + email_account);
                System.out.println("4>>> " + email);
                JOptionPane.showMessageDialog(null, "Nhân viên bạn chọn hiện đang là tài khoản bạn đăng nhập, không thể xóa!");
            }
        } else if (test == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Bạn đã hủy xóa Nhân Viên thành công");
        }
    }
    }//GEN-LAST:event_deleteNVMouseClicked

    private void editNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editNVMouseClicked
        // TODO add your handling code here:
        if (count == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn nhân viên để update!");
        } else {
                        System.out.print(count);
            hidepanel();
            UpdateNhanVien.setVisible(true);
            LayThongTinNhanVienUp(count);
        }
    }//GEN-LAST:event_editNVMouseClicked

    private void viewNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewNVMouseClicked
        // TODO add your handling code here:
        if (count == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn nhân viên để xem!");
        } else {
            hidepanel();
            ViewNhanVien.setVisible(true);
            LayThongTinNhanVienView(count);
        }
    }//GEN-LAST:event_viewNVMouseClicked

    private void addNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addNVMouseClicked
        hidepanel();
        AddNhanVien.setVisible(true);
        
    }//GEN-LAST:event_addNVMouseClicked

    private void jScrollPane1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseExited

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        count = tableNV.getSelectedRow();
        LayCCCDNhanVien(count);
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void tableNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableNVMouseClicked
        // TODO add your handling code here:
        count = tableNV.getSelectedRow();
        LayCCCDNhanVien(count);
    }//GEN-LAST:event_tableNVMouseClicked

    private void jLabel55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55MouseClicked
        hidepanel();
        QuanLyThongTinNV.setVisible(true);
        
    }//GEN-LAST:event_jLabel55MouseClicked

    private void PreviousButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreviousButtonActionPerformed
        // TODO add your handling code here:
        if (currentPage > 1) {
            currentPage--;
            showTable(currentPage);
        }
    }//GEN-LAST:event_PreviousButtonActionPerformed

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        // TODO add your handling code here:
        currentPage++;
        showTable(currentPage);
    }//GEN-LAST:event_NextButtonActionPerformed

    private void binMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_binMouseClicked
        hidepanel();
        Bin.setVisible(true);
        showTabledelete();
    }//GEN-LAST:event_binMouseClicked

    private void loadNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadNVMouseClicked
        showTable();
        count = -1;
    }//GEN-LAST:event_loadNVMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        if (txtSearch.isSelected()) {
            int option = txtSearch.getSelectedIndex();
            String textsearch = txtSearch.getText().trim();
            if (option == 0) {
                showTable("maSV", textsearch);
            } else if (option == 1) {
                showTable("tenSV", textsearch);
            } else if (option == 2) {
                showTable("CCCD", textsearch);
            } else if (option == 3) {
                showTable("maLop", textsearch);
            }
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void deleteSV1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteSV1MouseClicked
        count = tableNV1.getSelectedRow();
        if (count == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn Nhân Viên để xóa!");
        } else {
            int test = JOptionPane.showConfirmDialog(null, "Bạn chắc có muốn xóa Nhân Viên hay không !", "Thông báo", JOptionPane.YES_NO_OPTION);
            if (test == JOptionPane.YES_OPTION) {
                LayCCCDNhanVien(count);
                if ( email_account != email ){
                    new TaiKhoanDAO().XoaTaiKhoanbin(email);
                    deleteTaiKhoan(email);
                    JOptionPane.showMessageDialog(null, "Xoá Nhân Viên thành công!");
                }else JOptionPane.showMessageDialog(null, "Tài khoản này là tài khoản bạn đang sử dụng, Không thể xóa !");
            } else if (test == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Bạn đã hủy xóa Nhân Viên thành công");
            }
        }
        showTabledelete();
        
    }//GEN-LAST:event_deleteSV1MouseClicked

    private void restoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restoreMouseClicked
        count = tableNV1.getSelectedRow();
        if (count == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn Nhân Viên để khôi phục!");
        } else {
            int test = JOptionPane.showConfirmDialog(null, "Bạn chắc có muốn khôi phục Nhân Viên hay không !", "Thông báo", JOptionPane.YES_NO_OPTION);
            if (test == JOptionPane.YES_OPTION) {
                LayCCCDNhanVien(count);
                new TaiKhoanDAO().KhoiphucTaiKhoanNV(email);
                JOptionPane.showMessageDialog(null, "Khôi phục Nhân Viên thành công!");
            }
        }
        showTabledelete();
    }//GEN-LAST:event_restoreMouseClicked

    private void jLabel61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseClicked
        hidepanel();
        QuanLyThongTinNV.setVisible(true);
    }//GEN-LAST:event_jLabel61MouseClicked

    private void jScrollPane2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane2MouseExited

    private void jScrollPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane2MouseClicked

    private void tableNV1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableNV1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableNV1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddNhanVien;
    private javax.swing.JPanel Bin;
    private java.awt.Button NextButton;
    private java.awt.Button PreviousButton;
    private javax.swing.JPanel QuanLyThongTinNV;
    private javax.swing.JPanel UpdateNhanVien;
    private javax.swing.JPanel ViewNhanVien;
    private javax.swing.JLabel addNV;
    private javax.swing.JLabel bin;
    private javax.swing.JButton btnAddNV;
    private javax.swing.JButton btnUpdateSV;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel deleteNV;
    private javax.swing.JLabel deleteSV1;
    private javax.swing.JLabel editNV;
    private javax.swing.JLabel hide_eye;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel loadNV;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JRadioButton rdUpNam;
    private javax.swing.JRadioButton rdUpNu;
    private javax.swing.JLabel restore;
    private javax.swing.JLabel show_eye;
    private javax.swing.JTable tableNV;
    private javax.swing.JTable tableNV1;
    private javax.swing.JTextField txtCCCDNV;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtMatKhauNV;
    private com.toedter.calendar.JDateChooser txtNgaySinh;
    private javax.swing.JPasswordField txtNhapLaiMatKhauNV;
    private javax.swing.JComboBox<String> txtQueQuanNV;
    private textfield.TextFieldSearchOption txtSearch;
    private javax.swing.JTextField txtSoDienThoaiNV;
    private javax.swing.JTextField txtTenDangNhapNV;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtUpCCCD;
    private javax.swing.JTextField txtUpEmail;
    private com.toedter.calendar.JDateChooser txtUpNgaySinh;
    private javax.swing.JComboBox<String> txtUpQueQuanNV;
    private javax.swing.JTextField txtUpSoDienThoaiNV;
    private javax.swing.JTextField txtUpTenNV;
    private javax.swing.JComboBox<String> txtUpTrangThai;
    private javax.swing.JLabel txtViewCCCDNV;
    private javax.swing.JLabel txtViewChucVuNV;
    private javax.swing.JLabel txtViewEmailNV;
    private javax.swing.JLabel txtViewGioiTinh;
    private javax.swing.JLabel txtViewHoTenNV;
    private javax.swing.JLabel txtViewNgaySinhNV;
    private javax.swing.JLabel txtViewQueQuan;
    private javax.swing.JLabel txtViewSoDienThoaiNV;
    private javax.swing.JLabel viewNV;
    // End of variables declaration//GEN-END:variables

    private void showTable() {
        listnhanvien = new QuanLyNhanVienDAO().getAllThongTinNV();
        Model.setRowCount(0);
        for (ThongTinNhanVien nv : listnhanvien) {
            String trangThai = nv.getTrangThai().equals("0") ? "Đang làm việc" : "Đã nghỉ việc";
            Model.addRow(new Object[]{
                nv.getTenNV(), nv.getCCCD(), nv.getGioiTinh(), nv.getNgaySinh(), nv.getSoDienThoai(), nv.getChucVu(), trangThai
            });
        }
        // Căn lề tất cả các cột về bên trái
        setLeftAlignmentForTableColumns(tableNV);
        count = -1;
    }
    
    private void showTabledelete() {
        listnhanvien = new QuanLyNhanVienDAO().getAllThongTinNVdelete();
        Modeldelete.setRowCount(0);
        for (ThongTinNhanVien nv : listnhanvien) {
            String trangThai = nv.getTrangThai().equals("0") ? "Đang làm việc" : "Đã nghỉ việc";
            Modeldelete.addRow(new Object[]{
                nv.getTenNV(), nv.getCCCD(), nv.getGioiTinh(), nv.getNgaySinh(), nv.getSoDienThoai(), nv.getChucVu(), trangThai
            });
        }
        // Căn lề tất cả các cột về bên trái
        setLeftAlignmentForTableColumns(tableNV1);
        count = -1;
    }

    private void setLeftAlignmentForTableColumns(JTable table) {
        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        leftRenderer.setHorizontalAlignment(DefaultTableCellRenderer.LEFT);

        TableColumnModel columnModel = table.getColumnModel();
        for (int columnIndex = 0; columnIndex < columnModel.getColumnCount(); columnIndex++) {
            columnModel.getColumn(columnIndex).setCellRenderer(leftRenderer);
        }
    }

    private void showTable(String where, String text) {
        listnhanvien = new QuanLyNhanVienDAO().getAllThongTinNVSearch(where, text);
        Model.setRowCount(0);
        List<ThongTinNhanVien> filteredList = new ArrayList<>();
            for (ThongTinNhanVien nv : listnhanvien) {
                    filteredList.add(nv);
        count = -1;
        displayDataInTable(filteredList);
        }
    }

    private void LayCCCDNhanVien(int count) {
        ThongTinNhanVien nv = listnhanvien.get(count);
        cccd = nv.getCCCD();
        email = nv.getEmail();
    }

    private void LayThongTinNhanVienUp(int count) {
        ThongTinNhanVien nv = listnhanvien.get(count);
        txtUpTenNV.setText(nv.getTenNV());
        txtUpCCCD.setText(nv.getCCCD());
        txtUpNgaySinh.setDate(nv.getNgaySinh());
        if (nv.getGioiTinh().equals("Nam")) {
            rdUpNam.setSelected(true);
        } else {
            rdUpNu.setSelected(true);
        }
        String trangThai = nv.getTrangThai().equals("0") ? "Đang làm việc" : "Đã nghỉ việc";
        txtUpTrangThai.setSelectedItem(trangThai);
        txtUpSoDienThoaiNV.setText(nv.getSoDienThoai());
        txtUpQueQuanNV.setSelectedItem(nv.getQueQuan());
        txtUpEmail.setText(nv.getEmail());
        email = nv.getEmail();
        cccd = nv.getCCCD();
    }

    private void LayThongTinNhanVienView(int count) {
        ThongTinNhanVien nv = listnhanvien.get(count);
        txtViewHoTenNV.setText(nv.getTenNV());
        txtViewCCCDNV.setText(nv.getCCCD());
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String date = sdf.format(nv.getNgaySinh());
        txtViewNgaySinhNV.setText(date);
        if (nv.getGioiTinh().equals("Nam")) {
            txtViewGioiTinh.setText("Nam");
        } else {
            txtViewGioiTinh.setText("Nữ");
        }
        txtViewSoDienThoaiNV.setText(nv.getSoDienThoai());
        txtViewQueQuan.setText(nv.getQueQuan());
        txtViewEmailNV.setText(nv.getEmail());
        txtViewChucVuNV.setText(nv.getChucVu());
    }

    void AddSearch() {
        txtSearch.addEventOptionSelected(new SearchOptionEvent() {
            @Override
            public void optionSelected(SearchOption option, int index) {
                txtSearch.setHint("Tìm kiếm " + option.getName() + "....");
            }
        });
        txtSearch.addOption(new SearchOption("Tên NV", new ImageIcon(getClass().getResource("/img/user.png"))));
        txtSearch.addOption(new SearchOption("CCCD", new ImageIcon(getClass().getResource("/img/user.png"))));
        txtSearch.addOption(new SearchOption("Số điện thoại", new ImageIcon(getClass().getResource("/img/email.png"))));
    }

    public void AddNhanVien() {
        Connection conn = KetNoiSQL.getConnection();
        String sql = "insert into NhanVien (tenNV, CCCD, gioiTinh, ngaySinh, email, soDienThoai, queQuan , chucVu, trangThai,tenDangNhap)"
                + "values(?,?,?,?,?,?,?,?,?,?)";
        int row = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, txtTenNV.getText().trim());
            ps.setString(2, txtCCCDNV.getText().trim());
            if (rdNam.isSelected()) {
                ps.setString(3, "Nam");
            } else {
                ps.setString(3, "Nữ");
            }
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(txtNgaySinh.getDate());
            ps.setString(4, date);
            ps.setString(5, txtEmail.getText().trim());
            ps.setString(6, txtSoDienThoaiNV.getText().trim());
            ps.setString(7, selectedQueQuan);
            ps.setString(8, "Quản Lý");
            ps.setString(9, "0");
            ps.setString(10,txtTenDangNhapNV.getText().trim() );
            row = ps.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(null, "Thêm nhân viên thành công");
                QuanLyThongTinNV.setVisible(true);
                AddNhanVien.setVisible(false);
                ViewNhanVien.setVisible(false);
                UpdateNhanVien.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Thêm nhân viên không thành công!");
            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        showTable();
    }

    void AddTaiKhoan() {
        Connection conn = KetNoiSQL.getConnection();
        int row = 0;
        String phanquyen = "Quản lý";
        String sql1 = "insert into TaiKhoan (tenDangNhap, matKhau, email, phanQuyen) values(?,?,?,?)";
        try {
            PreparedStatement ps1 = conn.prepareStatement(sql1);

            String password = PasswordHash(txtMatKhauNV.getText().trim());
            ps1.setString(1, txtTenDangNhapNV.getText().trim());
            ps1.setString(2, PasswordHash(password));
            ps1.setString(3, txtEmail.getText().trim());
            ps1.setString(4, phanquyen);

            row = ps1.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    private void deleteTaiKhoan(String email1) {
        Connection conn = KetNoiSQL.getConnection();
        String sql = "delete from TaiKhoan where email = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, email1);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Delete thanh cong");
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Lỗi xóa không thành công !");
        }
    }
    private void resetForm() {
        txtTenNV.setText("");
        txtCCCDNV.setText("");
        txtEmail.setText("");
        txtMatKhauNV.setText("");
        txtTenDangNhapNV.setText("");
        txtNgaySinh.setDate(null);
        txtMatKhauNV.setText("");
        txtNhapLaiMatKhauNV.setText("");
        txtSoDienThoaiNV.setText("");
        rdNam.setSelected(true);
    }

    private void updateNV() {
        try {
            Connection conn = KetNoiSQL.getConnection();
            String sql = "UPDATE NhanVien set tenNV=?, CCCD=?, ngaySinh=?, gioiTinh=?, soDienThoai=?, queQuan=?, email=?,  trangThai=? where CCCD=?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, txtUpTenNV.getText().trim());
            ps.setString(2, txtUpCCCD.getText().trim());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(txtUpNgaySinh.getDate());
            ps.setString(3, date);
            if (rdUpNam.isSelected()) {
                ps.setString(4, "Nam");
            } else {
                ps.setString(4, "Nữ");
            }
            ps.setString(5, txtUpSoDienThoaiNV.getText().trim());
            ps.setString(6, selectedUpQueQuan);
            ps.setString(7, txtUpEmail.getText().trim());
            ps.setString(8, selectedUpTrangThai);
            ps.setString(9, cccd);
            ps.executeUpdate();
            conn.close();
        } catch (SQLException ex) {
        }
        showTable();
    }

    void UpdateTaiKhoan(String email) {
        Connection conn = KetNoiSQL.getConnection();
        int row = 0;
        String sql1 = "update TaiKhoan set email=?, phanQuyen=? where email=?";
        try {
            PreparedStatement ps1 = conn.prepareStatement(sql1);

            ps1.setString(1, txtUpEmail.getText().trim());
            ps1.setString(3, txtUpEmail.getText().trim());
            ps1.setString(2, selectedUpChucVu);

            row = ps1.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(null, "Cập nhật tài khoản thành công!");
            } else {
            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void refreshTableData() {
        List<ThongTinNhanVien> filteredList = new ArrayList<>();
            filteredList = new QuanLyNhanVienDAO().getAllThongTinNV();
            for (ThongTinNhanVien nv : listnhanvien) {
                    filteredList.add(nv);
                }
        displayDataInTable(filteredList);
    }

// Phương thức để hiển thị dữ liệu trong bảng
    private void displayDataInTable(List<ThongTinNhanVien> dataList) {
        Model.setRowCount(0);
        for (ThongTinNhanVien nv : dataList) {
            Model.addRow(new Object[]{
                nv.getTenNV(), nv.getCCCD(), nv.getGioiTinh(), nv.getNgaySinh(), nv.getSoDienThoai(), nv.getChucVu(), nv.getTrangThai()
            });
        }
        // Căn lề tất cả các cột về bên trái
        setLeftAlignmentForTableColumns(tableNV);
        count = -1;
    }

    private void showTable(int page) {
        
        int startIndex = (page - 1) * rowsPerPage;
        int endIndex;

        if (Model == null || listnhanvien.isEmpty()) {
            return;
        }

        // Hiển thị dữ liệu của trang hiện tại
        Model.setRowCount(0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        if (page == 1) {
            endIndex = Math.min(startIndex + rowsPerPage, Math.min(12, listnhanvien.size())); // Chỉ hiển thị 12 dòng cho trang đầu tiên
        } else {
            endIndex = Math.min(startIndex + rowsPerPage, listnhanvien.size()); // Hiển thị toàn bộ dữ liệu cho các trang khác
        }

         for (int i = startIndex; i < endIndex; i++) {
            ThongTinNhanVien nv = listnhanvien.get(i);
            Model.addRow(new Object[]{nv.getTenNV(), nv.getCCCD(), nv.getGioiTinh(), nv.getNgaySinh(), nv.getSoDienThoai(), nv.getChucVu(), nv.getTrangThai()});
        }

        // Kiểm tra xem có đủ dữ liệu để tạo trang tiếp theo không
        boolean hasNextPage = endIndex < listnhanvien.size();
    
        // Nếu có trang tiếp theo, cho phép người dùng chuyển trang
        NextButton.setEnabled(hasNextPage);
        
        
        // Tính toán index bắt đầu và kết thúc của dữ liệu trên trang
       
    }
    

}
