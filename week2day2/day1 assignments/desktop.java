package classroomex;

public class desktop extends computer {
	public void desktopsize() {
		System.out.println("desktop size = 3.9 x 53.8 x 31.4 cm");
	}

	public static void main(String[] args) {
		desktop desk = new desktop();
		desk.computermodel();
		desk.desktopsize();

	}

}
