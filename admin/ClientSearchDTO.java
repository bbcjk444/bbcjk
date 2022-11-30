package admin;

public class ClientSearchDTO {
	private int paynum;
	private String phonenumber;
	private String name;
	private int seatnumber;
	private int paytime;
	private String starttime;
	private String endtime;

	public int getPaynum() {
		return paynum;
	}

	public void setPaynum(int paynum) {
		this.paynum = paynum;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeatnumber() {
		return seatnumber;
	}

	public void setSeatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}

	public int getPaytime() {
		return paytime;
	}

	public void setPaytime(int paytime) {
		this.paytime = paytime;
	}

	public String getStarttime() {
		return starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public ClientSearchDTO(int paynum, String phonenumber, String name, int seatnumber, int paytime, String starttime,
			String endtime) {

		this.paynum = paynum;
		this.phonenumber = phonenumber;
		this.name = name;
		this.seatnumber = seatnumber;
		this.paytime = paytime;
		this.starttime = starttime;
		this.endtime = endtime;
	}

}
