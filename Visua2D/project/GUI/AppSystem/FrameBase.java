package Visua2D.project.GUI.AppSystem;

import Visua2D.assets.util.resources.UI.assets.Components.AppColors;
import Visua2D.assets.util.resources.UI.theme.ThemeWindow;
import Visua2D.assets.util.resources.URL.UtilityURL;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

/**
 * Automatic Generation Project - Author
 * Project Name: GeoMath-2D~3D
 * Author: ARCHISMAN NATH on 5/17/2021 in 8:53 AM
 */
public class FrameBase extends JFrame implements ActionListener {

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

    public FrameBase() {

        jMenuBar = new JMenuBar();
        File = new JMenu("File");
        preferencesMenu = new JMenu("Preferences");
        Options = new JMenu("Options");

        jMenuBar.add(File);
        jMenuBar.add(preferencesMenu);

        File.add(Options);

        exitMenuItem = new JMenuItem("Exit", new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("EXIT_IMAGE_ICON-removebg-preview.png"))));
        exitMenuItem.addActionListener(this);
        Options.add(exitMenuItem);

        changeTheme = new JMenu("UI Options");
        preferencesMenu.add(changeTheme);

        changeThemeItem = new JMenuItem("Change UI Theme", new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("UITheme-removebg-preview.png"))));
        changeThemeItem.addActionListener(this);
        changeTheme.add(changeThemeItem);

        Help = new JMenu("Help");
        jMenuBar.add(Help);

        Contact = new JMenuItem("App Info", new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("contact-removebg-preview.png"))));
        Contact.addActionListener(this);
        Help.add(Contact);

        Info = new JMenu("Other Info");
        Help.add(Info);

        Version = new JMenuItem("Version", new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("Vers_Info-removebg-preview.png"))));
        Version.addActionListener(this);
        Info.add(Version);

        ImageIcon img = new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("brickchang-removebg-preview (2).png")));
        this.setIconImage(img.getImage());
        this.setSize(1542,828);
        this.setTitle("Visua 2D GMI"); // working Title
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
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

        if(e.getSource() == Contact) {
            //make sure to make repos public or else this link won't work for other people
            UtilityURL.openWebpage("https://github.com/Nebulax418/Visua2D");
            UtilityURL.openWebpage("https://github.com/Xpliot/Visua-2D");
        }

        if(e.getSource() == Version) {
            UtilityURL.openWebpage("https://707493.wixsite.com/version");
        }
    }
    //Paint methods
}
