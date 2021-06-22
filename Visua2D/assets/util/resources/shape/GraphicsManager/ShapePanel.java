package Visua2D.assets.util.resources.shape.GraphicsManager;

import Visua2D.assets.util.resources.UI.assets.Components.AppColors;
import Visua2D.assets.util.resources.UI.assets.Components.VerticalLabelUI;
import Visua2D.assets.util.resources.UI.assets.Math.Math;
import Visua2D.assets.util.resources.shape.Graphics.CircleOrEllipse;
import Visua2D.assets.util.resources.shape.Graphics.InfoFrame;
import Visua2D.assets.util.resources.shape.Graphics.Triangle;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ShapePanel extends JPanel implements ActionListener,ChangeListener,KeyListener {

    public static final JPanel quadDisplay = new JPanel();
    public static CircleOrEllipse circleOrEllipse = new CircleOrEllipse(100, 100);
    public static Triangle triangle = new Triangle();

    //---------------------------------------------

    //QUAD - DRAWING AND SLIDERS
    //width
    public static JSlider widthSlider = new JSlider();
    public static JLabel widthLblChange = new JLabel();
    public static JLabel widthLblShow = new JLabel();
    //height
    public static JSlider heightSlider = new JSlider();
    public static JLabel heightLblChange = new JLabel();
    public static JLabel heightLblShow = new JLabel();
    //x
    public static JSlider xSlider = new JSlider();
    public static JLabel xLabelChanger = new JLabel();
    public static JLabel xLabelShower = new JLabel();
    //y
    public static JSlider ySlider = new JSlider();
    public static JLabel yLabelChanger = new JLabel();
    public static JLabel yLabelShower = new JLabel();
    //area
    public static JLabel areaLblForQuad = new JLabel();
    public static JLabel perimeterForQuad = new JLabel();
    //perimeter
    //values - quad
    int width = widthSlider.getValue();
    int height = heightSlider.getValue();
    int area = (int) Math.squareOrRectangleArea(height, width);
    char sqr = '\u00B2';

    //-------------------------------------


    //CIRCLE TextFields

    public static JPanel roundPane = new JPanel();
    public static JLabel propertiesLbl = new JLabel();
    public static JLabel roundWidthLBl = new JLabel();
    public static JTextField roundWidthFld = new JTextField();
    public static JLabel roundHeightLbl = new JLabel();
    public static JTextField roundHeightFld = new JTextField();
    public static JButton CalEllipseCircleBtn = new JButton("RESIZE AND CALCULATE A/Pm.");


    //FUNCTIONALITY COMPONENTS FOR CIRCLE/ELLIPSE
    public static JTextField AreaFldCircleEllipse = new JTextField();
    public static JTextField PerimeterFldCircleEllipse = new JTextField();
    public static JTextField CircleOrEllipseFld = new JTextField();
    public static JLabel AreaLblCircleOrEllipse = new JLabel("Area: ");
    public static JLabel circleEllipsePerimeterLbl = new JLabel("Pm.: ");
    public static JLabel CircleOrEllipseLbl = new JLabel("Type: ");

    public static JButton infoBtnCircleEllipse = new JButton("INFO");


    //Constructor
    public ShapePanel(){
        this.setBackground(AppColors.White);
        this.setPreferredSize(new Dimension(200, 200));
        this.setLayout(null);

        //Quad
        setQuadFuncOptions();

        //Circle
        setCircleEllipseOptions();

        //DRAWING OUR SHAPES
        QuadDisplayed();
        CircleDisplayed();
        TriangleDisplayed();
    }

    //-----------------------------------------------------------------


    //quad
    public void QuadDisplayed() {
        quadDisplay.setBounds(597, 235, 100, 100);
        quadDisplay.setVisible(false);
        this.add(quadDisplay);
    }

    //circle
    public void CircleDisplayed() {
        circleOrEllipse.setBounds(450,220,1000,500);
        circleOrEllipse.setVisible(false);
        this.add(circleOrEllipse);
    }

    //circle
    public void TriangleDisplayed() {
        triangle.setBounds(70, 80, 200, 200);
        triangle.setVisible(false);
        this.add(triangle);
    }

    public void setQuadFuncOptions() {
        setWidthSlider();
        setHeightSlider();
        setXSlider();
        setYSlider();
        setAreaChanger();
        setPerimeterForQuad();
    }


    //----------------------------------------------------------

    //QUAD SLIDERS AND FUNCTIONALITY
    public void setWidthSlider() {
        widthSlider.setMinimum(0);
        widthSlider.setMaximum(500);
        widthSlider.setValue(100);
        widthSlider.setBounds(90, 60, 1100, 45);

        widthSlider.setPaintTicks(true);
        widthSlider.setMinorTickSpacing(25);

        widthSlider.setPaintTrack(true);
        widthSlider.setMajorTickSpacing(100);

        widthSlider.setPaintLabels(true);
        widthSlider.setFont(new Font("Arial", Font.BOLD, 16));

        widthLblChange.setBounds(675, 18, 100, 25);
        widthLblChange.setFont(new Font("MV Boli", Font.BOLD, 20));
        widthLblChange.setForeground(Color.GREEN.darker().darker());
        widthLblChange.setText(widthSlider.getValue()+" px");
        widthLblChange.setVisible(false);

        widthSlider.addChangeListener(this);
        widthSlider.setVisible(false);

        widthLblShow.setText("Change Width: ");
        widthLblShow.setFont(new Font("Arial Black", Font.PLAIN, 18));
        widthLblShow.setBounds(520, 0, 230, 60);
        widthLblShow.setVisible(false);

        this.add(widthSlider);
        this.add(widthLblChange);
        this.add(widthLblShow);
    }
    public void setHeightSlider() {
        heightSlider.setMinimum(0);
        heightSlider.setMaximum(500);
        heightSlider.setValue(100);
        heightSlider.setBounds(1170, 127, 70, 350);

        heightSlider.setPaintTicks(true);
        heightSlider.setMinorTickSpacing(25);


        heightSlider.setPaintTrack(true);
        heightSlider.setMajorTickSpacing(100);

        heightSlider.setPaintLabels(true);
        heightSlider.setOrientation(SwingConstants.VERTICAL);
        heightSlider.addChangeListener(this);
        heightSlider.setFont(new Font("Arial", Font.BOLD, 16));
        heightSlider.setVisible(false);

        heightLblChange.setBounds(1250, 200, 30, 140);
        heightLblChange.setText("Change Height: ");
        heightLblChange.setFont(new Font("Arial Black", Font.PLAIN, 15));
        heightLblChange.setUI(new VerticalLabelUI(true));
        heightLblChange.setVisible(false);

        heightLblShow.setBounds(1240, 335, 50, 100);
        heightLblShow.setFont(new Font("MV Boli", Font.BOLD, 19));
        heightLblShow.setForeground(Color.GREEN.darker().darker());
        heightLblShow.setUI(new VerticalLabelUI(true));
        heightLblShow.setText(heightSlider.getValue() + " px");
        heightLblShow.setVisible(false);

        this.add(heightSlider);
        this.add(heightLblChange);
        this.add(heightLblShow);
    }
    public void setXSlider() {
        xSlider.setMinimum(0);
        xSlider.setMaximum(1000);
        xSlider.setValue(597);
        xSlider.setBounds(90, 500, 1120, 45);

        xSlider.setPaintTicks(true);
        xSlider.setMinorTickSpacing(50);

        xSlider.setPaintTrack(true);
        xSlider.setMajorTickSpacing(100);

        xSlider.setPaintLabels(true);
        xSlider.addChangeListener(this);
        xSlider.setFont(new Font("Arial", Font.BOLD, 16));
        xSlider.setVisible(false);

        xLabelShower.setBounds(513, 410, 230, 140);
        xLabelShower.setText("Change X Coordinate: ");
        xLabelShower.setFont(new Font("Arial Black", Font.PLAIN, 18));
        xLabelShower.setVisible(false);

        xLabelChanger.setBounds(740, 409, 100, 140);
        xLabelChanger.setText(xSlider.getValue() + " px");
        xLabelChanger.setFont(new Font("MV Boli", Font.BOLD, 20));
        xLabelChanger.setForeground(Color.MAGENTA.darker().darker());
        xLabelChanger.setVisible(false);

        this.add(xSlider);
        this.add(xLabelShower);
        this.add(xLabelChanger);
    }
    public void setYSlider() {
        ySlider.setMinimum(0);
        ySlider.setMaximum(450);
        ySlider.setValue(235);
        ySlider.setBounds(40, 128, 80, 360);

        ySlider.setPaintTicks(true);
        ySlider.setMinorTickSpacing(25);

        ySlider.setPaintTrack(true);
        ySlider.setMajorTickSpacing(50);

        ySlider.setPaintLabels(true);
        ySlider.addChangeListener(this);
        ySlider.setFont(new Font("Arial", Font.BOLD, 16));
        ySlider.setOrientation(SwingConstants.VERTICAL);
        ySlider.setVisible(false);

        yLabelShower.setBounds(10, 240, 20, 200);
        yLabelShower.setText("Change Y Coordinate: ");
        yLabelShower.setFont(new Font("Arial Black", Font.PLAIN, 15));
        yLabelShower.setUI(new VerticalLabelUI(false));
        yLabelShower.setVisible(false);

        yLabelChanger.setBounds(10, 50, 20, 200);
        yLabelChanger.setText(ySlider.getValue()+" px");
        yLabelChanger.setFont(new Font("MV Boli", Font.BOLD, 18));
        yLabelChanger.setUI(new VerticalLabelUI(false));
        yLabelChanger.setForeground(Color.MAGENTA.darker().darker());
        yLabelChanger.setVisible(false);

        this.add(ySlider);
        this.add(yLabelShower);
        this.add(yLabelChanger);
    }
    public void setAreaChanger() {
        areaLblForQuad.setBounds(1163, 3, 214, 40);
        areaLblForQuad.setFont(new Font("Calibri", Font.BOLD, 19));
        areaLblForQuad.setText("Area: " + area + " px" + sqr);
        areaLblForQuad.setForeground(Color.BLUE.darker().darker());
        areaLblForQuad.setVisible(false);
        this.add(areaLblForQuad);
    }
    public void setPerimeterForQuad() {
        perimeterForQuad.setBounds(1165, 28, 214, 40);
        perimeterForQuad.setFont(new Font("Calibri", Font.BOLD, 19));
        perimeterForQuad.setText("Pm: " + (widthSlider.getValue()+heightSlider.getValue()) * 2 + " px");
        perimeterForQuad.setForeground(Color.RED.darker());
        perimeterForQuad.setVisible(false);
        this.add(perimeterForQuad);

    }

    //--------------------------------------------------------------------------------

    //CIRCLE

    public void setCircleEllipseOptions() {

        roundPane.setBounds(1000, -1, 380, 590);
        roundPane.setBackground(Color.WHITE);
        roundPane.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        roundPane.setLayout(null);
        roundPane.setVisible(false);
        this.add(roundPane);

        propertiesLbl.setBounds(40, 12, 300, 30);
        propertiesLbl.setForeground(Color.BLUE.darker());
        propertiesLbl.setFont(new Font("Arial Black", Font.BOLD, 16));
        propertiesLbl.setText("Circle/Ellipse PROPERTIES");
        roundPane.add(propertiesLbl);

        roundWidthLBl.setBounds(15, 60, 100, 30);
        roundWidthLBl.setText("Width: ");
        roundWidthLBl.setForeground(Color.RED.darker());
        roundWidthLBl.setFont(new Font("Calibri", Font.BOLD, 15));
        roundPane.add(roundWidthLBl);

        roundWidthFld.setBounds(65, 57, 230, 35);
        roundWidthFld.setFont(new Font("Consolas", Font.BOLD, 25));
        roundWidthFld.setText(CircleOrEllipse.getTheWidth() + "");
        roundWidthFld.addKeyListener(this);
        roundPane.add(roundWidthFld);

        roundHeightLbl.setBounds(15, 120, 100, 30);
        roundHeightLbl.setText("Height: ");
        roundHeightLbl.setForeground(Color.RED.darker());
        roundHeightLbl.setFont(new Font("Calibri", Font.BOLD, 15));
        roundPane.add(roundHeightLbl);

        roundHeightFld.setBounds(67, 115, 227, 35);
        roundHeightFld.setFont(new Font("Consolas", Font.BOLD, 25));
        roundHeightFld.setText(CircleOrEllipse.getTheHeight() + "");
        roundHeightFld.addKeyListener(this);
        roundPane.add(roundHeightFld);

        CalEllipseCircleBtn.setBounds(54, 170, 230, 30);
        CalEllipseCircleBtn.setFocusPainted(false);
        CalEllipseCircleBtn.addActionListener(this);
        CalEllipseCircleBtn.addChangeListener(this);
        CalEllipseCircleBtn.setVisible(false);
        roundPane.add(CalEllipseCircleBtn);

        AreaLblCircleOrEllipse.setBounds(16, 230, 100, 30);
        AreaLblCircleOrEllipse.setText("Area: ");
        AreaLblCircleOrEllipse.setForeground(Color.BLACK);
        AreaLblCircleOrEllipse.setFont(new Font("Calibri", Font.BOLD, 23));
        roundPane.add(AreaLblCircleOrEllipse);

        AreaFldCircleEllipse.setBounds(74, 223, 217, 40);
        AreaFldCircleEllipse.setFont(new Font("Consolas", Font.PLAIN, 25));
        AreaFldCircleEllipse.setEditable(false);
        roundPane.add(AreaFldCircleEllipse);

        circleEllipsePerimeterLbl.setBounds(16, 290, 80, 30);
        circleEllipsePerimeterLbl.setForeground(Color.BLACK);
        circleEllipsePerimeterLbl.setFont(new Font("Calibri", Font.BOLD, 26));
        roundPane.add(circleEllipsePerimeterLbl);

        PerimeterFldCircleEllipse.setBounds(74, 280, 217, 40);
        PerimeterFldCircleEllipse.setFont(new Font("Consolas", Font.PLAIN, 25));
        PerimeterFldCircleEllipse.setEditable(false);
        roundPane.add(PerimeterFldCircleEllipse);

        CircleOrEllipseLbl.setBounds(13, 350, 120, 30);
        CircleOrEllipseLbl.setForeground(Color.BLACK);
        CircleOrEllipseLbl.setFont(new Font("Calibri", Font.BOLD, 24));
        roundPane.add(CircleOrEllipseLbl);

        CircleOrEllipseFld.setBounds(74, 340, 217, 40);
        CircleOrEllipseFld.setFont(new Font("Calibri", Font.PLAIN, 26));
        CircleOrEllipseFld.setEditable(false);
        roundPane.add(CircleOrEllipseFld);

        infoBtnCircleEllipse.setBounds(35, 420, 250, 120);
        infoBtnCircleEllipse.addActionListener(this::setInfoFrame);
        infoBtnCircleEllipse.setBackground(Color.BLACK);
        infoBtnCircleEllipse.setForeground(Color.WHITE);
        infoBtnCircleEllipse.setFocusPainted(false);
        infoBtnCircleEllipse.setFont(new Font("Consolas", Font.BOLD, 57));
        infoBtnCircleEllipse.setHorizontalAlignment(SwingConstants.CENTER);
        roundPane.add(infoBtnCircleEllipse);


    }


    @Override
    public void stateChanged(ChangeEvent e) {

        //QUAD
        xLabelChanger.setText(xSlider.getValue() + " px");
        widthLblChange.setText(widthSlider.getValue()+" " + "px");
        heightLblShow.setText(heightSlider.getValue()+" " + "px");
        yLabelChanger.setText(ySlider.getValue()+" px");
        areaLblForQuad.setText("Area: " + widthSlider.getValue() * heightSlider.getValue() + " px" + sqr);
        perimeterForQuad.setText("Pm: " + (widthSlider.getValue()+heightSlider.getValue()) * 2 + " px");
        quadDisplay.setBounds(xSlider.getValue(), ySlider.getValue(), widthSlider.getValue(), heightSlider.getValue());


//        String aString = roundWidthFld.getText().trim();
//        String bString = roundHeightFld.getText().trim();
//        double a = Double.parseDouble(aString);
//        double theHeight = Double.parseDouble(bString);
//        Circle.setAlterDia(a);
//        Circle.setAlterHeight(theHeight);
//        repaint();

        //Circle
//        String aString = roundWidthFld.getText().trim();
//        String bString = roundHeightFld.getText().trim();
//        double a = Double.parseDouble(aString);
//        double theHeight = Double.parseDouble(bString);

        if(e.getSource() == CalEllipseCircleBtn) {
            String widthDia = roundWidthFld.getText().trim();
            String roundHeight = roundHeightFld.getText().trim();
            double width = Double.parseDouble(widthDia);
            double height = Double.parseDouble(roundHeight);

            if(width == 0 && height != 0) {
                circleEllipsePerimeterLbl.setText("Len: ");
            } else if(height == 0 && width != 0) {
                circleEllipsePerimeterLbl.setText("Len: ");
            } else if(width == 0 && height == 0) {
                circleEllipsePerimeterLbl.setText("Pm.: ");
            } else if(width != 0 && height != 0) {
                circleEllipsePerimeterLbl.setText("Pm.: ");
            } else {
                circleEllipsePerimeterLbl.setText("Pm.: ");
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == CalEllipseCircleBtn && roundWidthFld.getText().isEmpty() || roundHeightFld.getText().isEmpty()) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(CalEllipseCircleBtn, "Please fill in all the fields", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String widthDia = roundWidthFld.getText().trim();
            String roundHeight = roundHeightFld.getText().trim();
            double width = Double.parseDouble(widthDia);
            double height = Double.parseDouble(roundHeight);
            CircleOrEllipse.setWidth(width);
            CircleOrEllipse.setHeight(height);
            repaint();

            //area - circle
            double areaOfCircle = Math.areaOfCircle(width);
            //area of ellipse
            double areaEllipse = Math.ellipseArea(width, height);
            //perimeter - circle - should say circumference
            double radius = width / 2; //or height/2
            double circleCircumference = Math.circumferenceOfCircle(radius /*could also be height/2 because they are all the same in a circle*/);
            //perimeter of ellipse - using Ramanujan's approximations equation
            double ellipsePerimeter = Math.ellipsePerimeter(width, height);

            String ellipseOrCircle = Math.ellipseOrCircle(width, height);

            if (width == height) {
                AreaFldCircleEllipse.setText(areaOfCircle + "");
                PerimeterFldCircleEllipse.setText(circleCircumference + "");
            } else {
                AreaFldCircleEllipse.setText(areaEllipse + "");
                PerimeterFldCircleEllipse.setText(ellipsePerimeter + "");
            }
            CircleOrEllipseFld.setText(ellipseOrCircle + "");

            if(width == 0 && height != 0) {
                PerimeterFldCircleEllipse.setText(height+"");
                CircleOrEllipseFld.setText("N/A");
            } else if(height == 0 && width != 0) {
                PerimeterFldCircleEllipse.setText(width+"");
                CircleOrEllipseFld.setText("N/A");
            } else if(width == 0 && height == 0) {
                CircleOrEllipseFld.setText("N/A");
            } else if(width != 0 && height != 0) {
                if (width == height) {
                    AreaFldCircleEllipse.setText(areaOfCircle + "");
                    PerimeterFldCircleEllipse.setText(circleCircumference + "");
                } else {
                    AreaFldCircleEllipse.setText(areaEllipse + "");
                    PerimeterFldCircleEllipse.setText(ellipsePerimeter + "");
                }
            }
        }
    }

    public void setInfoFrame(ActionEvent e) {
        if(e.getSource() == infoBtnCircleEllipse) {
            InfoFrame infoFrame = new InfoFrame();
            infoFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getSource() == roundWidthFld) {
            if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9' || e.getKeyChar() == KeyEvent.VK_BACK_SPACE || e.getKeyChar() == KeyEvent.VK_TAB) {
                roundWidthFld.setEditable(true);
            } else if(e.getKeyChar() == '.') {
                String checker = roundWidthFld.getText();
                int counter = 0;
                for(int i = 0; i < checker.length(); i++) {
                    if(checker.charAt(i) == '.') {
                        counter++;
                        if(counter > 0) {
                            e.consume();
                            roundWidthFld.setEditable(false);
                            Toolkit.getDefaultToolkit().beep();
                        }
                    }
                }
            } else {
                roundWidthFld.setEditable(false);
                Toolkit.getDefaultToolkit().beep();
            }
        }

        if(e.getSource() == roundHeightFld) {
            if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9' || e.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
                roundHeightFld.setEditable(true);
            } else if(e.getKeyChar() == '.') {
                String checker = roundHeightFld.getText();
                int counter = 0;
                for(int i = 0; i < checker.length(); i++) {
                    if(checker.charAt(i) == '.') {
                        counter++;
                        if(counter > 0) {
                            e.consume();
                            roundHeightFld.setEditable(false);
                            Toolkit.getDefaultToolkit().beep();
                        }
                    }
                }
            } else {
                roundHeightFld.setEditable(false);
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

