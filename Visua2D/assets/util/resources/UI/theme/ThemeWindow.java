package Visua2D.assets.util.resources.UI.theme;

import Visua2D.assets.util.resources.UI.assets.Components.AppColors;
import Visua2D.project.GUI.AppSystem.BottomGUI;
import Visua2D.project.GUI.AppSystem.ColorPalettePanel;
import Visua2D.project.GUI.AppSystem.SideGUI;
import Visua2D.project.Manager.Application;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThemeWindow extends JFrame implements ActionListener {

    String[] themes = {"Heaven", "Midnight", "Ocean", "Variety", "Sunset"};
    public JComboBox chooseThemeComboBox = new JComboBox(themes);
    public JLabel ChooseThemeLbl = new JLabel("Choose Your Theme");

    public ThemeWindow() {
        this.setResizable(false);
        this.setTitle("Choose Theme");
        this.setSize(350, 300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon("src/Visua2D/assets/util/resources/UI/assets/Images/UITheme-removebg-preview.png");
        this.setLayout(null);
        this.setIconImage(img.getImage());
        this.getContentPane().setBackground(new Color(238, 238, 238));

        ChooseThemeLbl.setForeground(Color.BLACK);
        ChooseThemeLbl.setFont(new Font("Arial Black", Font.BOLD, 26));
        ChooseThemeLbl.setBounds(15, 30, 350, 50);
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
        }

        if(chooseThemeComboBox.getSelectedItem() == themes[1]) {

            //change the theme to midnight
            Application.bottomPanel.setBackground(AppColors.Midnight_Black);
            Application.bottomPanel.setBorder(BottomGUI.BlackLine);
            BottomGUI.calculateAreaButton.setBackground(AppColors.Midnight_Black);
            BottomGUI.calculateAreaButton.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 1));
            BottomGUI.calculateAreaButton.setForeground(AppColors.Midnight_White);
            BottomGUI.calculatePCBtn.setBackground(AppColors.Midnight_Black);
            BottomGUI.calculatePCBtn.setBorder(BorderFactory.createLineBorder(AppColors.Variety_WHITE, 1));
            BottomGUI.calculatePCBtn.setForeground(AppColors.Variety_WHITE);
            BottomGUI.DimensionPanel.setBackground(AppColors.Variety_BLACK);
            BottomGUI.DimensionPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 2));
            BottomGUI.LengthPanel.setBackground(AppColors.Midnight_Black);
            BottomGUI.LengthPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 2));
            BottomGUI.WidthPanel.setBackground(AppColors.Midnight_Black);
            BottomGUI.WidthPanel.setBorder(BorderFactory.createLineBorder(AppColors.Variety_WHITE, 2));
            BottomGUI.CalPanel.setBackground(AppColors.Variety_BLACK);
            BottomGUI.lengthlbl.setBackground(AppColors.Midnight_Blue);
            BottomGUI.lengthlbl.setForeground(AppColors.Midnight_White);
            BottomGUI.lengthInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Variety_Misty_Gray, 1));
            BottomGUI.lengthInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomGUI.widthlbl.setForeground(AppColors.Midnight_White);
            BottomGUI.widthInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Variety_Misty_Gray, 1));
            BottomGUI.widthInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomGUI.CalcAreaPanel.setBackground(AppColors.Midnight_Blue);
            BottomGUI.CalcAreaPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 2));
            BottomGUI.CalcPCPanel.setBackground(AppColors.Midnight_Blue);
            BottomGUI.CalcPCPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 2));
            BottomGUI.AreaInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Variety_Misty_Gray, 1));
            BottomGUI.AreaInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomGUI.PCInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Variety_Misty_Gray, 1));
            BottomGUI.PCInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomGUI.unlabel.setForeground(Color.RED);
            BottomGUI.un2Label.setForeground(Color.RED);
            BottomGUI.clearButton.setBackground(AppColors.Midnight_White);
            BottomGUI.clearButton.setForeground(AppColors.Black);

            //SIDE GUI
            Application.sidePanel.setBackground(AppColors.Midnight_Blue.darker().darker());
            SideGUI.QuadButton.setBackground(AppColors.Midnight_Gray);
            SideGUI.QuadButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SideGUI.QuadButton.setForeground(AppColors.Variety_WHITE);
            SideGUI.Trianglebutton.setBackground(AppColors.Midnight_Gray);
            SideGUI.Trianglebutton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SideGUI.Trianglebutton.setForeground(AppColors.Variety_WHITE);
            SideGUI.EllipseButton.setBackground(AppColors.Midnight_Gray);
            SideGUI.EllipseButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SideGUI.EllipseButton.setForeground(AppColors.Variety_WHITE);
            SideGUI.CalculatorButton.setBackground(AppColors.Midnight_White);
            SideGUI.CalculatorButton.setForeground(AppColors.Midnight_Black);
            SideGUI.formulaPanel.setBackground(AppColors.Midnight_Black);
            SideGUI.formulaPanel.setBorder(BorderFactory.createLineBorder(AppColors.Variety_WHITE, 2));
            SideGUI.TriangleRbtn.setBackground(AppColors.Variety_BLACK);
            SideGUI.TriangleRbtn.setForeground(AppColors.Variety_WHITE);
            SideGUI.OpenQuad.setBackground(AppColors.Variety_WHITE);
            SideGUI.OpenQuad.setForeground(new Color(255, 255, 255));

            //ColorPalletePanel
            Application.colorPalettePanel.setBackground(AppColors.Midnight_Black.brighter().brighter().brighter());
            Application.colorPalettePanel.setBorder(BorderFactory.createLineBorder(AppColors.Variety_BLACK, 4));
            ColorPalettePanel.openColorChooser.setForeground(AppColors.Variety_WHITE);
            ColorPalettePanel.openColorChooser.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            ColorPalettePanel.openColorChooser.setBackground(AppColors.Variety_Aqua_Navy_Blue.darker());
        }

        if(chooseThemeComboBox.getSelectedItem() == themes[2]) {
            Application.bottomPanel.setBackground(AppColors.Variety_BLACK);
            Application.bottomPanel.setBorder(BottomGUI.BlackLine);
            BottomGUI.calculateAreaButton.setBackground(AppColors.Black);
            BottomGUI.calculateAreaButton.setBorder(BorderFactory.createLineBorder(AppColors.White, 1));
            BottomGUI.calculateAreaButton.setForeground(AppColors.White);
            BottomGUI.calculatePCBtn.setBackground(AppColors.Black);
            BottomGUI.calculatePCBtn.setBorder(BorderFactory.createLineBorder(AppColors.White, 1));
            BottomGUI.calculatePCBtn.setForeground(AppColors.White);
            BottomGUI.DimensionPanel.setBackground(AppColors.Misty_blue);
            BottomGUI.DimensionPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 2));
            BottomGUI.LengthPanel.setBackground(AppColors.Misty_blue);
            BottomGUI.LengthPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 2));
            BottomGUI.WidthPanel.setBackground(AppColors.Misty_blue);
            BottomGUI.WidthPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 2));
            BottomGUI.CalPanel.setBackground(AppColors.Misty_blue);
            BottomGUI.lengthlbl.setBackground(AppColors.Blue_Grotto);
            BottomGUI.lengthlbl.setForeground(AppColors.Variety_WHITE);
            BottomGUI.lengthInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Variety_Misty_Gray, 1));
            BottomGUI.lengthInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomGUI.widthlbl.setForeground(AppColors.White);
            BottomGUI.widthInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Variety_Misty_Gray, 1));
            BottomGUI.widthInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomGUI.CalcAreaPanel.setBackground(AppColors.Misty_blue);
            BottomGUI.CalcAreaPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 2));
            BottomGUI.CalcPCPanel.setBackground(AppColors.Misty_blue);
            BottomGUI.CalcPCPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 2));
            BottomGUI.AreaInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Black, 1));
            BottomGUI.AreaInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomGUI.PCInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Black, 1));
            BottomGUI.PCInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomGUI.unlabel.setForeground(AppColors.White);
            BottomGUI.un2Label.setForeground(AppColors.White);
            BottomGUI.clearButton.setForeground(AppColors.White);
            BottomGUI.clearButton.setBackground(AppColors.Black);

            //Side GUI
            Application.sidePanel.setBackground(AppColors.Misty_blue);
            SideGUI.QuadButton.setBackground(AppColors.Cool_Gray);
            SideGUI.QuadButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SideGUI.QuadButton.setForeground(AppColors.White);
            SideGUI.Trianglebutton.setBackground(AppColors.Cool_Gray);
            SideGUI.Trianglebutton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SideGUI.Trianglebutton.setForeground(AppColors.White);
            SideGUI.EllipseButton.setBackground(AppColors.Cool_Gray);
            SideGUI.EllipseButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SideGUI.EllipseButton.setForeground(AppColors.White);
            SideGUI.CalculatorButton.setBackground(AppColors.Cool_Gray);
            SideGUI.CalculatorButton.setForeground(AppColors.White);
            SideGUI.formulaPanel.setBackground(AppColors.Cool_Gray);
            SideGUI.formulaPanel.setBorder(BorderFactory.createLineBorder(AppColors.White, 2));
            SideGUI.TriangleRbtn.setBackground(AppColors.White);
            SideGUI.TriangleRbtn.setForeground(AppColors.White);
            SideGUI.OpenQuad.setBackground(AppColors.White);
            SideGUI.OpenQuad.setForeground(new Color(255, 255, 255));

            //ColorPalettePanel Changes
            Application.colorPalettePanel.setBackground(AppColors.Misty_blue);
            Application.colorPalettePanel.setBorder(BorderFactory.createLineBorder(AppColors.Black, 4));
            ColorPalettePanel.openColorChooser.setForeground(AppColors.White);
            ColorPalettePanel.openColorChooser.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            ColorPalettePanel.openColorChooser.setBackground(AppColors.Variety_Aqua_Navy_Blue);


        }

        if (chooseThemeComboBox.getSelectedItem() == themes[3]) {

            //change to Variety Theme - Archy

            //BottomGUI
            Application.bottomPanel.setBackground(AppColors.Variety_BLACK);
            Application.bottomPanel.setBorder(BottomGUI.BlackLine);
            BottomGUI.calculateAreaButton.setBackground(AppColors.Variety_BLACK);
            BottomGUI.calculateAreaButton.setBorder(BorderFactory.createLineBorder(AppColors.Variety_WHITE, 1));
            BottomGUI.calculateAreaButton.setForeground(AppColors.Variety_WHITE);
            BottomGUI.calculatePCBtn.setBackground(AppColors.Variety_BLACK);
            BottomGUI.calculatePCBtn.setBorder(BorderFactory.createLineBorder(AppColors.Variety_WHITE, 1));
            BottomGUI.calculatePCBtn.setForeground(AppColors.Variety_WHITE);
            BottomGUI.DimensionPanel.setBackground(AppColors.Variety_BLACK);
            BottomGUI.DimensionPanel.setBorder(BorderFactory.createLineBorder(AppColors.Variety_BLACK, 2));
            BottomGUI.LengthPanel.setBackground(AppColors.Variety_Deep_Gray);
            BottomGUI.LengthPanel.setBorder(BorderFactory.createLineBorder(AppColors.Variety_WHITE, 2));
            BottomGUI.WidthPanel.setBackground(AppColors.Variety_Deep_Gray);
            BottomGUI.WidthPanel.setBorder(BorderFactory.createLineBorder(AppColors.Variety_WHITE, 2));
            BottomGUI.CalPanel.setBackground(AppColors.Variety_BLACK);
            BottomGUI.lengthlbl.setBackground(AppColors.Variety_Misty_Gray);
            BottomGUI.lengthlbl.setForeground(AppColors.Variety_WHITE);
            BottomGUI.lengthInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Variety_Misty_Gray, 1));
            BottomGUI.lengthInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomGUI.widthlbl.setForeground(AppColors.Variety_WHITE);
            BottomGUI.widthInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Variety_Misty_Gray, 1));
            BottomGUI.widthInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomGUI.CalcAreaPanel.setBackground(AppColors.Variety_Deep_Red);
            BottomGUI.CalcAreaPanel.setBorder(BorderFactory.createLineBorder(AppColors.Variety_BLACK, 2));
            BottomGUI.CalcPCPanel.setBackground(AppColors.Variety_BLUE);
            BottomGUI.CalcPCPanel.setBorder(BorderFactory.createLineBorder(AppColors.Variety_BLACK, 2));
            BottomGUI.AreaInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Variety_Misty_Gray, 1));
            BottomGUI.AreaInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomGUI.PCInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Variety_Misty_Gray, 1));
            BottomGUI.PCInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomGUI.unlabel.setForeground(AppColors.Variety_Deep_Red);
            BottomGUI.un2Label.setForeground(AppColors.Variety_Deep_Red);
            BottomGUI.clearButton.setForeground(AppColors.Variety_BLACK);
            BottomGUI.clearButton.setBackground(AppColors.Variety_WHITE);

            //Side GUI
            Application.sidePanel.setBackground(AppColors.Variety_Misty_Gray);
            SideGUI.QuadButton.setBackground(AppColors.Variety_Pink);
            SideGUI.QuadButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SideGUI.QuadButton.setForeground(AppColors.Variety_BLACK);
            SideGUI.Trianglebutton.setBackground(AppColors.Variety_Pink);
            SideGUI.Trianglebutton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SideGUI.Trianglebutton.setForeground(AppColors.Variety_BLACK);
            SideGUI.EllipseButton.setBackground(AppColors.Variety_Pink);
            SideGUI.EllipseButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SideGUI.EllipseButton.setForeground(AppColors.Variety_BLACK);
            SideGUI.CalculatorButton.setBackground(AppColors.Variety_Deep_Magenta);
            SideGUI.CalculatorButton.setForeground(AppColors.Variety_WHITE);
            SideGUI.formulaPanel.setBackground(AppColors.Variety_Bottle_Green);
            SideGUI.formulaPanel.setBorder(BorderFactory.createLineBorder(AppColors.Variety_WHITE, 2));
            SideGUI.TriangleRbtn.setBackground(AppColors.Variety_BLACK);
            SideGUI.TriangleRbtn.setForeground(AppColors.Variety_WHITE);
            SideGUI.OpenQuad.setBackground(AppColors.Variety_WHITE);
            SideGUI.OpenQuad.setForeground(new Color(255, 255, 255));

            //ColorPalletePanel
            Application.colorPalettePanel.setBackground(AppColors.Variety_Beige);
            Application.colorPalettePanel.setBorder(BorderFactory.createLineBorder(AppColors.Variety_BLACK, 4));
            ColorPalettePanel.openColorChooser.setForeground(AppColors.Variety_WHITE);
            ColorPalettePanel.openColorChooser.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            ColorPalettePanel.openColorChooser.setBackground(AppColors.Variety_Aqua_Navy_Blue);


        }

        if(chooseThemeComboBox.getSelectedItem() == themes[4]) {
            Application.bottomPanel.setBackground(AppColors.Variety_BLACK);
            Application.bottomPanel.setBorder(BottomGUI.BlackLine);
            BottomGUI.calculateAreaButton.setBackground(AppColors.Mimosa);
            BottomGUI.calculateAreaButton.setBorder(BorderFactory.createLineBorder(AppColors.Sunset_Gray, 1));
            BottomGUI.calculateAreaButton.setForeground(AppColors.Sunset_Gray);
            BottomGUI.calculatePCBtn.setBackground(AppColors.Mimosa);
            BottomGUI.calculatePCBtn.setBorder(BorderFactory.createLineBorder(AppColors.Sunset_Gray, 1));
            BottomGUI.calculatePCBtn.setForeground(AppColors.Sunset_Gray);
            BottomGUI.DimensionPanel.setBackground(AppColors.Sunset_Gray);
            BottomGUI.DimensionPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 2));
            BottomGUI.LengthPanel.setBackground(AppColors.Sunset_Gray);
            BottomGUI.LengthPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 2));
            BottomGUI.WidthPanel.setBackground(AppColors.Sunset_Gray);
            BottomGUI.WidthPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 2));
            BottomGUI.CalPanel.setBackground(AppColors.Sunset_Gray);
            BottomGUI.lengthlbl.setBackground(AppColors.Sunset_Gray);
            BottomGUI.lengthlbl.setForeground(AppColors.White);
            BottomGUI.lengthInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Variety_Misty_Gray, 1));
            BottomGUI.lengthInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomGUI.widthlbl.setForeground(AppColors.White);
            BottomGUI.widthInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Variety_Misty_Gray, 1));
            BottomGUI.widthInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomGUI.CalcAreaPanel.setBackground(AppColors.Sunset_Gray);
            BottomGUI.CalcAreaPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 2));
            BottomGUI.CalcPCPanel.setBackground(AppColors.Sunset_Gray);
            BottomGUI.CalcPCPanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 2));
            BottomGUI.AreaInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Sunset_Gray, 1));
            BottomGUI.AreaInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomGUI.PCInputfld.setBorder(BorderFactory.createLineBorder(AppColors.Sunset_Gray, 1));
            BottomGUI.PCInputfld.setCaretColor(AppColors.Variety_Misty_Gray);
            BottomGUI.unlabel.setForeground(AppColors.Sunset_Gray);
            BottomGUI.un2Label.setForeground(AppColors.Sunset_Gray);
            BottomGUI.clearButton.setForeground(AppColors.Sunset_Gray);
            BottomGUI.clearButton.setBackground(AppColors.Mimosa);

            //SideGUI
            Application.sidePanel.setBackground(AppColors.Sunset_Gray);
            SideGUI.QuadButton.setBackground(AppColors.Mimosa);
            SideGUI.QuadButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SideGUI.QuadButton.setForeground(AppColors.Black);
            SideGUI.Trianglebutton.setBackground(AppColors.Mimosa);
            SideGUI.Trianglebutton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SideGUI.Trianglebutton.setForeground(AppColors.Black);
            SideGUI.EllipseButton.setBackground(AppColors.Mimosa);
            SideGUI.EllipseButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            SideGUI.EllipseButton.setForeground(AppColors.Black);
            SideGUI.CalculatorButton.setBackground(AppColors.Mimosa);
            SideGUI.CalculatorButton.setForeground(AppColors.Black);
            SideGUI.formulaPanel.setBackground(AppColors.Sunset_Gray);
            SideGUI.formulaPanel.setBorder(BorderFactory.createLineBorder(AppColors.White, 2));
            SideGUI.TriangleRbtn.setBackground(AppColors.White);
            SideGUI.TriangleRbtn.setForeground(AppColors.White);
            SideGUI.OpenQuad.setBackground(AppColors.White);
            SideGUI.OpenQuad.setForeground(AppColors.White);

            //ColorPalletePanel
            Application.colorPalettePanel.setBackground(AppColors.Sunset_Gray);
            Application.colorPalettePanel.setBorder(BorderFactory.createLineBorder(AppColors.Midnight_White, 4));
            ColorPalettePanel.openColorChooser.setForeground(AppColors.Black);
            ColorPalettePanel.openColorChooser.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            ColorPalettePanel.openColorChooser.setBackground(AppColors.Mimosa);
        }
    }
}
