package Visua2D.assets.util.resources.Shape.Graphics;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.util.Objects;

//this is for the circle and ellipse
public class CircleInfoFrame extends JFrame {

    public static JTextArea infoTextArea = new JTextArea();

    public CircleInfoFrame() {
        this.setSize(650, 650);
        ImageIcon img = new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("brickchang-removebg-preview (2).png")));
        this.setLocation(450, 70);
        this.setTitle("Circle Info");
        this.setIconImage(img.getImage());
        this.getContentPane().setBackground(Color.GRAY);
        this.setLayout(new FlowLayout());

        infoTextArea.setBounds(50, 50, 600, 600);
        infoTextArea.setText("This circle/ellipse properties tab is used to incorporate the properties " +
                "of an ellipse or circle, based on the width and the height. " +
                "The user can define the width and the height - and the shape will AUTOMATICALLY resize " +
                ". More functions include calculating the area and the perimeter of a circle or ellipse " +
                "Another function includes specifying if the shape is either an ellipse or circle. " +
                "The area of an ellipse and a circle is very much different, so is the perimeter. " +
                "The area of a circle is pi r^2 - here r is defined by the width = dia = dia/2 = width/2 = radius " +
                "So in literal terms this means that the height and the width of a circle is the diameter and this is " +
                "where width/2 is equal to height/2 which is equal to diameter. " +
                "But for the case of an ellipse - we have to use the perimeter pi * a * b " +
                "where a is defined by the width / 2 and b is defined by the height / 2 " +
                "In fact - a circle is a special type of ellipse just like comparing to the analogy as a " +
                "square is a special type of rectangle." +
                "So this program can identify if the shape is an ellipse or not and will switch between the formulas " +
                "to achieve the desired - and absolutely accurate output. " +
                "Circle perimeter is derived through 2 * pi * r  - pi * dia - which can also be referred " +
                "to as pi * width/2 or pi * height/2 - FOR ONLY CIRCLES " +
                "the perimeter of the ellipse on the other hand is completely different " +
                "there are numerous formulas to calculate a perimeter of the ellipse - the most " +
                "accurate using integration and calculus or even finite series with sigma. " +
                "We have opted for the Ramanujan's approximation - Ramanujan was a indian mathematican " +
                "who was the most influential and created many new formulas and equations for shapes" +
                "His formula is used still for the best approximations without using integration and calculus " +
                "Please view this link: https://www.mathsisfun.com/geometry/ellipse-perimeter.html. " +
                "Info on how to implement this formula into java code is on our github page - " +
                "\nView the Math class defined on our " +
                "github page - you will find more info about the github in the menu bars above ");
        infoTextArea.setLineWrap(true);
        infoTextArea.setEditable(false);
        infoTextArea.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        infoTextArea.setFont(new Font("Arial", Font.PLAIN, 17));
        infoTextArea.setWrapStyleWord(true);


        this.add(infoTextArea);
        this.setVisible(true);
    }
}
