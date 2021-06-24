package Visua2D.assets.util.resources.UI.theme;

import Visua2D.assets.util.resources.UI.assets.Components.AppColors;
import Visua2D.project.GUI.AppSystem.BottomPanelGUI;
import Visua2D.project.GUI.AppSystem.ColorPalettePanel;
import Visua2D.project.GUI.AppSystem.SidePanelGUI;
import Visua2D.project.Manager.Application;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class ThemeWindow extends JFrame implements ActionListener {

    String[] themes = {"Heaven", "Midnight", "Ocean", "Lavender", "Variety", "Sunset"};
    public JComboBox chooseThemeComboBox = new JComboBox(themes);
    public JLabel ChooseThemeLbl = new JLabel("Choose Your Theme");

    public ThemeWindow() {
        this.setResizable(false);
        this.setTitle("Choose Theme");
        this.setSize(350, 190);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("UITheme-removebg-preview.png")));
        this.setLayout(null);
        this.setIconImage(img.getImage());
        this.getContentPane().setBackground(new Color(238, 238, 238));

        ChooseThemeLbl.setForeground(Color.BLACK);
        ChooseThemeLbl.setFont(new Font("Arial Black", Font.BOLD, 24));
        ChooseThemeLbl.setBounds(27, 26, 350, 30);
        this.add(ChooseThemeLbl);

        chooseThemeComboBox.setBounds(70,80, 170, 40);
        chooseThemeComboBox.setEditable(false);
        chooseThemeComboBox.setFont(new Font("Arial", Font.BOLD, 20));
        chooseThemeComboBox.addActionListener(this);
        this.add(chooseThemeComboBox);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(chooseThemeComboBox.getSelectedItem() == themes[0]) {
            //Change the theme to Heaven White Theme
            Application.bottomPanel.setBackground(AppColors.Serenity);
            Application.bottomPanel.setBorder(BottomPanelGUI.BlackLine);
            BottomPanelGUI.calculateAreaButton.setBackground(AppColors.Light_White);
            BottomPanelGUI.calculateAreaButton.setBorder(BorderFactory.createLineBorder(AppColors.Black, 1));
            BottomPanelGUI.calculateAreaButton.setForeground(AppColors.Black);
            BottomPanelGUI.calculatePCBtn.setBackground(AppColors.Light_White);
            BottomPanelGUI.calculatePCBtn.setBorder(BorderFactory.createLineBorder(AppColors.Variety_WHITE, 1));
            BottomPanelGUI.calculatePCBtn.setForeground(AppColors.Black);
            BottomPanelGUI.DimensionPanel.setBackground(AppColors.Serenity);
            BottomPanelGUI.DimensionPanel.setBorder(BorderFactory.createLineBorder(AppColors.Light_White, 2));
            BottomPanelGUI.LengthPanel.setBackground(AppColors.Serenity);
            BottomPanelGUI.LengthPanel.setBorder(BorderFactory.createLineBorder(AppColors.Light_White, 2));
            BottomPanelGUI.WidthPanel.setBackground(AppColors.Serenity);
            BottomPanelGUI.WidthPanel.setBorder(BorderFactory.createLineBorder(AppColors.Light_White, 2));
            BottomPanelGUI.CalPanel.setBackground(AppColors.Serenity);
            BottomPanelGUI.lengthlbl.setBackground(AppColors.Light_White);
            BottomPanelGUI.lengthlbl.setForeground(AppColors.Light_White);
            BottomPanelGUI.lengthInputfld.setBorder(BorderFactory.createLineBorder(AppColors.White, 1));
            BottomPanelGUI.lengthInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomPanelGUI.widthlbl.setForeground(AppColors.Light_White);
            BottomPanelGUI.widthInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Black, 1));
            BottomPanelGUI.widthInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomPanelGUI.CalcAreaPanel.setBackground(AppColors.Serenity);
            BottomPanelGUI.CalcAreaPanel.setBorder(BorderFactory.createLineBorder(AppColors.Variety_WHITE, 2));
            BottomPanelGUI.CalcPCPanel.setBackground(AppColors.Serenity);
            BottomPanelGUI.CalcPCPanel.setBorder(BorderFactory.createLineBorder(AppColors.Variety_WHITE, 2));
            BottomPanelGUI.AreaInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Black, 1));
            BottomPanelGUI.AreaInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomPanelGUI.PCInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Black, 1));
            BottomPanelGUI.PCInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomPanelGUI.UnitLabel.setForeground(AppColors.Variety_WHITE);
            BottomPanelGUI.unlabel.setForeground(AppColors.Crimson);
            BottomPanelGUI.un2Label.setForeground(AppColors.Crimson);
            BottomPanelGUI.clearButton.setBackground(AppColors.Light_White);
            BottomPanelGUI.clearButton.setForeground(AppColors.Black);

            //SIDE GUI
            Application.sidePanel.setBackground(AppColors.Serenity);
            SidePanelGUI.QuadButton.setBackground(AppColors.Light_White);
            SidePanelGUI.QuadButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SidePanelGUI.QuadButton.setForeground(AppColors.Black);
            SidePanelGUI.Trianglebutton.setBackground(AppColors.Light_White);
            SidePanelGUI.Trianglebutton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SidePanelGUI.Trianglebutton.setForeground(AppColors.Black);
            SidePanelGUI.EllipseButton.setForeground(AppColors.Black);
            SidePanelGUI.EllipseButton.setBackground(AppColors.Light_White);
            SidePanelGUI.CalculatorButton.setBackground(AppColors.Variety_Beige.darker());
            SidePanelGUI.CalculatorButton.setForeground(AppColors.White.brighter());
            SidePanelGUI.formulaPanel.setBackground(AppColors.Serenity);
            SidePanelGUI.formulaPanel.setBorder(BorderFactory.createLineBorder(AppColors.Variety_WHITE, 2));
            SidePanelGUI.TriangleRbtn.setBackground(AppColors.Variety_BLACK);
            SidePanelGUI.TriangleRbtn.setForeground(AppColors.Light_White);
            SidePanelGUI.OpenQuad.setBackground(AppColors.Variety_WHITE);
            SidePanelGUI.OpenQuad.setForeground(new Color(255, 255, 255));

            //ColorPalletePanel
            Application.colorPalettePanel.setBackground(AppColors.Midnight_Black.brighter().brighter().brighter());
            Application.colorPalettePanel.setBorder(BorderFactory.createLineBorder(AppColors.Variety_BLACK, 4));
            ColorPalettePanel.openColorChooser.setForeground(AppColors.Black);
            ColorPalettePanel.openColorChooser.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            ColorPalettePanel.openColorChooser.setBackground(AppColors.Light_White);
        }

        if(chooseThemeComboBox.getSelectedItem() == themes[1]) {

            //change the theme to midnight
            Application.bottomPanel.setBackground(AppColors.Midnight_Black);
            Application.bottomPanel.setBorder(BottomPanelGUI.BlackLine);
            BottomPanelGUI.calculateAreaButton.setBackground(AppColors.Midnight_Black);
            BottomPanelGUI.calculateAreaButton.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 1));
            BottomPanelGUI.calculateAreaButton.setForeground(AppColors.Variety_WHITE);
            BottomPanelGUI.calculatePCBtn.setBackground(AppColors.Midnight_Black);
            BottomPanelGUI.calculatePCBtn.setBorder(BorderFactory.createLineBorder(AppColors.Variety_WHITE, 1));
            BottomPanelGUI.calculatePCBtn.setForeground(AppColors.Variety_WHITE);
            BottomPanelGUI.DimensionPanel.setBackground(AppColors.Variety_BLACK);
            BottomPanelGUI.DimensionPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 2));
            BottomPanelGUI.LengthPanel.setBackground(AppColors.Midnight_Black);
            BottomPanelGUI.UnitLabel.setForeground(AppColors.Variety_WHITE);
            BottomPanelGUI.LengthPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 2));
            BottomPanelGUI.WidthPanel.setBackground(AppColors.Midnight_Black);
            BottomPanelGUI.WidthPanel.setBorder(BorderFactory.createLineBorder(AppColors.Variety_WHITE, 2));
            BottomPanelGUI.CalPanel.setBackground(AppColors.Variety_BLACK);
            BottomPanelGUI.lengthlbl.setBackground(AppColors.Midnight_Blue);
            BottomPanelGUI.lengthlbl.setForeground(AppColors.Variety_WHITE);
            BottomPanelGUI.lengthInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Variety_Misty_Gray, 1));
            BottomPanelGUI.lengthInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomPanelGUI.widthlbl.setForeground(AppColors.Variety_WHITE);
            BottomPanelGUI.widthInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Variety_Misty_Gray, 1));
            BottomPanelGUI.widthInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomPanelGUI.CalcAreaPanel.setBackground(AppColors.Midnight_Blue.darker());
            BottomPanelGUI.CalcAreaPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 2));
            BottomPanelGUI.CalcPCPanel.setBackground(AppColors.Midnight_Blue.darker());
            BottomPanelGUI.CalcPCPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 2));
            BottomPanelGUI.AreaInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Variety_Misty_Gray, 1));
            BottomPanelGUI.AreaInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomPanelGUI.PCInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Variety_Misty_Gray, 1));
            BottomPanelGUI.PCInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomPanelGUI.unlabel.setForeground(Color.RED);
            BottomPanelGUI.un2Label.setForeground(Color.RED);
            BottomPanelGUI.clearButton.setBackground(AppColors.Midnight_White);
            BottomPanelGUI.clearButton.setForeground(AppColors.Black);

            //SIDE GUI
            Application.sidePanel.setBackground(AppColors.Midnight_Blue.darker().darker());
            SidePanelGUI.QuadButton.setBackground(AppColors.Midnight_Gray);
            SidePanelGUI.QuadButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SidePanelGUI.QuadButton.setForeground(AppColors.Variety_WHITE);
            SidePanelGUI.Trianglebutton.setBackground(AppColors.Midnight_Gray);
            SidePanelGUI.Trianglebutton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SidePanelGUI.Trianglebutton.setForeground(AppColors.Variety_WHITE);
            SidePanelGUI.EllipseButton.setBackground(AppColors.Midnight_Gray);
            SidePanelGUI.EllipseButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SidePanelGUI.EllipseButton.setForeground(AppColors.Variety_WHITE);
            SidePanelGUI.CalculatorButton.setBackground(AppColors.Midnight_White);
            SidePanelGUI.CalculatorButton.setForeground(AppColors.Midnight_Black);
            SidePanelGUI.formulaPanel.setBackground(AppColors.Midnight_Black);
            SidePanelGUI.formulaPanel.setBorder(BorderFactory.createLineBorder(AppColors.Variety_WHITE, 2));
            SidePanelGUI.TriangleRbtn.setBackground(AppColors.Variety_BLACK);
            SidePanelGUI.TriangleRbtn.setForeground(AppColors.Variety_WHITE);
            SidePanelGUI.OpenQuad.setBackground(AppColors.Variety_WHITE);
            SidePanelGUI.OpenQuad.setForeground(new Color(255, 255, 255));

            //ColorPalletePanel
            Application.colorPalettePanel.setBackground(AppColors.Midnight_Black.brighter().brighter().brighter());
            Application.colorPalettePanel.setBorder(BorderFactory.createLineBorder(AppColors.Variety_BLACK, 4));
            ColorPalettePanel.openColorChooser.setForeground(AppColors.Variety_WHITE);
            ColorPalettePanel.openColorChooser.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            ColorPalettePanel.openColorChooser.setBackground(AppColors.Variety_Aqua_Navy_Blue.darker());
        }

        if(chooseThemeComboBox.getSelectedItem() == themes[2]) {
            //ocean theme
            Application.bottomPanel.setBackground(AppColors.Variety_BLACK);
            Application.bottomPanel.setBorder(BottomPanelGUI.BlackLine);
            BottomPanelGUI.calculateAreaButton.setBackground(AppColors.Black);
            BottomPanelGUI.calculateAreaButton.setBorder(BorderFactory.createLineBorder(AppColors.White, 1));
            BottomPanelGUI.UnitLabel.setForeground(AppColors.Variety_WHITE);
            BottomPanelGUI.calculateAreaButton.setForeground(AppColors.White);
            BottomPanelGUI.calculatePCBtn.setBackground(AppColors.Black);
            BottomPanelGUI.calculatePCBtn.setBorder(BorderFactory.createLineBorder(AppColors.White, 1));
            BottomPanelGUI.calculatePCBtn.setForeground(AppColors.White);
            BottomPanelGUI.DimensionPanel.setBackground(AppColors.Misty_blue);
            BottomPanelGUI.DimensionPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 2));
            BottomPanelGUI.LengthPanel.setBackground(AppColors.Misty_blue);
            BottomPanelGUI.LengthPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 2));
            BottomPanelGUI.WidthPanel.setBackground(AppColors.Misty_blue);
            BottomPanelGUI.WidthPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 2));
            BottomPanelGUI.CalPanel.setBackground(AppColors.Misty_blue);
            BottomPanelGUI.lengthlbl.setBackground(AppColors.Blue_Grotto);
            BottomPanelGUI.lengthlbl.setForeground(AppColors.Variety_WHITE);
            BottomPanelGUI.lengthInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Variety_Misty_Gray, 1));
            BottomPanelGUI.lengthInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomPanelGUI.widthlbl.setForeground(AppColors.White);
            BottomPanelGUI.widthInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Variety_Misty_Gray, 1));
            BottomPanelGUI.widthInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomPanelGUI.CalcAreaPanel.setBackground(AppColors.Misty_blue);
            BottomPanelGUI.CalcAreaPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 2));
            BottomPanelGUI.CalcPCPanel.setBackground(AppColors.Misty_blue);
            BottomPanelGUI.CalcPCPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 2));
            BottomPanelGUI.AreaInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Black, 1));
            BottomPanelGUI.AreaInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomPanelGUI.PCInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Black, 1));
            BottomPanelGUI.PCInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomPanelGUI.unlabel.setForeground(AppColors.White);
            BottomPanelGUI.un2Label.setForeground(AppColors.White);
            BottomPanelGUI.clearButton.setForeground(AppColors.White);
            BottomPanelGUI.clearButton.setBackground(AppColors.Black);

            //Side GUI
            Application.sidePanel.setBackground(AppColors.Misty_blue);
            SidePanelGUI.QuadButton.setBackground(AppColors.Cool_Gray);
            SidePanelGUI.QuadButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SidePanelGUI.QuadButton.setForeground(AppColors.White);
            SidePanelGUI.Trianglebutton.setBackground(AppColors.Cool_Gray);
            SidePanelGUI.Trianglebutton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SidePanelGUI.Trianglebutton.setForeground(AppColors.White);
            SidePanelGUI.EllipseButton.setBackground(AppColors.Cool_Gray);
            SidePanelGUI.EllipseButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SidePanelGUI.EllipseButton.setForeground(AppColors.White);
            SidePanelGUI.CalculatorButton.setBackground(AppColors.Cool_Gray);
            SidePanelGUI.CalculatorButton.setForeground(AppColors.White);
            SidePanelGUI.formulaPanel.setBackground(AppColors.Cool_Gray);
            SidePanelGUI.formulaPanel.setBorder(BorderFactory.createLineBorder(AppColors.White, 2));
            SidePanelGUI.TriangleRbtn.setBackground(AppColors.White);
            SidePanelGUI.TriangleRbtn.setForeground(AppColors.White);
            SidePanelGUI.OpenQuad.setBackground(AppColors.White);
            SidePanelGUI.OpenQuad.setForeground(new Color(255, 255, 255));

            //ColorPalettePanel Changes
            Application.colorPalettePanel.setBackground(AppColors.Misty_blue);
            Application.colorPalettePanel.setBorder(BorderFactory.createLineBorder(AppColors.Black, 4));
            ColorPalettePanel.openColorChooser.setForeground(AppColors.White);
            ColorPalettePanel.openColorChooser.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            ColorPalettePanel.openColorChooser.setBackground(AppColors.Variety_Aqua_Navy_Blue);


        }

        if(chooseThemeComboBox.getSelectedItem() == themes[3]) {
            //change to lavender theme

            //BOTTOM GUI
            Application.bottomPanel.setBackground(AppColors.Midnight_Black);
            Application.bottomPanel.setBorder(BottomPanelGUI.BlackLine);
            BottomPanelGUI.calculateAreaButton.setBackground(AppColors.Lavender_Pink.brighter());
            BottomPanelGUI.calculateAreaButton.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_Black, 1));
            BottomPanelGUI.calculateAreaButton.setForeground(AppColors.Midnight_Black);
            BottomPanelGUI.calculatePCBtn.setBackground(AppColors.Lavender_Pink.brighter());
            BottomPanelGUI.calculatePCBtn.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_Black, 1));
            BottomPanelGUI.calculatePCBtn.setForeground(AppColors.Midnight_Black);
            BottomPanelGUI.UnitLabel.setForeground(AppColors.Midnight_Black);
            BottomPanelGUI.DimensionPanel.setBackground(AppColors.Midnight_White);
            BottomPanelGUI.DimensionPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 2));
            BottomPanelGUI.LengthPanel.setBackground(AppColors.Midnight_Gray);
            BottomPanelGUI.LengthPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_Black, 2));
            BottomPanelGUI.WidthPanel.setBackground(AppColors.Midnight_Gray);
            BottomPanelGUI.WidthPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_Black, 2));
            BottomPanelGUI.CalPanel.setBackground(AppColors.Lavender_Purple);
            BottomPanelGUI.lengthlbl.setBackground(AppColors.Midnight_Blue);
            BottomPanelGUI.lengthlbl.setForeground(AppColors.Midnight_White);
            BottomPanelGUI.lengthInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Variety_Misty_Gray, 1));
            BottomPanelGUI.lengthInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomPanelGUI.widthlbl.setForeground(AppColors.Midnight_White);
            BottomPanelGUI.widthInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Variety_Misty_Gray, 1));
            BottomPanelGUI.widthInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomPanelGUI.CalcAreaPanel.setBackground(AppColors.Lavender_Purple);
            BottomPanelGUI.CalcAreaPanel.setBorder(BorderFactory.createLineBorder(AppColors.Lavender_Dark_Blue, 2));
            BottomPanelGUI.CalcPCPanel.setBackground(AppColors.Lavender_Purple);
            BottomPanelGUI.CalcPCPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_Black, 2));
            BottomPanelGUI.AreaInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Variety_Misty_Gray, 1));
            BottomPanelGUI.AreaInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomPanelGUI.PCInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Variety_Misty_Gray, 1));
            BottomPanelGUI.PCInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomPanelGUI.unlabel.setForeground(Color.RED);
            BottomPanelGUI.un2Label.setForeground(Color.RED);
            BottomPanelGUI.clearButton.setBackground(AppColors.Lavender_Blue.darker().darker().darker());
            BottomPanelGUI.clearButton.setForeground(AppColors.White);

            //SIDE GUI
            Application.sidePanel.setBackground(AppColors.Lavender_Golden_Yellow);
            SidePanelGUI.QuadButton.setBackground(AppColors.Lavender_Blue);
            SidePanelGUI.QuadButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SidePanelGUI.QuadButton.setForeground(AppColors.Variety_WHITE);
            SidePanelGUI.Trianglebutton.setBackground(AppColors.Lavender_Blue);
            SidePanelGUI.Trianglebutton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SidePanelGUI.Trianglebutton.setForeground(AppColors.Variety_WHITE);
            SidePanelGUI.EllipseButton.setBackground(AppColors.Lavender_Blue);
            SidePanelGUI.EllipseButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SidePanelGUI.EllipseButton.setForeground(AppColors.Variety_WHITE);
            SidePanelGUI.CalculatorButton.setBackground(AppColors.Lavender_Pink.darker());
            SidePanelGUI.CalculatorButton.setForeground(AppColors.Midnight_White.brighter());
            SidePanelGUI.formulaPanel.setBackground(AppColors.Lavender_Dark_Blue);
            SidePanelGUI.formulaPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_Black, 2));
            SidePanelGUI.TriangleRbtn.setBackground(AppColors.Variety_BLACK);
            SidePanelGUI.TriangleRbtn.setForeground(AppColors.Variety_WHITE);
            SidePanelGUI.OpenQuad.setBackground(AppColors.Variety_WHITE);
            SidePanelGUI.OpenQuad.setForeground(new Color(255, 255, 255));

            //ColorPalletePanel
            Application.colorPalettePanel.setBackground(AppColors.Lavender_Purple);
            Application.colorPalettePanel.setBorder(BorderFactory.createLineBorder(AppColors.Variety_BLACK, 4));
            ColorPalettePanel.openColorChooser.setForeground(AppColors.Variety_WHITE);
            ColorPalettePanel.openColorChooser.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            ColorPalettePanel.openColorChooser.setBackground(AppColors.Lavender_Blue.darker());

        }


        if (chooseThemeComboBox.getSelectedItem() == themes[4]) {

            //change to Variety Theme

            //BottomGUI
            Application.bottomPanel.setBackground(AppColors.Variety_BLACK);
            Application.bottomPanel.setBorder(BottomPanelGUI.BlackLine);
            BottomPanelGUI.calculateAreaButton.setBackground(AppColors.Variety_BLACK);
            BottomPanelGUI.UnitLabel.setForeground(AppColors.Variety_WHITE);
            BottomPanelGUI.calculateAreaButton.setBorder(BorderFactory.createLineBorder(AppColors.Variety_WHITE, 1));
            BottomPanelGUI.calculateAreaButton.setForeground(AppColors.Variety_WHITE);
            BottomPanelGUI.calculatePCBtn.setBackground(AppColors.Variety_BLACK);
            BottomPanelGUI.calculatePCBtn.setBorder(BorderFactory.createLineBorder(AppColors.Variety_WHITE, 1));
            BottomPanelGUI.calculatePCBtn.setForeground(AppColors.Variety_WHITE);
            BottomPanelGUI.DimensionPanel.setBackground(AppColors.Variety_BLACK);
            BottomPanelGUI.DimensionPanel.setBorder(BorderFactory.createLineBorder(AppColors.Variety_BLACK, 2));
            BottomPanelGUI.LengthPanel.setBackground(AppColors.Variety_Deep_Gray);
            BottomPanelGUI.LengthPanel.setBorder(BorderFactory.createLineBorder(AppColors.Variety_WHITE, 2));
            BottomPanelGUI.WidthPanel.setBackground(AppColors.Variety_Deep_Gray);
            BottomPanelGUI.WidthPanel.setBorder(BorderFactory.createLineBorder(AppColors.Variety_WHITE, 2));
            BottomPanelGUI.CalPanel.setBackground(AppColors.Variety_BLACK);
            BottomPanelGUI.lengthlbl.setBackground(AppColors.Variety_Misty_Gray);
            BottomPanelGUI.lengthlbl.setForeground(AppColors.Variety_WHITE);
            BottomPanelGUI.lengthInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Variety_Misty_Gray, 1));
            BottomPanelGUI.lengthInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomPanelGUI.widthlbl.setForeground(AppColors.Variety_WHITE);
            BottomPanelGUI.widthInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Variety_Misty_Gray, 1));
            BottomPanelGUI.widthInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomPanelGUI.CalcAreaPanel.setBackground(AppColors.Variety_Deep_Red);
            BottomPanelGUI.CalcAreaPanel.setBorder(BorderFactory.createLineBorder(AppColors.Variety_BLACK, 2));
            BottomPanelGUI.CalcPCPanel.setBackground(AppColors.Variety_BLUE);
            BottomPanelGUI.CalcPCPanel.setBorder(BorderFactory.createLineBorder(AppColors.Variety_BLACK, 2));
            BottomPanelGUI.AreaInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Variety_Misty_Gray, 1));
            BottomPanelGUI.AreaInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomPanelGUI.PCInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Variety_Misty_Gray, 1));
            BottomPanelGUI.PCInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomPanelGUI.unlabel.setForeground(AppColors.Variety_Deep_Red);
            BottomPanelGUI.un2Label.setForeground(AppColors.Variety_Deep_Red);
            BottomPanelGUI.clearButton.setForeground(AppColors.Variety_BLACK);
            BottomPanelGUI.clearButton.setBackground(AppColors.Variety_WHITE);

            //Side GUI
            Application.sidePanel.setBackground(AppColors.Variety_Misty_Gray);
            SidePanelGUI.QuadButton.setBackground(AppColors.Variety_Pink);
            SidePanelGUI.QuadButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SidePanelGUI.QuadButton.setForeground(AppColors.Variety_BLACK);
            SidePanelGUI.Trianglebutton.setBackground(AppColors.Variety_Pink);
            SidePanelGUI.Trianglebutton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SidePanelGUI.Trianglebutton.setForeground(AppColors.Variety_BLACK);
            SidePanelGUI.EllipseButton.setBackground(AppColors.Variety_Pink);
            SidePanelGUI.EllipseButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SidePanelGUI.EllipseButton.setForeground(AppColors.Variety_BLACK);
            SidePanelGUI.CalculatorButton.setBackground(AppColors.Variety_Deep_Magenta);
            SidePanelGUI.CalculatorButton.setForeground(AppColors.Variety_WHITE);
            SidePanelGUI.formulaPanel.setBackground(AppColors.Variety_Bottle_Green);
            SidePanelGUI.formulaPanel.setBorder(BorderFactory.createLineBorder(AppColors.Variety_WHITE, 2));
            SidePanelGUI.TriangleRbtn.setBackground(AppColors.Variety_BLACK);
            SidePanelGUI.TriangleRbtn.setForeground(AppColors.Variety_WHITE);
            SidePanelGUI.OpenQuad.setBackground(AppColors.Variety_WHITE);
            SidePanelGUI.OpenQuad.setForeground(new Color(255, 255, 255));

            //ColorPalletePanel
            Application.colorPalettePanel.setBackground(AppColors.Variety_Beige);
            Application.colorPalettePanel.setBorder(BorderFactory.createLineBorder(AppColors.Variety_BLACK, 4));
            ColorPalettePanel.openColorChooser.setForeground(AppColors.Variety_WHITE);
            ColorPalettePanel.openColorChooser.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            ColorPalettePanel.openColorChooser.setBackground(AppColors.Variety_Aqua_Navy_Blue);


        }

        if(chooseThemeComboBox.getSelectedItem() == themes[5]) {

            //change to sunset
            Application.bottomPanel.setBackground(AppColors.Variety_BLACK);
            Application.bottomPanel.setBorder(BottomPanelGUI.BlackLine);
            BottomPanelGUI.UnitLabel.setForeground(AppColors.Variety_WHITE);
            BottomPanelGUI.calculateAreaButton.setBackground(AppColors.Mimosa);
            BottomPanelGUI.calculateAreaButton.setBorder(BorderFactory.createLineBorder(AppColors.Sunset_Gray, 1));
            BottomPanelGUI.calculateAreaButton.setForeground(AppColors.Sunset_Gray);
            BottomPanelGUI.calculatePCBtn.setBackground(AppColors.Mimosa);
            BottomPanelGUI.calculatePCBtn.setBorder(BorderFactory.createLineBorder(AppColors.Sunset_Gray, 1));
            BottomPanelGUI.calculatePCBtn.setForeground(AppColors.Sunset_Gray);
            BottomPanelGUI.DimensionPanel.setBackground(AppColors.Sunset_Gray);
            BottomPanelGUI.DimensionPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 2));
            BottomPanelGUI.LengthPanel.setBackground(AppColors.Sunset_Gray);
            BottomPanelGUI.LengthPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 2));
            BottomPanelGUI.WidthPanel.setBackground(AppColors.Sunset_Gray);
            BottomPanelGUI.WidthPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 2));
            BottomPanelGUI.CalPanel.setBackground(AppColors.Sunset_Gray);
            BottomPanelGUI.lengthlbl.setBackground(AppColors.Sunset_Gray);
            BottomPanelGUI.lengthlbl.setForeground(AppColors.White);
            BottomPanelGUI.lengthInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Variety_Misty_Gray, 1));
            BottomPanelGUI.lengthInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomPanelGUI.widthlbl.setForeground(AppColors.White);
            BottomPanelGUI.widthInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Variety_Misty_Gray, 1));
            BottomPanelGUI.widthInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomPanelGUI.CalcAreaPanel.setBackground(AppColors.Sunset_Gray);
            BottomPanelGUI.CalcAreaPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 2));
            BottomPanelGUI.CalcPCPanel.setBackground(AppColors.Sunset_Gray);
            BottomPanelGUI.CalcPCPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 2));
            BottomPanelGUI.AreaInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Sunset_Gray, 1));
            BottomPanelGUI.AreaInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomPanelGUI.PCInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Sunset_Gray, 1));
            BottomPanelGUI.PCInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomPanelGUI.unlabel.setForeground(AppColors.Sunset_Gray);
            BottomPanelGUI.un2Label.setForeground(AppColors.Sunset_Gray);
            BottomPanelGUI.clearButton.setForeground(AppColors.Sunset_Gray);
            BottomPanelGUI.clearButton.setBackground(AppColors.Mimosa);

            //SideGUI
            Application.sidePanel.setBackground(AppColors.Sunset_Gray);
            SidePanelGUI.QuadButton.setBackground(AppColors.Mimosa);
            SidePanelGUI.QuadButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SidePanelGUI.QuadButton.setForeground(AppColors.Black);
            SidePanelGUI.Trianglebutton.setBackground(AppColors.Mimosa);
            SidePanelGUI.Trianglebutton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SidePanelGUI.Trianglebutton.setForeground(AppColors.Black);
            SidePanelGUI.EllipseButton.setBackground(AppColors.Mimosa);
            SidePanelGUI.EllipseButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SidePanelGUI.EllipseButton.setForeground(AppColors.Black);
            SidePanelGUI.CalculatorButton.setBackground(AppColors.Mimosa);
            SidePanelGUI.CalculatorButton.setForeground(AppColors.Black);
            SidePanelGUI.formulaPanel.setBackground(AppColors.Sunset_Gray);
            SidePanelGUI.formulaPanel.setBorder(BorderFactory.createLineBorder(AppColors.White, 2));
            SidePanelGUI.TriangleRbtn.setBackground(AppColors.White);
            SidePanelGUI.TriangleRbtn.setForeground(AppColors.White);
            SidePanelGUI.OpenQuad.setBackground(AppColors.White);
            SidePanelGUI.OpenQuad.setForeground(AppColors.White);

            //ColorPalletePanel
            Application.colorPalettePanel.setBackground(AppColors.Sunset_Gray);
            Application.colorPalettePanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 4));
            ColorPalettePanel.openColorChooser.setForeground(AppColors.Black);
            ColorPalettePanel.openColorChooser.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            ColorPalettePanel.openColorChooser.setBackground(AppColors.Mimosa);
        }
    }
}
