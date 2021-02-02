package com.company;

import javax.swing.*;
import java.awt.*;

public class ChessTest extends Canvas {
    public void paint(Graphics g) {
        ChessBoard chessboard = new ChessBoard();
        int side = 40;
        int coordX = 0, coordY = 0;
        Color[] colors = {Color.GREEN, Color.WHITE};

        for (int i = 0; i < chessboard.getCHESSBOARD().length; i++){
            int tmp = i % 2;
            for (int j = 0; j < chessboard.getCHESSBOARD().length; j++){
                chessboard.fill(new Rectangle(new Coordinates(coordX, coordY),
                        colors[tmp], true, side), i, j);
                tmp =  tmp == 1 ? 0 : 1;
                coordX += 42;

                chessboard.getChessboardRectangle(i, j).draw(g);
                System.out.println(chessboard.getChessboardRectangle(i, j).speak());

            }
            coordX = 0;
            coordY += 42;
        }
        System.out.println("Amount of rectangles: " + Rectangle.getCOUNT());
    }

    public static void main(String[] args) {
        ChessTest canvas = new ChessTest();
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(canvas);
        frame.setVisible(true);
    }

}
