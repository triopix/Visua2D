package Visua2D.assets.util.resources.Shape.Graphics;

import com.bric.colorpicker.ColorPickerDialog;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CircleOrEllipse extends JComponent implements ActionListener, ChangeListener {

    public static int theWidth;
    public static Color color;
    public static int theHeight;

    public CircleOrEllipse(int width, int height) {
        CircleOrEllipse.theWidth = width;
        CircleOrEllipse.theHeight = height;
    }

    public void setColor(Color colorOfCircle) {
        color = colorOfCircle;
    }

    public static void setWidth(double width) {
        CircleOrEllipse.theWidth = (int) width;
    }

    public static void setHeight(double height) {
        theHeight = (int) height;
    }

    public static double getTheWidth() {
        return theWidth;
    }

    public static double getTheHeight() {
        return theHeight;
    }

    public Color getColor() {
        return color;
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        Graphics2D g2d = (Graphics2D) graphics;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //Draws the rounded panel with borders.
        graphics.setColor(getColor());
        g2d.fillOval(0, 0, theWidth, theHeight);
//            graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); //paint border
//
    }

    public void changeColorOfTheCircle() {
        Color color = ColorPickerDialog.showDialog(null, Color.WHITE, true);
        this.setColor(color);
        repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void stateChanged(ChangeEvent e) {

    }
}

