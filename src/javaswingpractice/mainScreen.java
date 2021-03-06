/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingpractice;

import java.awt.Button;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 *
 * @author zaberoy21
 */
public class mainScreen extends javax.swing.JPanel
{

    private ArrayList<Participant> participants;
    ParticipantsListModel<Participant> modelParticipants;

    public mainScreen()
    {
        initComponents();

        plus1.setVisible(false);
        plus2.setVisible(false);
        minus1.setVisible(false);
        minus2.setVisible(false);
        backButton.setVisible(false);
        editbutton.setVisible(true);
        addParticipant.setVisible(false);
        AddPButton.setVisible(false);
        
        modelParticipants = new ParticipantsListModel<Participant>(participants);
    }

    /**
     * public void updatePanelSize() { GraphicsDevice gd =
     * GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
     * float monitorWidth = gd.getDisplayMode().getWidth(); float monitorHeight
     * = gd.getDisplayMode().getHeight();
     *
     * float monitorRatio = monitorWidth / monitorHeight;
     *
     * JComponent parent = (JComponent) getParent(); float width =
     * parent.getWidth(); float height = parent.getHeight();
     *
     * width = Math.min(width, height * monitorRatio); height = width /
     * monitorRatio; } /** /** This method is called from within the constructor
     * to initialize the form. WARNING: Do NOT modify this code. The content of
     * this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        editbutton = new javax.swing.JButton();
        plus1 = new javax.swing.JButton();
        minus1 = new javax.swing.JButton();
        plus2 = new javax.swing.JButton();
        minus2 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        participantsList = new javax.swing.JScrollPane();
        ParticipantsList = new javax.swing.JList();
        addParticipant = new javax.swing.JTextField();
        AddPButton = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 102, 0));
        jLabel3.setText("The Chore Tracker 5000");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Participants:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Chores:");

        editbutton.setText("Edit");
        editbutton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                editbuttonMouseClicked(evt);
            }
        });
        editbutton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                editbuttonActionPerformed(evt);
            }
        });

        plus1.setText("+");
        plus1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                plus1MouseClicked(evt);
            }
        });

        minus1.setText("-");
        minus1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                minus1MouseClicked(evt);
            }
        });

        plus2.setText("+");

        minus2.setText("-");

        backButton.setText("Back");
        backButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                backButtonMouseClicked(evt);
            }
        });

        participantsList.setViewportView(ParticipantsList);

        AddPButton.setText("Add");
        AddPButton.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                AddPButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(backButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editbutton)
                        .addGap(173, 173, 173)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(addParticipant, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddPButton)
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(minus1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(plus1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(participantsList, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(minus2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(plus2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(editbutton)
                        .addComponent(backButton)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plus1)
                    .addComponent(plus2))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minus1)
                    .addComponent(minus2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(participantsList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addParticipant, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddPButton))))
                .addContainerGap(191, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editbuttonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_editbuttonActionPerformed
    {//GEN-HEADEREND:event_editbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editbuttonActionPerformed

    private void editbuttonMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_editbuttonMouseClicked
    {//GEN-HEADEREND:event_editbuttonMouseClicked
        plus1.setVisible(true);
        minus1.setVisible(true);
        plus2.setVisible(true);
        minus2.setVisible(true);
        backButton.setVisible(true);
        editbutton.setVisible(false);
    }//GEN-LAST:event_editbuttonMouseClicked

    private void minus1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_minus1MouseClicked
    {//GEN-HEADEREND:event_minus1MouseClicked

    }//GEN-LAST:event_minus1MouseClicked

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_backButtonMouseClicked
    {//GEN-HEADEREND:event_backButtonMouseClicked
        plus1.setVisible(false);
        minus1.setVisible(false);
        plus2.setVisible(false);
        minus2.setVisible(false);
        backButton.setVisible(false);
        editbutton.setVisible(true);
    }//GEN-LAST:event_backButtonMouseClicked

    private void plus1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_plus1MouseClicked
    {//GEN-HEADEREND:event_plus1MouseClicked
        addParticipant.setVisible(true);
        AddPButton.setVisible(true);
    }//GEN-LAST:event_plus1MouseClicked

    private void AddPButtonMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_AddPButtonMouseClicked
    {//GEN-HEADEREND:event_AddPButtonMouseClicked
         DefaultListModel dm = new DefaultListModel();
         dm.addElement("hello");
         ParticipantsList.setModel(dm);
    }//GEN-LAST:event_AddPButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPButton;
    private javax.swing.JList ParticipantsList;
    private javax.swing.JTextField addParticipant;
    private javax.swing.JButton backButton;
    private javax.swing.JButton editbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton minus1;
    private javax.swing.JButton minus2;
    private javax.swing.JScrollPane participantsList;
    private javax.swing.JButton plus1;
    private javax.swing.JButton plus2;
    // End of variables declaration//GEN-END:variables
}
