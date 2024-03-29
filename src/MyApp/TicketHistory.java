/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MyApp;

import Database.Data_Tickets;
import Database.Tickets;
import com.formdev.flatlaf.FlatIntelliJLaf;
import java.util.ArrayList;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author boxro
 */
public class TicketHistory extends javax.swing.JFrame {

    private Data_Tickets mySql = new Data_Tickets();
    private ArrayList<Tickets> tickethistory;
    String ticketid;

    DefaultTableModel model;

    /**
     * Creates new form TicketHistory
     */
    public TicketHistory() {
        initComponents();
        FrameCenter.centerJFrame(this);
    }

    public TicketHistory(String ticketid) {
        this.ticketid = ticketid;
        initComponents();
        FrameCenter.centerJFrame(this);
        initialView();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ticketHistoryTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        descHistory = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        notesHistory = new javax.swing.JTextArea();
        titleHistory = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        creatorHistory = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ticketHistoryTable.setAutoCreateRowSorter(true);
        ticketHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null }
                },
                new String[] {
                        "Revision #", "Status", "Type", "Priority", "Department", "Date Updated", "Personnel Assigned"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        ticketHistoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ticketHistoryTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ticketHistoryTable);

        descHistory.setEditable(false);
        descHistory.setColumns(20);
        descHistory.setLineWrap(true);
        descHistory.setRows(5);
        jScrollPane2.setViewportView(descHistory);

        notesHistory.setEditable(false);
        notesHistory.setColumns(20);
        notesHistory.setLineWrap(true);
        notesHistory.setRows(5);
        jScrollPane3.setViewportView(notesHistory);

        titleHistory.setEditable(false);

        jLabel23.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 102, 204));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Ticket History - ");

        jLabel20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel20.setText("Ticket Description");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setText("Ticket Name");

        jLabel22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel22.setText("Ticket Notes");

        creatorHistory.setEditable(false);

        jLabel24.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel24.setText("Creator");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel22)
                                .addGap(172, 172, 172))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(jScrollPane1)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(titleHistory,
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(jScrollPane2))
                                                                                .addGap(18, 18, 18))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel21)
                                                                                .addGap(337, 337, 337)))
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel24)
                                                                        .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(jScrollPane3,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        427, Short.MAX_VALUE)
                                                                                .addComponent(creatorHistory))))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(317, 317, 317)
                                                .addComponent(jLabel23)))
                                .addContainerGap(17, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(23, Short.MAX_VALUE)
                                .addComponent(jLabel23)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel21)
                                        .addComponent(jLabel24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(creatorHistory, javax.swing.GroupLayout.DEFAULT_SIZE, 33,
                                                Short.MAX_VALUE)
                                        .addComponent(titleHistory))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 186,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 186,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ticketHistoryTableMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_ticketHistoryTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = ticketHistoryTable.getSelectedRow();
        tickethistory = mySql.ShowRecSpec("SELECT * FROM masterrecord WHERE TicketID = '" + ticketid
                + "' AND RevisionCount = '" + ticketHistoryTable.getValueAt(selectedRow, 0).toString() + "'");
        for (Tickets t : tickethistory) {
            titleHistory.setText(t.getTitle());
            descHistory.setText(t.getDesc());
            creatorHistory.setText(t.getCreator());
            notesHistory.setText(t.getNotes());
        }
    }// GEN-LAST:event_ticketHistoryTableMouseClicked

    private void initialView() {
        jLabel23.setText("Ticket History - " + ticketid);
        tickethistory = mySql.ShowRecSpec(
                "SELECT * FROM masterrecord WHERE TicketID = '" + ticketid + "' ORDER BY RevisionCount ASC");
        model = (DefaultTableModel) ticketHistoryTable.getModel();
        model.setRowCount(0);
        for (Tickets t : tickethistory) {
            model.addRow(new Object[] { t.getRevcount(), t.getStatus(), t.getType(), t.getPriority(), t.getDepartment(),
                    t.getDateUpdated(), t.getPersonnel() });
            titleHistory.setText(t.getTitle());
            descHistory.setText(t.getDesc());
            creatorHistory.setText(t.getCreator());
            notesHistory.setText(t.getNotes());
        }

    }

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
            java.util.logging.Logger.getLogger(TicketHistory.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicketHistory.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicketHistory.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicketHistory.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new TicketHistory().setVisible(true);
                }
            });
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
    }

    public void setTicketid(String ticketid) {
        this.ticketid = ticketid;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField creatorHistory;
    private javax.swing.JTextArea descHistory;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea notesHistory;
    private javax.swing.JTable ticketHistoryTable;
    private javax.swing.JTextField titleHistory;
    // End of variables declaration//GEN-END:variables
}
