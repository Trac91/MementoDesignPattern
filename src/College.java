import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class College extends JFrame {

    public ArrayList studentRecords = new ArrayList();

    int savedStudentDetails = 0;
    int currentDetails=0;

    public JButton btnSave;
    // Create Text Area for input
    public JTextArea tNumber = new JTextArea(1, 40);
    public JTextArea name = new JTextArea(1, 40);
    public JTextArea dob = new JTextArea(1, 40);
    public JTextArea gpa = new JTextArea(1, 40);

    public College(){

        this.setSize(600, 750);
        this.setTitle("ITTralee");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel jPanel = new JPanel();
        jPanel.add(new JLabel("Student Details" + "\n"));
        jPanel.add(new JLabel("\n" +"TNumber"));
        jPanel.add(tNumber);
        jPanel.add(new JLabel("Name"));
        jPanel.add(name);
        jPanel.add(new JLabel("Date of Birth"));
        jPanel.add(dob);
        jPanel.add(new JLabel("GPA"));
        jPanel.add(gpa);

        ButtonListener saveListener = new ButtonListener();

        btnSave = new JButton("Save");
        btnSave.addActionListener(saveListener);

        jPanel.add(btnSave);

        this.add(jPanel);
        this.setVisible(true);
    }

    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == btnSave) {
                String txtTNumber = tNumber.getText();
                String txtName = name.getText();
                String txtDOB = dob.getText();
                Float txtGPA = Float.valueOf(gpa.getText());

                savedStudentDetails++;
                currentDetails++;
                // Add Student Details to the array list
                studentRecords.add(new StudentOriginator(txtTNumber,txtName,txtDOB,txtGPA));

                // Printing out the student details
                System.out.println("Saving Student\n" + "Student TNumber: " + txtTNumber +"\n" +
                        "Name: " + txtName + "\n" + "DOB: " + txtDOB + "\n" +"GPA: " + txtGPA);
                System.out.println(studentRecords.toString());


            }
        }


    }

}
