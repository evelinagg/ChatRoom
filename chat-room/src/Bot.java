public class Bot extends User {

	public Bot(ChatRoom chatRoom, String name) {
		super(chatRoom, name);
		chatRoom.addUser(this);
	}

	@Override
	public void send(String msg) {
		System.out.println(this.name + " (a bot) sent:  " + msg);
		chatRoom.sendMessage(msg, this);

	}

	@Override
	public void receive(String msg, User from) {
		System.out.println(this.name + " received:  " + msg);
		if (msg == "cat") {
			this.chatRoom.scheduleDeletion();
		}
	}
}
