package utils;

public class ObjIgraca {
	String username;
	String ipAdresa;
	String status;
	
	
	
	public ObjIgraca(String username, String ipAdresa, String status) {
		super();
		this.username = username;
		this.ipAdresa = ipAdresa;
		this.status = status;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getIpAdresa() {
		return ipAdresa;
	}
	public void setIpAdresa(String ipAdresa) {
		this.ipAdresa = ipAdresa;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
	
}
