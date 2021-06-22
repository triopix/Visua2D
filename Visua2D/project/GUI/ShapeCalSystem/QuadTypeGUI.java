package Visua2D.project.GUI.ShapeCalSystem;

import Visua2D.assets.util.resources.UI.assets.Math.Math;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class QuadTypeGUI implements ActionListener, KeyListener {

    public JFrame frame = new JFrame();
    private final JPanel triDimensionPanel = new JPanel();
    private final JLabel side1 = new JLabel("Side No. 1");
    private final JLabel side2 = new JLabel("Side No. 2");
    private final JLabel side3 = new JLabel("Side No. 3");
    private final JLabel side4 = new JLabel("Side No. 4");

    private final JTextField side1TxtFld = new JTextField();
    private final JTextField side2TxtFld = new JTextField();
    private final JTextField side3TxtFld = new JTextField();
    private final JTextField side4TxtFld = new JTextField();

    private final JTextField answerFld = new JTextField();

    private final JButton CalculateQuadType = new JButton("Calculate Quad Type");
    private final JButton clearButton = new JButton("CLEAR FIELDS");

    String cm = "cm";
    String m = "m";
    String mm = "mm";
    String km = "km";
    String in = "in";
    String yd = "yd";
    String ft = "ft";
    String mi = "mi";

    String[] units = {cm, m, mm, km, in, yd, ft, mi};

    //JComboBox for units
    private final JComboBox unitComboBox;

    //label for units
    private JLabel unitLabel = new JLabel("CHOOSE UNIT");
    private JLabel warningLabelSide1 = new JLabel();
    private JLabel warningLabelSide2 = new JLabel();
    private JLabel warningLabelSide3 = new JLabel();
    private JLabel warningLabelSide4 = new JLabel();

    //our important strings and chars


    //constructor
    public QuadTypeGUI() {

        //setting the frame
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(212, 206, 204));
        frame.setSize(650, 510);
        frame.setTitle("QuadType Calculator");
        frame.setResizable(false);

        //adding the panel
        triDimensionPanel.setBounds(0, 0, 500, 380);
        triDimensionPanel.setLayout(null);
        triDimensionPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        frame.add(triDimensionPanel);

        //setting side 1 label
        side1.setBounds(5, 5, 150, 50);
        side1.setBackground(Color.YELLOW);
        side1.setOpaque(true);
        side1.setFont(new Font("Segoe UI", Font.BOLD, 20));
        side1.setVerticalAlignment(SwingConstants.CENTER);
        side1.setHorizontalAlignment(SwingConstants.CENTER);
        side1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        side1.setForeground(Color.BLACK);
        triDimensionPanel.add(side1);

        side2.setBounds(5, 100, 150, 50);
        side2.setBackground(Color.YELLOW);
        side2.setOpaque(true);
        side2.setFont(new Font("Segoe UI", Font.BOLD, 20));
        side2.setVerticalAlignment(SwingConstants.CENTER);
        side2.setHorizontalAlignment(SwingConstants.CENTER);
        side2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        side2.setForeground(Color.BLACK);
        triDimensionPanel.add(side2);

        side3.setBounds(5, 195, 150, 50);
        side3.setBackground(Color.YELLOW);
        side3.setOpaque(true);
        side3.setFont(new Font("Segoe UI", Font.BOLD, 20));
        side3.setVerticalAlignment(SwingConstants.CENTER);
        side3.setHorizontalAlignment(SwingConstants.CENTER);
        side3.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        side3.setForeground(Color.BLACK);
        triDimensionPanel.add(side3);

        side4.setBounds(5, 290, 150, 50);
        side4.setBackground(Color.YELLOW);
        side4.setOpaque(true);
        side4.setFont(new Font("Segoe UI", Font.BOLD, 20));
        side4.setVerticalAlignment(SwingConstants.CENTER);
        side4.setHorizontalAlignment(SwingConstants.CENTER);
        side4.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        side4.setForeground(Color.BLACK);
        triDimensionPanel.add(side4);

        //---------------------------------------

        //setting up the text fields
        side1TxtFld.setBounds(158, 5, 325, 50);
        side1TxtFld.setFont(new Font("Segoe UI", Font.PLAIN, 27));
        side1TxtFld.setBorder(BorderFactory.createLineBorder(Color.GRAY.darker(), 1));
        side1TxtFld.addKeyListener(this);
        triDimensionPanel.add(side1TxtFld);

        side2TxtFld.setBounds(158, 100, 325, 50);
        side2TxtFld.setFont(new Font("Segoe UI", Font.PLAIN, 27));
        side2TxtFld.setBorder(BorderFactory.createLineBorder(Color.GRAY.darker(), 1));
        side2TxtFld.addKeyListener(this);
        triDimensionPanel.add(side2TxtFld);

        side3TxtFld.setBounds(158, 195, 325, 50);
        side3TxtFld.setFont(new Font("Segoe UI", Font.PLAIN, 27));
        side3TxtFld.setBorder(BorderFactory.createLineBorder(Color.GRAY.darker(), 1));
        side3TxtFld.addKeyListener(this);
        triDimensionPanel.add(side3TxtFld);

        side4TxtFld.setBounds(158, 290, 325, 50);
        side4TxtFld.setFont(new Font("Segoe UI", Font.PLAIN, 27));
        side4TxtFld.setBorder(BorderFactory.createLineBorder(Color.GRAY.darker(), 1));
        side4TxtFld.addKeyListener(this);
        triDimensionPanel.add(side4TxtFld);


        //calculate quad type button implementation
        CalculateQuadType.setBackground(new Color(0, 0, 0));
        CalculateQuadType.setBounds(5, 393, 220, 60);
        CalculateQuadType.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        CalculateQuadType.setFont(new Font("Cambria", Font.BOLD + Font.ITALIC, 21));
        CalculateQuadType.setFocusable(false);
        CalculateQuadType.setForeground(Color.WHITE);
        CalculateQuadType.addActionListener(this);
        frame.add(CalculateQuadType);

        //text field for the answer
        answerFld.setBounds(237, 395, 390, 58);
        answerFld.setEditable(false);
        answerFld.setBorder(BorderFactory.createLineBorder(Color.GRAY.darker(), 1));
        answerFld.setFont(new Font("Segoe UI", Font.ITALIC, 27));
        frame.add(answerFld);

        //setting up the unit label
        unitLabel.setBounds(510, 10, 120, 20);
        unitLabel.setHorizontalAlignment(SwingConstants.CENTER);
        unitLabel.setVerticalAlignment(SwingConstants.CENTER);
        unitLabel.setForeground(Color.BLACK);
        unitLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        frame.add(unitLabel);


        //setting up our combo box
        unitComboBox = new JComboBox(units);
        unitComboBox.setBounds(517, 37, 100, 40);
        unitComboBox.setFont(new Font("Arial", Font.BOLD, 15));
        unitComboBox.addActionListener(this);
        frame.add(unitComboBox);

        //setting up our clear button
        clearButton.setBounds(508, 340, 120, 40);
        clearButton.setFocusable(false);
        clearButton.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 13));
        clearButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        clearButton.addActionListener(this::clearFields);
        frame.add(clearButton);


        //warning label 1
        warningLabelSide1.setBounds(15, 55, 500, 40);
        warningLabelSide1.setForeground(new Color(243, 6, 6, 255));
        warningLabelSide1.setFont(new Font("Arial Black", Font.BOLD, 14));
        triDimensionPanel.add(warningLabelSide1);

        //making the warning label 2
        warningLabelSide2.setBounds(15, 150, 500, 40);
        warningLabelSide2.setForeground(new Color(243, 6, 6, 255));
        warningLabelSide2.setFont(new Font("Arial Black", Font.BOLD, 14));
        triDimensionPanel.add(warningLabelSide2);

        //warning label 3
        warningLabelSide3.setBounds(15, 248, 500, 40);
        warningLabelSide3.setForeground(new Color(243, 6, 6, 255));
        warningLabelSide3.setFont(new Font("Arial Black", Font.BOLD, 14));
        triDimensionPanel.add(warningLabelSide3);

        //warning label 4
        warningLabelSide4.setBounds(15, 338, 500, 40);
        warningLabelSide4.setForeground(new Color(243, 6, 6, 255));
        warningLabelSide4.setFont(new Font("Arial Black", Font.BOLD, 14));
        triDimensionPanel.add(warningLabelSide4);


        //making the window visible
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //calculating what type of quad it is

        if (e.getSource() == CalculateQuadType && side1TxtFld.getText().isEmpty() ||
            side2TxtFld.getText().isEmpty() || side3TxtFld.getText().isEmpty() || side4TxtFld.getText().isEmpty()) {
            //set editabitliy to false - after you show the dialog - then set the editability to true once again
            side1TxtFld.setEditable(false);
            side2TxtFld.setEditable(false);
            side3TxtFld.setEditable(false);
            side4TxtFld.setEditable(false);
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(CalculateQuadType, "Please Fill In All The Fields", "Error Message", JOptionPane.ERROR_MESSAGE);
            side1TxtFld.setEditable(true);
            side2TxtFld.setEditable(true);
            side3TxtFld.setEditable(true);
            side4TxtFld.setEditable(true);
            answerFld.setText("");
        } else if(e.getSource() == unitComboBox && side1TxtFld.getText().isEmpty() ||
                side2TxtFld.getText().isEmpty() || side3TxtFld.getText().isEmpty() || side4TxtFld.getText().isEmpty()) {
            side1TxtFld.setEditable(false);
            side2TxtFld.setEditable(false);
            side3TxtFld.setEditable(false);
            side4TxtFld.setEditable(false);
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(CalculateQuadType, "Please Fill In All The Fields", "Error Message", JOptionPane.ERROR_MESSAGE);
            side1TxtFld.setEditable(true);
            side2TxtFld.setEditable(true);
            side3TxtFld.setEditable(true);
            side4TxtFld.setEditable(true);
            answerFld.setText("");
        } else {

            String side1Str = side1TxtFld.getText().trim();
            String side2Str = side2TxtFld.getText().trim();
            String side3Str = side3TxtFld.getText().trim();
            String side4Str = side4TxtFld.getText().trim();

            double side1StrNum = Double.parseDouble(side1Str);
            double side2StrNum = Double.parseDouble(side2Str);
            double side3StrNum = Double.parseDouble(side3Str);
            double side4StrNum = Double.parseDouble(side4Str);

            //calling the quad type method
            answerFld.setText(Math.QuadType(side1StrNum, side2StrNum, side3StrNum, side4StrNum));

            //jcombobox methods
            if(e.getSource() == unitComboBox) {
                String selected = (String) unitComboBox.getSelectedItem();
                assert selected != null;
                side1TxtFld.setText(side1StrNum + " " + selected);
                side2TxtFld.setText(side2StrNum +" " + selected);
                side3TxtFld.setText(side3StrNum + " " + selected);
                side4TxtFld.setText(side4StrNum +" " + selected);
                side1TxtFld.setEditable(false);
                side2TxtFld.setEditable(false);
                side3TxtFld.setEditable(false);
                side4TxtFld.setEditable(false);
            }

            if(side1StrNum == 0 || side2StrNum == 0 || side3StrNum == 0 || side4StrNum == 0) {
                answerFld.setText("N/A");
            }
        }
    }




