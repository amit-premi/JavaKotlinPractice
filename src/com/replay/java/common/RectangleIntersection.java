package com.replay.java.common;

/**
 * Created by Amit PREMI on 25-Nov-18.
 */
public class RectangleIntersection {

    public static void main(String[] args) {
        Point l1 = new Point(0, 10);
        Point r1 = new Point(10, 0);
        Point l2 = new Point(15, 25);
        Point r2 = new Point(25, 15);

        Rectangle rectFirst = new Rectangle(l1, r1);
        Rectangle rectSecond = new Rectangle(l2, r2);

        System.out.println("Rectangle's will Intersect TRUE/FALSE: " + isRectangleIntersect(rectFirst, rectSecond));
    }

    private static boolean isRectangleIntersect(Rectangle recFirst, Rectangle recSecond) {
        return recFirst.rightBottom.x_axis >= recSecond.leftTop.x_axis && recFirst.leftTop.x_axis <= recSecond.rightBottom.x_axis &&
                recFirst.rightBottom.y_axis <= recSecond.leftTop.y_axis && recFirst.leftTop.y_axis >= recSecond.rightBottom.y_axis;
    }

    static class Point {
        int x_axis;
        int y_axis;

        private Point(int x, int y) {
            this.x_axis = x;
            this.y_axis = y;
        }
    }

    static class Rectangle {
        Point leftTop;
        Point rightBottom;

        private Rectangle(Point leftT, Point rightB) {
            this.leftTop = leftT;
            this.rightBottom = rightB;
        }
    }
}
