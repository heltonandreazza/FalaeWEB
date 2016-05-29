package pojos;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class usersGroup {

	public String name;
	public User[] users;
	public String token;

}
