package kh.spring.dto;


public class ProBusinessLog_NEX {
	private String check;
	private int busi_seq;
	private String busi_proId;
	private String busi_proName;
	private String busi_contents;
	private String busi_date;
	public ProBusinessLog_NEX(String check, int busi_seq, String busi_proId, String busi_proName, String busi_contents,
			String busi_date) {
		super();
		this.check = check;
		this.busi_seq = busi_seq;
		this.busi_proId = busi_proId;
		this.busi_proName = busi_proName;
		this.busi_contents = busi_contents;
		this.busi_date = busi_date;
	}
	public ProBusinessLog_NEX() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCheck() {
		return check;
	}
	public void setCheck(String check) {
		this.check = check;
	}
	public int getBusi_seq() {
		return busi_seq;
	}
	public void setBusi_seq(int busi_seq) {
		this.busi_seq = busi_seq;
	}
	public String getBusi_proId() {
		return busi_proId;
	}
	public void setBusi_proId(String busi_proId) {
		this.busi_proId = busi_proId;
	}
	public String getBusi_proName() {
		return busi_proName;
	}
	public void setBusi_proName(String busi_proName) {
		this.busi_proName = busi_proName;
	}
	public String getBusi_contents() {
		return busi_contents;
	}
	public void setBusi_contents(String busi_contents) {
		this.busi_contents = busi_contents;
	}
	public String getBusi_date() {
		return busi_date;
	}
	public void setBusi_date(String busi_date) {
		this.busi_date = busi_date;
	}
	
	
}
