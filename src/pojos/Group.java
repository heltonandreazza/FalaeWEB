package pojos;

import java.util.HashMap;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Group {

	public int id;
	public String name;
	public String description;
	public String owner;
	public User[] users;
	public String token;

}
