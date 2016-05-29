package pojos;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Mensagem {
	public String message;

	public Mensagem() {};
	
	public Mensagem(String message) {
		this.message = message;
	}
	
}
