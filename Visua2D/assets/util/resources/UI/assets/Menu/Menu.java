package Visua2D.assets.util.resources.UI.assets.Menu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Automatic Generation Project - Author
 * Project Name: GeoMath-2D~3D
 * Author: ARCHISMAN NATH on 5/17/2021 in 4:41 PM
 */
public class Menu extends JFrame implements ActionListener {

    //TODO implement a progress bar

    private JFrame windowFrame = new JFrame();
    private JButton startApp = new JButton("Start Application");
    private JLabel[] startLabels = {new JLabel("Aegean 2D Mathematics Engine"),
            new JLabel("Developed by Archisman Nath and Daniel Kayali in the JAVA Programming Language")};

    Font roboto = new Font("Arial Black", Font.BOLD, 35);


    public Menu() {
        ImageIcon img = new ImageIcon("src/Aegean2DMath/Images/GeoMathImage.jpg");
        windowFrame.setSize(750, 600);
        windowFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        windowFrame.setResizable(false);
        windowFrame.getContentPane().setBackground(new Color(245, 238, 234));
        windowFrame.setTitle("Menu Screen");
        windowFrame.setIconImage(img.getImage());
        windowFrame.setLayout(null);
        setVisible();

        //Setting our labels
        setFirstStartLbl();
        setSecondStartLbl();
    }

    public void setFirstStartLbl() {
        startLabels[0].setBounds(40, 280, 650, 60);
        startLabels[0].setFont(roboto);
        startLabels[0].setForeground(Color.BLACK);
        startLabels[0].setVerticalAlignment(SwingConstants.CENTER);
        startLabels[0].setHorizontalAlignment(SwingConstants.CENTER);
        windowFrame.add(startLabels[0]);
    }

    public void setSecondStartLbl() {
        startLabels[1].setBounds(55, 343, 630, 50);
        startLabels[1].setFont(new Font("Cambria", Font.ITALIC + Font.BOLD, 16));
        startLabels[1].setForeground(Color.BLACK);
        windowFrame.add(startLabels[1]);
    }

    public void setVisible() {
        windowFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
