
package com.mycompany.aels;

/**
 *
 * @author MD SADRUL ANAM
 */
public class QuizQuestionPage extends javax.swing.JFrame {

  String coursename;

String[] questions;          // we will fill later
String[][] options;          // we will fill later
int[] correctAnswers;        // we will fill later

int currentQuestion = 0;
int score = 0;
 
    public QuizQuestionPage(String course) {
        initComponents();
    this.coursename = course;
    coursejl.setText(course + " Quiz");
     loadQuestions(course);
    showQuestion();
    }
    void showQuestion() {
    showquestionjl.setText((currentQuestion + 1) + ". " + questions[currentQuestion]);

    rboption1.setText(options[currentQuestion][0]);
    rboption2.setText(options[currentQuestion][1]);
    rboption3.setText(options[currentQuestion][2]);
    rboption4.setText(options[currentQuestion][3]);

    // clear selection
    rboption1.setSelected(false);
    rboption2.setSelected(false);
    rboption3.setSelected(false);
    rboption4.setSelected(false);
}
    void loadQuestions(String course) {

    if (course.equalsIgnoreCase("PROG")) {

        questions = new String[]{
            "Which keyword is used to create a class in Java?",
            "Which method is the entry point of a Java program?",
            "Which OOP concept allows method overriding?",
            "Which data type is used to store decimal numbers?",
            "Which keyword is used to create an object?"
        };

        options = new String[][]{
            {"class", "Class", "define", "struct"},
            {"main()", "start()", "run()", "execute()"},
            {"Inheritance", "Abstraction", "Encapsulation", "Polymorphism"},
            {"int", "double", "char", "boolean"},
            {"new", "create", "object", "init"}
        };

        correctAnswers = new int[]{0, 0, 0, 1, 0};

    } else if (course.equalsIgnoreCase("DSA")) {

        questions = new String[]{
            "Which data structure uses FIFO order?",
            "Which algorithm is used for sorting?",
            "Which data structure uses LIFO order?",
            "Which searching algorithm is fastest?",
            "Which structure is used to represent a hierarchy?"
        };

        options = new String[][]{
            {"Stack", "Queue", "Tree", "Graph"},
            {"Bubble Sort", "Linear Search", "DFS", "BFS"},
            {"Stack", "Queue", "Binary Tree", "Array"},
            {"Binary Search", "Linear Search", "Bubble Sort", "Selection Sort"},
            {"Tree", "Stack", "Queue", "Array"}
        };

        correctAnswers = new int[]{1, 0, 0, 0, 0};

    } else if (course.equalsIgnoreCase("SE")) {

        questions = new String[]{
            "What is the first phase of SDLC?",
            "Which diagram shows the system boundary?",
            "What does DFD stand for?",
            "Which model is also called the waterfall model?",
            "Who interacts with the system directly?"
        };

        options = new String[][]{
            {"Planning", "Analysis", "Design", "Implementation"},
            {"Use-case diagram", "Context diagram", "Class diagram", "ERD"},
            {"Data Flow Diagram", "Design Flow Document", "Data File Diagram", "Diagram Flow Data"},
            {"Linear sequential model", "RAD model", "Agile model", "Prototype model"},
            {"User", "Database", "System", "Compiler"}
        };

        correctAnswers = new int[]{0, 1, 0, 0, 0};

    } else if (course.equalsIgnoreCase("DMG")) {

        questions = new String[]{
            "A graph with no cycles is called?",
            "Which structure is used for BFS?",
            "What is the degree of a node?",
            "Which is a simple graph property?",
            "DFS uses which data structure?"
        };

        options = new String[][]{
            {"Acyclic graph", "Complete graph", "Tree", "Bipartite graph"},
            {"Queue", "Stack", "Tree", "Array"},
            {"Number of edges incident to a node", "Number of cycles", "Graph height", "Graph weight"},
            {"No parallel edges", "All nodes connected", "No vertices", "Weighted edges only"},
            {"Stack", "Queue", "Heap", "Graph"}
        };

        correctAnswers = new int[]{2, 0, 0, 0, 0};

    } else if (course.equalsIgnoreCase("MATH")) {

        questions = new String[]{
            "Derivative of sin(x) is?",
            "Integral of 1/x dx is?",
            "What is the Laplace transform of 1?",
            "Matrix with equal number of rows and columns is called?",
            "Solution of dy/dx = 0 is?"
        };

        options = new String[][]{
            {"cos(x)", "-sin(x)", "tan(x)", "sec(x)"},
            {"ln|x| + C", "x ln(x)", "1/(x^2)", "x^2 + C"},
            {"1/s", "s", "0", "∞"},
            {"Square matrix", "Row matrix", "Column matrix", "Unit matrix"},
            {"Constant", "x", "1/x", "0"}
        };

        correctAnswers = new int[]{0, 0, 0, 0, 0};

    } else {
        System.out.println("Wrong choice! " + course);
        javax.swing.JOptionPane.showMessageDialog(this, "No questions found for course: " + course);
        questions = new String[]{"No questions available."};
        options = new String[][]{{"N/A", "N/A", "N/A", "N/A"}};
        correctAnswers = new int[]{0};
    }
}



