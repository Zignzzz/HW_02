import java.awt.Graphics;
import java.awt.Image;
public class AvatarClockDB extends AvatarClock {
	public void paint(Graphics g){
		Image image = createImage(800,1000);
		Graphics offscreen = image.getGraphics();
		super.paint(offscreen);
		g.drawImage(image,0,0,this);
	}
	public void update(Graphics g){
		paint(g);
	}
}
