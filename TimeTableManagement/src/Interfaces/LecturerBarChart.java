/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
//IT19216256_Member 04
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
/**
 *
 * @author Dell
 */
public class LecturerBarChart extends javax.swing.JFrame {

    /**
     * Creates new form LecturerBarChart
     */
      Connection con = null;
      PreparedStatement pst = null;
      ResultSet rs = null;
     
    public LecturerBarChart() {
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
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        LPanal = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jButton1.setBackground(new java.awt.Color(0, 51, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Lecturer", "Ms.Kushnara Siriwardana", "Prof.Nimal Rajapakse", "Prof.Rahula Attalage", "DR.Anuradha Karunasena", "Ms.Disni Siriwardhana", " " }));

        LPanal.setBackground(new java.awt.Color(153, 153, 255));
        LPanal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lecturer Statics", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cambria", 0, 18))); // NOI18N
        LPanal.setLayout(new javax.swing.BoxLayout(LPanal, javax.swing.BoxLayout.LINE_AXIS));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LPanal, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LPanal, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        String ses = jComboBox1.getSelectedItem().toString();
        String k = "Ms.Kushnara Siriwardana";
        String D = "Prof.Nimal Rajapakse";
        String R = "Prof.Rahula Attalage";
        String A = "DR.Anuradha karunasena";
        String B = "Ms.Disni Siriwardhana";
        
        
       
        
        
         try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/mynewdb","root","");
            String sql = "select * from lecturers WHERE lecturername=?";
            pst.setString(1, ses);
            
            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
           
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
         
         
         
       
         if (ses.equals(k)) { 
             
             
                   DefaultCategoryDataset db = new DefaultCategoryDataset();
                     db.setValue(5, "Groups", "IP");
                     db.setValue(4, "Groups", "OOC");
                     db.setValue(3, "Groups", "OOP");
       
        
        // test
        JFreeChart jchart = ChartFactory.createBarChart("Lecturer Statistic","Subject","Groups", db, PlotOrientation.VERTICAL, true,true,false);
        
        CategoryPlot plot = jchart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.black);
        
        
        ChartFrame cf = new ChartFrame("Lecture Statistic",jchart,true);
        cf.setVisible(true);
        cf.setSize(500, 400);
             
             
            
        } else if (ses.equals(D)) {
            
            
        DefaultCategoryDataset db = new DefaultCategoryDataset();
        db.setValue(6, "Groups", "ISDM");
        db.setValue(7, "Groups", "DBS");
        db.setValue(4, "Groups", "DMS");
       
        
        // test
        JFreeChart jchart = ChartFactory.createBarChart("Lecturer Statistic","Subject","Groups", db, PlotOrientation.VERTICAL, true,true,false);
        
        CategoryPlot plot = jchart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.black);
        
        
        ChartFrame cf = new ChartFrame("Lecture Statistic",jchart,true);
        cf.setVisible(true);
        cf.setSize(500, 400);
            
            
        } else if (ses.equals(R)) {
                
        
        DefaultCategoryDataset db = new DefaultCategoryDataset();
        db.setValue(10, "Groups", "EAP");
        db.setValue(7, "Groups", "EA");
        db.setValue(6, "Groups", "CS");
       
        
        // test
        JFreeChart jchart = ChartFactory.createBarChart("Lecturer Statistic","Subject","Groups", db, PlotOrientation.VERTICAL, true,true,false);
        
        CategoryPlot plot = jchart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.black);
        
        
        ChartFrame cf = new ChartFrame("Lecture Statistic",jchart,true);
        cf.setVisible(true);
        cf.setSize(500, 400);
       // ChartPanel cp = new ChartPanel(jchart);
        
       // LPanal.removeAll();
        //LPanal.add(cp);
        //LPanal.updateUI();
        
        }else if (ses.equals(B)) {
                
        
        DefaultCategoryDataset db = new DefaultCategoryDataset();
        db.setValue(4, "Groups", "IWT");
        db.setValue(4, "Groups", "NDM");
        db.setValue(4, "Groups", "CN");
       
        
        // test
        JFreeChart jchart = ChartFactory.createBarChart("Lecturer Statistic","Subject","Groups", db, PlotOrientation.VERTICAL, true,true,false);
        
        CategoryPlot plot = jchart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.black);
        
        
        ChartFrame cf = new ChartFrame("Lecture Statistic",jchart,true);
        cf.setVisible(true);
        cf.setSize(500, 400);
       // ChartPanel cp = new ChartPanel(jchart);
        
       // LPanal.removeAll();
        //LPanal.add(cp);
        //LPanal.updateUI();
        
        }else if (ses.equals(A)) {
                
        
        DefaultCategoryDataset db = new DefaultCategoryDataset();
        db.setValue(2, "Groups", "DMS");
        db.setValue(3, "Groups", "SPM");
        db.setValue(3, "Groups", "SE");
       
        
        // test
        JFreeChart jchart = ChartFactory.createBarChart("Lecturer Statistic","Subject","Groups", db, PlotOrientation.VERTICAL, true,true,false);
        
        CategoryPlot plot = jchart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.black);
        
        
        ChartFrame cf = new ChartFrame("Lecture Statistic",jchart,true);
        cf.setVisible(true);
        cf.setSize(500, 400);
       // ChartPanel cp = new ChartPanel(jchart);
        
       // LPanal.removeAll();
        //LPanal.add(cp);
        //LPanal.updateUI();
        
        }    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
           StatisticsDashBoard s1 = new StatisticsDashBoard();
           s1.setVisible(true);
           this.dispose();
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(LecturerBarChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecturerBarChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecturerBarChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecturerBarChart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LecturerBarChart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LPanal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
