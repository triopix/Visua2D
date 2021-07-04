package Visua2D.assets.util.resources.URL;

import java.awt.*;
import java.net.URL;

public class UtilityURL {

    public static void openWebpage(String urlString) {
        try {
            Desktop.getDesktop().browse(new URL(urlString).toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