    QuizQuestionPage() {
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        optionsGroup = new javax.swing.ButtonGroup();
        coursenamejl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        coursejl = new javax.swing.JLabel();
        showquestionjl = new javax.swing.JLabel();
        rboption1 = new javax.swing.JRadioButton();
        rboption2 = new javax.swing.JRadioButton();
        rboption3 = new javax.swing.JRadioButton();
        rboption4 = new javax.swing.JRadioButton();
        Nextb = new javax.swing.JButton();
        backb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        coursenamejl.setBackground(new java.awt.Color(51, 255, 204));
        coursenamejl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Adaptive E-Learning System");

        coursejl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        coursejl.setText("Course name here");

        showquestionjl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        showquestionjl.setText("Question will appear here");

        optionsGroup.add(rboption1);
        rboption1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rboption1.setText("Option 1");

        optionsGroup.add(rboption2);
        rboption2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rboption2.setText("Option 2");

        optionsGroup.add(rboption3);
        rboption3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rboption3.setText("Option 3");

        optionsGroup.add(rboption4);
        rboption4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rboption4.setText("Option 4");

        Nextb.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Nextb.setText("Next");
        Nextb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextbActionPerformed(evt);
            }
        });

        backb.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backb.setText("Back");
        backb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout coursenamejlLayout = new javax.swing.GroupLayout(coursenamejl);
        coursenamejl.setLayout(coursenamejlLayout);
        coursenamejlLayout.setHorizontalGroup(
            coursenamejlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursenamejlLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1)
                .addGap(0, 144, Short.MAX_VALUE))
            .addGroup(coursenamejlLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(coursenamejlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(coursenamejlLayout.createSequentialGroup()
                        .addGroup(coursenamejlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(coursenamejlLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(coursenamejlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(showquestionjl)
                                    .addGroup(coursenamejlLayout.createSequentialGroup()
                                        .addComponent(coursejl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(backb))))
                            .addGroup(coursenamejlLayout.createSequentialGroup()
                                .addGroup(coursenamejlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(rboption4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                    .addComponent(rboption3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(29, 29, 29)
                                .addComponent(Nextb)))
                        .addGap(62, 62, 62))
                    .addGroup(coursenamejlLayout.createSequentialGroup()
                        .addGroup(coursenamejlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(rboption1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(rboption2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        coursenamejlLayout.setVerticalGroup(
            coursenamejlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(coursenamejlLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(coursenamejlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(coursejl)
                    .addComponent(backb))
                .addGap(36, 36, 36)
                .addComponent(showquestionjl)
                .addGap(36, 36, 36)
                .addComponent(rboption1)
                .addGap(18, 18, 18)
                .addComponent(rboption2)
                .addGap(20, 20, 20)
                .addComponent(rboption3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(coursenamejlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rboption4)
                    .addComponent(Nextb))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(coursenamejl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(coursenamejl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NextbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextbActionPerformed
        // TODO add your handling code here:
         int selected = -1;

    if (rboption1.isSelected()) selected = 0;
    if (rboption2.isSelected()) selected = 1;
    if (rboption3.isSelected()) selected = 2;
    if (rboption4.isSelected()) selected = 3;

    if (selected == -1) {
        javax.swing.JOptionPane.showMessageDialog(this, "Please select an answer!");
        return;
    }

    // Check answer
    if (selected == correctAnswers[currentQuestion]) {
        score++;
    }

    currentQuestion++;

    if (currentQuestion < questions.length) {
        showQuestion();
    } else {
        javax.swing.JOptionPane.showMessageDialog(this,
            "Quiz Finished!\nYour Score: " + score + " out of " + questions.length);
        
       
    }
    }//GEN-LAST:event_NextbActionPerformed

    private void backbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Quiz q1=new Quiz();
        q1.setVisible(true);
    }//GEN-LAST:event_backbActionPerformed

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
            java.util.logging.Logger.getLogger(QuizQuestionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuizQuestionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuizQuestionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuizQuestionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizQuestionPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Nextb;
    private javax.swing.JButton backb;
    private javax.swing.JLabel coursejl;
    private javax.swing.JPanel coursenamejl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup optionsGroup;
    private javax.swing.JRadioButton rboption1;
    private javax.swing.JRadioButton rboption2;
    private javax.swing.JRadioButton rboption3;
    private javax.swing.JRadioButton rboption4;
    private javax.swing.JLabel showquestionjl;
    // End of variables declaration//GEN-END:variables
}
