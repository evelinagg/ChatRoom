public class RegularUser extends User {

	public RegularUser(ChatRoom chatRoom, String name) {
		super(chatRoom, name);
		chatRoom.addUser(this);
	}
	 
	@Override
	public void send(String msg) {
		System.out.println(this.name + " sent:  " + msg);
		chatRoom.sendMessage(msg, this);

	}

	@Override
	public void receive(String msg, User from) {
		System.out.println(this.name + " received:  " + msg);
	}

}
