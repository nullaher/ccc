/**
 * Copyright ©2018 simon.zeng All Rights Reserved cn.uinpay.msvc.demo.model.UserInf.java
 * nullaher@gmail.com 2018年5月11日
 */
package cn.nullaher.test.msvc.swaggerUI.model;

import java.util.Date;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @autor: zxy@uinpay.cn
 * @desc : ...
 */
@ApiModel
public class UserInf {
	@ApiModelProperty(value = "用户ID" , example = "60010")
	private Integer userId;
	
	@ApiModelProperty(value = "姓名" , example = "王大神" , notes = "测试note")
	private String username;
	
	@ApiModelProperty(value = "生日" , example = "1911-11-11" , notes = "测试note")
	private Date birthday;
	
	private String password;
	
	@ApiModelProperty(value = "手机号" , example = "188888888866")
	private String mobilePhone;
	
	public Integer getUserId(){
		return userId;
	}
	
	public void setUserId(Integer userId){
		this.userId = userId;
	}
	
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	
	public Date getBirthday(){
		return birthday;
	}
	
	public void setBirthday(Date birthday){
		this.birthday = birthday;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getMobilePhone(){
		return mobilePhone;
	}
	
	public void setMobilePhone(String mobilePhone){
		this.mobilePhone = mobilePhone;
	}
	
}
