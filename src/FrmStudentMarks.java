/*
Conner Recoskie
April 17th, 2023
This program allows user's to enter in differnt student names and marks, they are
all added to an array. The user can then list all the data, get indivdual
students marks, and get the test averages. 
*/
public class FrmStudentMarks extends javax.swing.JFrame {
    // Declaring arrays for student names and test scores
    String [][] studentNames = new String [15][2];
    Integer [][] testScores = new Integer [15][4];

    int currentIndex = 0; 
    
    // Declaring variables for first names and last names
    String firstName;
    String lastName;
    
    String output = "" ;
    
    /*
    Function: round
    Purpose: This method rounds a given number to two decimal places.
    Parameters: double amount repersents the amount that is going to be rounded.
    Returns: double
    */
    public static double round (double amount)
    {
        amount = amount * 100.0;
        amount = Math.round(amount);
        amount = amount/100.0;
        
        return amount;
    }    
  
    public FrmStudentMarks() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblTest1 = new javax.swing.JLabel();
        txtTest1 = new javax.swing.JTextField();
        lblTest2 = new javax.swing.JLabel();
        txtTest2 = new javax.swing.JTextField();
        lblTest3 = new javax.swing.JLabel();
        txtTest3 = new javax.swing.JTextField();
        lblTest4 = new javax.swing.JLabel();
        txtTest4 = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnStudentAverage = new javax.swing.JButton();
        btnList = new javax.swing.JButton();
        btnCourseAverage = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutputArea = new javax.swing.JTextArea();
        lblMessageLine = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblTitle.setText("<html><u>Student Marks</u></html>");

        lblFirstName.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblFirstName.setText("First Name:");

        lblLastName.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblLastName.setText("Last Name:");

        lblTest1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblTest1.setText("Test 1:");

        lblTest2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblTest2.setText("Test 2:");

        lblTest3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblTest3.setText("Test 3:");

