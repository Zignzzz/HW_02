import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class Avatar extends Applet{
	public void paint(Graphics g){
		Color skin = new Color(224,177,132);
		Color mouth = new Color(185,124,109);
		Color hair = new Color(45,34,30);
		this.setSize(800, 1000);
		g.setColor(hair);
		g.fillOval(205,120,380,380); //Hair
		g.fillRoundRect(207,300, 376, 300, 100, 100); //Hair
		g.setColor(skin);
		g.fillOval(250, 150, 290, 380); //face
		g.setColor(Color.white);
		g.drawString("ZIGN", 520, 550);
		//ear
		g.setColor(skin);
		g.fillArc(238,315,45,65,90,180);
		g.fillArc(510,315,45,65,90,-180);
		
		g.setColor(hair);//front hair
		int[] x1 = {230,450,300};
		int[] y1 = {360,140,150};
		g.fillPolygon(x1, y1, 3 );
		int[] x2 = {380,580,520};
		int[] y2 = {140,350,170};
		g.fillPolygon(x2, y2, 3);
		
		//eye
		g.setColor(Color.white);
		g.fillOval(310,300,60,40);
		g.fillOval(440,300,60,40);
		g.setColor(Color.black);
		g.fillOval(315,305,30,30);
		g.fillOval(445,305,30,30);
		g.setColor(Color.white);
		
		//g.fillOval(315,305,10,10);
		//g.fillOval(445,305,10,10);
		g.setColor(hair);
		//eyebrow
		g.fillArc(302, 280, 60, 14, 0, 180);
		g.fillArc(432, 280, 60, 14, 0, 180);
		
		//nose
		//int[] x3 = {300,300,310};
		//int[] y3 = {350,365,375};
		//g.fillPolygon(x3, y3, 3);
		
		g.drawArc(390, 360, 20, 40, 110, 190);
		
		
		//mouth
		g.setColor(mouth);
		g.drawArc(350, 410, 100, 40, 0, -180);
		
		//tongue
	}
}
