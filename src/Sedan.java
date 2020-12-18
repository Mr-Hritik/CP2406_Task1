import java.awt.*;

public class Sedan extends Car{
    Sedan(Road road){
        super(road);
        width = 31;
        height = 13;
    }
    public void paintMeHorizontal(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(xPosition, yPosition, width, height);
    }
    public void paintMeVertical(Graphics g){
        g.setColor(Color.BLUE);
        g.fillRect(xPosition, yPosition, width, height);
    }
}