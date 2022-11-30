package Client;

public class ClientVO {
private String phonenumber;
private String password;
private String name;
private String address;
private int paytime;
private int liveuse;
private String starttime;
private String endtime;

public String getStarttime() {
	return starttime;
}

public String getEndtime() {
	return endtime;
}



public ClientVO(String phonenumber, String password, String name, String address, int paytime, int liveuse,
		String starttime, String endtime) {
	super();
	this.phonenumber = phonenumber;
	this.password = password;
	this.name = name;
	this.address = address;
	this.paytime = paytime;
	this.liveuse = liveuse;
	this.starttime = starttime;
	this.endtime = endtime;
}

public int getPaytime() {
	return paytime;
}

public void setPaytime(int i) {
	this.paytime = i;
}

public ClientVO(String phonenumber, String password, String name, String address) {
	super();
	this.phonenumber = phonenumber;
	this.password = password;
	this.name = name;
	this.address = address;
}




public ClientVO(String phonenumber, String password) {
	this.phonenumber = phonenumber;
	this.password = password;
	}

public String getPhonenumber() {
	return phonenumber;
}

public String getPassword() {
	return password;
}

public String getName() {
	return name;
}

public String getAddress() {
	return address;
}








}