//    public void quadType(double side1Input, double side2Input, double side3Input, double side4Input) {
//        if (side1Input == side3Input && side2Input == side4Input && side1Input != side2Input &&
//                side2Input != side3Input && side3Input != side4Input && side1Input != side4Input) {
//            answerFld.setText("This is a Rectangle");
//        } else if (side1Input == side2Input && side3Input == side4Input &&
//                side1Input != side3Input && side2Input != side4Input &&
//                side1Input != side4Input && side2Input != side3Input) {
//            answerFld.setText("This is a Rectangle");
//        } else if (side1Input == side4Input && side2Input == side3Input && side1Input != side2Input &&
//                side1Input != side3Input && side2Input != side4Input && side3Input != side4Input) {
//            answerFld.setText("This is a Rectangle");
//        } else if ((side1Input == side2Input) && (side2Input == side3Input) && (side3Input == side4Input) &&
//                (side1Input == side3Input) && (side1Input == side4Input) && (side2Input == side4Input)) {
//            answerFld.setText("This is a Square");
//        } else {
//            answerFld.setText("This is a Quadrilateral");
//        }
//    }

    //not needed but needed for the event listiner
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //needed
    @Override
    public void keyPressed(KeyEvent ke) {

        if(ke.getSource() == side1TxtFld) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
                side1TxtFld.setEditable(true);
                warningLabelSide1.setText("");
            } else if(ke.getKeyChar() == '.' ) {
                String checker = side1TxtFld.getText();
                int counter = 0;
                for(int i = 0; i < checker.length(); i++) {
                    if(checker.charAt(i) == '.') {
                        counter++;
                        if(counter > 0) {
                            ke.consume();
                            side1TxtFld.setEditable(false);
                            warningLabelSide1.setText("ONLY ONE DECIMAL POINT ALLOWED");
                            warningLabelSide1.setFont(new Font("Arial Black", Font.BOLD + Font.ITALIC, 14));
                            warningLabelSide1.setForeground(Color.GREEN.darker().darker());
                            Toolkit.getDefaultToolkit().beep();
                        }
                    }
                }
            } else {
                side1TxtFld.setEditable(false);
                Toolkit.getDefaultToolkit().beep();
                warningLabelSide1.setText("Enter only numerical digits (0 - 9) and/or Decimal Numbers");
            }
        }


        if(ke.getSource() == side2TxtFld) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
                side2TxtFld.setEditable(true);
                warningLabelSide2.setText("");
            } else if( ke.getKeyChar() == '.') {
                String checker = side2TxtFld.getText();
                int counter = 0;
                for(int i = 0; i < checker.length(); i++) {
                    if(checker.charAt(i) == '.') {
                        counter++;
                        if(counter > 0) {
                            ke.consume();
                            side2TxtFld.setEditable(false);
                            warningLabelSide2.setText("ONLY ONE DECIMAL POINT ALLOWED");
                            warningLabelSide2.setFont(new Font("Arial Black", Font.BOLD + Font.ITALIC, 14));
                            warningLabelSide2.setForeground(Color.GREEN.darker().darker());
                            Toolkit.getDefaultToolkit().beep();
                        }
                    }
                }
            } else {
                side2TxtFld.setEditable(false);
                Toolkit.getDefaultToolkit().beep();
                warningLabelSide2.setText("Enter only numerical digits (0 - 9) and/or Decimal Numbers");
            }
        }

        if(ke.getSource() == side3TxtFld) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
                side3TxtFld.setEditable(true);
                warningLabelSide3.setText("");
            }  else if( ke.getKeyChar() == '.') {
                String checker = side3TxtFld.getText();
                int counter = 0;
                for (int i = 0; i < checker.length(); i++) {
                    if (checker.charAt(i) == '.') {
                        counter++;
                        if (counter > 0) {
                            ke.consume();
                            side3TxtFld.setEditable(false);
                            warningLabelSide3.setText("ONLY ONE DECIMAL POINT ALLOWED");
                            warningLabelSide3.setFont(new Font("Arial Black", Font.BOLD + Font.ITALIC, 14));
                            warningLabelSide3.setForeground(Color.GREEN.darker().darker());
                            Toolkit.getDefaultToolkit().beep();
                        }
                    }
                }
            } else {
                side3TxtFld.setEditable(false);
                Toolkit.getDefaultToolkit().beep();
                warningLabelSide3.setText("Enter only numerical digits (0 - 9) and/or Decimal Numbers");
            }
        }


        if(ke.getSource() == side4TxtFld) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
                side4TxtFld.setEditable(true);
                warningLabelSide4.setText("");
            }  else if( ke.getKeyChar() == '.') {
                String checker = side4TxtFld.getText();
                int counter = 0;
                for (int i = 0; i < checker.length(); i++) {
                    if (checker.charAt(i) == '.') {
                        counter++;
                        if (counter > 0) {
                            ke.consume();
                            side4TxtFld.setEditable(false);
                            warningLabelSide4.setText("ONLY ONE DECIMAL POINT ALLOWED");
                            warningLabelSide4.setFont(new Font("Arial Black", Font.BOLD + Font.ITALIC, 14));
                            warningLabelSide4.setForeground(Color.GREEN.darker().darker());
                            Toolkit.getDefaultToolkit().beep();
                        }
                    }
                }
            } else {
                side4TxtFld.setEditable(false);
                Toolkit.getDefaultToolkit().beep();
                warningLabelSide4.setText("Enter only numerical digits (0 - 9) and/or Decimal Numbers");
            }
        }

    }

    //not needed  as well but for the event listner
    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void clearFields(ActionEvent e) {
        if(e.getSource() == clearButton && side1TxtFld.getText().isEmpty() &&
           side2TxtFld.getText().isEmpty() && side3TxtFld.getText().isEmpty() && side4TxtFld.getText().isEmpty()) {
           side1TxtFld.setEditable(false);
           side2TxtFld.setEditable(false);
           side3TxtFld.setEditable(false);
           side4TxtFld.setEditable(false);
           Toolkit.getDefaultToolkit().beep();
           JOptionPane.showMessageDialog(clearButton, "Could Not Clear Any Values", "Alert Message", JOptionPane.WARNING_MESSAGE);
           side1TxtFld.setEditable(true);
           side2TxtFld.setEditable(true);
           side3TxtFld.setEditable(true);
           side4TxtFld.setEditable(true);
        } else {
            unitComboBox.removeActionListener(this);
            side1TxtFld.setText("");
            side2TxtFld.setText("");
            side3TxtFld.setText("");
            side4TxtFld.setText("");
            answerFld.setText("");
            side1TxtFld.setEditable(true);
            side2TxtFld.setEditable(true);
            side3TxtFld.setEditable(true);
            side4TxtFld.setEditable(true);
            unitComboBox.setSelectedItem(units[0]);
            unitComboBox.addActionListener(this);
        }
    }
}


