package Pay;

public class PayVO {
	private int paynum;
	private String phonenumber;
	private String name;
	private int seatnumber;
	private int paytime;
	public PayVO(int paynum, String phonenumber, String name, int seatnumber, int paytime, String starttime,
			String endtime) {
		super();
		this.paynum = paynum;
		this.phonenumber = phonenumber;
		this.name = name;
		this.seatnumber = seatnumber;
		this.paytime = paytime;
		this.starttime = starttime;
		this.endtime = endtime;
	}

	public int getPaynum() {
		return paynum;
	}

	private String starttime;
	private String endtime;
	
	public String getName() {
		return name;
	}

	public String getStarttime() {
		return starttime;
	}

	public String getEndtime() {
		return endtime;
	}

	public PayVO(String phonenumber, String name, int seatnumber, int paytime, String starttime, String endtime) {
		super();
		this.phonenumber = phonenumber;
		this.name = name;
		this.seatnumber = seatnumber;
		this.paytime = paytime;
		this.starttime = starttime;
		this.endtime = endtime;
	}

	public PayVO(String phonenumber, int seatnumber, int paytime) {
		super();
		this.phonenumber = phonenumber;
		this.seatnumber = seatnumber;
		this.paytime = paytime;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public int getSeatnumber() {
		return seatnumber;
	}

	public int getPaytime() {
		return paytime;
	}

	public void setPaytime(int paytime) {
		this.paytime = paytime;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public void setSeatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}
	
	
	
	
	
}

