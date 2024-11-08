package aufgabenblatt06;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;

public class MyCircle {
    private float radius;

    public MyCircle(float radius) {
        this.radius = radius;
    }

    public void createPoints() {
        class Point {
            private float x;
            private float y;

            public Point(float x, float y) {
                this.x = x;
                this.y = y;
            }

            private boolean output(PrintWriter pw) {
                try {
                    pw.print("" + x + " ");
                    pw.println("" + y);
                } catch (Exception e) {
                    return false;
                }
                return true;
            }
        }
        ArrayList<Point> points = new ArrayList<>();
        for (int i = 0; i < 360; i++) {
            points.add(new Point((float) Math.sin(2 * Math.PI * i / 360) * radius,
                    (float) Math.cos(2 * Math.PI * i / 360) * radius));
        }

        File f = new File("C:\\Users\\krist\\Desktop\\plot.pl");
        try {
            PrintWriter pw = new PrintWriter(f);
            for (Point p : points) {
                p.output(pw);
                pw.flush();
            }
            pw.close();
        } catch (Exception e) {
            System.out.println("Error: no output created\n" + e);
        }


    }

}



