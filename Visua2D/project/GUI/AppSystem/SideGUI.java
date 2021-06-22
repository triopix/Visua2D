package Visua2D.project.GUI.AppSystem;

import Visua2D.assets.util.resources.UI.assets.Components.AppColors;
import Visua2D.assets.util.resources.UI.assets.Components.AppButton;
import Visua2D.project.GUI.ShapeCalSystem.TriangleAreaGUI;
import Visua2D.project.GUI.ShapeCalSystem.TriTypePerimeterGUI;
import Visua2D.project.GUI.ShapeCalSystem.QuadTypeGUI;
import Visua2D.assets.util.resources.shape.GraphicsManager.ShapePanel;


import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Automatic Generation Project - Author
 * Project Name: GeoMath-2D~3D
 * Author: ARCHISMAN NATH on 5/19/2021 in 10:15 AM
 */
public class SideGUI extends JPanel implements ActionListener {


    public static final JButton CalculatorButton = new AppButton();
    public static final AppButton EllipseButton = new AppButton();
    public static final AppButton QuadButton = new AppButton();
    public static final AppButton Trianglebutton = new AppButton();
    public static final JPanel formulaPanel = new JPanel();
    public static final JCheckBox TriangleRbtn = new JCheckBox("Triangle Area/Pm.");
    public static final JCheckBox OpenQuad = new JCheckBox("Quad Calculator");
    public static final JCheckBox TriPerimeterTriType = new JCheckBox("Triangle Pm./Type");
    public static final Font SidePanelFont = new Font("Segoe UI", Font.BOLD, 22);


    public static JLabel quadImgLbl = new JLabel();
    public static JLabel ellipseImgLbl = new JLabel();
    public static JLabel triLblShower = new JLabel();


    public SideGUI() {
        this.setBackground(AppColors.Variety_Misty_Gray);
        this.setPreferredSize(new Dimension(225, 800));
        this.setLayout(new FlowLayout());
        setSquareButton();
    }

