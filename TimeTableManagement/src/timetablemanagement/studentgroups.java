/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetablemanagement;


import DataBase.DBconnection;
import java.sql.ResultSetMetaData;
import java.sql.PreparedStatement;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.UUID;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bimsara De Silva
 */
public class studentgroups extends javax.swing.JFrame {

    /**
     * Creates new form studentgroups
     */
    public studentgroups() {
        initComponents();
        setLocationRelativeTo(null);
        table_update();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        back = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        program = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        sgid = new javax.swing.JTextField();
        gid = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        gnumber = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        submitbutton = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        clearbutton = new javax.swing.JButton();
        yearcombo = new javax.swing.JComboBox<>();
        semestercombo = new javax.swing.JComboBox<>();
        subgroupcombo = new javax.swing.JComboBox<>();
        generate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Student Groups");
        jLabel4.setOpaque(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "year", "semester", "program", "groupnumber", "subgroupnumber", "groupid", "subgroupid"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        back.setBackground(new java.awt.Color(153, 153, 153));
        back.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        back.setText("Back To Main Dashboard");
        back.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        back.setContentAreaFilled(false);
        back.setOpaque(true);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Semester");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Program");

        program.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        program.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                programActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Sub Group ID");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Group ID");

        sgid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sgid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sgidActionPerformed(evt);
            }
        });

        gid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gidActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Group Number");

        gnumber.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        gnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gnumberActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Sub Group Number");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Acedemic Year");

        submitbutton.setBackground(new java.awt.Color(0, 204, 0));
        submitbutton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        submitbutton.setText("Submit");
        submitbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submitbutton.setContentAreaFilled(false);
        submitbutton.setOpaque(true);
        submitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbuttonActionPerformed(evt);
            }
        });

        Edit.setBackground(new java.awt.Color(51, 153, 255));
        Edit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Edit.setText("Edit");
        Edit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Edit.setContentAreaFilled(false);
        Edit.setOpaque(true);
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(255, 0, 0));
        delete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        delete.setText("Delete");
        delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete.setContentAreaFilled(false);
        delete.setOpaque(true);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        clearbutton.setBackground(new java.awt.Color(153, 153, 153));
        clearbutton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        clearbutton.setText("Clear");
        clearbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clearbutton.setContentAreaFilled(false);
        clearbutton.setOpaque(true);
        clearbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbuttonActionPerformed(evt);
            }
        });

        yearcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Y1", "Y2", "Y3", "Y4" }));
        yearcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearcomboActionPerformed(evt);
            }
        });

        semestercombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S1", "S2", "S3", "S4" }));
        semestercombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semestercomboActionPerformed(evt);
            }
        });

        subgroupcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        subgroupcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subgroupcomboActionPerformed(evt);
            }
        });

        generate.setBackground(new java.awt.Color(255, 0, 204));
        generate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        generate.setText("Generate");
        generate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        generate.setContentAreaFilled(false);
        generate.setOpaque(true);
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(183, 183, 183)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(semestercombo, 0, 51, Short.MAX_VALUE)
                                            .addComponent(yearcombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(223, 223, 223)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel11)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addComponent(submitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(280, 280, 280)
                                        .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(75, 75, 75)
                                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(clearbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(gid, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(sgid)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(234, 234, 234)
                                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)))))))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(program, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(gnumber)
                    .addComponent(subgroupcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(generate, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(yearcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(gid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(sgid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(semestercombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(program, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(generate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(subgroupcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

         Connection con;
         PreparedStatement insert;
         
         
         private void table_update()
         {
             int p;
              try {
            
       
        
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/timetable","root","");
            insert = con.prepareStatement("select * from studentgroupsre");
           
           
            ResultSet rs = insert.executeQuery();
            ResultSetMetaData Rss = rs.getMetaData();
            p = Rss.getColumnCount();
            
            DefaultTableModel dft = (DefaultTableModel) jTable1.getModel();
            dft.setRowCount(0);
            
               while(rs.next())
               {
                   Vector v2 = new Vector();
                   
                   for(int q=1; q<=p; q++)
                   {
                       v2.add(rs.getString("id"));
                       v2.add(rs.getString("year"));
                       v2.add(rs.getString("semester"));
                       v2.add(rs.getString("program"));
                       v2.add(rs.getString("groupnumber"));
                       v2.add(rs.getString("subgroupnumber"));
                       v2.add(rs.getString("groupid"));
                       v2.add(rs.getString("subgroupid"));
                      
                   }
                   
                   dft.addRow(v2);
               }
               
            
        } catch (ClassNotFoundException ex) {
            
            Logger.getLogger(studentgroups.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            
            Logger.getLogger(studentgroups.class.getName()).log(Level.SEVERE, null, ex);
        }
         }
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel dft = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        
            yearcombo.setSelectedItem(dft.getValueAt(selectedIndex, 1).toString());
            semestercombo.setSelectedItem(dft.getValueAt(selectedIndex, 2).toString());
            program.setText(dft.getValueAt(selectedIndex, 3).toString());
            gnumber.setText(dft.getValueAt(selectedIndex, 4).toString());
            subgroupcombo.setSelectedItem(dft.getValueAt(selectedIndex, 5).toString());
            gid.setText(dft.getValueAt(selectedIndex, 6).toString());
            sgid.setText(dft.getValueAt(selectedIndex, 7).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
        MainDashboard md = new MainDashboard();
        md.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_backMouseClicked

    private void clearbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbuttonActionPerformed
        yearcombo.setSelectedIndex(0);
        semestercombo.setSelectedIndex(0);
        program.setText("");
        gnumber.setText("");
        subgroupcombo.setSelectedIndex(0);
        gid.setText("");
        sgid.setText("");
    }//GEN-LAST:event_clearbuttonActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dft = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();

        try {

            int id = Integer.parseInt(dft.getValueAt(selectedIndex, 0).toString());

            int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure?","Warning",JOptionPane.YES_NO_OPTION);

            if(dialogResult == JOptionPane.YES_OPTION)
            {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/timetable","root","");
                insert = con.prepareStatement("delete from studentgroupsre where id=?");

                insert.setInt(1, id);

            }

            insert.executeUpdate();

            JOptionPane.showMessageDialog(this,"Successfully Deleted");
            table_update();

        } catch (ClassNotFoundException ex) {

            Logger.getLogger(studentgroups.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {

            Logger.getLogger(studentgroups.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:

        DefaultTableModel dft = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();

        try {

            int id = Integer.parseInt(dft.getValueAt(selectedIndex, 0).toString());
            String AcademicYear = yearcombo.getSelectedItem().toString();
            String Semester = semestercombo.getSelectedItem().toString();
            String Program = program.getText();
            String GNumber = gnumber.getText();
            String SGNumber = subgroupcombo.getSelectedItem().toString();
            String GID = gid.getText();
            String SGID = sgid.getText();

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/timetable","root","");
            insert = con.prepareStatement("update studentgroupsre set year=?,semester=?,program=?,groupnumber=?,subgroupnumber=?,groupid=?,subgroupid=? where id=? ");

            insert.setString(1, AcademicYear);
            insert.setString(2, Semester);
            insert.setString(3, Program);
            insert.setString(4, GNumber);
            insert.setString(5, SGNumber);
            insert.setString(6, GID);
            insert.setString(7, SGID);
            insert.setInt(8, id);
            insert.executeUpdate();

            JOptionPane.showMessageDialog(this,"Successfully Updated");

        yearcombo.setSelectedIndex(0);
        semestercombo.setSelectedIndex(0);
        program.setText("");
        gnumber.setText("");
        subgroupcombo.setSelectedIndex(0);
        gid.setText("");
        sgid.setText("");
        program.requestFocus();
        table_update();

        } catch (ClassNotFoundException ex) {

            Logger.getLogger(studentgroups.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {

            Logger.getLogger(studentgroups.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EditActionPerformed

    private void submitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbuttonActionPerformed

        String AcademicYear = yearcombo.getSelectedItem().toString();
        String Semester = semestercombo.getSelectedItem().toString();
        String Program = program.getText();
        String GNumber = gnumber.getText();
         String SGNumber = subgroupcombo.getSelectedItem().toString();
        String GID = gid.getText();
        String SGID = sgid.getText();

        Connection con;
        PreparedStatement insert;

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/timetable","root","");
            insert = con.prepareStatement("insert into studentgroupsre(year,semester,program,groupnumber,subgroupnumber,groupid,subgroupid)values(?,?,?,?,?,?,?)");

            insert.setString(1, AcademicYear);
            insert.setString(2, Semester);
            insert.setString(3, Program);
            insert.setString(4, GNumber);
            insert.setString(5, SGNumber);
            insert.setString(6, GID);
            insert.setString(7, SGID);
            insert.executeUpdate();

            JOptionPane.showMessageDialog(this,"Successfully Added");

        yearcombo.setSelectedIndex(0);
        semestercombo.setSelectedIndex(0);
        program.setText("");
        gnumber.setText("");
        subgroupcombo.setSelectedIndex(0);
        gid.setText("");
        sgid.setText("");
        program.requestFocus();
        table_update();

        } catch (ClassNotFoundException ex) {

            Logger.getLogger(studentgroups.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {

            Logger.getLogger(studentgroups.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_submitbuttonActionPerformed

    private void sgidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sgidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sgidActionPerformed

    private void gidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gidActionPerformed

    private void gnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gnumberActionPerformed

    private void programActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_programActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_programActionPerformed

    private void yearcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearcomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearcomboActionPerformed

    private void semestercomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semestercomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semestercomboActionPerformed

    private void subgroupcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subgroupcomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subgroupcomboActionPerformed

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        String grid = yearcombo.getSelectedItem().toString()+semestercombo.getSelectedItem().toString()+"."+gnumber.getText();
        String sgrid = grid +"."+ subgroupcombo.getSelectedItem().toString();
        
        gid.setText(grid);
        sgid.setText(sgrid);
    }//GEN-LAST:event_generateActionPerformed

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
            java.util.logging.Logger.getLogger(studentgroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentgroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentgroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentgroups.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentgroups().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Edit;
    private javax.swing.JButton back;
    private javax.swing.JButton clearbutton;
    private javax.swing.JButton delete;
    private javax.swing.JButton generate;
    private javax.swing.JTextField gid;
    private javax.swing.JTextField gnumber;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField program;
    private javax.swing.JComboBox<String> semestercombo;
    private javax.swing.JTextField sgid;
    private javax.swing.JComboBox<String> subgroupcombo;
    private javax.swing.JButton submitbutton;
    private javax.swing.JComboBox<String> yearcombo;
    // End of variables declaration//GEN-END:variables
}
