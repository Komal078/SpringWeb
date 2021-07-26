package io.com.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "todo")
public class todo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column
	private String user;

	@Column(name = "description")
	private String desc;

	@Column(name = "target_Date")

	  private Date target_Date;

	@Column(name = "is_Done")
	private boolean is_Done;

	public todo() {
		super();
	}

	public todo(int id, String user, String desc, Date target_Date, boolean is_Done) {
		super();
		this.id = id;
		this.user = user;
		this.desc = desc;
		this.target_Date = target_Date;
		this.is_Done = is_Done;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getTarget_Date() {
		return target_Date;
	}

	public void setTarget_Date(Date target_Date) {
		this.target_Date = target_Date;
	}

	public boolean isIs_Done() {
		return is_Done;
	}

	public void setIs_Done(boolean is_Done) {
		this.is_Done = is_Done;
	}

	@Override
	public String toString() {
		return "todo [id=" + id + ", user=" + user + ", desc=" + desc + ", target_Date=" + target_Date + ", is_Done="
				+ is_Done + "]";
	}


}
	