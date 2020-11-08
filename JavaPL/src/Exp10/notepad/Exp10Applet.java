/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Exp10;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Student
 */
public class Exp10Applet extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    public void paint(Graphics g) {

        int x[] = {50, 100, 150};
        int y[] = {100, 50, 100};
        int n = 3;
        g.setColor(Color.red);
        g.fillPolygon(x, y, n);
        g.setColor(Color.blue);
        g.fillRect(50, 100, 100, 100);

    }

}
// TODO overwrite start(), stop() and destroy() methods

/*<applet code="Exp10Applet.class" width="200" height="200">
</applet>*/