        lblTest4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblTest4.setText("Test 4:");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnStudentAverage.setText("Student Average");
        btnStudentAverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentAverageActionPerformed(evt);
            }
        });

        btnList.setText("List");
        btnList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListActionPerformed(evt);
            }
        });

        btnCourseAverage.setText("Test Averages");
        btnCourseAverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseAverageActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        txtOutputArea.setColumns(20);
        txtOutputArea.setRows(5);
        jScrollPane1.setViewportView(txtOutputArea);

        lblMessageLine.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblMessageLine.setText("  ");

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLastName)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblTest4)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lblTest2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblTest1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblTest3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtTest4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                            .addComponent(txtTest3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                            .addComponent(txtTest2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                            .addComponent(txtTest1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnCourseAverage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnStudentAverage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtLastName)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFirstName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFirstName)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMessageLine, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTest1)
                    .addComponent(txtTest1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd)
                    .addComponent(btnStudentAverage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTest2)
                    .addComponent(txtTest2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnList)
                    .addComponent(btnCourseAverage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTest3)
                    .addComponent(txtTest3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTest4)
                    .addComponent(txtTest4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit)
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMessageLine)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // Exit program
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       // Declaring int variables to hold test marks
       int test1 = 0;
       int test2 = 0;
       int test3 = 0;
       int test4 = 0;
        
        // Checking user input
        try 
        {
            // Attempting to parse user input into integer variables
            test1 = Integer.parseInt(txtTest1.getText());
            test2 = Integer.parseInt(txtTest2.getText());
            test3 = Integer.parseInt(txtTest3.getText());
            test4 = Integer.parseInt(txtTest4.getText());  
        }
        catch (NumberFormatException e)
        {
            // Outputting error message to user if invalid input is detected
            lblMessageLine.setText("Invalid input");
        }
        
        // If the amount of students added reaches 15
        if (currentIndex == 15)
        {
            // Output message telling user this is the last student they can add
            lblMessageLine.setText("No more students can be added");
            return;
        }
        
        // Adding first and last names to array
        studentNames[currentIndex][0] = txtFirstName.getText();
        studentNames[currentIndex][1] = txtLastName.getText();
        
        // Adding test scores to array
        testScores[currentIndex][0] = test1;
        testScores[currentIndex][1] = test2;
        testScores[currentIndex][2] = test3;
        testScores[currentIndex][3] = test4;
        
        // Incrementing the amount of students index 
        currentIndex++;
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListActionPerformed
        // Setting the output area blank
        txtOutputArea.setText("");
        
        // Resetting the output variable
        output = "";
        
        // Getting the names and grades of each student from arrays
        for (int i = 0; i < currentIndex; i++)
        {
            output += studentNames[i][0] + " " + studentNames[i][1] + ": ";
            
           for (int j = 0; j <= 3; j++)
           {
               output += String.valueOf(testScores[i][j]) + "  ";
           }
            output += "\n";
        }
        
        // Adding names and data to GUI
        txtOutputArea.setText(output);
    }//GEN-LAST:event_btnListActionPerformed

    private void btnStudentAverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentAverageActionPerformed
        // Getting first and last names from text boxes
        firstName = txtFirstName.getText();
        lastName = txtLastName.getText();
        
        // Declaring an index variable
        int index = -1;
        
        // Declaring a variable to hold the total score of a student
        double totalScore = 0;
        
        // Declaring a variable to hold the students average
        double studentAverage;
        
        //  Declaring a variable to hold the students scores
        String studentScores = "";
        
        // Getting the correct test scores for the student requested
        for (int i = 0; i < studentNames.length; i++)
        {
            if (studentNames[i][0].equals(firstName) && studentNames[i][1].equals(lastName))
            {
                index = i;
                break;
            }
        }
        
        // If a student was not found (index variable was not incremented)
        if (index == -1) 
        {
            // Output a message to the user telling them that the student was not found
            lblMessageLine.setText("Student not found");
            return;
        }
        
        // Making the output area blank
        txtOutputArea.setText("");
        
        // Adding the students test scores together to a running total
        for (int j = 0; j < 4; j++)
        {
            totalScore += testScores[index][j];
            studentScores += ", " + testScores[index][j];
        }
         
        // Getting the student average
        studentAverage = totalScore / 4;
        
        // Outputting the student average and scores to the GUI
        txtOutputArea.setText(firstName + " " + lastName + "'s " + "average is " +
                studentAverage + "\n" + "\n" + " All " + firstName + " " + lastName +
                "'s" + " grades" + studentScores );
        
    }//GEN-LAST:event_btnStudentAverageActionPerformed

    private void btnCourseAverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseAverageActionPerformed
        // Declaring variables to hold each tests average
        double test1Average = 0.0;
        double test2Average = 0.0;
        double test3Average = 0.0;
        double test4Average = 0.0;
        
        // Adding each individual test score to a running balence
        for (int i = 0; i < currentIndex; i++) 
        {
            test1Average += testScores[i][0];
            test2Average += testScores[i][1];
            test3Average += testScores[i][2];
            test4Average += testScores[i][3];
        }

        // Dividing the test scores by the amount of students there is, to get the averages
        // Passing the averages to the "round" method to be rounded
        test1Average /= currentIndex;
        test1Average = round(test1Average);
        
        test2Average /= currentIndex;
        test2Average = round(test2Average);
        
        test3Average /= currentIndex;
        test3Average = round(test3Average);
        
        test4Average /= currentIndex;
        test4Average = round(test4Average);
        
        // Creating a heading for the output message
        String output1 = """
                        Test Averages
                        """;
        
        // Outputting the individual test averages and all the student data to the GUI
        txtOutputArea.setText(output1 + "Test 1 Average: " + test1Average + "\n"
                + "Test 2 Average: " + test2Average + "\n" + "Test 3 Average: "
                + test3Average + "\n" + "Test 4 Average: " + test4Average + "\n"
                + "\n" + "Student Data: " + "\n" + output);

    }//GEN-LAST:event_btnCourseAverageActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // Making the text inputs clear of text. 
        txtFirstName.setText("");
        txtLastName.setText("");
        txtTest1.setText("");
        txtTest2.setText("");
        txtTest3.setText("");
        txtTest4.setText("");
    }//GEN-LAST:event_btnClearActionPerformed


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
            java.util.logging.Logger.getLogger(FrmStudentMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmStudentMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmStudentMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmStudentMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmStudentMarks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCourseAverage;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnList;
    private javax.swing.JButton btnStudentAverage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMessageLine;
    private javax.swing.JLabel lblTest1;
    private javax.swing.JLabel lblTest2;
    private javax.swing.JLabel lblTest3;
    private javax.swing.JLabel lblTest4;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextArea txtOutputArea;
    private javax.swing.JTextField txtTest1;
    private javax.swing.JTextField txtTest2;
    private javax.swing.JTextField txtTest3;
    private javax.swing.JTextField txtTest4;
    // End of variables declaration//GEN-END:variables
}
