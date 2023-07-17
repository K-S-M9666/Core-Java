package Interfaces;
class Phone
{
	void call() {
		System.out.println("Phone Call");
	}
	void sms() {
		System.out.println("Phone Sending SMS");
	}
}
interface ICamera
{
	void click();
	void record();
}
interface IMusicplayer
{
	void play();
	void pause();
	void stop();
}
class SmartPhone extends Phone implements ICamera,IMusicplayer
{
	
	public void click() {System.out.println("Clicking Photos");}
	public void record() {System.out.println("Recording ");}
	public void play() {System.out.println("Playing Music");}
	public void pause() {System.out.println("Pause Videos");}
	public void stop() {System.out.println("Stop Music");}
	
}
public class IntefaceEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICamera s=new SmartPhone();
		s.click();
		s.record();
//         s.call();
//         s.pause();
//         s.sms();
//         s.stop();
         
	}

}
