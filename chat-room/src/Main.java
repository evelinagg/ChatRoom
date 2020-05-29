public class Main {

	public static void main(String[] args) {
		ChatRoom room = new ChatRoom();
		
		User pesho = UserFactory.createUser("user", room, "Pesho");
		User gosho = UserFactory.createUser("user", room, "Gosho");
		User mitko = UserFactory.createUser("user", room, "Mitko");
		
		pesho.send("Kak ste hora?");
		gosho.send("Biva, ti?");
		mitko.send("addBot");
		pesho.send("Kakuv e tozi bot?");
		mitko.send("Napishi 'cat'");
		pesho.send("cat");
	}

}
