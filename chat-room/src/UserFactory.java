public class UserFactory {
	public static User createUser(String type, ChatRoom chatRoom, String name) {
		if (type.equals("user")) {
			return new RegularUser(chatRoom, name);
		}
		if (type.equals("bot")) {
			return new Bot(chatRoom, name);
		}
		return null;
	}
}
