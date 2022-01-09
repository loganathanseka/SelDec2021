package classroomex;
import classroomex.mobile;
import classroomex.smartphone;

public class androidphone extends smartphone {
	public void takeviedio() {
		System.out.println("take viedio from android phone");
	}
	public void sendms() {
		System.out.println("send message from Android phone");
	}

	public static void main(String[] args) {
		androidphone andr = new androidphone();
		andr.takeviedio();
		andr.sendms();
		mobile mob = new mobile();
		mob.sendms();
		mob.savecontact();
		mob.makecall();
		smartphone smart = new smartphone();
		smart.accesswhatsapp();
		smart.sendms();
		

	}

}
