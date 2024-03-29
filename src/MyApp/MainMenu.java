package MyApp;

import Database.Credentials;
import Database.Data_Credentials;
import Database.Data_Tickets;
import Database.Tickets;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class MainMenu extends javax.swing.JFrame {

    // Applications
    Login login;
    NewUser newUser;
    UpdateUser updateUser;

    private String acctype = null,
            firstname = null,
            lastname = null,
            department = null,
            empid = null;

    private ArrayList<Tickets> alltickets = null,
            solvedtickets = null,
            assignedtickets = null,
            mytickets = null,
            tickethistory = null,
            followuptickets = null;

    private final Data_Tickets mySql = new Data_Tickets();
    private final Data_Credentials creds = new Data_Credentials();
    private ArrayList<Credentials> user = null;
    DefaultTableModel model = null;

    public MainMenu() {
        initComponents();

        // Set-up form settings
        FrameCenter.centerJFrame(this);
        setResizable(false);
        updateTableDisplay();

        // set-up component settings
        userManagerTable.setAutoCreateRowSorter(true);
        myTicketTable.setAutoCreateRowSorter(true);
        allTicketTable.setAutoCreateRowSorter(true);
        assignedTicketTable.setAutoCreateRowSorter(true);
        solvedTicketsTable.setAutoCreateRowSorter(true);
    }

    public MainMenu(String acctype, String firstname, String lastname, String department, String empid) {

        initComponents();

        // initialize variables
        this.acctype = acctype;
        this.firstname = firstname;
        this.lastname = lastname;
        this.department = department;
        this.empid = empid;

        // Set-up form settings
        FrameCenter.centerJFrame(this);
        setResizable(false);
        updateTableDisplay();

        // set-up component settings
        userManagerTable.setAutoCreateRowSorter(true);
        myTicketTable.setAutoCreateRowSorter(true);
        allTicketTable.setAutoCreateRowSorter(true);
        assignedTicketTable.setAutoCreateRowSorter(true);
        solvedTicketsTable.setAutoCreateRowSorter(true);
        setInterface(acctype);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        optionsPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        myTicketsBttn = new javax.swing.JButton();
        allTicketsBttn = new javax.swing.JButton();
        solvedTickets = new javax.swing.JButton();
        createTicket = new javax.swing.JButton();
        logoutBttn = new javax.swing.JButton();
        manageUserButton = new javax.swing.JButton();
        assignedTicketsBttn = new javax.swing.JButton();
        parentPanel = new javax.swing.JPanel();
        defPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        userManagementPanel = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        userManagerTable = new javax.swing.JTable();
        createUserButton = new javax.swing.JButton();
        updateUserButton = new javax.swing.JButton();
        deleteUserButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        refreshTableButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        myTicketsPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        myTicketTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        allTicketsPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        allTicketTable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        solvedTicketsPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        solvedTicketsTable = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        createTicketPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ticketTypeComboBox1 = new javax.swing.JComboBox<>();
        priorityComboBox1 = new javax.swing.JComboBox<>();
        assigneeComboBox1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        depComboBox3 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        newTicketName = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        createTicketTxtArea = new javax.swing.JTextArea();
        cancelTicketBttn = new javax.swing.JButton();
        createTicketBttn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        resetTicketBttn1 = new javax.swing.JButton();
        indivTicketPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        ticketNumberLbl1 = new javax.swing.JLabel();
        ticketTypeComboBox = new javax.swing.JComboBox<>();
        priorityComboBox = new javax.swing.JComboBox<>();
        depComboBox = new javax.swing.JComboBox<>();
        assigneeComboBox = new javax.swing.JComboBox<>();
        ticketNumberLbl4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ticketNameTxtField = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        ticketTxtArea = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        updateTicketButton = new javax.swing.JButton();
        closeTicketButton = new javax.swing.JButton();
        cancelModifyButton = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        ticketHistoryTable = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        ticketNotesTextArea = new javax.swing.JTextArea();
        jLabel24 = new javax.swing.JLabel();
        assignedTicketsPanel = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        assignedTicketTable = new javax.swing.JTable();
        jLabel23 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        requestsTicketTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setBackground(new java.awt.Color(68, 148, 220));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        optionsPanel.setBackground(new java.awt.Color(68, 148, 220));
        optionsPanel.setMaximumSize(new java.awt.Dimension(179, 563));
        optionsPanel.setMinimumSize(new java.awt.Dimension(179, 563));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/winrockLogo.png"))); // NOI18N
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        myTicketsBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/myticketsButton.png"))); // NOI18N
        myTicketsBttn.setBorder(null);
        myTicketsBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelButtonPerformed(evt);
            }
        });

        allTicketsBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/allticketsButton.png"))); // NOI18N
        allTicketsBttn.setBorder(null);
        allTicketsBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelButtonPerformed(evt);
            }
        });

        solvedTickets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/solvedticketsButton.png"))); // NOI18N
        solvedTickets.setBorder(null);
        solvedTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelButtonPerformed(evt);
            }
        });

        createTicket.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/createticketButton.png"))); // NOI18N
        createTicket.setBorder(null);
        createTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelButtonPerformed(evt);
            }
        });

        logoutBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logoutButton.png"))); // NOI18N
        logoutBttn.setBorder(null);
        logoutBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBttnActionPerformed(evt);
            }
        });

        manageUserButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/manageUserButton.png"))); // NOI18N
        manageUserButton.setBorder(null);
        manageUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelButtonPerformed(evt);
            }
        });

        assignedTicketsBttn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/assTicketsButton.png"))); // NOI18N
        assignedTicketsBttn.setBorder(null);
        assignedTicketsBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelButtonPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionsPanelLayout = new javax.swing.GroupLayout(optionsPanel);
        optionsPanel.setLayout(optionsPanelLayout);
        optionsPanelLayout.setHorizontalGroup(
                optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionsPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                        .addGroup(optionsPanelLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(optionsPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(myTicketsBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(allTicketsBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 145,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(optionsPanelLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(createTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 145,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(manageUserButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(logoutBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 141,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(solvedTickets, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, optionsPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(assignedTicketsBttn)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        optionsPanelLayout.setVerticalGroup(
                optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(optionsPanelLayout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(myTicketsBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(allTicketsBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(assignedTicketsBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(solvedTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(createTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 44,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(manageUserButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(logoutBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)));

        getContentPane().add(optionsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 580));

        parentPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        parentPanel.setLayout(new java.awt.CardLayout());

        defPanel.setForeground(new java.awt.Color(0, 153, 255));
        defPanel.setPreferredSize(new java.awt.Dimension(610, 349));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME TO");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("A Ticket Management System for Winrock International");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Are you ready to work on your tickets, <Employee Name>?");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/menuBG3.png"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(1008, 223));
        jLabel5.setMinimumSize(new java.awt.Dimension(1008, 223));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 106)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("WinQueue");

        jSeparator1.setBackground(new java.awt.Color(0, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(0, 102, 102));

        jSeparator2.setBackground(new java.awt.Color(0, 102, 102));
        jSeparator2.setForeground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout defPanelLayout = new javax.swing.GroupLayout(defPanel);
        defPanel.setLayout(defPanelLayout);
        defPanelLayout.setHorizontalGroup(
                defPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, defPanelLayout.createSequentialGroup()
                                .addContainerGap(202, Short.MAX_VALUE)
                                .addGroup(defPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(defPanelLayout.createSequentialGroup()
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 69,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(21, 21, 21)
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 226,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 524,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                .addGap(213, 213, 213))
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE));
        defPanelLayout.setVerticalGroup(
                defPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(defPanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(defPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 13,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 13,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 96,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));

        parentPanel.add(defPanel, "card2");

        userManagerTable.setAutoCreateRowSorter(true);
        userManagerTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "#", "Employee ID", "First Name", "Middle Name", "Last Name", "Mobile #", "Email", "Birthday",
                        "Account Type", "Department", "Position", "Start Date", "Gender"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        userManagerTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane7.setViewportView(userManagerTable);
        if (userManagerTable.getColumnModel().getColumnCount() > 0) {
            userManagerTable.getColumnModel().getColumn(0).setMinWidth(5);
            userManagerTable.getColumnModel().getColumn(0).setPreferredWidth(30);
            userManagerTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            userManagerTable.getColumnModel().getColumn(8).setPreferredWidth(100);
        }

        createUserButton.setBackground(new java.awt.Color(0, 153, 51));
        createUserButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        createUserButton.setForeground(new java.awt.Color(255, 255, 255));
        createUserButton.setText("CREATE");
        createUserButton.setBorder(new javax.swing.border.MatteBorder(null));
        createUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserButtonActionPerformed(evt);
            }
        });

        updateUserButton.setBackground(new java.awt.Color(204, 153, 0));
        updateUserButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        updateUserButton.setForeground(new java.awt.Color(255, 255, 255));
        updateUserButton.setText("UPDATE");
        updateUserButton.setBorder(new javax.swing.border.MatteBorder(null));
        updateUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserButtonActionPerformed(evt);
            }
        });

        deleteUserButton.setBackground(new java.awt.Color(153, 0, 0));
        deleteUserButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deleteUserButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteUserButton.setText("DELETE");
        deleteUserButton.setBorder(new javax.swing.border.MatteBorder(null));
        deleteUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserButtonActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 204));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("User Manager");

        refreshTableButton.setBackground(new java.awt.Color(0, 153, 255));
        refreshTableButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        refreshTableButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshTableButton.setText("REFRESH");
        refreshTableButton.setBorder(new javax.swing.border.MatteBorder(null));
        refreshTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTableButtonActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("To delete or update an entry, click the cell desired and press the corresponding buttons");

        javax.swing.GroupLayout userManagementPanelLayout = new javax.swing.GroupLayout(userManagementPanel);
        userManagementPanel.setLayout(userManagementPanelLayout);
        userManagementPanelLayout.setHorizontalGroup(
                userManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                userManagementPanelLayout.createSequentialGroup()
                                        .addContainerGap(58, Short.MAX_VALUE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 488,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(createUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(updateUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(deleteUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(refreshTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22))
                        .addGroup(userManagementPanelLayout.createSequentialGroup()
                                .addGap(389, 389, 389)
                                .addComponent(jLabel12)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(userManagementPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 964,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));
        userManagementPanelLayout.setVerticalGroup(
                userManagementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(userManagementPanelLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(userManagementPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(createUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(updateUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(deleteUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(refreshTableButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap()));

        parentPanel.add(userManagementPanel, "card8");

        myTicketsPanel.setPreferredSize(new java.awt.Dimension(610, 349));

        myTicketTable.setAutoCreateRowSorter(true);
        myTicketTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null }
                },
                new String[] {
                        "Ticket Number", "Ticket Title", "Ticket Type", "Priority", "Department", "Date Created",
                        "Date Updated"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        myTicketTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myTicketTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(myTicketTable);

        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 204));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("My Tickets");

        javax.swing.GroupLayout myTicketsPanelLayout = new javax.swing.GroupLayout(myTicketsPanel);
        myTicketsPanel.setLayout(myTicketsPanelLayout);
        myTicketsPanelLayout.setHorizontalGroup(
                myTicketsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(myTicketsPanelLayout.createSequentialGroup()
                                .addGap(393, 393, 393)
                                .addComponent(jLabel9)
                                .addContainerGap(453, Short.MAX_VALUE))
                        .addGroup(myTicketsPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addContainerGap()));
        myTicketsPanelLayout.setVerticalGroup(
                myTicketsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                myTicketsPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)));

        parentPanel.add(myTicketsPanel, "card3");

        allTicketsPanel.setPreferredSize(new java.awt.Dimension(610, 349));

        allTicketTable.setAutoCreateRowSorter(true);
        allTicketTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null }
                },
                new String[] {
                        "Ticket Number", "Ticket Type", "Priority", "Department", "Date Updated", "Assignee", "Status"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        allTicketTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allTicketTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(allTicketTable);

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 204));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("All Tickets");

        javax.swing.GroupLayout allTicketsPanelLayout = new javax.swing.GroupLayout(allTicketsPanel);
        allTicketsPanel.setLayout(allTicketsPanelLayout);
        allTicketsPanelLayout.setHorizontalGroup(
                allTicketsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 978, Short.MAX_VALUE)
                        .addGroup(allTicketsPanelLayout.createSequentialGroup()
                                .addGap(404, 404, 404)
                                .addComponent(jLabel10)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        allTicketsPanelLayout.setVerticalGroup(
                allTicketsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                allTicketsPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 472,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)));

        parentPanel.add(allTicketsPanel, "card4");

        solvedTicketsPanel.setPreferredSize(new java.awt.Dimension(610, 349));

        solvedTicketsTable.setAutoCreateRowSorter(true);
        solvedTicketsTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null }
                },
                new String[] {
                        "Ticket Number", "Ticket Title", "Ticket Type", "Priority", "Department", "Date Solved",
                        "Assignee"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane3.setViewportView(solvedTicketsTable);

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Solved Tickets");

        javax.swing.GroupLayout solvedTicketsPanelLayout = new javax.swing.GroupLayout(solvedTicketsPanel);
        solvedTicketsPanel.setLayout(solvedTicketsPanelLayout);
        solvedTicketsPanelLayout.setHorizontalGroup(
                solvedTicketsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(solvedTicketsPanelLayout.createSequentialGroup()
                                .addGap(376, 376, 376)
                                .addComponent(jLabel8)
                                .addContainerGap(420, Short.MAX_VALUE))
                        .addGroup(solvedTicketsPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane3)
                                .addContainerGap()));
        solvedTicketsPanelLayout.setVerticalGroup(
                solvedTicketsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                solvedTicketsPanelLayout.createSequentialGroup()
                                        .addContainerGap(26, Short.MAX_VALUE)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 469,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)));

        parentPanel.add(solvedTicketsPanel, "card5");

        createTicketPanel.setPreferredSize(new java.awt.Dimension(610, 349));

        jPanel3.setEnabled(false);

        ticketTypeComboBox1.setBackground(new java.awt.Color(0, 102, 204));
        ticketTypeComboBox1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ticketTypeComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        ticketTypeComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Request", "Support" }));
        ticketTypeComboBox1
                .setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        priorityComboBox1.setBackground(new java.awt.Color(0, 102, 204));
        priorityComboBox1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        priorityComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        priorityComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Low", "Moderate", "High" }));
        priorityComboBox1
                .setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        assigneeComboBox1.setBackground(new java.awt.Color(0, 102, 204));
        assigneeComboBox1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        assigneeComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        assigneeComboBox1
                .setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        assigneeComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assigneeComboBox1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setText("Ticket Type");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setText("Priority Level");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel16.setText("Assigned Department");

        depComboBox3.setBackground(new java.awt.Color(0, 102, 204));
        depComboBox3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        depComboBox3.setForeground(new java.awt.Color(255, 255, 255));
        depComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Technical", "Financial",
                "Operations", "Legal", "Engineering", "Logistics", "Marketing", "Administration" }));
        depComboBox3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        depComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depComboBox3ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel17.setText("Assigned User");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ticketTypeComboBox1, javax.swing.GroupLayout.Alignment.TRAILING,
                                                0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(priorityComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addComponent(assigneeComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addComponent(depComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel14)
                                                        .addComponent(jLabel15)
                                                        .addComponent(jLabel16)
                                                        .addComponent(jLabel17))
                                                .addGap(0, 27, Short.MAX_VALUE)))
                                .addContainerGap()));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(158, 158, 158)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ticketTypeComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(priorityComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(depComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(assigneeComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(129, Short.MAX_VALUE)));

        newTicketName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newTicketName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTicketNameActionPerformed(evt);
            }
        });

        createTicketTxtArea.setColumns(20);
        createTicketTxtArea.setLineWrap(true);
        createTicketTxtArea.setRows(5);
        jScrollPane5.setViewportView(createTicketTxtArea);

        cancelTicketBttn.setBackground(new java.awt.Color(153, 0, 0));
        cancelTicketBttn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancelTicketBttn.setForeground(new java.awt.Color(255, 255, 255));
        cancelTicketBttn.setText("CANCEL");
        cancelTicketBttn.setBorder(new javax.swing.border.MatteBorder(null));
        cancelTicketBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelButtonPerformed(evt);
            }
        });

        createTicketBttn.setBackground(new java.awt.Color(204, 153, 0));
        createTicketBttn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        createTicketBttn.setForeground(new java.awt.Color(255, 255, 255));
        createTicketBttn.setText("CREATE TICKET");
        createTicketBttn.setBorder(new javax.swing.border.MatteBorder(null));
        createTicketBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createTicketBttnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Create Ticket");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel18.setText("Ticket Title");

        jLabel19.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel19.setText("Ticket Description");

        resetTicketBttn1.setBackground(new java.awt.Color(0, 153, 51));
        resetTicketBttn1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        resetTicketBttn1.setForeground(new java.awt.Color(255, 255, 255));
        resetTicketBttn1.setText("RESET");
        resetTicketBttn1.setBorder(new javax.swing.border.MatteBorder(null));
        resetTicketBttn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetTicketBttn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(35, 35, 35)
                                                .addGroup(jPanel4Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(jLabel19)
                                                        .addComponent(jLabel18)
                                                        .addComponent(jScrollPane5)
                                                        .addComponent(newTicketName,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 712,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(307, 307, 307)
                                                .addComponent(jLabel7))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(195, 195, 195)
                                                .addComponent(createTicketBttn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(cancelTicketBttn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(resetTicketBttn1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(28, Short.MAX_VALUE)));
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26,
                                        Short.MAX_VALUE)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(newTicketName, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 291,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cancelTicketBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(createTicketBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(resetTicketBttn1, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)));

        javax.swing.GroupLayout createTicketPanelLayout = new javax.swing.GroupLayout(createTicketPanel);
        createTicketPanel.setLayout(createTicketPanelLayout);
        createTicketPanelLayout.setHorizontalGroup(
                createTicketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(createTicketPanelLayout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(7, Short.MAX_VALUE)));
        createTicketPanelLayout.setVerticalGroup(
                createTicketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        parentPanel.add(createTicketPanel, "card6");

        indivTicketPanel.setPreferredSize(new java.awt.Dimension(610, 349));

        jPanel1.setPreferredSize(new java.awt.Dimension(191, 573));

        ticketNumberLbl1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        ticketNumberLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ticketNumberLbl1.setText("Ticket Number:");

        ticketTypeComboBox.setBackground(new java.awt.Color(0, 102, 204));
        ticketTypeComboBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ticketTypeComboBox.setForeground(new java.awt.Color(255, 255, 255));
        ticketTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Request", "Support" }));
        ticketTypeComboBox
                .setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        ticketTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketTypeComboBoxActionPerformed(evt);
            }
        });

        priorityComboBox.setBackground(new java.awt.Color(0, 102, 204));
        priorityComboBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        priorityComboBox.setForeground(new java.awt.Color(255, 255, 255));
        priorityComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Low", "Moderate", "High" }));
        priorityComboBox
                .setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        depComboBox.setBackground(new java.awt.Color(0, 102, 204));
        depComboBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        depComboBox.setForeground(new java.awt.Color(255, 255, 255));
        depComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Technical", "Financial",
                "Operations", "Legal", "Engineering", "Logistics", "Marketing", "Administration" }));
        depComboBox.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        depComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depComboBoxActionPerformed(evt);
            }
        });

        assigneeComboBox.setBackground(new java.awt.Color(0, 102, 204));
        assigneeComboBox.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        assigneeComboBox.setForeground(new java.awt.Color(255, 255, 255));
        assigneeComboBox
                .setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        assigneeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assigneeComboBoxActionPerformed(evt);
            }
        });

        ticketNumberLbl4.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        ticketNumberLbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ticketNumberLbl4.setText("2023011");

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        jLabel26.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel26.setText("Type");

        jLabel27.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel27.setText("Priority");

        jLabel28.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel28.setText("Department");

        jLabel29.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel29.setText("Assigned Personnel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(ticketNumberLbl4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                142,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(23, 23, 23))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel1Layout.createSequentialGroup()
                                                                        .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel1Layout
                                                                                        .createSequentialGroup()
                                                                                        .addGap(6, 6, 6)
                                                                                        .addComponent(jSeparator4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                110,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(ticketNumberLbl1,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        125,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGap(32, 32, 32))))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(assigneeComboBox, 0,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(ticketTypeComboBox, 0,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(priorityComboBox, 0,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(depComboBox, 0,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel28)
                                                                        .addComponent(jLabel27,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                59,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel26,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                76,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel29,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                168,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(11, 11, 11)))
                                                .addContainerGap()))));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(ticketNumberLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 7,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ticketNumberLbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 54,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ticketTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(priorityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(depComboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(assigneeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        ticketNameTxtField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        ticketTxtArea.setEditable(false);
        ticketTxtArea.setColumns(20);
        ticketTxtArea.setLineWrap(true);
        ticketTxtArea.setRows(5);
        jScrollPane4.setViewportView(ticketTxtArea);

        jLabel11.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 102, 204));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Modify Ticket");

        updateTicketButton.setBackground(new java.awt.Color(204, 153, 0));
        updateTicketButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        updateTicketButton.setForeground(new java.awt.Color(255, 255, 255));
        updateTicketButton.setText("UPDATE TICKET");
        updateTicketButton.setBorder(new javax.swing.border.MatteBorder(null));
        updateTicketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTicketButtonActionPerformed(evt);
            }
        });

        closeTicketButton.setBackground(new java.awt.Color(0, 153, 51));
        closeTicketButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        closeTicketButton.setForeground(new java.awt.Color(255, 255, 255));
        closeTicketButton.setText("CLOSE TICKET");
        closeTicketButton.setBorder(new javax.swing.border.MatteBorder(null));
        closeTicketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeTicketButtonActionPerformed(evt);
            }
        });

        cancelModifyButton.setBackground(new java.awt.Color(153, 0, 0));
        cancelModifyButton.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cancelModifyButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelModifyButton.setText("CANCEL");
        cancelModifyButton.setBorder(new javax.swing.border.MatteBorder(null));
        cancelModifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelModifyButtonActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setText("Ticket Name");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setText("Ticket Description");

        ticketHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null }
                },
                new String[] {
                        "Revision #", "Date Updated", "Status", "Department", "Personnel", "Priority"
                }));
        ticketHistoryTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        ticketHistoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ticketHistoryTableMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(ticketHistoryTable);

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setText("Ticket History");

        ticketNotesTextArea.setColumns(20);
        ticketNotesTextArea.setLineWrap(true);
        ticketNotesTextArea.setRows(5);
        jScrollPane9.setViewportView(ticketNotesTextArea);

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setText("Ticket Notes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(updateTicketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(closeTicketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cancelModifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(jScrollPane6,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 694,
                                                                Short.MAX_VALUE)
                                                        .addComponent(ticketNameTxtField)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jScrollPane4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                345,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel21,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                153,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jScrollPane9)
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(jLabel24,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        121,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                                .addContainerGap(83, Short.MAX_VALUE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel20)
                                                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                        jPanel2Layout.createSequentialGroup()
                                                .addContainerGap(327, Short.MAX_VALUE)
                                                .addComponent(jLabel11)
                                                .addContainerGap(327, Short.MAX_VALUE))));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(52, Short.MAX_VALUE)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ticketNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel21)
                                        .addComponent(jLabel24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane9)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 132,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 16,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 185,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel2Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(updateTicketButton,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 31,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(closeTicketButton, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cancelModifyButton, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(20, 20, 20))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                        jPanel2Layout.createSequentialGroup()
                                                .addContainerGap(17, Short.MAX_VALUE)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(501, Short.MAX_VALUE))));

        javax.swing.GroupLayout indivTicketPanelLayout = new javax.swing.GroupLayout(indivTicketPanel);
        indivTicketPanel.setLayout(indivTicketPanelLayout);
        indivTicketPanelLayout.setHorizontalGroup(
                indivTicketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(indivTicketPanelLayout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        indivTicketPanelLayout.setVerticalGroup(
                indivTicketPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        parentPanel.add(indivTicketPanel, "card7");

        assignedTicketsPanel.setPreferredSize(new java.awt.Dimension(610, 349));

        assignedTicketTable.setAutoCreateRowSorter(true);
        assignedTicketTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null }
                },
                new String[] {
                        "Ticket Number", "Ticket Title", "Ticket Type", "Priority", "Department", "Date Created",
                        "Date Updated"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        assignedTicketTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                assignedTicketTableMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(assignedTicketTable);

        jLabel23.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 102, 204));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Assigned Tickets");

        jLabel30.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 102, 204));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Follow-up Requests");

        requestsTicketTable.setAutoCreateRowSorter(true);
        requestsTicketTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null }
                },
                new String[] {
                        "Ticket Number", "Ticket Title", "Ticket Type", "Priority", "Department", "Date Created",
                        "Date Updated"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        requestsTicketTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                requestsTicketTableMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(requestsTicketTable);

        javax.swing.GroupLayout assignedTicketsPanelLayout = new javax.swing.GroupLayout(assignedTicketsPanel);
        assignedTicketsPanel.setLayout(assignedTicketsPanelLayout);
        assignedTicketsPanelLayout.setHorizontalGroup(
                assignedTicketsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(assignedTicketsPanelLayout.createSequentialGroup()
                                .addGroup(assignedTicketsPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(assignedTicketsPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 957,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(assignedTicketsPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        957, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(assignedTicketsPanelLayout.createSequentialGroup()
                                                .addGap(383, 383, 383)
                                                .addComponent(jLabel23))
                                        .addGroup(assignedTicketsPanelLayout.createSequentialGroup()
                                                .addGap(364, 364, 364)
                                                .addComponent(jLabel30)))
                                .addContainerGap(15, Short.MAX_VALUE)));
        assignedTicketsPanelLayout.setVerticalGroup(
                assignedTicketsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, assignedTicketsPanelLayout
                                .createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel23)
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 29,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 188,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)));

        parentPanel.add(assignedTicketsPanel, "card4");

        getContentPane().add(parentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 0, 980, 575));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelButtonPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_panelButtonPerformed
        parentPanel.removeAll();
        if (evt.getSource() == myTicketsBttn) {
            parentPanel.add(myTicketsPanel);
        } else if (evt.getSource() == allTicketsBttn) {
            parentPanel.add(allTicketsPanel);
        } else if (evt.getSource() == assignedTicketsBttn) {
            parentPanel.add(assignedTicketsPanel);
        } else if (evt.getSource() == solvedTickets) {
            parentPanel.add(solvedTicketsPanel);
        } else if (evt.getSource() == createTicket) {
            parentPanel.add(createTicketPanel);
            configureCreateTicket();
        } else if (evt.getSource() == manageUserButton) {
            parentPanel.add(userManagementPanel);
        } else if (evt.getSource() == cancelTicketBttn) {
            parentPanel.add(defPanel);
        }
        parentPanel.repaint();
        parentPanel.revalidate();
        updateTableDisplay();
    }// GEN-LAST:event_panelButtonPerformed

    public void configureCreateTicket() {
        String department = depComboBox3.getSelectedItem().toString();
        Data_Tickets emp = new Data_Tickets();
        String param = "SELECT DISTINCT CONCAT(firstname, ' ', lastname) AS combined FROM credentials WHERE department = '"
                + department + "'";
        Object[] emplist = emp.employeeList(param).toArray();
        assigneeComboBox1.setModel(new DefaultComboBoxModel(emplist));
        assigneeComboBox1.addItem("N/A");
    }

    private void logoutBttnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_logoutBttnActionPerformed
        int ans = JOptionPane.showOptionDialog(this, "Do you want to logoff?", "Logout User", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Yes", "No" }, JOptionPane.YES_OPTION);
        if (ans == JOptionPane.YES_OPTION) {
            login = new Login();
            login.setVisible(true);
            dispose();
        }
    }// GEN-LAST:event_logoutBttnActionPerformed

    private void createUserButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_createUserButtonActionPerformed
        newUser = new NewUser();
        newUser.setVisible(true);
    }// GEN-LAST:event_createUserButtonActionPerformed

    private void deleteUserButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deleteUserButtonActionPerformed
        if (userManagerTable.getSelectedRowCount() == 1) {
            int ans = JOptionPane.showOptionDialog(this, "Are you sure you want to delete this entry?", "Delete User",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Yes", "No" },
                    JOptionPane.YES_OPTION);
            if (ans == JOptionPane.YES_OPTION) {
                if (userManagerTable.getValueAt(userManagerTable.getSelectedRow(), 1).toString().equals(empid)) {
                    JOptionPane.showMessageDialog(null,
                            "Credential deletion aborted. You tried to delete your own record", "Error",
                            JOptionPane.ERROR_MESSAGE);
                } else {
                    creds.deleteRowSpec(userManagerTable.getValueAt(userManagerTable.getSelectedRow(), 0).toString());
                    updateTableDisplay();
                }
            }
        } else {
            if (userManagerTable.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table is empty.");
            } else {
                JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            }
        }
    }// GEN-LAST:event_deleteUserButtonActionPerformed

    private void updateUserButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_updateUserButtonActionPerformed
        model = (DefaultTableModel) userManagerTable.getModel();
        int selectedRow = userManagerTable.getSelectedRow();
        if (userManagerTable.getSelectedRowCount() == 1) {
            updateUser = new UpdateUser();
            updateUser.setVisible(true);
            try {
                updateUser.populateflds((userManagerTable.getValueAt(selectedRow, 0).toString()));
            } catch (ParseException ex) {
                Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            if (userManagerTable.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table is empty.");
            } else {
                JOptionPane.showMessageDialog(this, "Please select a row to update.");
            }
        }

    }// GEN-LAST:event_updateUserButtonActionPerformed

    private void refreshTableButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_refreshTableButtonActionPerformed
        // TODO add your handling code here:
        updateTableDisplay();
    }// GEN-LAST:event_refreshTableButtonActionPerformed

    private void ticketTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ticketTypeComboBoxActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_ticketTypeComboBoxActionPerformed

    private void createTicketBttnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_createTicketBttnActionPerformed

        String AssignedDepartment = depComboBox3.getSelectedItem().toString();
        String param = "SELECT DISTINCT CONCAT(firstname, ' ', lastname) AS combined FROM credentials WHERE department = '"
                + AssignedDepartment + "'";

        Date currentdate = new Date();
        SimpleDateFormat sdl = new SimpleDateFormat("yyyyMM");
        Data_Tickets ticket = new Data_Tickets();
        String TicketID = sdl.format(currentdate) + ticket.tallyCount("alltickets");

        Object[] emplist = ticket.employeeList(param).toArray();
        String AssignedPersonnel = "";

        assigneeComboBox1.setModel(new DefaultComboBoxModel(emplist));

        if (acctype.equals("Administrator")) {
            AssignedPersonnel = assigneeComboBox1.getSelectedItem().toString();
        } else {
            AssignedPersonnel = "N/A";
        }

        Timestamp tstamp = new Timestamp(System.currentTimeMillis());
        String DateCreated = tstamp.toString();
        String DateUpdated = tstamp.toString();

        String TicketName = newTicketName.getText();
        String TicketDesc = createTicketTxtArea.getText();
        String TicketType = ticketTypeComboBox1.getSelectedItem().toString();
        String PriorityLevel = priorityComboBox1.getSelectedItem().toString();
        String Creator = getFirstname() + " " + getLastname();

        String Status = "Open";
        List<String> array = Arrays.asList(TicketID, TicketName, TicketDesc, TicketType, PriorityLevel,
                AssignedDepartment, AssignedPersonnel, DateCreated, DateUpdated, Status, Creator);

        if (checkFields(array).equals("not valid")) {
            JOptionPane.showMessageDialog(null, "All fields must not be blank!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int RevCount = 0,
                    followup = 0;
            String notes = "";
            Tickets information = new Tickets(TicketID, RevCount, TicketName, TicketDesc, TicketType, PriorityLevel,
                    AssignedDepartment, AssignedPersonnel, DateCreated, DateUpdated, Status, Creator, notes, followup);
            ticket.addRow("alltickets", information);
            ticket.addRow("masterrecord", information);
            JOptionPane.showMessageDialog(null, "Ticket has been created. Your ticket number is " + TicketID + ".",
                    "Ticket Created", JOptionPane.INFORMATION_MESSAGE);
            resetCreateFields();
        }
    }// GEN-LAST:event_createTicketBttnActionPerformed

    private String checkFields(List<String> strings) {
        for (String s : strings) {
            if (s == null || s.trim().isEmpty()) {
                return "not valid";
            }
        }
        return "valid";
    }

    private void resetCreateFields() {
        newTicketName.setText("");
        createTicketTxtArea.setText("");
        ticketTypeComboBox1.setSelectedIndex(0);
        priorityComboBox1.setSelectedIndex(0);
        depComboBox3.setSelectedIndex(0);
        assigneeComboBox1.setSelectedIndex(0);
    }

    private void newTicketNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_newTicketNameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_newTicketNameActionPerformed

    private void cancelModifyButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cancelModifyButtonActionPerformed
        // TODO add your handling code here:
        parentPanel.removeAll();
        parentPanel.add(defPanel);
        parentPanel.repaint();
        parentPanel.revalidate();
        updateTableDisplay();
    }// GEN-LAST:event_cancelModifyButtonActionPerformed

    private void assigneeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_assigneeComboBoxActionPerformed
        // TODO add your handling code here:

    }// GEN-LAST:event_assigneeComboBoxActionPerformed

    private void updateTicketButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_updateTicketButtonActionPerformed
        // TODO add your handling code here:
        String TicketID = ticketNumberLbl4.getText();
        String parameters = "SELECT * FROM alltickets WHERE TicketID = '" + TicketID + "'";
        Data_Tickets ticket = new Data_Tickets();
        ArrayList<Tickets> ticketinfo = ticket.ShowRecSpec(parameters);

        long now = System.currentTimeMillis();
        Timestamp tstamp = new Timestamp(now);
        String DateUpdated = tstamp.toString();

        String OldRevCount = "";
        int NewRevCount = 0;
        String DateCreated = "";
        for (Tickets t : ticketinfo) {
            OldRevCount = Integer.toString(t.getRevcount());
            NewRevCount = t.getRevcount() + 1;
            DateCreated = t.getDateCreated();
        }
        DateCreated = LocalDateTime.now().toString();  

        String TicketName = ticketNameTxtField.getText(),
                TicketDesc = ticketTxtArea.getText(),
                TicketType = ticketTypeComboBox.getSelectedItem().toString(),
                PriorityLevel = priorityComboBox.getSelectedItem().toString(),
                AssignedDepartment = depComboBox.getSelectedItem().toString(),
                AssignedPersonnel = (String) assigneeComboBox.getSelectedItem(),
                Status = "Open",
                Creator = getFirstname() + " " + getLastname();
        List<String> array = Arrays.asList(TicketID, TicketName, TicketDesc, TicketType, PriorityLevel,
                AssignedDepartment, AssignedPersonnel, DateCreated, DateUpdated, Status, Creator);
        
        for(String i: array){
            System.out.println(i);
        }
        
        int followup = 0;
        if (checkFields(array).equals("valid")) {
            String Notes = ticketNotesTextArea.getText();
            Tickets information = new Tickets(TicketID, NewRevCount, TicketName, TicketDesc, TicketType, PriorityLevel,
                    AssignedDepartment, AssignedPersonnel, DateCreated, DateUpdated, Status, Creator, Notes, followup);

            ticket.deleteRowParam("alltickets", information, " AND RevisionCount = '" + OldRevCount + "'");

            ticket.addRow("alltickets", information);
            ticket.addRow("masterrecord", information);

            tickethistory = mySql.ShowRecSpec(
                    "SELECT * FROM masterrecord WHERE TicketID = '" + TicketID + "' ORDER BY RevisionCount ASC");
            model = (DefaultTableModel) ticketHistoryTable.getModel();

            model.setRowCount(0);
            for (Tickets t : tickethistory) {
                model.addRow(new Object[] { t.getRevcount(), t.getDateUpdated(), t.getStatus(), t.getDepartment(),
                        t.getPersonnel(), t.getPriority() });
            }
            updateTableDisplay();
            JOptionPane.showMessageDialog(null, "Ticket has been updated", "Ticket Updated",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "All fields must not be blank!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }// GEN-LAST:event_updateTicketButtonActionPerformed

    private void depComboBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_depComboBoxActionPerformed
        String department = depComboBox.getSelectedItem().toString();
        Data_Tickets emp = new Data_Tickets();
        String param = "SELECT DISTINCT CONCAT(firstname, ' ', lastname) AS combined FROM credentials WHERE department = '"
                + department + "'";
        Object[] emplist = emp.employeeList(param).toArray();
        assigneeComboBox.setModel(new DefaultComboBoxModel(emplist));
        assigneeComboBox.addItem("N/A");

    }// GEN-LAST:event_depComboBoxActionPerformed

    private void depComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_depComboBox3ActionPerformed
        // TODO add your handling code here:
        String department = depComboBox3.getSelectedItem().toString();
        Data_Tickets emp = new Data_Tickets();
        String param = "SELECT DISTINCT CONCAT(firstname, ' ', lastname) AS combined FROM credentials WHERE department = '"
                + department + "'";
        Object[] emplist = emp.employeeList(param).toArray();
        assigneeComboBox1.setModel(new DefaultComboBoxModel(emplist));
        assigneeComboBox1.addItem("N/A");
    }// GEN-LAST:event_depComboBox3ActionPerformed

    private void assigneeComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_assigneeComboBox1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_assigneeComboBox1ActionPerformed

    private void closeTicketButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_closeTicketButtonActionPerformed
        // TODO add your handling code here:
        int ans = JOptionPane.showOptionDialog(this, "Are you sure you want to close this ticket?", "Close Ticket",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Yes", "No" },
                JOptionPane.YES_OPTION);
        if (ans == JOptionPane.YES_OPTION) {
            Data_Tickets ticket = new Data_Tickets();
            String TicketID = ticketNumberLbl4.getText();
            String parameters = "SELECT * FROM alltickets WHERE TicketID = '" + TicketID + "'";
            ArrayList<Tickets> ticketinfo = ticket.ShowRecSpec(parameters);

            long now = System.currentTimeMillis();
            Timestamp tstamp = new Timestamp(now);

            String OldRevCount = "";
            int NewRevCount = 0;
            String DateCreated = "";
            String DateUpdated = tstamp.toString();

            for (Tickets t : ticketinfo) {
                OldRevCount = Integer.toString(t.getRevcount());
                NewRevCount = t.getRevcount() + 1;
                DateCreated = t.getDateCreated();
            }

            int followup = 0;

            String TicketName = ticketNameTxtField.getText();
            String TicketDesc = ticketTxtArea.getText();
            String TicketType = ticketTypeComboBox.getSelectedItem().toString();
            String PriorityLevel = priorityComboBox.getSelectedItem().toString();
            String AssignedDepartment = depComboBox.getSelectedItem().toString();
            String AssignedPersonnel = assigneeComboBox.getSelectedItem().toString();
            String Status = "Closed";
            String Creator = getFirstname() + " " + getLastname();

            List<String> array = Arrays.asList(TicketID, TicketName, TicketDesc, TicketType, PriorityLevel,
                    AssignedDepartment, AssignedPersonnel, DateCreated, DateUpdated, Status, Creator);

            if (checkFields(array).equals("valid")) {
                String Notes = ticketNotesTextArea.getText();
                Tickets information = new Tickets(TicketID, NewRevCount, TicketName, TicketDesc, TicketType,
                        PriorityLevel, AssignedDepartment, AssignedPersonnel, DateCreated, DateUpdated, Status, Creator,
                        Notes, followup);

                ticket.deleteRowParam("alltickets", information, " AND RevisionCount = '" + OldRevCount + "'");
                ticket.addRow("masterrecord", information);

                tickethistory = mySql.ShowRecSpec(
                        "SELECT * FROM masterrecord WHERE TicketID = '" + TicketID + "' ORDER BY RevisionCount ASC");
                model = (DefaultTableModel) ticketHistoryTable.getModel();

                model.setRowCount(0);

                for (Tickets t : tickethistory) {
                    model.addRow(new Object[] { t.getRevcount(), t.getDateUpdated(), t.getStatus(), t.getDepartment(),
                            t.getPersonnel(), t.getPriority() });
                }
                updateTableDisplay();
                JOptionPane.showMessageDialog(null, "Ticket has been closed", "Ticket Closed",
                        JOptionPane.INFORMATION_MESSAGE);
                parentPanel.removeAll();
                parentPanel.add(assignedTicketsPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
                updateTableDisplay();
            } else {
                JOptionPane.showMessageDialog(null, "All fields must not be blank!", "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }// GEN-LAST:event_closeTicketButtonActionPerformed

    private void ticketHistoryTableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_ticketHistoryTableMouseClicked
        // TODO add your handling code here:

        int row = ticketHistoryTable.rowAtPoint(evt.getPoint());
        int col = ticketHistoryTable.columnAtPoint(evt.getPoint());

        if (row >= 0 && col >= 0) {
            String id = ticketNumberLbl4.getText();
            Data_Tickets ticket = new Data_Tickets();
            String parameters = "SELECT * FROM masterrecord WHERE TicketID = '" + id + "' ORDER BY Number ASC";
            ArrayList<Tickets> ticketinfo = ticket.ShowRecSpec(parameters);

            int selectedRow = ticketHistoryTable.getSelectedRow();
            ticketTypeComboBox.setSelectedItem(ticketHistoryTable.getValueAt(selectedRow, 1).toString());
            priorityComboBox.setSelectedItem(ticketHistoryTable.getValueAt(selectedRow, 5).toString());
            depComboBox.setSelectedItem(ticketHistoryTable.getValueAt(selectedRow, 3).toString());
            for (Tickets t : ticketinfo) {
                ticketNameTxtField.setText(t.getTitle());
                ticketTxtArea.setText(t.getDesc());
                String department = depComboBox.getSelectedItem().toString();
                String param = "SELECT DISTINCT CONCAT(firstname, ' ', lastname) AS combined FROM credentials WHERE department = '"
                        + department + "'";
                Data_Tickets emp = new Data_Tickets();
                Object[] emplist = emp.employeeList(param).toArray();

                assigneeComboBox.setModel(new DefaultComboBoxModel(emplist));
                assigneeComboBox.setSelectedItem(t.getPersonnel());
            }
        }
    }// GEN-LAST:event_ticketHistoryTableMouseClicked

    private void assignedTicketTableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_assignedTicketTableMouseClicked
        // TODO add your handling code here:

        int row = assignedTicketTable.rowAtPoint(evt.getPoint());
        int col = assignedTicketTable.columnAtPoint(evt.getPoint());
        if (row >= 0 && col >= 0) {
            parentPanel.removeAll();
            parentPanel.add(indivTicketPanel);
            parentPanel.repaint();
            parentPanel.revalidate();

            int selectedRow = assignedTicketTable.getSelectedRow();
            String id = assignedTicketTable.getValueAt(selectedRow, 0).toString();
            Data_Tickets ticket = new Data_Tickets();
            String parameters = "SELECT * FROM alltickets WHERE TicketID = '" + id + "'";
            ArrayList<Tickets> ticketinfo = ticket.ShowRecSpec(parameters);

            ticketNumberLbl4.setText(id);
            ticketTypeComboBox.setSelectedItem(assignedTicketTable.getValueAt(selectedRow, 1).toString());
            priorityComboBox.setSelectedItem(assignedTicketTable.getValueAt(selectedRow, 2).toString());
            depComboBox.setSelectedItem(assignedTicketTable.getValueAt(selectedRow, 3).toString());

            for (Tickets t : ticketinfo) {
                ticketNameTxtField.setText(t.getTitle());
                ticketTxtArea.setText(t.getDesc());

                String department = depComboBox.getSelectedItem().toString();
                Data_Tickets emp = new Data_Tickets();
                String param = "SELECT DISTINCT CONCAT(firstname, ' ', lastname) AS combined FROM credentials WHERE department = '"
                        + department + "'";
                Object[] emplist = emp.employeeList(param).toArray();

                assigneeComboBox.setModel(new DefaultComboBoxModel(emplist));
                if (t.getPersonnel().equals("N/A")) {
                    assigneeComboBox.addItem("N/A");
                    assigneeComboBox.setSelectedItem("N/A");
                }
                assigneeComboBox.setSelectedItem(t.getPersonnel());
            }
            tickethistory = mySql
                    .ShowRecSpec("SELECT * FROM masterrecord WHERE TicketID = '" + id + "' ORDER BY RevisionCount ASC");
            model = (DefaultTableModel) ticketHistoryTable.getModel();

            model.setRowCount(0);
            for (Tickets t : tickethistory) {
                model.addRow(new Object[] { t.getRevcount(), t.getDateUpdated(), t.getStatus(), t.getDepartment(),
                        t.getPersonnel(), t.getPriority() });
            }
            updateTableDisplay();
        }
    }// GEN-LAST:event_assignedTicketTableMouseClicked

    private void resetTicketBttn1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_resetTicketBttn1ActionPerformed
        // TODO add your handling code here:
        resetCreateFields();
    }// GEN-LAST:event_resetTicketBttn1ActionPerformed

    private void allTicketTableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_allTicketTableMouseClicked
        JPopupMenu userPop = new JPopupMenu("Additional Options");
        JMenuItem showHistory = new JMenuItem("Ticket History");
        userPop.add(showHistory);

        JMenuItem modifyTicket = new JMenuItem("Modify Ticket");
        modifyTicket.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(indivTicketPanel);
                parentPanel.repaint();
                parentPanel.revalidate();

                int selectedRow = allTicketTable.getSelectedRow();
                String id = allTicketTable.getValueAt(selectedRow, 0).toString();

                Data_Tickets ticket = new Data_Tickets();
                String parameters = "SELECT * FROM alltickets WHERE TicketID = '" + id + "'";
                ArrayList<Tickets> ticketinfo = ticket.ShowRecSpec(parameters);

                ticketNumberLbl4.setText(id);
                ticketTypeComboBox.setSelectedItem(allTicketTable.getValueAt(selectedRow, 1).toString());
                priorityComboBox.setSelectedItem(allTicketTable.getValueAt(selectedRow, 2).toString());
                depComboBox.setSelectedItem(allTicketTable.getValueAt(selectedRow, 3).toString());

                for (Tickets t : ticketinfo) {
                    ticketNameTxtField.setText(t.getTitle());
                    ticketTxtArea.setText(t.getDesc());

                    String department = depComboBox.getSelectedItem().toString();
                    String param = "SELECT DISTINCT CONCAT(firstname, ' ', lastname) AS combined FROM credentials WHERE department = '"
                            + department + "'";

                    Data_Tickets emp = new Data_Tickets();
                    Object[] emplist = emp.employeeList(param).toArray();

                    assigneeComboBox.setModel(new DefaultComboBoxModel(emplist));
                    if (t.getPersonnel().equals("N/A")) {
                        assigneeComboBox.addItem("N/A");
                        assigneeComboBox.setSelectedItem("N/A");
                    } else
                        assigneeComboBox.setSelectedItem(t.getPersonnel());
                }

                tickethistory = mySql.ShowRecSpec(
                        "SELECT * FROM masterrecord WHERE TicketID = '" + id + "' ORDER BY RevisionCount ASC");
                model = (DefaultTableModel) ticketHistoryTable.getModel();

                model.setRowCount(0);
                for (Tickets t : tickethistory) {
                    model.addRow(new Object[] { t.getRevcount(), t.getDateUpdated(), t.getStatus(), t.getDepartment(),
                            t.getPersonnel(), t.getPriority() });
                }
                updateTableDisplay();
            }

        });
        showHistory.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = allTicketTable.getSelectedRow();
                TicketHistory history = new TicketHistory(allTicketTable.getValueAt(selectedRow, 0).toString());
                history.show();
            }

        });
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON3 && allTicketTable.getSelectedRow() != -1) {
            if (getAcctype().equals("Administrator")) {
                userPop.add(modifyTicket);
            }
            userPop.show(allTicketTable, evt.getX(), evt.getY());
        }
    }// GEN-LAST:event_allTicketTableMouseClicked

    private void requestsTicketTableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_requestsTicketTableMouseClicked
        // TODO add your handling code here:
        if (requestsTicketTable.getSelectedRowCount() == 1) {
            int ans = JOptionPane.showOptionDialog(this, "Mark this entry as read?", "Mark as read",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Yes", "No" },
                    JOptionPane.YES_OPTION);
            if (ans == JOptionPane.YES_OPTION) {
                mySql.editRowFollowup("alltickets", "0",
                        requestsTicketTable.getValueAt(requestsTicketTable.getSelectedRow(), 0).toString());
                updateTableDisplay();
            }
        } else {
            if (requestsTicketTable.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table is empty.");
            } else {
                JOptionPane.showMessageDialog(this, "Please select a row to mark.");
            }
        }
    }// GEN-LAST:event_requestsTicketTableMouseClicked

    private void myTicketTableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_myTicketTableMouseClicked
        // TODO add your handling code here:
        if (myTicketTable.getSelectedRowCount() == 1) {
            int ans = JOptionPane.showOptionDialog(this, "Followup this ticket?", "Followup Ticket",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Yes", "No" },
                    JOptionPane.YES_OPTION);
            if (ans == JOptionPane.YES_OPTION) {
                mySql.editRowFollowup("alltickets", "1",
                        myTicketTable.getValueAt(myTicketTable.getSelectedRow(), 0).toString());
                updateTableDisplay();
            }
        } else {
            if (myTicketTable.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table is empty.");
            } else {
                JOptionPane.showMessageDialog(this, "Please select a row to followup.");
            }
        }
    }// GEN-LAST:event_myTicketTableMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new MainMenu().setVisible(true);
                }
            });
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable allTicketTable;
    private javax.swing.JButton allTicketsBttn;
    private javax.swing.JPanel allTicketsPanel;
    private javax.swing.JTable assignedTicketTable;
    private javax.swing.JButton assignedTicketsBttn;
    private javax.swing.JPanel assignedTicketsPanel;
    private javax.swing.JComboBox<String> assigneeComboBox;
    private javax.swing.JComboBox<String> assigneeComboBox1;
    private javax.swing.JButton cancelModifyButton;
    private javax.swing.JButton cancelTicketBttn;
    private javax.swing.JButton closeTicketButton;
    private javax.swing.JButton createTicket;
    private javax.swing.JButton createTicketBttn;
    private javax.swing.JPanel createTicketPanel;
    private javax.swing.JTextArea createTicketTxtArea;
    private javax.swing.JButton createUserButton;
    private javax.swing.JPanel defPanel;
    private javax.swing.JButton deleteUserButton;
    private javax.swing.JComboBox<String> depComboBox;
    private javax.swing.JComboBox<String> depComboBox3;
    private javax.swing.JPanel indivTicketPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton logoutBttn;
    private javax.swing.JButton manageUserButton;
    private javax.swing.JTable myTicketTable;
    private javax.swing.JButton myTicketsBttn;
    private javax.swing.JPanel myTicketsPanel;
    private javax.swing.JTextField newTicketName;
    private javax.swing.JPanel optionsPanel;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JComboBox<String> priorityComboBox;
    private javax.swing.JComboBox<String> priorityComboBox1;
    private javax.swing.JButton refreshTableButton;
    private javax.swing.JTable requestsTicketTable;
    private javax.swing.JButton resetTicketBttn1;
    private javax.swing.JButton solvedTickets;
    private javax.swing.JPanel solvedTicketsPanel;
    private javax.swing.JTable solvedTicketsTable;
    private javax.swing.JTable ticketHistoryTable;
    private javax.swing.JTextField ticketNameTxtField;
    private javax.swing.JTextArea ticketNotesTextArea;
    private javax.swing.JLabel ticketNumberLbl1;
    private javax.swing.JLabel ticketNumberLbl4;
    private javax.swing.JTextArea ticketTxtArea;
    private javax.swing.JComboBox<String> ticketTypeComboBox;
    private javax.swing.JComboBox<String> ticketTypeComboBox1;
    private javax.swing.JButton updateTicketButton;
    private javax.swing.JButton updateUserButton;
    private javax.swing.JPanel userManagementPanel;
    private javax.swing.JTable userManagerTable;
    // End of variables declaration//GEN-END:variables

    public void setAcctype(String acctype) {
        this.acctype = acctype;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAcctype() {
        return acctype;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    protected void setInterface(String x) {
        if ("Employee".equals(x)) {
            manageUserButton.setVisible(false);
            assigneeComboBox1.setVisible(false);
            assigneeComboBox.enable(false);
            depComboBox.enable(false);
            jLabel17.setVisible(false);
        }
        if ("Administrator".equals(x)) {
            manageUserButton.setVisible(true);
        }
        jLabel3.setText("Are you ready to work on your tickets, " + getFirstname() + " " + getLastname() + "?");
    }

    private void updateTableDisplay() {
        user = creds.ShowRec("credentials");
        model = (DefaultTableModel) userManagerTable.getModel();
        model.setRowCount(0);
        for (Credentials u : user) {
            model.addRow(new Object[] { u.getNum(), u.getEmpnum(), u.getF_name(), u.getM_name(), u.getL_name(),
                    u.getPhonenum(), u.getEmail(), u.getBday(), u.getActType(), u.getDepartment(), u.getPosition(),
                    u.getStartdate(), u.getGender() });
        }
        alltickets = mySql.ShowRecSpec(
                "SELECT m1.* FROM masterrecord m1 LEFT JOIN masterrecord m2 ON (m1.TicketID = m2.TicketID and m1.RevisionCount < m2.RevisionCount) WHERE m2.RevisionCount IS NULL ORDER BY TicketID DESC");
        model = (DefaultTableModel) allTicketTable.getModel();
        model.setRowCount(0);
        for (Tickets t : alltickets) {
            model.addRow(new Object[] { t.getId(), t.getType(), t.getPriority(), t.getDepartment(), t.getDateUpdated(),
                    t.getPersonnel(), t.getStatus() });
        }
        followuptickets = mySql.ShowRecSpec("SELECT * FROM alltickets WHERE AssignedPersonnel = '" + getFirstname()
                + " " + getLastname() + "' AND FollowUp = 1");
        model = (DefaultTableModel) requestsTicketTable.getModel();
        model.setRowCount(0);
        for (Tickets t : followuptickets) {
            model.addRow(new Object[] { t.getId(), t.getTitle(), t.getType(), t.getPriority(), t.getDepartment(),
                    t.getDateCreated(), t.getDateUpdated() });
        }
        solvedtickets = mySql.ShowRecSpec("SELECT * FROM masterrecord WHERE Status = 'Closed'");
        model = (DefaultTableModel) solvedTicketsTable.getModel();
        model.setRowCount(0);
        for (Tickets t : solvedtickets) {
            model.addRow(new Object[] { t.getId(), t.getTitle(), t.getType(), t.getPriority(), t.getDepartment(),
                    t.getDateUpdated(), t.getPersonnel() });
        }
        assignedtickets = mySql.ShowRecSpec(
                "SELECT * FROM alltickets WHERE AssignedPersonnel = '" + getFirstname() + " " + getLastname() + "'");
        model = (DefaultTableModel) assignedTicketTable.getModel();
        model.setRowCount(0);
        for (Tickets t : assignedtickets) {
            model.addRow(new Object[] { t.getId(), t.getTitle(), t.getType(), t.getPriority(), t.getDepartment(),
                    t.getDateCreated(), t.getDateUpdated() });
        }
        mytickets = mySql.ShowRecSpec(
                "SELECT m1.* FROM masterrecord m1 LEFT JOIN masterrecord m2 ON (m1.TicketID = m2.TicketID and m1.RevisionCount < m2.RevisionCount and m1.Creator = m2.Creator) WHERE m2.RevisionCount IS NULL HAVING m1.Creator = '"
                        + getFirstname() + " " + getLastname() + "' ORDER BY TicketID ASC");
        model = (DefaultTableModel) myTicketTable.getModel();
        model.setRowCount(0);
        for (Tickets t : mytickets) {
            model.addRow(new Object[] { t.getId(), t.getTitle(), t.getType(), t.getPriority(), t.getDepartment(),
                    t.getDateCreated(), t.getDateUpdated() });
        }
    }
}
