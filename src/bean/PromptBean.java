package bean;

public class PromptBean {

	private String port;
	private String name;
	
	public PromptBean(String port, String name) {
		this.setName(name);
		this.setPort(port);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}
	
}
