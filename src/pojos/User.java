package pojos;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	public int id;
	public String name;
	public String password;
	public int rating;

	public User() {	}

	public User(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.rating = 0;
	}

}
