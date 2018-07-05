
package hrschedulingsystem;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }
    public void openViewEmp()
    {
        new viewEmp().setVisible(true);
        this.dispose();
    }
    public void openViewProj()
    {
        new viewProjects().setVisible(true);
        this.dispose();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        viewEmp_panel = new javax.swing.JPanel();
        viewEmp_icon = new javax.swing.JLabel();
        viewEmp_label = new javax.swing.JLabel();
        viewProj_panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        viewProj_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(44, 44, 84));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(245, 214, 186));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HR SCHEDULING SYSTEM");

        viewEmp_panel.setBackground(new java.awt.Color(44, 44, 84));
        viewEmp_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewEmp_panelMouseClicked(evt);
            }
        });

        viewEmp_icon.setForeground(new java.awt.Color(244, 157, 110));
        viewEmp_icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewEmp_icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hazel Cavite\\Documents\\NetBeansProjects\\HRSchedulingSystem\\img\\team.png")); // NOI18N
        viewEmp_icon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewEmp_iconMouseClicked(evt);
            }
        });

        viewEmp_label.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        viewEmp_label.setForeground(new java.awt.Color(244, 157, 110));
        viewEmp_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewEmp_label.setText("View Employees");
        viewEmp_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewEmp_labelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout viewEmp_panelLayout = new javax.swing.GroupLayout(viewEmp_panel);
        viewEmp_panel.setLayout(viewEmp_panelLayout);
        viewEmp_panelLayout.setHorizontalGroup(
            viewEmp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewEmp_panelLayout.createSequentialGroup()
                .addGroup(viewEmp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewEmp_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(viewEmp_label, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(viewEmp_panelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(viewEmp_icon, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewEmp_panelLayout.setVerticalGroup(
            viewEmp_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewEmp_panelLayout.createSequentialGroup()
                .addComponent(viewEmp_icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewEmp_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        viewProj_panel.setBackground(new java.awt.Color(44, 44, 84));
        viewProj_panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewProj_panelMouseClicked(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(244, 157, 110));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Hazel Cavite\\Documents\\NetBeansProjects\\HRSchedulingSystem\\img\\growth.png")); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        viewProj_label.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        viewProj_label.setForeground(new java.awt.Color(244, 157, 110));
        viewProj_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewProj_label.setText("View Project");
        viewProj_label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewProj_labelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout viewProj_panelLayout = new javax.swing.GroupLayout(viewProj_panel);
        viewProj_panel.setLayout(viewProj_panelLayout);
        viewProj_panelLayout.setHorizontalGroup(
            viewProj_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewProj_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewProj_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewProj_label, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewProj_panelLayout.setVerticalGroup(
            viewProj_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewProj_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addComponent(viewProj_label, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(viewEmp_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)
                        .addComponent(viewProj_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(133, 133, 133))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(viewEmp_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(viewProj_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void viewEmp_iconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewEmp_iconMouseClicked
        openViewEmp();
    }//GEN-LAST:event_viewEmp_iconMouseClicked

    private void viewEmp_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewEmp_panelMouseClicked
        openViewEmp();
    }//GEN-LAST:event_viewEmp_panelMouseClicked

    private void viewEmp_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewEmp_labelMouseClicked
        openViewEmp();
    }//GEN-LAST:event_viewEmp_labelMouseClicked

    private void viewProj_labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewProj_labelMouseClicked
        openViewProj();
    }//GEN-LAST:event_viewProj_labelMouseClicked

    private void viewProj_panelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewProj_panelMouseClicked
        openViewProj();
    }//GEN-LAST:event_viewProj_panelMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        openViewProj();
    }//GEN-LAST:event_jLabel4MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel viewEmp_icon;
    private javax.swing.JLabel viewEmp_label;
    private javax.swing.JPanel viewEmp_panel;
    private javax.swing.JLabel viewProj_label;
    private javax.swing.JPanel viewProj_panel;
    // End of variables declaration//GEN-END:variables
}
