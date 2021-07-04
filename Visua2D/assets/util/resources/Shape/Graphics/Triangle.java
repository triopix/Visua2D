package Visua2D.assets.util.resources.Shape.Graphics;

import com.bric.colorpicker.ColorPickerDialog;

import javax.swing.*;
import java.awt.*;

public class Triangle extends JComponent {

    public static Color triColor;
    public static int[] triX;
    public static int[] triY;

    public Triangle(int[] arrX, int[] arrY) {
        triX = arrX;
        triY = arrY;
    }

    //setters
    public void setTriX(int[] arrX) {
        triX = arrX;
    }

    public void setTriY(int[] arrY) {
        triY = arrY;
    }

    public void setColor(Color colorOfTriangle) {
        triColor = colorOfTriangle;
    }


    //getters

    public Color getTriColor() {
        return triColor;
    }

    public int[] getTriX() {
        return triX;
    }

    public int[] getTriY() {
        return triY;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(getTriColor());
        g.fillPolygon(triX, triY, 3);
    }

    public void changeColorOfTriangle() {
        Color color = ColorPickerDialog.showDialog(null, Color.WHITE, true);
        this.setColor(color);
        repaint();
    }
}
