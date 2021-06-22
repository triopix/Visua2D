package Visua2D.project.GUI.AppSystem;

import Visua2D.assets.util.resources.UI.assets.Components.AppColors;
import Visua2D.assets.util.resources.UI.theme.ThemeWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Automatic Generation Project - Author
 * Project Name: GeoMath-2D~3D
 * Author: ARCHISMAN NATH on 5/17/2021 in 8:53 AM
 */
public class VisuaFrame extends JFrame implements ActionListener {

    public JMenuBar jMenuBar;
    public JMenu File, preferencesMenu;
    public JMenuItem Options;
    public JMenuItem exitMenuItem;
    public JMenuItem changeThemeItem;
    public JMenuItem Contact;
    public JMenuItem Version;
    public JMenu Help;
    public JMenu Info;
    public JMenu changeTheme;

    public VisuaFrame() {

        jMenuBar = new JMenuBar();
        File = new JMenu("File");
        preferencesMenu = new JMenu("Preferences");
        Options = new JMenu("Options");

        jMenuBar.add(File);
        jMenuBar.add(preferencesMenu);

        File.add(Options);

        exitMenuItem = new JMenuItem("Exit", new ImageIcon("src/Visua2D/assets/util/resources/UI/assets/Images/EXIT_IMAGE_ICON-removebg-preview.png"));
        exitMenuItem.addActionListener(this);
        Options.add(exitMenuItem);

        changeTheme = new JMenu("UI Options");
        preferencesMenu.add(changeTheme);

        changeThemeItem = new JMenuItem("Change UI Theme", new ImageIcon("src/Visua2D/assets/util/resources/UI/assets/Images/UITheme-removebg-preview.png"));
        changeThemeItem.addActionListener(this);
        changeTheme.add(changeThemeItem);

        Help = new JMenu("Help");
        jMenuBar.add(Help);

        Contact = new JMenuItem("App Info", new ImageIcon("src/Visua2D/assets/util/resources/UI/assets/Images/contact-removebg-preview.png"));
        Contact.addActionListener(this);
        Help.add(Contact);

        Info = new JMenu("Other Info");
        Help.add(Info);

        Version = new JMenuItem("Version", new ImageIcon("src/Visua2D/assets/util/resources/UI/assets/Images/Vers_Info-removebg-preview.png"));
        Info.add(Version);

        ImageIcon img = new ImageIcon("src/Visua2D/assets/util/resources/UI/assets/Images/brickchang-removebg-preview (2).png");
        this.setIconImage(img.getImage());
        this.setSize(1542,828);
        this.setTitle("Visua"); // working Title
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.getContentPane().setBackground(AppColors.FRAME_WHITE);
        this.setJMenuBar(jMenuBar);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == exitMenuItem) {
            Toolkit.getDefaultToolkit().beep();
            if (JOptionPane.showConfirmDialog(exitMenuItem, "Are you sure you want to exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
                System.exit(0);
            }
        }

        if(e.getSource() == changeThemeItem) {
            ThemeWindow themeWindow = new ThemeWindow();
            themeWindow.setDefaultCloseOperation(HIDE_ON_CLOSE);
        }
    }
    //Paint methods

}
