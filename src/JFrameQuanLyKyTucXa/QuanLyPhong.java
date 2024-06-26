
package JFrameQuanLyKyTucXa;

import Connector.KetNoiSQL;
import dao.PhongDAO;
import dao.SinhVienDAO;
import dao.ThongTinHoaDonDAO;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ThongTinPhong;
import model.ThongTinSinhVien;
import textfield.SearchOptionEvent;
import textfield.SearchOption;

public class QuanLyPhong extends javax.swing.JPanel {

    private List<ThongTinPhong> listphong;
    private DefaultTableModel Model;
    private DefaultTableModel TableView;
    private int count = -1;
    private String maPhong;
    private PhongDAO phongdao;
    private String selectedQueQuan, selectedUpQueQuan;
    private String selectedLoaiPhong, selectedUpLoaiPhong;
    private List<ThongTinSinhVien> listsinhvien;

    /**
     * Creates new form QuanLyPhong
     */
    public QuanLyPhong() {
        initComponents();

        AddSearch();
        Model = (DefaultTableModel) tablePhong.getModel();
        showTable();
        tablePhong.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tablePhong.getTableHeader().setOpaque(false);
        tablePhong.getTableHeader().setBackground(new Color(0,102,102));
        tablePhong.getTableHeader().setForeground(new Color(225, 225, 225));

        TableView = (DefaultTableModel) tableViewPhong.getModel();
        tableViewPhong.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        tableViewPhong.getTableHeader().setOpaque(false);
        tableViewPhong.getTableHeader().setBackground(new Color(0,102,102));
        tableViewPhong.getTableHeader().setForeground(new Color(225, 225, 225));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        QuanLyThongTinPhong = new javax.swing.JPanel();
        ScrollPaneSV = new javax.swing.JScrollPane();
        tablePhong = new javax.swing.JTable();
        addPhong = new javax.swing.JLabel();
        viewPhong = new javax.swing.JLabel();
        editPhong = new javax.swing.JLabel();
        deletePhong = new javax.swing.JLabel();
        txtSearch = new textfield.TextFieldSearchOption();
        jLabel1 = new javax.swing.JLabel();
        ViewPhong = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtViewSoLuongSVPhong = new javax.swing.JLabel();
        txtViewMaPhong = new javax.swing.JLabel();
        txtViewTienPhong = new javax.swing.JLabel();
        txtViewTenPhong = new javax.swing.JLabel();
        txtViewLoaiPhong = new javax.swing.JLabel();
        ScrollPaneSV1 = new javax.swing.JScrollPane();
        tableViewPhong = new javax.swing.JTable();
        AddPhong = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAddSV = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtAddTenPhong = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtAddMaPhong = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        txtAddLoaiPhong = new javax.swing.JComboBox<>();
        UpdatePhong = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtUpTenPhong = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtUpSoLuongSinhVienPhong = new javax.swing.JTextField();
        btnUpdatePhong = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtUpTienPhong = new javax.swing.JTextField();
        txtUpLoaiPhong = new javax.swing.JComboBox<>();

        setPreferredSize(new java.awt.Dimension(1068, 580));
        setLayout(new java.awt.CardLayout());

        QuanLyThongTinPhong.setBackground(new java.awt.Color(255, 255, 255));

        ScrollPaneSV.setBackground(new java.awt.Color(255, 255, 255));
        ScrollPaneSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ScrollPaneSVMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ScrollPaneSVMouseExited(evt);
            }
        });

        tablePhong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablePhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phòng", "Tên phòng", "Số lượng SV tối đa", "Loại phòng", "Tiền phòng", "Giới tính"
            }
        ));
        tablePhong.setFocusable(false);
        tablePhong.setGridColor(new java.awt.Color(255, 255, 255));
        tablePhong.setRowHeight(25);
        tablePhong.setSelectionBackground(new java.awt.Color(19, 90, 118));
        tablePhong.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tablePhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePhongMouseClicked(evt);
            }
        });
        ScrollPaneSV.setViewportView(tablePhong);

        addPhong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        addPhong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addPhongMouseClicked(evt);
            }
        });

        viewPhong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/magnifyingglass.png"))); // NOI18N
        viewPhong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewPhongMouseClicked(evt);
            }
        });

        editPhong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editPhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/copywriting.png"))); // NOI18N
        editPhong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editPhongMouseClicked(evt);
            }
        });

        deletePhong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deletePhong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        deletePhong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deletePhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletePhongMouseClicked(evt);
            }
        });

        txtSearch.setBorder(null);
        txtSearch.setForeground(new java.awt.Color(19, 90, 118));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(19, 90, 118));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quản lý thông tin phòng");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));

        javax.swing.GroupLayout QuanLyThongTinPhongLayout = new javax.swing.GroupLayout(QuanLyThongTinPhong);
        QuanLyThongTinPhong.setLayout(QuanLyThongTinPhongLayout);
        QuanLyThongTinPhongLayout.setHorizontalGroup(
            QuanLyThongTinPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuanLyThongTinPhongLayout.createSequentialGroup()
                .addGroup(QuanLyThongTinPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(QuanLyThongTinPhongLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(addPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(viewPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deletePhong, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(QuanLyThongTinPhongLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(QuanLyThongTinPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ScrollPaneSV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1070, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        QuanLyThongTinPhongLayout.setVerticalGroup(
            QuanLyThongTinPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuanLyThongTinPhongLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(QuanLyThongTinPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(QuanLyThongTinPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(deletePhong, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                        .addComponent(editPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(ScrollPaneSV, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        add(QuanLyThongTinPhong, "card2");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(19, 90, 118));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("Hệ thống quản lý ký túc xá sinh viên");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(237, 50, 55));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Thông tin chi tiết của phòng");

        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_main.png"))); // NOI18N
        jLabel55.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel55MouseClicked(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(19, 90, 118));
        jLabel22.setText("Tiền phòng  :");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(19, 90, 118));
        jLabel23.setText("Tên phòng :");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(19, 90, 118));
        jLabel24.setText("Số lượng sinh viên phòng :");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(19, 90, 118));
        jLabel25.setText("Loại phòng  :");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(19, 90, 118));
        jLabel26.setText("Mã phòng :");

        txtViewSoLuongSVPhong.setBackground(new java.awt.Color(255, 255, 255));
        txtViewSoLuongSVPhong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtViewSoLuongSVPhong.setForeground(new java.awt.Color(19, 90, 118));

        txtViewMaPhong.setBackground(new java.awt.Color(255, 255, 255));
        txtViewMaPhong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtViewMaPhong.setForeground(new java.awt.Color(19, 90, 118));

        txtViewTienPhong.setBackground(new java.awt.Color(255, 255, 255));
        txtViewTienPhong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtViewTienPhong.setForeground(new java.awt.Color(19, 90, 118));

        txtViewTenPhong.setBackground(new java.awt.Color(255, 255, 255));
        txtViewTenPhong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtViewTenPhong.setForeground(new java.awt.Color(19, 90, 118));

        txtViewLoaiPhong.setBackground(new java.awt.Color(255, 255, 255));
        txtViewLoaiPhong.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtViewLoaiPhong.setForeground(new java.awt.Color(19, 90, 118));

        ScrollPaneSV1.setBackground(new java.awt.Color(255, 255, 255));

        tableViewPhong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tableViewPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sinh viên", "Tên sinh viên", "CCCD", "Giới tính", "Ngày sinh", "Mã lớp ", "Số điện thoại"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableViewPhong.setFocusable(false);
        tableViewPhong.setGridColor(new java.awt.Color(255, 255, 255));
        tableViewPhong.setRowHeight(25);
        tableViewPhong.setSelectionBackground(new java.awt.Color(19, 90, 118));
        tableViewPhong.setSelectionForeground(new java.awt.Color(255, 255, 255));
        ScrollPaneSV1.setViewportView(tableViewPhong);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 892, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 224, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(68, 68, 68)
                                .addComponent(txtViewTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtViewTienPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtViewLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(68, 68, 68)
                                .addComponent(txtViewMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(81, 81, 81)
                                .addComponent(jLabel24)
                                .addGap(18, 18, 18)
                                .addComponent(txtViewSoLuongSVPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ScrollPaneSV1, javax.swing.GroupLayout.PREFERRED_SIZE, 967, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtViewMaPhong, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtViewSoLuongSVPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewTienPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtViewLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(ScrollPaneSV1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ViewPhongLayout = new javax.swing.GroupLayout(ViewPhong);
        ViewPhong.setLayout(ViewPhongLayout);
        ViewPhongLayout.setHorizontalGroup(
            ViewPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ViewPhongLayout.setVerticalGroup(
            ViewPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(ViewPhong, "card5");

        AddPhong.setBackground(new java.awt.Color(19, 90, 118));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Hệ thống quản lý ký túc xá sinh viên");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Thêm thông tin phòng ở ký túc xá");

        btnAddSV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddSV.setForeground(new java.awt.Color(19, 90, 118));
        btnAddSV.setText("Lưu phòng");
        btnAddSV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddSVMouseClicked(evt);
            }
        });
        btnAddSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSVActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_white.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(19, 90, 118));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Tên phòng :");

        txtAddTenPhong.setBackground(new java.awt.Color(19, 90, 118));
        txtAddTenPhong.setForeground(new java.awt.Color(255, 255, 255));
        txtAddTenPhong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtAddTenPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddTenPhongActionPerformed1(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(19, 90, 118));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Loại phòng  :");

        txtAddMaPhong.setBackground(new java.awt.Color(19, 90, 118));
        txtAddMaPhong.setForeground(new java.awt.Color(255, 255, 255));
        txtAddMaPhong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtAddMaPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddMaPhongActionPerformed1(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(19, 90, 118));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Mã phòng :");

        jLabel27.setBackground(new java.awt.Color(19, 90, 118));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Phòng  :");

        rdNam.setBackground(new java.awt.Color(19, 90, 118));
        buttonGroup1.add(rdNam);
        rdNam.setForeground(new java.awt.Color(255, 255, 255));
        rdNam.setSelected(true);
        rdNam.setText("Nam");
        rdNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNamActionPerformed(evt);
            }
        });

        rdNu.setBackground(new java.awt.Color(19, 90, 118));
        buttonGroup1.add(rdNu);
        rdNu.setForeground(new java.awt.Color(255, 255, 255));
        rdNu.setText("Nữ");
        rdNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdNuActionPerformed(evt);
            }
        });

        txtAddLoaiPhong.setForeground(new java.awt.Color(19, 90, 118));
        txtAddLoaiPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loại 1", "Loại 2", "Loại 3", "Loại 4", "Loại 5", "Loại 6" }));
        txtAddLoaiPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddLoaiPhongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddPhongLayout = new javax.swing.GroupLayout(AddPhong);
        AddPhong.setLayout(AddPhongLayout);
        AddPhongLayout.setHorizontalGroup(
            AddPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddPhongLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, 1123, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddPhongLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(AddPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddPhongLayout.createSequentialGroup()
                        .addGroup(AddPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(AddPhongLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtAddMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AddPhongLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(90, 90, 90)
                                .addComponent(txtAddTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AddPhongLayout.createSequentialGroup()
                                .addGroup(AddPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(AddPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAddLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(AddPhongLayout.createSequentialGroup()
                                        .addComponent(rdNam)
                                        .addGap(44, 44, 44)
                                        .addComponent(rdNu)))))
                        .addGap(296, 296, 296))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddPhongLayout.createSequentialGroup()
                        .addComponent(btnAddSV, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(309, 309, 309))))
        );
        AddPhongLayout.setVerticalGroup(
            AddPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddPhongLayout.createSequentialGroup()
                .addGroup(AddPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPhongLayout.createSequentialGroup()
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddPhongLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(AddPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddPhongLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtAddMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AddPhongLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(AddPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(AddPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(AddPhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdNam)
                    .addComponent(rdNu))
                .addGap(53, 53, 53)
                .addComponent(btnAddSV, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        add(AddPhong, "card3");

        UpdatePhong.setPreferredSize(new java.awt.Dimension(1066, 507));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(19, 90, 118));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("Hệ thống quản lý ký túc xá sinh viên");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(237, 50, 55));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cập nhật thông tin phòng");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(19, 90, 118));
        jLabel13.setText("Tên phòng :");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(19, 90, 118));
        jLabel14.setText("Số lượng sinh viên phòng :");

        txtUpTenPhong.setForeground(new java.awt.Color(19, 90, 118));
        txtUpTenPhong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));
        txtUpTenPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpTenPhongActionPerformed1(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(19, 90, 118));
        jLabel15.setText("Loại phòng  :");

        txtUpSoLuongSinhVienPhong.setForeground(new java.awt.Color(19, 90, 118));
        txtUpSoLuongSinhVienPhong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));
        txtUpSoLuongSinhVienPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpSoLuongSinhVienPhongActionPerformed1(evt);
            }
        });

        btnUpdatePhong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdatePhong.setForeground(new java.awt.Color(237, 50, 55));
        btnUpdatePhong.setText("Lưu phòng");
        btnUpdatePhong.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(237, 50, 55)));
        btnUpdatePhong.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdatePhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdatePhongMouseClicked(evt);
            }
        });
        btnUpdatePhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePhongActionPerformed(evt);
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

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(19, 90, 118));
        jLabel16.setText("Tiền phòng  :");

        txtUpTienPhong.setForeground(new java.awt.Color(19, 90, 118));
        txtUpTienPhong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(19, 90, 118)));
        txtUpTienPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpTienPhongActionPerformed1(evt);
            }
        });

        txtUpLoaiPhong.setForeground(new java.awt.Color(19, 90, 118));
        txtUpLoaiPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Loại 1", "Loại 2", "Loại 3", "Loại 4", "Loại 5", "Loại 6" }));
        txtUpLoaiPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUpLoaiPhongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, 1116, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUpTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpSoLuongSinhVienPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnUpdatePhong, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtUpLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtUpTienPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(277, 277, 277))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpSoLuongSinhVienPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUpTienPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnUpdatePhong, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout UpdatePhongLayout = new javax.swing.GroupLayout(UpdatePhong);
        UpdatePhong.setLayout(UpdatePhongLayout);
        UpdatePhongLayout.setHorizontalGroup(
            UpdatePhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        UpdatePhongLayout.setVerticalGroup(
            UpdatePhongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        add(UpdatePhong, "card4");
    }// </editor-fold>//GEN-END:initComponents

    private void tablePhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePhongMouseClicked
        // TODO add your handling code here:
        count = tablePhong.getSelectedRow();
    }//GEN-LAST:event_tablePhongMouseClicked

    private void ScrollPaneSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScrollPaneSVMouseClicked

    }//GEN-LAST:event_ScrollPaneSVMouseClicked

    private void ScrollPaneSVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScrollPaneSVMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ScrollPaneSVMouseExited

    private void addPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPhongMouseClicked
        // TODO add your handling code here:
        resetForm();
        AddPhong.setVisible(true);
        QuanLyThongTinPhong.setVisible(false);
        UpdatePhong.setVisible(false);
        ViewPhong.setVisible(false);
    }//GEN-LAST:event_addPhongMouseClicked

    private void viewPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewPhongMouseClicked
        // TODO add your handling code here:
        if (count == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn phòng để xem!");
        } else {
            LayMaPhong(count);
            QuanLyThongTinPhong.setVisible(false);
            AddPhong.setVisible(false);
            UpdatePhong.setVisible(false);
            ViewPhong.setVisible(true);            
            LayThongTinPhongView(count);
            showTableView(maPhong);
        }


    }//GEN-LAST:event_viewPhongMouseClicked

    private void editPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editPhongMouseClicked
        // TODO add your handling code here:
        if (count == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn phòng để update!");
        } else {
            UpdatePhong.setVisible(true);
            QuanLyThongTinPhong.setVisible(false);
            AddPhong.setVisible(false);
            ViewPhong.setVisible(false);
            LayThongTinPhongUp(count);
        }


    }//GEN-LAST:event_editPhongMouseClicked

    private void deletePhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletePhongMouseClicked
        // TODO add your handling code here:
        if (count == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn phòng để xóa!");
        } else {
            LayMaPhong(count);
            int soluongsv = new PhongDAO().soluongSVtttheomaPhong(maPhong);
            if (soluongsv > 0) {
                JOptionPane.showMessageDialog(null, "Không thể xóa phòng vì sinh viên còn trong phòng!");
            } else {
                int test = JOptionPane.showConfirmDialog(null, "Bạn chắc có muốn xóa phòng hay không !", "Thông báo đăng ký", JOptionPane.YES_NO_OPTION);
                if (test == JOptionPane.YES_OPTION) {
                    deletePhong(maPhong);
                } else if (test == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Bạn đã hủy xóa phòng thành công");
                }
            }
        }
    }//GEN-LAST:event_deletePhongMouseClicked

    private void txtUpTenPhongActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpTenPhongActionPerformed1
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpTenPhongActionPerformed1

    private void txtUpSoLuongSinhVienPhongActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpSoLuongSinhVienPhongActionPerformed1
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpSoLuongSinhVienPhongActionPerformed1

    private void btnUpdatePhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdatePhongMouseClicked
        // TODO add your handling code here:
        LayMaPhong(count);
        String tenphong = txtUpTenPhong.getText().trim();
        String soluongsv = txtUpSoLuongSinhVienPhong.getText().trim();
        String tienphong = txtUpTienPhong.getText().trim();
        int soluongsvphong = new PhongDAO().SoLuongSV(maPhong);
        String kiemtraso = "^[0-9.]+$";
        String ycmasv = "^\\w{2}\\d{2}$";

        if (tenphong.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống tên phòng. Vui lòng điền đầy đủ thông tin!");
        } else if (soluongsv.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống số lượng sinh viên. Vui lòng điền đầy đủ thông tin!");
        } else if (tienphong.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống tiền phòng. Vui lòng điền đầy đủ thông tin!");
        } else if (!soluongsv.matches(kiemtraso)) {
            JOptionPane.showMessageDialog(null, "Định dạng số sinh viên sai. Vui lòng nhập lại!");
        } else if (!tienphong.matches(kiemtraso)) {
            JOptionPane.showMessageDialog(null, "Định dạng số tiền phòng sai. Vui lòng nhập lại!");
        } else {
            int soluong = Integer.parseInt(txtUpSoLuongSinhVienPhong.getText().trim());
            if (soluongsvphong > soluong) {
                JOptionPane.showMessageDialog(null, "Hiện tại số sinh viên vượt qua số lượng sinh viên của phòng. Vui lòng nhập lại số lượng sinh viên của phòng lớn hơn!");
            } else {
                int test = JOptionPane.showConfirmDialog(null, "Bạn chắc có muốn cập nhật phòng hay không !", "Thông báo đăng ký", JOptionPane.YES_NO_OPTION);
                if (test == JOptionPane.YES_OPTION) {
                    LayMaPhong(count);
                    updatePhong(maPhong);
                    JOptionPane.showMessageDialog(null, "Bạn cập nhật phòng thành công!");
                } else if (test == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(null, "Bạn đã hủy đăng ký thành công");
                }
            }
        }
    }//GEN-LAST:event_btnUpdatePhongMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        QuanLyThongTinPhong.setVisible(true);
        AddPhong.setVisible(false);
        UpdatePhong.setVisible(false);
        ViewPhong.setVisible(false);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel55MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55MouseClicked
        // TODO add your handling code here:
        QuanLyThongTinPhong.setVisible(true);
        AddPhong.setVisible(false);
        UpdatePhong.setVisible(false);
        ViewPhong.setVisible(false);
    }//GEN-LAST:event_jLabel55MouseClicked

    private void txtUpTienPhongActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpTienPhongActionPerformed1
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpTienPhongActionPerformed1

    private void btnUpdatePhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdatePhongActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        // TODO add your handling code here:
        if (txtSearch.isSelected()) {
            int option = txtSearch.getSelectedIndex();
            String textsearch = txtSearch.getText().trim();
            if (option == 0) {
                showTable("maPhong", textsearch);
            } else if (option == 1) {
                showTable("tenPhong", textsearch);
            } else if (option == 2) {
                showTable("tienPhong", textsearch);
            } else if (option == 3) {
                showTable("soLuongSVPhong", textsearch);
            } else if (option == 4) {
                showTable("gioiTinh", textsearch);
            }
        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtUpLoaiPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUpLoaiPhongActionPerformed
        // TODO add your handling code here:
        selectedUpLoaiPhong = (String) txtUpLoaiPhong.getSelectedItem();
    }//GEN-LAST:event_txtUpLoaiPhongActionPerformed

    private void txtAddLoaiPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddLoaiPhongActionPerformed
        // TODO add your handling code here:
        selectedLoaiPhong = (String) txtAddLoaiPhong.getSelectedItem();
    }//GEN-LAST:event_txtAddLoaiPhongActionPerformed

    private void rdNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdNuActionPerformed

    private void rdNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdNamActionPerformed

    private void txtAddMaPhongActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddMaPhongActionPerformed1
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddMaPhongActionPerformed1

    private void txtAddTenPhongActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddTenPhongActionPerformed1
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddTenPhongActionPerformed1

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        QuanLyThongTinPhong.setVisible(true);
        AddPhong.setVisible(false);
        UpdatePhong.setVisible(false);
        ViewPhong.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnAddSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddSVActionPerformed

    private void btnAddSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddSVMouseClicked
        // TODO add your handling code here:
        String maphong = txtAddMaPhong.getText().trim();
        String tenphong = txtAddTenPhong.getText().trim();

        String kiemtraso = "^[0-9.]+$";
        boolean kiemtramaphong = new PhongDAO().KiemTraMaSoPhong(maphong);

        if (maphong.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống mã phòng. Vui lòng điền đầy đủ thông tin!");
        } else if (tenphong.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Không để trống tên phòng. Vui lòng điền đầy đủ thông tin!");
        } else if (kiemtramaphong) {
            JOptionPane.showMessageDialog(null, "Mã phòng đã được đăng ký!");
        } else {
            int test = JOptionPane.showConfirmDialog(null, "Bạn chắc có muốn thêm phòng hay không !", "Thông báo đăng ký", JOptionPane.YES_NO_OPTION);
            if (test == JOptionPane.YES_OPTION) {
                AddPhong();
                //resetForm();

            } else if (test == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Bạn đã hủy đăng ký thành công");
            }
        }
    }//GEN-LAST:event_btnAddSVMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddPhong;
    private javax.swing.JPanel QuanLyThongTinPhong;
    private javax.swing.JScrollPane ScrollPaneSV;
    private javax.swing.JScrollPane ScrollPaneSV1;
    private javax.swing.JPanel UpdatePhong;
    private javax.swing.JPanel ViewPhong;
    private javax.swing.JLabel addPhong;
    private javax.swing.JButton btnAddSV;
    private javax.swing.JButton btnUpdatePhong;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel deletePhong;
    private javax.swing.JLabel editPhong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTable tablePhong;
    private javax.swing.JTable tableViewPhong;
    private javax.swing.JComboBox<String> txtAddLoaiPhong;
    private javax.swing.JTextField txtAddMaPhong;
    private javax.swing.JTextField txtAddTenPhong;
    private textfield.TextFieldSearchOption txtSearch;
    private javax.swing.JComboBox<String> txtUpLoaiPhong;
    private javax.swing.JTextField txtUpSoLuongSinhVienPhong;
    private javax.swing.JTextField txtUpTenPhong;
    private javax.swing.JTextField txtUpTienPhong;
    private javax.swing.JLabel txtViewLoaiPhong;
    private javax.swing.JLabel txtViewMaPhong;
    private javax.swing.JLabel txtViewSoLuongSVPhong;
    private javax.swing.JLabel txtViewTenPhong;
    private javax.swing.JLabel txtViewTienPhong;
    private javax.swing.JLabel viewPhong;
    // End of variables declaration//GEN-END:variables

    void showTable() {
        listphong = new PhongDAO().getAllThongTinPhong();        
        Model.setRowCount(0);
        for (ThongTinPhong phong : listphong) {
            int soluongsv = new PhongDAO().SoLuongSV(phong.getMaPhong());
            Model.addRow(new Object[]{
                phong.getMaPhong(), phong.getTenPhong(), phong.getSoLuongSVPhong(), phong.getLoaiPhong(), phong.getTienPhong(),phong.getGioiTinh()
            });
        }
        count = -1;
    }

     private void showTable(String where, String text) {
        listphong = new PhongDAO().getAllThongTinPhongSearch(where, text);
        Model.setRowCount(0);
        for (ThongTinPhong phong : listphong) {
            int soluongsv = new PhongDAO().SoLuongSV(phong.getMaPhong());
            Model.addRow(new Object[]{
                phong.getMaPhong(), phong.getTenPhong(), phong.getSoLuongSVPhong(), phong.getLoaiPhong(), phong.getTienPhong(),phong.getGioiTinh()
            });
        }
    }

     private void showTableView(String maPhong) {
        listsinhvien = new SinhVienDAO().getAllThongTinSVTheoPhong(maPhong);
        TableView.setRowCount(0);
        for (ThongTinSinhVien sv : listsinhvien) {
            TableView.addRow(new Object[]{
                sv.getMaSV(), sv.getTenSV(), sv.getCCCD(), sv.getGioiTinh(), sv.getNgaySinh(), sv.getMaLop(), sv.getSoDienThoai()
            });
        }
    }

    private void LayMaPhong(int count) {
        ThongTinPhong phong = listphong.get(count);
        maPhong = phong.getMaPhong();
    }

    private void LayThongTinPhongUp(int count) {
        ThongTinPhong phong = listphong.get(count);

        txtUpTenPhong.setText(phong.getTenPhong());
        txtUpLoaiPhong.setSelectedItem(phong.getLoaiPhong());
        String soluongsv = String.valueOf(phong.getSoLuongSVPhong());
        txtUpSoLuongSinhVienPhong.setText(soluongsv);
        String sotien = String.valueOf(phong.getTienPhong());
        txtUpTienPhong.setText(sotien);
    }

    private void LayThongTinPhongView(int count) {
        ThongTinPhong phong = listphong.get(count);
        txtViewTenPhong.setText(phong.getTenPhong());
        txtViewLoaiPhong.setText(phong.getLoaiPhong());
        String soluongsv = String.valueOf(phong.getSoLuongSVPhong());
        txtViewSoLuongSVPhong.setText(soluongsv);
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        String str1 = currencyVN.format(phong.getTienPhong());
        txtViewTienPhong.setText(str1);
        txtViewMaPhong.setText(phong.getMaPhong());
    }

    public void AddPhong() {
        Double tienphong=0.0;
        int soluongsv=0;
        switch (selectedLoaiPhong) {
            case "Loại 1":
                tienphong=1300000.0;
                soluongsv=4;
                break;
            case "Loại 2":
                tienphong=900000.0;
                soluongsv=6;
                break;
            case "Loại 3":
                tienphong=700000.0;
                soluongsv=8;
                break;
            case "Loại 4":
                tienphong=600000.0;
                soluongsv=4;
                break;
            case "Loại 5":
                tienphong=400000.0;
                soluongsv=6;
                break;
            case "Loại 6":
                tienphong=200000.0;
                soluongsv=8;
                break;
            default:
                break;
        }
        Connection conn = KetNoiSQL.getConnection();
        String sql = "insert into Phong (maPhong,tenPhong,soLuongSVPhong,loaiPhong,tienPhong,gioiTinh)"
                + "values(?,?,?,?,?,?)";
        int row = 0;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, txtAddMaPhong.getText().trim());
            ps.setString(2, txtAddTenPhong.getText().trim());
            ps.setInt(3, soluongsv);
            ps.setString(4, selectedLoaiPhong);
            ps.setDouble(5, tienphong);
            if (rdNam.isSelected()) {
                ps.setString(6, "Nam");
            } else {
                ps.setString(6, "Nữ");
            }

            row = ps.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(null, "Thêm Phòng thành công");
            } else {
            }
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        showTable();

    }


    private void deletePhong(String maPhong) {
        Connection conn = KetNoiSQL.getConnection();
        String sql = "delete from Phong where maPhong = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, maPhong);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Delete thành công");
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Loi xoa khong thanh cong");
        }
        showTable();
    }

    private void resetForm() {
        txtAddMaPhong.setText("");
        txtAddTenPhong.setText("");

    }

    private void updatePhong(String maPhong) {
        String tenPhong = txtUpTenPhong.getText().trim();
        int soluongsv = Integer.parseInt(txtUpSoLuongSinhVienPhong.getText().trim());
        double tienphong = Double.parseDouble(txtUpTienPhong.getText().trim());

        Connection conn = KetNoiSQL.getConnection();
        String sql = "update Phong set tenPhong='" + tenPhong + "', soLuongSVPhong='" + soluongsv + "', loaiPhong='" + selectedUpLoaiPhong.trim() + "' ,tienPhong='" + tienphong + "' where maPhong='" + maPhong + "'";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
        }

        showTable();
    }

    void AddSearch() {
        txtSearch.addEventOptionSelected(new SearchOptionEvent() {
            @Override
            public void optionSelected(SearchOption option, int index) {
                txtSearch.setHint("Tìm kiếm " + option.getName() + "....");
            }
        });
        txtSearch.addOption(new SearchOption("mã phòng", new ImageIcon(getClass().getResource("/img/home.png"))));
        txtSearch.addOption(new SearchOption("tên phòng", new ImageIcon(getClass().getResource("/img/home.png"))));
        txtSearch.addOption(new SearchOption("tiền phòng", new ImageIcon(getClass().getResource("/img/money.png"))));
        txtSearch.addOption(new SearchOption("số lượng SV tối đa", new ImageIcon(getClass().getResource("/img/people.png"))));
        txtSearch.addOption(new SearchOption("phòng theo giới tính", new ImageIcon(getClass().getResource("/img/user.png"))));

    }

    void setCount() {
        count = -1;
    }

}
