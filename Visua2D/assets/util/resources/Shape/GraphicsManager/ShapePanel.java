package Visua2D.assets.util.resources.Shape.GraphicsManager;

import Visua2D.assets.util.resources.UI.assets.Components.AppColors;
import Visua2D.assets.util.resources.UI.assets.Components.VerticalLabelUI;
import Visua2D.assets.util.resources.UI.assets.Math.Math;
import Visua2D.assets.util.resources.Shape.Graphics.CircleOrEllipse;
import Visua2D.assets.util.resources.Shape.Graphics.CircleInfoFrame;
import Visua2D.assets.util.resources.Shape.Graphics.Triangle;

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
    public static final CircleOrEllipse circleOrEllipse = new CircleOrEllipse(100, 100);

    public static int[] defaultArrX = {50,100,0};
    public static int[] defaultArrY = {0,100,100};
    public static final Triangle triangle = new Triangle(defaultArrX, defaultArrY);

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


    //x and y components for the circle
    public static JSlider circleOrEllipseXSlider = new JSlider();
    public static JSlider circleOrEllipseYSlider = new JSlider();

    public static JLabel circleOrEllipseXChangerLbl = new JLabel();
    public static JLabel circleOrEllipseYChangerLbl = new JLabel();
    public static JLabel circleOrEllipseXShowerLbl = new JLabel("Change X Coordinate: ");
    public static JLabel circleOrEllipseYShowerLbl = new JLabel("Change Y Coordinate: ");


    //TRIANGLE
    public static JPanel triCompPanel = new JPanel();
    public static JLabel triPropertiesLbl = new JLabel("Triangle Properties");

    public static JLabel triX1Lbl = new JLabel("<html>X<sub>1</sub></html>");
    public static JLabel triX2Lbl = new JLabel("<html>X<sub>2</sub></html>");
    public static JLabel triX3Lbl = new JLabel("<html>X<sub>3</sub></html>");
    public static JTextField triX1Fld = new JTextField();
    public static JTextField triX2Fld = new JTextField();
    public static JTextField triX3Fld = new JTextField();

    public static JLabel triY1Lbl = new JLabel("<html>Y<sub>1</sub></html>");
    public static JLabel triY2Lbl = new JLabel("<html>Y<sub>2</sub></html>");
    public static JLabel triY3Lbl = new JLabel("<html>Y<sub>3</sub></html>");
    public static JTextField triY1Fld = new JTextField();
    public static JTextField triY2Fld = new JTextField();
    public static JTextField triY3Fld = new JTextField();

    public static JButton resizeTriangleBtn = new JButton("RESIZE TRIANGLE");

    //change x and y
    public static JSlider triangleXSlider = new JSlider();
    public static JSlider triangleYSlider = new JSlider();

    public static JLabel triangleXChangerLbl = new JLabel();
    public static JLabel triangleYChangerLbl = new JLabel();
    public static JLabel triangleXShowerLbl = new JLabel("Change X Coordinate: ");
    public static JLabel triangleYShowerLbl = new JLabel("Change Y Coordinate: ");



    //Constructor
    public ShapePanel(){
        this.setBackground(AppColors.White);
        this.setPreferredSize(new Dimension(200, 200));
        this.setLayout(null);

        setQuadFuncOptions();

        setCircleEllipseOptions();

        setTriangleComponents();

        setShapes();
    }

    //-----------------------------------------------------------------

    public void setShapes() {
        quadDisplay.setBounds(597, 235, 100, 100);
        quadDisplay.setVisible(false);
        this.add(quadDisplay);

        circleOrEllipse.setBounds(450,220,1000,500);
        circleOrEllipse.setVisible(false);
        this.add(circleOrEllipse);

        triangle.setBounds(450, 220, 1000, 500);
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

        //x slider
        circleOrEllipseXSlider.setMinimum(0);
        circleOrEllipseXSlider.setMaximum(1000);
        circleOrEllipseXSlider.setValue(450);
        circleOrEllipseXSlider.setBounds(30, 508, 945, 45);
        circleOrEllipseXSlider.setPaintTicks(true);
        circleOrEllipseXSlider.setMinorTickSpacing(50);
        circleOrEllipseXSlider.setPaintTrack(true);
        circleOrEllipseXSlider.setMajorTickSpacing(100);
        circleOrEllipseXSlider.setPaintLabels(true);
        circleOrEllipseXSlider.addChangeListener(this);
        circleOrEllipseXSlider.setFont(new Font("Arial", Font.BOLD, 16));
        circleOrEllipseXSlider.setVisible(false);

        //x label shower
        circleOrEllipseXShowerLbl.setBounds(380, 415, 230, 140);
        circleOrEllipseXShowerLbl.setText("Change X Coordinate: ");
        circleOrEllipseXShowerLbl.setFont(new Font("Arial Black", Font.PLAIN, 18));
        circleOrEllipseXShowerLbl.setVisible(false);

        //x label changer
        circleOrEllipseXChangerLbl.setBounds(610, 415, 100, 140);
        circleOrEllipseXChangerLbl.setText(circleOrEllipseXSlider.getValue() + " px");
        circleOrEllipseXChangerLbl.setFont(new Font("MV Boli", Font.BOLD, 20));
        circleOrEllipseXChangerLbl.setForeground(Color.MAGENTA.darker().darker());
        circleOrEllipseXChangerLbl.setVisible(false);

        //y slider
        circleOrEllipseYSlider.setMinimum(0);
        circleOrEllipseYSlider.setMaximum(500);
        circleOrEllipseYSlider.setValue(220);
        circleOrEllipseYSlider.setBounds(30, 20, 90, 475);

        circleOrEllipseYSlider.setPaintTicks(true);
        circleOrEllipseYSlider.setMinorTickSpacing(25);

        circleOrEllipseYSlider.setPaintTrack(true);
        circleOrEllipseYSlider.setMajorTickSpacing(50);

        circleOrEllipseYSlider.setPaintLabels(true);
        circleOrEllipseYSlider.addChangeListener(this);
        circleOrEllipseYSlider.setFont(new Font("Arial", Font.BOLD, 16));
        circleOrEllipseYSlider.setOrientation(SwingConstants.VERTICAL);
        circleOrEllipseYSlider.setVisible(false);


        //y label shower
        circleOrEllipseYShowerLbl.setBounds(10, 210, 20, 200);
        circleOrEllipseYShowerLbl.setText("Change Y Coordinate: ");
        circleOrEllipseYShowerLbl.setFont(new Font("Arial Black", Font.PLAIN, 15));
        circleOrEllipseYShowerLbl.setUI(new VerticalLabelUI(false));
        circleOrEllipseYShowerLbl.setVisible(false);


        //y label changer
        circleOrEllipseYChangerLbl.setBounds(10, 10, 20, 200);
        circleOrEllipseYChangerLbl.setText(circleOrEllipseYSlider.getValue()+" px");
        circleOrEllipseYChangerLbl.setFont(new Font("MV Boli", Font.BOLD, 18));
        circleOrEllipseYChangerLbl.setUI(new VerticalLabelUI(false));
        circleOrEllipseYChangerLbl.setForeground(Color.MAGENTA.darker().darker());
        circleOrEllipseYChangerLbl.setVisible(false);

        //adding - to shape panel
        this.add(circleOrEllipseXSlider);
        this.add(circleOrEllipseYSlider);
        this.add(circleOrEllipseXShowerLbl);
        this.add(circleOrEllipseXChangerLbl);
        this.add(circleOrEllipseYShowerLbl);
        this.add(circleOrEllipseYChangerLbl);
    }


    public void setTriangleComponents() {

        triCompPanel.setBounds(1000, -1, 380, 590);
        triCompPanel.setBackground(Color.WHITE);
        triCompPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        triCompPanel.setLayout(null);
        triCompPanel.setVisible(false);
        this.add(triCompPanel);

        triPropertiesLbl.setBounds(51, 22, 300, 30);
        triPropertiesLbl.setForeground(Color.BLUE.darker());
        triPropertiesLbl.setFont(new Font("Arial Black", Font.BOLD, 20));
        triCompPanel.add(triPropertiesLbl);

        triX1Lbl.setBounds(20, 80, 30, 40);
        triX1Lbl.setFont(new Font("Arial", Font.BOLD, 18));
        triX1Lbl.setForeground(Color.BLACK);
        triCompPanel.add(triX1Lbl);

        triX2Lbl.setBounds(20, 140, 30, 40);
        triX2Lbl.setFont(new Font("Arial", Font.BOLD, 18));
        triX2Lbl.setForeground(Color.BLACK);
        triCompPanel.add(triX2Lbl);

        triX3Lbl.setBounds(20, 200, 30, 40);
        triX3Lbl.setFont(new Font("Arial", Font.BOLD, 18));
        triX3Lbl.setForeground(Color.BLACK);
        triCompPanel.add(triX3Lbl);

        triX1Fld.setBounds(55, 80, 235, 40);
        triX1Fld.setFont(new Font("Consolas", Font.PLAIN, 26));
        triX1Fld.addKeyListener(this);
        triX1Fld.setText(triangle.getTriX()[0]+ ""); //defaultArrX[0] - Value at 50 px
        triCompPanel.add(triX1Fld);

        triX2Fld.setBounds(55, 140, 235, 40);
        triX2Fld.setFont(new Font("Consolas", Font.PLAIN, 26));
        triX2Fld.addKeyListener(this);
        triX2Fld.setText(triangle.getTriX()[1]+ ""); //defaultArrX[1] - Value at 100 px
        triCompPanel.add(triX2Fld);

        triX3Fld.setBounds(55, 200, 235, 40);
        triX3Fld.setFont(new Font("Consolas", Font.PLAIN, 26));
        triX3Fld.addKeyListener(this);
        triX3Fld.setText(triangle.getTriX()[2]+ ""); //defaultArrX[2] - Value at 0 px
        triCompPanel.add(triX3Fld);

        triY1Lbl.setBounds(20, 270, 30, 40);
        triY1Lbl.setFont(new Font("Arial", Font.BOLD, 18));
        triY1Lbl.setForeground(Color.BLACK);
        triCompPanel.add(triY1Lbl);

        triY2Lbl.setBounds(20, 330, 30, 40);
        triY2Lbl.setFont(new Font("Arial", Font.BOLD, 18));
        triY2Lbl.setForeground(Color.BLACK);
        triCompPanel.add(triY2Lbl);

        triY3Lbl.setBounds(20, 390, 30, 40);
        triY3Lbl.setFont(new Font("Arial", Font.BOLD, 18));
        triY3Lbl.setForeground(Color.BLACK);
        triCompPanel.add(triY3Lbl);

        triY1Fld.setBounds(55, 270, 235, 40);
        triY1Fld.setFont(new Font("Consolas", Font.PLAIN, 26));
        triY1Fld.addKeyListener(this);
        triY1Fld.setText(triangle.getTriY()[0]+ ""); //defaultArrY[0] - Value at 0 px
        triCompPanel.add(triY1Fld);

        triY2Fld.setBounds(55, 330, 235, 40);
        triY2Fld.setFont(new Font("Consolas", Font.PLAIN, 26));
        triY2Fld.addKeyListener(this);
        triY2Fld.setText(triangle.getTriY()[1]+ ""); //defaultArrY[1] - Value at 100 px
        triCompPanel.add(triY2Fld);

        triY3Fld.setBounds(55, 390, 235, 40);
        triY3Fld.setFont(new Font("Consolas", Font.PLAIN, 26));
        triY3Fld.addKeyListener(this);
        triY3Fld.setText(triangle.getTriY()[2]+ ""); //defaultArrY[2] - Value at 100 px
        triCompPanel.add(triY3Fld);

        resizeTriangleBtn.setBounds(47, 469, 230, 70);
        resizeTriangleBtn.setFont(new Font("Arial", Font.BOLD, 20));
        resizeTriangleBtn.addActionListener(this::triangleActionsPerformed);
        resizeTriangleBtn.setFocusPainted(false);
        triCompPanel.add(resizeTriangleBtn);

        triangleXSlider.setMinimum(0);
        triangleXSlider.setMaximum(1000);
        triangleXSlider.setValue(450);
        triangleXSlider.setBounds(30, 508, 945, 45);
        triangleXSlider.setPaintTicks(true);
        triangleXSlider.setMinorTickSpacing(50);
        triangleXSlider.setPaintTrack(true);
        triangleXSlider.setMajorTickSpacing(100);
        triangleXSlider.setPaintLabels(true);
        triangleXSlider.addChangeListener(this);
        triangleXSlider.setFont(new Font("Arial", Font.BOLD, 16));
        triangleXSlider.setVisible(false);
        this.add(triangleXSlider);

        triangleYSlider.setMinimum(0);
        triangleYSlider.setMaximum(500);
        triangleYSlider.setValue(220);
        triangleYSlider.setBounds(30, 20, 90, 475);
        triangleYSlider.setPaintTicks(true);
        triangleYSlider.setMinorTickSpacing(25);
        triangleYSlider.setPaintTrack(true);
        triangleYSlider.setMajorTickSpacing(50);
        triangleYSlider.setPaintLabels(true);
        triangleYSlider.addChangeListener(this);
        triangleYSlider.setFont(new Font("Arial", Font.BOLD, 16));
        triangleYSlider.setOrientation(SwingConstants.VERTICAL);
        triangleYSlider.setVisible(false);
        this.add(triangleYSlider);


        triangleXChangerLbl.setBounds(610, 415, 100, 140);
        triangleXChangerLbl.setText(triangleXSlider.getValue() + " px");
        triangleXChangerLbl.setFont(new Font("MV Boli", Font.BOLD, 20));
        triangleXChangerLbl.setForeground(Color.MAGENTA.darker().darker());
        triangleXChangerLbl.setVisible(false);
        this.add(triangleXChangerLbl);


        triangleXShowerLbl.setBounds(380, 415, 230, 140);
        triangleXShowerLbl.setText("Change X Coordinate: ");
        triangleXShowerLbl.setFont(new Font("Arial Black", Font.PLAIN, 18));
        triangleXShowerLbl.setVisible(false);
        this.add(triangleXShowerLbl);


        triangleYChangerLbl.setBounds(10, 10, 20, 200);
        triangleYChangerLbl.setText(triangleYSlider.getValue()+" px");
        triangleYChangerLbl.setFont(new Font("MV Boli", Font.BOLD, 18));
        triangleYChangerLbl.setUI(new VerticalLabelUI(false));
        triangleYChangerLbl.setForeground(Color.MAGENTA.darker().darker());
        triangleYChangerLbl.setVisible(false);
        this.add(triangleYChangerLbl);


        triangleYShowerLbl.setBounds(10, 210, 20, 200);
        triangleYShowerLbl.setText("Change Y Coordinate: ");
        triangleYShowerLbl.setFont(new Font("Arial Black", Font.PLAIN, 15));
        triangleYShowerLbl.setUI(new VerticalLabelUI(false));
        triangleYShowerLbl.setVisible(false);
        this.add(triangleYShowerLbl);


    }



    //ACTIONS





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


        circleOrEllipseXChangerLbl.setText(circleOrEllipseXSlider.getValue()+ " px");
        circleOrEllipseYChangerLbl.setText(circleOrEllipseYSlider.getValue()+" px");
        circleOrEllipse.setBounds(circleOrEllipseXSlider.getValue(), circleOrEllipseYSlider.getValue(), 1000, 500);

        triangleXChangerLbl.setText(triangleXSlider.getValue() + " px");
        triangleYChangerLbl.setText(triangleYSlider.getValue() + " px");
        triangle.setBounds(triangleXSlider.getValue(), triangleYSlider.getValue(), 1000, 500);

        //round pane

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

            //changing the labels if one dimension is not present
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

            //changing the ellipse type - checking to see if it is not an ellipse or circle if fields are entered wrongly
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


    //ONLY FOR TRIANGLES
    public void triangleActionsPerformed(ActionEvent e) {

        if(e.getSource() == resizeTriangleBtn && triX1Fld.getText().isEmpty() || triX2Fld.getText().isEmpty() ||
                triX3Fld.getText().isEmpty() || triY1Fld.getText().isEmpty() || triY2Fld.getText().isEmpty() || triY3Fld.getText().isEmpty()) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(resizeTriangleBtn, "Please fill in All the Fields", "Error", JOptionPane.ERROR_MESSAGE);
        } else if(e.getSource() == resizeTriangleBtn && Double.parseDouble(triX1Fld.getText().trim()) > 200 ||
                Double.parseDouble(triX2Fld.getText().trim()) > 200 || Double.parseDouble(triX3Fld.getText().trim()) > 200 || Double.parseDouble(triY1Fld.getText().trim()) > 200
                                    || Double.parseDouble(triY2Fld.getText().trim()) > 200 || Double.parseDouble(triY3Fld.getText().trim()) > 200) {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(resizeTriangleBtn, "Values should be less than or equal to 200 px for drawing triangles", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String x1 = triX1Fld.getText().trim();
            String x2 = triX2Fld.getText().trim();
            String x3 = triX3Fld.getText().trim();
            String y1 = triY1Fld.getText().trim();
            String y2 = triY2Fld.getText().trim();
            String y3 = triY3Fld.getText().trim();

            double x1Num = Double.parseDouble(x1);
            double x2Num = Double.parseDouble(x2);
            double x3Num = Double.parseDouble(x3);
            double y1Num = Double.parseDouble(y1);
            double y2Num = Double.parseDouble(y2);
            double y3Num = Double.parseDouble(y3);

            int[] xArr = {(int) x1Num, (int) x2Num, (int) x3Num};
            int[] yArr = {(int) y1Num, (int) y2Num, (int) y3Num};

            triangle.setTriX(xArr);
            triangle.setTriY(yArr);
            repaint();
        }

    }

    public void setInfoFrame(ActionEvent e) {
        if(e.getSource() == infoBtnCircleEllipse) {
            CircleInfoFrame circleInfoFrame = new CircleInfoFrame();
            circleInfoFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
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


        //FOR TRIANGLES - x1
        if(e.getSource() == triX1Fld) {
            if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9' || e.getKeyChar() == KeyEvent.VK_BACK_SPACE || e.getKeyChar() == KeyEvent.VK_TAB) {
                triX1Fld.setEditable(true);
            } else if(e.getKeyChar() == '.') {
                String checker = triX1Fld.getText();
                int counter = 0;
                for(int i = 0; i < checker.length(); i++) {
                    if(checker.charAt(i) == '.') {
                        counter++;
                        if(counter > 0) {
                            e.consume();
                            triX1Fld.setEditable(false);
                            Toolkit.getDefaultToolkit().beep();
                        }
                    }
                }
            } else {
                triX1Fld.setEditable(false);
                Toolkit.getDefaultToolkit().beep();
            }
        }

        //x2
        if(e.getSource() == triX2Fld) {
            if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9' || e.getKeyChar() == KeyEvent.VK_BACK_SPACE || e.getKeyChar() == KeyEvent.VK_TAB) {
                triX2Fld.setEditable(true);
            } else if(e.getKeyChar() == '.') {
                String checker = triX2Fld.getText();
                int counter = 0;
                for(int i = 0; i < checker.length(); i++) {
                    if(checker.charAt(i) == '.') {
                        counter++;
                        if(counter > 0) {
                            e.consume();
                            triX2Fld.setEditable(false);
                            Toolkit.getDefaultToolkit().beep();
                        }
                    }
                }
            } else {
                triX2Fld.setEditable(false);
                Toolkit.getDefaultToolkit().beep();
            }
        }

        //x3
        if(e.getSource() == triX3Fld) {
            if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9' || e.getKeyChar() == KeyEvent.VK_BACK_SPACE || e.getKeyChar() == KeyEvent.VK_TAB) {
                triX3Fld.setEditable(true);
            } else if(e.getKeyChar() == '.') {
                String checker = triX3Fld.getText();
                int counter = 0;
                for(int i = 0; i < checker.length(); i++) {
                    if(checker.charAt(i) == '.') {
                        counter++;
                        if(counter > 0) {
                            e.consume();
                            triX3Fld.setEditable(false);
                            Toolkit.getDefaultToolkit().beep();
                        }
                    }
                }
            } else {
                triX3Fld.setEditable(false);
                Toolkit.getDefaultToolkit().beep();
            }
        }

        //For triangles

        //y1
        if(e.getSource() == triY1Fld) {
            if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9' || e.getKeyChar() == KeyEvent.VK_BACK_SPACE || e.getKeyChar() == KeyEvent.VK_TAB) {
                triY1Fld.setEditable(true);
            } else if(e.getKeyChar() == '.') {
                String checker = triY1Fld.getText();
                int counter = 0;
                for(int i = 0; i < checker.length(); i++) {
                    if(checker.charAt(i) == '.') {
                        counter++;
                        if(counter > 0) {
                            e.consume();
                            triY1Fld.setEditable(false);
                            Toolkit.getDefaultToolkit().beep();
                        }
                    }
                }
            } else {
                triY1Fld.setEditable(false);
                Toolkit.getDefaultToolkit().beep();
            }
        }

        //y2
        if(e.getSource() == triY2Fld) {
            if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9' || e.getKeyChar() == KeyEvent.VK_BACK_SPACE || e.getKeyChar() == KeyEvent.VK_TAB) {
                triY2Fld.setEditable(true);
            } else if(e.getKeyChar() == '.') {
                String checker = triY2Fld.getText();
                int counter = 0;
                for(int i = 0; i < checker.length(); i++) {
                    if(checker.charAt(i) == '.') {
                        counter++;
                        if(counter > 0) {
                            e.consume();
                            triY2Fld.setEditable(false);
                            Toolkit.getDefaultToolkit().beep();
                        }
                    }
                }
            } else {
                triY2Fld.setEditable(false);
                Toolkit.getDefaultToolkit().beep();
            }
        }

        //y3
        if(e.getSource() == triY3Fld) {
            if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9' || e.getKeyChar() == KeyEvent.VK_BACK_SPACE || e.getKeyChar() == KeyEvent.VK_TAB) {
                triY3Fld.setEditable(true);
            } else if (e.getKeyChar() == '.') {
                String checker = triY3Fld.getText();
                int counter = 0;
                for (int i = 0; i < checker.length(); i++) {
                    if (checker.charAt(i) == '.') {
                        counter++;
                        if (counter > 0) {
                            e.consume();
                            triY3Fld.setEditable(false);
                            Toolkit.getDefaultToolkit().beep();
                        }
                    }
                }
            } else {
                triY3Fld.setEditable(false);
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }


    @Override
    public void keyReleased(KeyEvent e) {

    }
}

