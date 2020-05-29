public abstract class User {
	protected ChatRoom chatRoom;
    protected String name;

    public User(ChatRoom chatRoom, String name) {
    	this.chatRoom = chatRoom;
        this.name = name;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg, User from);
}
