/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetablemanagement;


import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bimsara De Silva
 */


public class MainDashboard extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    
    
    
    public MainDashboard() {
        
        
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

        jDesktopPane1 = new javax.swing.JDesktopPane();
        SystemSessions = new javax.swing.JButton();
        SystemLecturer3 = new javax.swing.JButton();
        SystemLecturer4 = new javax.swing.JButton();
        SystemWorkDays = new javax.swing.JButton();
        students = new javax.swing.JButton();
        SystemStatistic = new javax.swing.JButton();
        SystemTag = new javax.swing.JButton();
        SystemLecturer1 = new javax.swing.JButton();
        SystemTimeTable = new javax.swing.JButton();
        SystemTimeTable1 = new javax.swing.JButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SystemSessions.setBackground(new java.awt.Color(0, 102, 255));
        SystemSessions.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SystemSessions.setText("Sessions");
        SystemSessions.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SystemSessions.setContentAreaFilled(false);
        SystemSessions.setOpaque(true);
        SystemSessions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemSessionsActionPerformed(evt);
            }
        });

        SystemLecturer3.setBackground(new java.awt.Color(0, 102, 255));
        SystemLecturer3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SystemLecturer3.setText("Locations");
        SystemLecturer3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SystemLecturer3.setContentAreaFilled(false);
        SystemLecturer3.setOpaque(true);
        SystemLecturer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemLecturer3ActionPerformed(evt);
            }
        });

        SystemLecturer4.setBackground(new java.awt.Color(0, 102, 255));
        SystemLecturer4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SystemLecturer4.setText("Subjects");
        SystemLecturer4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SystemLecturer4.setContentAreaFilled(false);
        SystemLecturer4.setFocusable(false);
        SystemLecturer4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SystemLecturer4.setOpaque(true);
        SystemLecturer4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        SystemLecturer4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemLecturer4ActionPerformed(evt);
            }
        });

        SystemWorkDays.setBackground(new java.awt.Color(0, 102, 255));
        SystemWorkDays.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SystemWorkDays.setText("Working Days & Hours");
        SystemWorkDays.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SystemWorkDays.setContentAreaFilled(false);
        SystemWorkDays.setOpaque(true);
        SystemWorkDays.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemWorkDaysActionPerformed(evt);
            }
        });

        students.setBackground(new java.awt.Color(0, 102, 255));
        students.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        students.setText("Students");
        students.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        students.setContentAreaFilled(false);
        students.setOpaque(true);
        students.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsActionPerformed(evt);
            }
        });

        SystemStatistic.setBackground(new java.awt.Color(0, 102, 255));
        SystemStatistic.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SystemStatistic.setText("Statistics");
        SystemStatistic.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SystemStatistic.setContentAreaFilled(false);
        SystemStatistic.setOpaque(true);
        SystemStatistic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemStatisticActionPerformed(evt);
            }
        });

        SystemTag.setBackground(new java.awt.Color(0, 102, 255));
        SystemTag.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SystemTag.setText("Tags");
        SystemTag.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SystemTag.setContentAreaFilled(false);
        SystemTag.setOpaque(true);
        SystemTag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemTagActionPerformed(evt);
            }
        });

        SystemLecturer1.setBackground(new java.awt.Color(0, 102, 255));
        SystemLecturer1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SystemLecturer1.setText("Lecturers");
        SystemLecturer1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SystemLecturer1.setContentAreaFilled(false);
        SystemLecturer1.setOpaque(true);
        SystemLecturer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemLecturer1ActionPerformed(evt);
            }
        });

        SystemTimeTable.setBackground(new java.awt.Color(255, 0, 153));
        SystemTimeTable.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SystemTimeTable.setText("Generate Time Tables");
        SystemTimeTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SystemTimeTable.setContentAreaFilled(false);
        SystemTimeTable.setOpaque(true);
        SystemTimeTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemTimeTableActionPerformed(evt);
            }
        });

        SystemTimeTable1.setBackground(new java.awt.Color(0, 102, 255));
        SystemTimeTable1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        SystemTimeTable1.setText("Not Available Times");
        SystemTimeTable1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SystemTimeTable1.setContentAreaFilled(false);
        SystemTimeTable1.setOpaque(true);
        SystemTimeTable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemTimeTable1ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(SystemSessions, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(SystemLecturer3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(SystemLecturer4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(SystemWorkDays, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(students, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(SystemStatistic, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(SystemTag, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(SystemLecturer1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(SystemTimeTable, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(SystemTimeTable1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SystemLecturer1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(SystemTag, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SystemWorkDays, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(students, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(SystemTimeTable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(SystemLecturer4, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(SystemStatistic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SystemLecturer3, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                            .addComponent(SystemSessions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(SystemTimeTable, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SystemLecturer1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(students, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SystemLecturer3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SystemLecturer4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SystemTag, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SystemWorkDays, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SystemStatistic, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SystemSessions, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SystemTimeTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SystemTimeTable, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 65)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Time Table Management System");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 65)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Home");

        jDesktopPane2.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1005, Short.MAX_VALUE)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(360, 360, 360)))
                .addGap(20, 20, 20))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDesktopPane2)
                        .addGap(5, 5, 5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDesktopPane1)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jDesktopPane2)
                .addGap(18, 18, 18)
                .addComponent(jDesktopPane1)
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
   
    private void SystemTimeTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemTimeTableActionPerformed
        dispose();
        Timetablegeneration md = new Timetablegeneration();
        md.setVisible(true);      
    }//GEN-LAST:event_SystemTimeTableActionPerformed

    private void SystemTagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemTagActionPerformed
        // TODO add your handling code here:
            dispose();
            ManageTags mt = new ManageTags();
            mt.setVisible(true);
    }//GEN-LAST:event_SystemTagActionPerformed

    private void SystemLecturer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemLecturer1ActionPerformed
        // TODO add your handling code here:
         member2.member2main l1 = new member2.member2main();
           l1.setVisible(true);
           this.dispose();

        
    }//GEN-LAST:event_SystemLecturer1ActionPerformed

    private void SystemWorkDaysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemWorkDaysActionPerformed
            dispose();
            Workingdaysandhours wd = new Workingdaysandhours();
            wd.setVisible(true);

    }//GEN-LAST:event_SystemWorkDaysActionPerformed

    private void SystemStatisticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemStatisticActionPerformed
        dispose();
        Interfaces.StatisticsDashBoard s1 = new Interfaces.StatisticsDashBoard();
        s1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SystemStatisticActionPerformed

    private void SystemLecturer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemLecturer3ActionPerformed
       Interfaces.LocationDashBoard l1 = new Interfaces.LocationDashBoard();
           l1.setVisible(true);
           this.dispose();

        
    }//GEN-LAST:event_SystemLecturer3ActionPerformed

    private void SystemSessionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemSessionsActionPerformed
            dispose();
            SessionsDashboard sessi = new SessionsDashboard();
            sessi.setVisible(true);
    }//GEN-LAST:event_SystemSessionsActionPerformed

    private void SystemLecturer4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemLecturer4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SystemLecturer4ActionPerformed

    private void studentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsActionPerformed
            dispose();
            studentgroups sg = new studentgroups();
            sg.setVisible(true);            
          
        
    }//GEN-LAST:event_studentsActionPerformed

    private void SystemTimeTable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemTimeTable1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SystemTimeTable1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SystemLecturer1;
    private javax.swing.JButton SystemLecturer3;
    private javax.swing.JButton SystemLecturer4;
    private javax.swing.JButton SystemSessions;
    private javax.swing.JButton SystemStatistic;
    private javax.swing.JButton SystemTag;
    private javax.swing.JButton SystemTimeTable;
    private javax.swing.JButton SystemTimeTable1;
    private javax.swing.JButton SystemWorkDays;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton students;
    // End of variables declaration//GEN-END:variables
}
