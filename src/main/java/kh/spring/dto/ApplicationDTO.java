package kh.spring.dto;

import java.sql.Date;

public class ApplicationDTO {
	
	private int seq;
	private String title;
	private String contents;
	private String applicant;
	private String name;
	private Date apply_date;
	private String approval;
	
	
	public ApplicationDTO() {
		super();
	}

	public ApplicationDTO(int seq, String title, String contents, String applicant, String name, Date apply_date, String approval) {
		super();
		this.seq = seq;
		this.title = title;
		this.contents = contents;
		this.applicant = applicant;
		this.name = name;
		this.apply_date = apply_date;
		this.approval = approval;
	}


	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getApplicant() {
		return applicant;
	}

	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}

	public Date getApply_date() {
		return apply_date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setApply_date(Date apply_date) {
		this.apply_date = apply_date;
	}

	public String getApproval() {
		return approval;
	}

	public void setApproval(String approval) {
		this.approval = approval;
	}
	
}
