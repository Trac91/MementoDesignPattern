import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GUI extends JFrame {


    Caretaker caretaker = new StudentCaretaker();
    Originator originator = new StudentOriginator();

    int savedStudentDetails = 0;
    int currentDetails=0;

    private JButton btnSave, btnUndo, btnRedo;
    // Create Text Area for input
    private JTextArea tNumber = new JTextArea(1, 40);
    private JTextArea name = new JTextArea(1, 40);
    private JTextArea dob = new JTextArea(1, 40);
    private JTextArea gpa = new JTextArea(1, 40);

    public GUI(){

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
        ButtonListener undoListener = new ButtonListener();
        ButtonListener redoListener = new ButtonListener();

        btnSave = new JButton("Save");
        btnSave.addActionListener(saveListener);

        btnUndo = new JButton("Undo");
        btnUndo.addActionListener(undoListener);

        btnRedo = new JButton("Redo");
        btnRedo.addActionListener(redoListener);

        jPanel.add(btnSave);
        jPanel.add(btnUndo);
        jPanel.add(btnRedo);

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
                float txtGPA = Float.parseFloat(gpa.getText());

                originator.setGpa(txtGPA);
                caretaker.addMemento(originator.Save());

                savedStudentDetails++;
                currentDetails++;

                // Printing out the student details
                System.out.println("Save Student " + savedStudentDetails);
                System.out.println("Saving Student\n" + "Student TNumber: " + txtTNumber +"\n" +
                        "Name: " + txtName + "\n" + "DOB: " + txtDOB + "\n" +"GPA: " + txtGPA);
                btnUndo.setEnabled(true);

            }else if (e.getSource() == btnUndo) {

                if (currentDetails >= 1) {

              currentDetails--;

              Float txtGPA = originator.Restore(caretaker.getMemento(currentDetails));

              gpa.setText(txtGPA.toString());

              btnRedo.setEnabled(true);

                } else {

                    btnUndo.setEnabled(false);
                }
            }else if(e.getSource()== btnRedo){

                if((savedStudentDetails -1) > currentDetails){
                    currentDetails++;
                }
                Float txtGPA = originator.Restore(caretaker.getMemento(currentDetails));

                gpa.setText(txtGPA.toString());

                btnUndo.setEnabled(true);

            }else{
                btnRedo.setEnabled(false);
            }
        }
    }
}
