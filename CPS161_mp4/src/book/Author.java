package book;

public class Author {
	
	private String firstName = "";
	private String lastName = "";
	private String birthday = "";
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public String getBirthday() {
		return birthday;
	}
	
	public void setFirstName(String f) {
		firstName = f;
	}
	
	public void setLastName(String l) {
		lastName = l;
	}
	
	public void setBirthday(String b) {
		birthday = b;
	}
	
	public String toString() {
		return firstName + " " + lastName + "(birthday: " + birthday + ")";
	}
	
}


