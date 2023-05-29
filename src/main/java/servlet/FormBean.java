package servlet;

import java.io.Serializable;

public class FormBean implements Serializable{
	
	private String name;
	private String company;
	private String mailAddress;
	private String contact;
	private String[] mailType;
	private boolean needDocs;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getMailAddress() {
		return mailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String[] getMailType() {
		return mailType;
	}
	public void setMailType(String[] mailType) {
		this.mailType = mailType;
	}
	public boolean getNeedDocs() {
		return needDocs;
	}
	public void setNeedDocs(boolean needDocs) {
		this.needDocs = needDocs;
	}
}