    public void setSquareButton(){
        QuadButton.setPreferredSize(new Dimension(150,50));
        QuadButton.setBackground(AppColors.Variety_Pink);
        QuadButton.setText("QUAD");
        QuadButton.setFont(SidePanelFont);
        QuadButton.addActionListener(this);
        QuadButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));


        quadImgLbl.setPreferredSize(new Dimension(80, 80));
        quadImgLbl.setText("");
        quadImgLbl.setIcon(new ImageIcon("src/Visua2D/assets/util/resources/UI/assets/Images/brikchas.png"));
        this.add(quadImgLbl);

        ellipseImgLbl.setPreferredSize(new Dimension(70, 70));
        ellipseImgLbl.setText("");
        ellipseImgLbl.setIcon(new ImageIcon("src/Visua2D/assets/util/resources/UI/assets/Images/circleEllipseimgsw.png"));
        this.add(ellipseImgLbl);

        triLblShower.setPreferredSize(new Dimension(60, 60));
        triLblShower.setText("");
        triLblShower.setIcon(new ImageIcon("src/Visua2D/assets/util/resources/UI/assets/Images/oiosw-removebg-preview.png"));
        this.add(triLblShower);

        this.add(QuadButton);
        setEllipse();
        setTriangleButton();
        setCalulatorFrame();
    }

    public void setTriangleButton(){

        Trianglebutton.setPreferredSize(new Dimension(150,50));
        Trianglebutton.setBackground(AppColors.Variety_Pink);
        Trianglebutton.setText("TRIANGLE");
        Trianglebutton.setFont(SidePanelFont);
        Trianglebutton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        Trianglebutton.addActionListener(this);
        this.add(Trianglebutton);
    }

    public void setEllipse(){

        EllipseButton.setPreferredSize(new Dimension(150,50));
        EllipseButton.setBackground(AppColors.Variety_Pink);
        EllipseButton.setText("ELLIPSE");
        EllipseButton.setFont(SidePanelFont);
        EllipseButton.addActionListener(this);
        EllipseButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        this.add(EllipseButton);
    }

    public void setCalulatorFrame(){
        CalculatorButton.setPreferredSize(new Dimension(150,50));
        CalculatorButton.setBackground(AppColors.Variety_Deep_Magenta);
        CalculatorButton.setFont(SidePanelFont);
        CalculatorButton.setForeground(AppColors.Variety_WHITE);
        CalculatorButton.setFocusable(false);
        CalculatorButton.addActionListener(this);
        CalculatorButton.setText("Calculator");
        this.add(CalculatorButton);
        setFormulaPanel();
    }

    public void setFormulaPanel(){
        formulaPanel.setBackground(AppColors.Variety_Bottle_Green);
        formulaPanel.setPreferredSize(new Dimension(200, 225));
        formulaPanel.setLayout(new FlowLayout());
        formulaPanel.setBorder(BorderFactory.createLineBorder(AppColors.Variety_WHITE, 2));
        this.add(formulaPanel);
        setOptionsRadioBtn();

    }

    public void setOptionsRadioBtn(){
        TriangleRbtn.setPreferredSize(new Dimension(150,50));
        TriangleRbtn.setBackground(AppColors.Variety_BLACK);
        TriangleRbtn.setForeground(AppColors.Variety_WHITE);
        TriangleRbtn.setFont(new Font("Segoe UI", Font.BOLD, 14));
        TriangleRbtn.setFocusable(false);
        TriangleRbtn.setContentAreaFilled(false);
        TriangleRbtn.addActionListener(this);
        formulaPanel.add(TriangleRbtn);

        setOpenQuadCalculator();
        setTriAnotherButton();

    }

    public void setOpenQuadCalculator() {
        OpenQuad.setPreferredSize(new Dimension(150,50));
        OpenQuad.setBackground(AppColors.Variety_WHITE);
        OpenQuad.setForeground(new Color(255, 255, 255));
        OpenQuad.setFont(new Font("Segoe UI", Font.BOLD, 16));
        OpenQuad.setFocusable(false);
        OpenQuad.setContentAreaFilled(false);
        OpenQuad.addActionListener(this);
        formulaPanel.add(OpenQuad);

    }

    public void setTriAnotherButton() {
        TriPerimeterTriType.setPreferredSize(new Dimension(150,50));
        TriPerimeterTriType.setBackground(AppColors.Variety_WHITE);
        TriPerimeterTriType.setForeground(new Color(255, 255, 255));
        TriPerimeterTriType.setFont(new Font("Segoe UI", Font.BOLD, 13));
        TriPerimeterTriType.setFocusable(false);
        TriPerimeterTriType.setContentAreaFilled(false);
        TriPerimeterTriType.addActionListener(this);
        formulaPanel.add(TriPerimeterTriType);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == CalculatorButton) {
            BaseCalc calc = new BaseCalc();
            calc.frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        }

        if (e.getSource() == QuadButton) {
            ShapePanel.CalEllipseCircleBtn.setVisible(false);
            ShapePanel.roundPane.setVisible(false);
            ShapePanel.triangle.setVisible(false);
            ShapePanel.yLabelChanger.setVisible(true);
            ShapePanel.yLabelShower.setVisible(true);
            ShapePanel.ySlider.setVisible(true);
            ShapePanel.areaLblForQuad.setVisible(true);
            ShapePanel.xLabelChanger.setVisible(true);
            ShapePanel.xLabelShower.setVisible(true);
            ShapePanel.xSlider.setVisible(true);
            ShapePanel.heightLblShow.setVisible(true);
            ShapePanel.heightLblChange.setVisible(true);
            ShapePanel.circleOrEllipse.setVisible(false);
            ShapePanel.quadDisplay.setVisible(true);
            ShapePanel.quadDisplay.setBackground(Color.BLACK);
            ShapePanel.widthSlider.setVisible(true);
            ShapePanel.widthLblChange.setVisible(true);
            ShapePanel.widthLblShow.setVisible(true);
            ShapePanel.heightSlider.setVisible(true);
            ShapePanel.perimeterForQuad.setVisible(true);
        }

        if(e.getSource() == EllipseButton) {
            ShapePanel.CalEllipseCircleBtn.setVisible(true);
            ShapePanel.roundPane.setVisible(true);
            ShapePanel.perimeterForQuad.setVisible(false);
            ShapePanel.triangle.setVisible(false);
            ShapePanel.yLabelChanger.setVisible(false);
            ShapePanel.yLabelShower.setVisible(false);
            ShapePanel.ySlider.setVisible(false);
            ShapePanel.areaLblForQuad.setVisible(false);
            ShapePanel.xLabelChanger.setVisible(false);
            ShapePanel.xLabelShower.setVisible(false);
            ShapePanel.xSlider.setVisible(false);
            ShapePanel.heightLblShow.setVisible(false);
            ShapePanel.heightLblChange.setVisible(false);
            ShapePanel.heightSlider.setVisible(false);
            ShapePanel.widthSlider.setVisible(false);
            ShapePanel.widthLblChange.setVisible(false);
            ShapePanel.widthLblShow.setVisible(false);
            ShapePanel.quadDisplay.setVisible(false);
            ShapePanel.circleOrEllipse.setVisible(true);
            ShapePanel.circleOrEllipse.changeColorOfTheCircle();
        }

        if(e.getSource() == Trianglebutton) {
            ShapePanel.CalEllipseCircleBtn.setVisible(false);
            ShapePanel.roundPane.setVisible(false);
            ShapePanel.perimeterForQuad.setVisible(false);
            ShapePanel.yLabelChanger.setVisible(false);
            ShapePanel.yLabelShower.setVisible(false);
            ShapePanel.ySlider.setVisible(false);
            ShapePanel.areaLblForQuad.setVisible(false);
            ShapePanel.xLabelChanger.setVisible(false);
            ShapePanel.xLabelShower.setVisible(false);
            ShapePanel.xSlider.setVisible(false);
            ShapePanel.heightLblShow.setVisible(false);
            ShapePanel.heightLblChange.setVisible(false);
            ShapePanel.heightSlider.setVisible(false);
            ShapePanel.widthSlider.setVisible(false);
            ShapePanel.widthLblChange.setVisible(false);
            ShapePanel.widthLblShow.setVisible(false);
            ShapePanel.quadDisplay.setVisible(false);
            ShapePanel.circleOrEllipse.setVisible(false);
            ShapePanel.triangle.setVisible(true);
            ShapePanel.triangle.changeColorOfTriangle();
        }

        if(TriangleRbtn.isSelected()){
            TriangleAreaGUI triangle = new TriangleAreaGUI();
            triangle.TriangleFrame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        }

        if(OpenQuad.isSelected()) {
            QuadTypeGUI quadTypeGUI = new QuadTypeGUI();
            quadTypeGUI.frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        }

        if(TriPerimeterTriType.isSelected()) {
            TriTypePerimeterGUI triEx = new TriTypePerimeterGUI();
            triEx.frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        }
    }
}