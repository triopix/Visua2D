package Visua2D.project.GUI.GeoSystem;

import Visua2D.assets.util.resources.Shape.Graphics.Triangle;
import Visua2D.assets.util.resources.UI.assets.Math.Math;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Objects;


public class TriangleAreaGUI implements ActionListener, KeyListener {

    public JFrame TriangleFrame = new JFrame();
    private final JPanel quadDimensionPanel = new JPanel();
    private final JLabel Heightlbl = new JLabel("Height");
    private final JLabel Baselbl = new JLabel("Base");

    private final JTextField HeightTxtFld = new JTextField();
    private final JTextField BaseTxtFld = new JTextField();


    private final JTextField answerFld = new JTextField();
    private final JTextField AreaFld = new JTextField();

    private final JButton CalculateArea = new JButton("Calculate Area ");
    private final JButton clearButton = new JButton("CLEAR FIELDS");

    char sqr = '\u00B2';
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
    private JLabel warningLabelHeight = new JLabel();
    private final JLabel warningLabelBase = new JLabel();

    //our important strings and chars


    //constructor
    public TriangleAreaGUI() {
        //setting the frame
        TriangleFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        TriangleFrame.setLayout(null);
        TriangleFrame.getContentPane().setBackground(new Color(212, 206, 204));
        TriangleFrame.setSize(650, 315);
        TriangleFrame.setTitle("Triangle Calculator");
        ImageIcon icon = new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("brickchang-removebg-preview (2).png")));
        TriangleFrame.setIconImage(icon.getImage());
        TriangleFrame.setResizable(false);

        //adding the panel
        quadDimensionPanel.setBounds(0, 0, 500, 200);
        quadDimensionPanel.setLayout(null);
        quadDimensionPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        TriangleFrame.add(quadDimensionPanel);

        //setting side 1 label
        Heightlbl.setBounds(5, 5, 150, 50);
        Heightlbl.setBackground(Color.YELLOW);
        Heightlbl.setOpaque(true);
        Heightlbl.setFont(new Font("Segoe UI", Font.BOLD, 20));
        Heightlbl.setVerticalAlignment(SwingConstants.CENTER);
        Heightlbl.setHorizontalAlignment(SwingConstants.CENTER);
        Heightlbl.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        Heightlbl.setForeground(Color.BLACK);
        quadDimensionPanel.add(Heightlbl);

        Baselbl.setBounds(5,100,150,50);
        Baselbl.setBackground(Color.YELLOW);
        Baselbl.setOpaque(true);
        Baselbl.setFont(new Font("Segoe UI", Font.BOLD, 20));
        Baselbl.setVerticalAlignment(SwingConstants.CENTER);
        Baselbl.setHorizontalAlignment(SwingConstants.CENTER);
        Baselbl.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        Baselbl.setForeground(Color.BLACK);
        quadDimensionPanel.add(Baselbl);


        //---------------------------------------

        //setting up the text fields
        HeightTxtFld.setBounds(158, 5, 325, 50);
        HeightTxtFld.setFont(new Font("Segoe UI", Font.PLAIN, 27));
        HeightTxtFld.setBorder(BorderFactory.createLineBorder(Color.GRAY.darker(), 1));
        HeightTxtFld.addKeyListener(this);
        quadDimensionPanel.add(HeightTxtFld);

        BaseTxtFld.setBounds(158, 100, 325, 50);
        BaseTxtFld.setFont(new Font("Segoe UI", Font.PLAIN, 27));
        BaseTxtFld.setBorder(BorderFactory.createLineBorder(Color.GRAY.darker(), 1));
        BaseTxtFld.addKeyListener(this);
        quadDimensionPanel.add(BaseTxtFld);



        //calculate quad type button implementation


        //calculate Area button implementation
        CalculateArea.setBackground(new Color(0, 0, 0));
        CalculateArea.setBounds(5, 210, 200, 55);
        CalculateArea.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        CalculateArea.setFont(new Font("Cambria", Font.BOLD + Font.ITALIC, 21));
        CalculateArea.setFocusable(false);
        CalculateArea.setForeground(Color.WHITE);
        CalculateArea.addActionListener(this);
        TriangleFrame.add(CalculateArea);


        AreaFld.setBounds(215, 210, 412, 56);
        AreaFld.setEditable(false);
        AreaFld.setBorder(BorderFactory.createLineBorder(Color.GRAY.darker(), 1));
        AreaFld.setFont(new Font("Segoe UI", Font.ITALIC, 27));
        TriangleFrame.add(AreaFld);


        //setting up the unit label
        unitLabel.setBounds(510, 10, 120, 20);
        unitLabel.setHorizontalAlignment(SwingConstants.CENTER);
        unitLabel.setVerticalAlignment(SwingConstants.CENTER);
        unitLabel.setForeground(Color.BLACK);
        unitLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        TriangleFrame.add(unitLabel);


        //setting up our combo box
        unitComboBox = new JComboBox(units);
        unitComboBox.setBounds(517, 37, 100, 40);
        unitComboBox.setFont(new Font("Arial", Font.BOLD, 15));
        unitComboBox.addActionListener(this);
        TriangleFrame.add(unitComboBox);

        //setting up our clear button
        clearButton.setBounds(508, 160, 120, 40);
        clearButton.setFocusable(false);
        clearButton.setFont(new Font("Arial", Font.BOLD + Font.ITALIC, 13));
        clearButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
        clearButton.addActionListener(this::clearFields);
        TriangleFrame.add(clearButton);


        //warning label height
        warningLabelHeight.setBounds(15, 55, 500, 40);
        warningLabelHeight.setForeground(new Color(243, 6, 6, 255));
        warningLabelHeight.setFont(new Font("Arial Black", Font.BOLD, 14));
        quadDimensionPanel.add(warningLabelHeight);

        //warning label base
        warningLabelBase.setBounds(15, 150, 500, 40);
        warningLabelBase.setForeground(new Color(243, 6, 6, 255));
        warningLabelBase.setFont(new Font("Arial Black", Font.BOLD, 14));
        quadDimensionPanel.add(warningLabelBase);

        //making the window visible
        TriangleFrame.setVisible(true);
    }


    //MAKE IT WORK METHODS

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == CalculateArea && HeightTxtFld.getText().isEmpty() || BaseTxtFld.getText().isEmpty()) {
            HeightTxtFld.setEditable(false);
            BaseTxtFld.setEditable(false);
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(CalculateArea, "Please Fill All The Fields", "Error", JOptionPane.ERROR_MESSAGE);
            HeightTxtFld.setEditable(true);
            BaseTxtFld.setEditable(true);
        }  else if(e.getSource() == unitComboBox && HeightTxtFld.getText().isEmpty() || BaseTxtFld.getText().isEmpty()) {
            HeightTxtFld.setEditable(false);
            BaseTxtFld.setEditable(false);
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(CalculateArea, "Please Fill All The Fields", "Error", JOptionPane.ERROR_MESSAGE);
            HeightTxtFld.setEditable(true);
            BaseTxtFld.setEditable(true);
        } else {
            String height = HeightTxtFld.getText().trim();
            String base = BaseTxtFld.getText().trim();

            double heightNum = Double.parseDouble(height);
            double baseNum = Double.parseDouble(base);

            double area = Math.TriangleArea(baseNum, heightNum);

            if(e.getSource() == CalculateArea) {
                AreaFld.setText(area+" ");
            } else if(e.getSource() == unitComboBox) {
                String selected = (String) unitComboBox.getSelectedItem();
                assert selected != null;
                HeightTxtFld.setText(heightNum + " " + selected);
                BaseTxtFld.setText(baseNum +" " + selected);
                AreaFld.setText(area + " " + selected+sqr);
                HeightTxtFld.setEditable(false);
                BaseTxtFld.setEditable(false);
                AreaFld.setEditable(false);
            }

        }

    }

    public void clearFields(ActionEvent e) {
        if(e.getSource() == clearButton && HeightTxtFld.getText().isEmpty() && BaseTxtFld.getText().isEmpty()) {
            HeightTxtFld.setEditable(false);
            BaseTxtFld.setEditable(false);
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(clearButton, "Could Not Clear Any Values", "Alert Message", JOptionPane.WARNING_MESSAGE);
            HeightTxtFld.setEditable(true);
            BaseTxtFld.setEditable(true);
        } else {
            unitComboBox.removeActionListener(this);
            HeightTxtFld.setText("");
            BaseTxtFld.setText("");
            answerFld.setText("");
            AreaFld.setText("");
            HeightTxtFld.setEditable(true);
            BaseTxtFld.setEditable(true);
            unitComboBox.setSelectedItem(units[0]);
            unitComboBox.addActionListener(this);
        }
    }


    //not needed but needed for the event listiner
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //needed
    @Override
    public void keyPressed(KeyEvent ke) {

        if(ke.getSource() == HeightTxtFld) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
                HeightTxtFld.setEditable(true);
                warningLabelHeight.setText("");
            } else if(ke.getKeyChar() == '.') {
                String checker = HeightTxtFld.getText();
                int counter = 0;
                for(int i = 0; i < checker.length(); i++) {
                    if(checker.charAt(i) == '.') {
                        counter++;
                        if(counter > 0) {
                            ke.consume();
                            HeightTxtFld.setEditable(false);
                            warningLabelHeight.setText("ONLY ONE DECIMAL POINT ALLOWED");
                            warningLabelHeight.setFont(new Font("Arial Black", Font.BOLD + Font.ITALIC, 14));
                            warningLabelHeight.setForeground(Color.GREEN.darker().darker());
                            Toolkit.getDefaultToolkit().beep();
                        }
                    }
                }
            } else {
                HeightTxtFld.setEditable(false);
                Toolkit.getDefaultToolkit().beep();
                warningLabelHeight.setForeground(Color.RED);
                warningLabelHeight.setFont(new Font("Arial Black", Font.BOLD, 14));
                warningLabelHeight.setText("Enter only numerical digits (0 - 9) and/or Decimal Numbers");
            }
        }

        if(ke.getSource() == BaseTxtFld) {
            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
                BaseTxtFld.setEditable(true);
                warningLabelBase.setText("");
            } else if(ke.getKeyChar() == '.') {
                String checker = BaseTxtFld.getText();
                int counter = 0;
                for(int i = 0; i < checker.length(); i++) {
                    if(checker.charAt(i) == '.') {
                        counter++;
                        if(counter > 0) {
                            ke.consume();
                            BaseTxtFld.setEditable(false);
                            warningLabelBase.setText("ONLY ONE DECIMAL POINT ALLOWED");
                            warningLabelBase.setFont(new Font("Arial Black", Font.BOLD + Font.ITALIC, 14));
                            warningLabelBase.setForeground(Color.GREEN.darker().darker());
                            Toolkit.getDefaultToolkit().beep();
                        }
                    }
                }
            } else {
                BaseTxtFld.setEditable(false);
                Toolkit.getDefaultToolkit().beep();
                warningLabelBase.setForeground(Color.RED);
                warningLabelBase.setFont(new Font("Arial Black", Font.BOLD, 14));
                warningLabelBase.setText("Enter only numerical digits (0 - 9) and/or Decimal Numbers");
            }

        }
    }

    //not needed  as well but for the event listner
    @Override
    public void keyReleased(KeyEvent e) {

    }
}