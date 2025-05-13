package drawMore;

import java.awt.Graphics;

public interface Mover {
    void setMovementVector(int x, int y);

    void draw(Graphics g);
}
