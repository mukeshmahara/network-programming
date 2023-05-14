package com.mukeshmahara.networkprogramming;
import java.awt.*;
import java.applet.*;
public class AppleteLifeCycle extends Applet {
    // Java Program to Make An Applet

// Importing required classes from packages



        public void init()
        {
            setBackground(Color.black);
            setForeground(Color.yellow);
        }
        public void paint(Graphics g)
        {
            g.drawString("Welcome", 100, 100);
        }
    }

