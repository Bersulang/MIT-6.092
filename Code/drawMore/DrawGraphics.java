package drawMore;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    Bouncer movingSprite;
    StraightMover unmovingSprite;
//    ArrayList<Bouncer> paint = new ArrayList<Bouncer>();
//    ArrayList<StraightMover> paintMore = new ArrayList<StraightMover>();
    ArrayList<Mover> moving= new ArrayList<Mover>();
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        Rectangle box = new Rectangle(15, 20, Color.RED);
        Rectangle box3 = new Rectangle(15,20,Color.cyan);
        Oval box2 = new Oval(20,20,Color.yellow);
        Oval box4 = new Oval(20,20, Color.GREEN);
        moving.add(movingSprite = new Bouncer(100, 170, box));
        moving.add(movingSprite = new Bouncer(30, 270, box2));
        moving.add(unmovingSprite = new StraightMover(90,300,box3));
        moving.add(unmovingSprite = new StraightMover(140,70,box4));
        for (Mover m : moving) {
            m.setMovementVector(3,1);
        }
/*        for (StraightMover n : paintMore) {
            n.setMovementVector(3,1);
        }*/

    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        for (Mover b : moving) {
            b.draw(surface);
        }
/*        for (StraightMover m : paintMore) {
            m.draw(surface);
        }*/
    }
}
