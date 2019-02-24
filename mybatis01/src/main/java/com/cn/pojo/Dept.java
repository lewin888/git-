package com.cn.pojo;

import java.io.Serializable;

public class Dept implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String dt_name;
	private String dt_createTime;
	private String dt_bz;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDt_name() {
		return dt_name;
	}
	public void setDt_name(String dt_name) {
		this.dt_name = dt_name;
	}
	public String getDt_createTime() {
		return dt_createTime;
	}
	public void setDt_createTime(String dt_createTime) {
		this.dt_createTime = dt_createTime;
	}
	public String getDt_bz() {
		return dt_bz;
	}
	public void setDt_bz(String dt_bz) {
		this.dt_bz = dt_bz;
	}
	@Override
	public String toString() {
		return "Dept [id=" + id + ", dt_name=" + dt_name + ", dt_createTime="
				+ dt_createTime + ", dt_bz=" + dt_bz + "]";
	}
	public Dept(int id, String dt_name, String dt_createTime, String dt_bz) {
		super();
		this.id = id;
		this.dt_name = dt_name;
		this.dt_createTime = dt_createTime;
		this.dt_bz = dt_bz;
	}
	public Dept() {
		super();
	}
	
	
}
