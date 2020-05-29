import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
	private List<User> users;
	private User bot = null;
	private boolean userDeletionScheduled = false;
	
	public ChatRoom() {
		this.users = new ArrayList<User>();
	}
	
	public void sendMessage(String message, User user) {
		for (User u : this.users) {
			if (u != user) {
				u.receive(message, user);
			}
		}
		
		if (message == "addBot" && this.bot == null) {
			this.bot = UserFactory.createUser("bot", this, "catBot");
			// Global room message.
			this.sendMessage("*** Cat bot added! ***", null);
		}

		if (this.userDeletionScheduled) {
			this.userDeletionScheduled = false;
			this.removeUser(user);
			this.bot.send(user.name + " got removed! The word 'cat' is forbidden!");
		}
	}
	
	public void addUser(User user) {
		this.users.add(user);
	}

	public void removeUser(User user) {
		this.users.remove(user);
	}
	
	public void scheduleDeletion() {
		this.userDeletionScheduled = true;
	}
}
