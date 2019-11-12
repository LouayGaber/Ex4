/**
 * Main Screen Of the game 
 *  *Author : Louay Gaber

 *
 */
public class Game_Mainwindow extends javax.swing.JFrame {
	  private javax.swing.JButton computer_button_;
	    private javax.swing.JTextField jTextField1;
	    private javax.swing.JTextField jTextField2;
	    private javax.swing.JButton student_button_;

	private static final long serialVersionUID = 1L;
	
    public Game_Mainwindow() {
        initComponents();
    }

    /**
     * initComponents
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")                       
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        computer_button_ = new javax.swing.JButton(); 
        student_button_ = new javax.swing.JButton(); 

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(247, 190, 190));

        jTextField1.setFont(new java.awt.Font("Tahoma",1, 18)); // NOI18N
        jTextField1.setText("Welcome To The Game Numbers"); //
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

       jTextField2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField2.setText("Choose who to play with");

        computer_button_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        computer_button_.setText("Computer");
        computer_button_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computer_button_ActionPerformed(evt);
            }
        });

        student_button_.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        student_button_.setText("Student");
        student_button_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                student_button_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(computer_button_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(student_button_, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(computer_button_, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(student_button_, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }                  

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent event) {                                            
    }                                           

    /**
     * computer_button_ActionPerformed
     * open the game against the computer window if chose to play with the computer
     * @param event - click on the button operation
     */
    private void computer_button_ActionPerformed(java.awt.event.ActionEvent event) {                                                 
        
        Game_StudentvsComputer c = new Game_StudentvsComputer();
        c.setVisible(true);
    }                                                

    /**
     * student_button_ActionPerformed
     * open the game against student window if chose to play with another student
     * @param event - click on the button operation
     */
    private void student_button_ActionPerformed(java.awt.event.ActionEvent evt) {                                                
       
        Game_StudentvsStudent s = new Game_StudentvsStudent();
        s.setVisible(true);
    }                                               


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game_Mainwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game_Mainwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game_Mainwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game_Mainwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game_Mainwindow().setVisible(true);
            }
        });
    }

}
