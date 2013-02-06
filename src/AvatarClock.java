import java.awt.*;
import java.util.Calendar;
import java.applet.Applet;

public class AvatarClock extends Avatar implements Runnable{
	protected Thread mainThread;
	protected int delay;
	
	public void init(){
		mainThread = null;
		delay = 1000;
	}
	public void start(){
		if(mainThread ==null){
			mainThread = new Thread(this);
			mainThread.start();
		}
	}
	public void run(){
		while(Thread.currentThread() == mainThread){
			repaint();
			try{
				Thread.currentThread().sleep(delay);
			}catch(InterruptedException e){}
		}
	}
	
	public void paintClock(Graphics g){
		int x1,y1;
		double p;
		for(int i=1; i<=60;i++){
			if(i%5!=0){
				p=i*0.10472;
				x1=(int)((320)*Math.cos(p))+390;
				y1=(int)((320)*Math.sin(p))+370;
				g.setColor(Color.gray);
				g.fillOval(x1-2,y1-2,4,4);
			}
			else{
				p=i*0.10472;
				x1=(int)((320)*Math.cos(p-Math.PI/2))+390;
				y1=(int)((320)*Math.sin(p-Math.PI/2))+370;
				//x1=(int)((320)*Math.cos(p-Math.PI/2))+390;
				//y1=(int)((320)*Math.sin(p-Math.PI/2))+370;
				g.setColor(Color.BLACK);
				//g.setFont(new Font("Times New Roman","15"));	
				g.drawString(i+"", x1-2, y1-2);
			}
		}
	}
	
	public void paint(Graphics g){
		Calendar c = Calendar.getInstance();
		int s = c.get(Calendar.SECOND);
		super.paint(g);	
		paintClock(g);
		
		//point movement
		double p,x1,y1,x2,y2,x3,y3,x4,y4;
		p=s*0.10472;
		x1=(int)((320)*Math.cos(p-Math.PI/2))+387;
		y1=(int)((320)*Math.sin(p-Math.PI/2))+367;
		x2=(int)((320)*Math.cos(p-Math.PI/2))+390;
		y2=(int)((320)*Math.sin(p-Math.PI/2))+370;
		//eye movement
		g.setColor(Color.white);
		x3=(int)((10)*Math.cos(p-Math.PI/2))+325;
		y3=(int)((10)*Math.sin(p-Math.PI/2))+315;
		g.fillOval((int)(x3-2),(int)(y3-2),10,10);
		x4=(int)((10)*Math.cos(p-Math.PI/2))+456;
		y4=(int)((10)*Math.sin(p-Math.PI/2))+315;
		g.fillOval((int)(x4-2),(int)(y4-2),10,10);
		g.setColor(Color.blue);
		if(s%5!=0){
		g.fillOval((int)(x1-2),(int)(y1-2),10,10);
		}else if(s%60==0){
		g.setColor(Color.blue);
		g.drawString(60+"",(int)(x2-2),(int)(y2-2));
		}
		else{
		g.setColor(Color.blue);
		g.drawString(s+"",(int)(x2-2),(int)(y2-2));
		}
		
	}
}
