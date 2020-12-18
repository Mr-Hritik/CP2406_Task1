import java.awt.*;

public class Bus extends Car {
    Bus(Road road){
        super(road);
        width = 46;
        height = 16;
    }
    public void paintMeHorizontal(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(xPosition, yPosition, width, height);
    }
    public void paintMeVertical(Graphics g){
        g.setColor(Color.GREEN);
        g.fillRect(xPosition, yPosition, width, height);
    }
}