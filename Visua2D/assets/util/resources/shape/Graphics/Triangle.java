package Visua2D.assets.util.resources.shape.Graphics;

import com.bric.colorpicker.ColorPickerDialog;

import javax.swing.*;
import java.awt.*;

public class Triangle extends JComponent {

    public static Color triColor;

    public void setColor(Color colorOfTriangle) {
        triColor = colorOfTriangle;
    }

    public Color getTriColor() {
        return triColor;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int [] x = {50,100,0};
        int [] y = {0,100,100};
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(getTriColor());
        g.fillPolygon(x, y, 3);
    }

    public void changeColorOfTriangle() {
        Color color = ColorPickerDialog.showDialog(null, Color.WHITE, true);
        this.setColor(color);
        repaint();
    }
}
