package draw;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collections;

public class DrawGraphics {
    BouncingBox box;
    BouncingBox box2;
    BouncingBox box3;
    ArrayList<BouncingBox> paint = new ArrayList<>();
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box = new BouncingBox(200, 300, Color.RED);
        box2 = new BouncingBox(350, 150, Color.BLUE);
        box3 = new BouncingBox(400, 250, Color.GREEN);
//        paint.add(box);
//        paint.add(box2);
//        paint.add(box3);
        Collections.addAll(paint, box, box2, box3); //更简洁的写法
//        box.setMovementVector(0,-1);
//        box2.setMovementVector(0,-1);
//        box3.setMovementVector(0,-1);
        for (BouncingBox b : paint) {
            b.setMovementVector(0,-1);
        } //更简洁的写法


//        for (int i = 0; i < paint.size(); i++) {
//            paint.get(i).setMovementVector(0,-1);
//        }    不使用增强型for语句的写法：
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawRoundRect(200,200,25,25,25,25);
        surface.drawRect(50, 60, 25, 25);
        surface.drawArc(100,100,30,30,240,170);
        for (BouncingBox box : paint) {
            box.draw(surface);
        }

    }

} 