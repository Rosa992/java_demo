import javax.swing.*;

public class JavaProject {
    public static void main(String[] args) {

       JFrame myJFrame = new JFrame();
       myJFrame.setTitle("Java radio button example");
       myJFrame.setSize(450, 300);

JPanel panel = new JPanel();
        JRadioButton Male = new JRadioButton("Male");
        JRadioButton Female = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(Male);
        bg.add(Female);

        //JRadioButton is added to the panel
        panel.add(Male);
        panel.add(Female);

        myJFrame.add(panel);
        myJFrame.setVisible(true);




    }
}
