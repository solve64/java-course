import java.awt.Robot;
import java.awt.event.InputEvent;

public class Intro
{
	public static void main(String[] args) throws Exception
	{
		new Intro().run();
	}

	private void run() throws Exception
	{
		System.out.println("Hello");
		System.out.println(1+2+3);
		System.out.println(add(1,10));
		
		Robot robot=new Robot();
		robot.mouseMove(200,200);//x,y
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}

	private int add(int from, int to)
	{
		int result=0;
		
		for(int i=from; i<=to; i++)
		{
			result+=i;
		}
		
		return result;
	}
}
