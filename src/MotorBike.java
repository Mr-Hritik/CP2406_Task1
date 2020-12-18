import java.awt.*;

public class MotorBike extends Car {
    MotorBike(Road road){
        super(road);
        width = 15;
        height = 7;
    }
    public void paintMeHorizontal(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(xPosition, yPosition, width, height);
    }
    public void paintMeVertical(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(xPosition, yPosition, width, height);
    }
}