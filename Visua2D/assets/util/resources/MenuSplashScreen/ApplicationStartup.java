package Visua2D.assets.util.resources.MenuSplashScreen;

import Visua2D.project.Manager.Application;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;
import java.util.Random;

public class ApplicationStartup {
    public static JFrame frame;
    JPanel backImgPanel = new JPanel();
    JLabel backgroundImage = new JLabel(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("Sscreen.jpg"))));
    JLabel versionLbl = new JLabel("  -  v1.0.0");
    JLabel changeTask = new JLabel();
    JProgressBar progressBar=new JProgressBar();

    public ApplicationStartup() {
        createGUI();
    }

    public void createGUI(){

        frame=new JFrame();
        frame.getContentPane().setLayout(null);
        frame.setUndecorated(true);
        frame.setSize(1146,758);
        frame.setIconImage(new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("brickchang-removebg-preview (2).png"))).getImage());
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        setBackImgPanel();
        addProgressBar();
        runningPBar();

    }

    public void setBackImgPanel() {
        backImgPanel.setBounds(0, 0, 1146, 756);
        frame.add(backImgPanel);

        backgroundImage.setBounds(0, 0, 1146, 756);
        backImgPanel.add(backgroundImage);

        versionLbl.setBounds(330, 652, 130, 30);
        versionLbl.setFont(new Font("Arial", Font.BOLD, 25));
        versionLbl.setForeground(Color.WHITE);
        backgroundImage.add(versionLbl);

        changeTask.setBounds(27, 708, 250, 30);
        changeTask.setFont(new Font("Segoe UI", Font.BOLD, 16));
        changeTask.setForeground(Color.WHITE);
        backgroundImage.add(changeTask);
    }

    public void addProgressBar(){
        progressBar.setBounds(0,743,1145,13);
        progressBar.setBorderPainted(true);
        progressBar.setStringPainted(false);
        progressBar.setBackground(Color.WHITE);
        progressBar.setForeground(Color.RED);
        progressBar.setValue(0);
        backgroundImage.add(progressBar);
    }

    public void runningPBar(){
        Random ran = new Random();
        int progress = 0;
        while( progress<=100)
        {
            try{
                Thread.sleep(ran.nextInt(250));
            }catch(Exception e){
                e.printStackTrace();
            }
            progress+=ran.nextInt(2);
            progressBar.setValue(progress);
            if(progress <= 20) {
                changeTask.setText("Preparing Resources... "+ progress + "%");
            } else if(progress <= 60) {
                changeTask.setText("Indexing Components... "+progress + "%");
            } else if(progress <= 80) {
                changeTask.setText("Compiling Sources... "+ progress + "%");
            } else if(progress <= 90) {
                changeTask.setText("Scanning Utilities... " + progress+"%");
            } else if(progress <= 93) {
                changeTask.setText("Indexing Complete... " + progress + "%");
            } else if(progress <= 96) {
                changeTask.setText("Setup Successful... "  + progress + "%");
            } else if(progress <= 100) {
                try {
                    changeTask.setText("Opening... "+progress+"%");
                    if(progress == 100) {
                        Thread.sleep(1000);
                        frame.dispose();
                        Application application = new Application();
                    }
                }catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}
