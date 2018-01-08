/*
Tyler Paulley and Andy Zhang
Operating Systems: Programming Exercise
12/3/2017
Simulation.java

Description: This program is a simulation of an operating system's task 
             buffers. Arraylists are used to represent the task producers
             and consumers (cores). A set number of tasks are generated, 
             and then allocated into the buffers. The program stops when
             all tasks are exhausted. Producers and consumers simulate a 
             critical section by stopping new tasks from being pushed into 
             them when they are 67-88% filled. 
*/

package synchronization.simulation;

import java.util.*;                                                              
import java.time.*;
import org.jfree.chart.ChartFactory;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFrame;
import java.awt.Color;

public class Simulation extends javax.swing.JFrame {
    public Simulation() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        RunSimulationButton = new javax.swing.JButton();
        jTextFieldPROD = new javax.swing.JTextField();
        jTextFieldSRB = new javax.swing.JTextField();
        jTextFieldCONS = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        RunSimulationButton.setText("Run Simulation");
        RunSimulationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RunSimulationButtonActionPerformed(evt);
            }
        });

        jTextFieldPROD.setToolTipText("Number of Producers");
        jTextFieldPROD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPRODActionPerformed(evt);
            }
        });

        jTextFieldSRB.setToolTipText("Number of SRBs");
        jTextFieldSRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSRBActionPerformed(evt);
            }
        });

        jTextFieldCONS.setToolTipText("Number of Consumers");
        jTextFieldCONS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCONSActionPerformed(evt);
            }
        });

        jLabel1.setText("Number of SRBs to Generate (e.g. 10)");

        jLabel2.setText("Number of Producers to Generate (e.g. 50)");

        jLabel3.setText("Number of Consumers to Generate  (e.g. 12)");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setText("Synchronization Simulation");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(543, 543, 543))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldPROD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCONS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(100, 100, 100))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RunSimulationButton)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldSRB, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldSRB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPROD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldCONS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(RunSimulationButton)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Code for RunSimulation button
    private void RunSimulationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RunSimulationButtonActionPerformed
        //Get inputs from text fields
        String SRBCountS = jTextFieldSRB.getText();
        int SRBCount = Integer.parseInt(SRBCountS);
        String ProdCountS = jTextFieldSRB.getText();
        int ProdCount = Integer.parseInt(ProdCountS);
        String ConsCountS = jTextFieldSRB.getText();
        int ConsCount = Integer.parseInt(ConsCountS);
        
        //Create ArrayList objects
        SRBList srbList = new SRBList(SRBCount);                                //SRBs: create arraylists that hold integers and strings (adt), size for 100 items in each
                                                                                //      these push items into Producers and have unique ids
        ProducerList prodList = new ProducerList(ProdCount);                    //Producers: create arraylists of size 100 but that can only be filled to a critical section (67-88 items)
                                                                                //           these have an id, can hold abstract data types, and serve to push items into Consumers
        ConsumerList consList = new ConsumerList(ConsCount);                    //Consumers: create arraylists of size 100 but that can only be filled to a critical section (67-88 items)
                                                                                //           these have an id, can hold abstract data types, and represent the cpu's cores
        long[] timeArray = new long[SRBCount];                                  //make an array of length = number of SRBs, holds time when srb becomes empty
        
        Random rand = new Random();
        rand.setSeed(Instant.now().toEpochMilli());
        
        for(int i = 0; i < timeArray.length; i++)
        {
            timeArray[i] = System.nanoTime();                                   //System.nanoTime(); get nanoseconds, Instant.now().toEpochMilli(); returns in milliseconds
        }
        
        while(!(srbList.TestIsEmpty()))                                         //randomly push from SRBtoProd or ProdtoCons until all SRBs are empty
        {
            int num = rand.nextInt((1 - 0) + 1) + 0;
            switch(num)
            {
                case 0:
                    srbList.SRBToProducer(prodList, timeArray);
                    break;
                case 1:
                    prodList.ProducerToConsumer(consList);
                    break;        
                default: 
                    System.out.println("ERROR: Invalid Case in main");
            }
        }
        DefaultCategoryDataset dcd = new DefaultCategoryDataset();              //create a bar chart when all SRBs empty
        for(int i = 0; i < timeArray.length; i++)
        {
            float roundedMilli = timeArray[i] / 100000;
            roundedMilli /= 10;
            dcd.setValue(roundedMilli, "Time", srbList.list.get(i).id);
        }
        
        JFreeChart jchart = ChartFactory.createBarChart3D("Source Request Buffer (SRB) Empty Time", "SRB ID", "Milliseconds", dcd, PlotOrientation.VERTICAL, true, true, false);
        
        CategoryPlot plot = jchart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.black);
        
        ChartFrame chartFrm = new ChartFrame("SRB Empty Time", jchart, true);
        chartFrm.setVisible(true);
        chartFrm.setSize(800,600);
    }//GEN-LAST:event_RunSimulationButtonActionPerformed

    private void jTextFieldSRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSRBActionPerformed
    }//GEN-LAST:event_jTextFieldSRBActionPerformed

    private void jTextFieldPRODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPRODActionPerformed
    }//GEN-LAST:event_jTextFieldPRODActionPerformed

    private void jTextFieldCONSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCONSActionPerformed
    }//GEN-LAST:event_jTextFieldCONSActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simulation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RunSimulationButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCONS;
    private javax.swing.JTextField jTextFieldPROD;
    private javax.swing.JTextField jTextFieldSRB;
    // End of variables declaration//GEN-END:variables
}
