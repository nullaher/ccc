/**
 * Copyright ©2018 simon.zeng All Rights Reserved
 * cn.nullaher.test.msvc.swaggerUI.web.model.RegistReqInf.java nullaher@gmail.com 2018年5月14日
 */
package cn.nullaher.test.msvc.swaggerUI.web.model;

import io.swagger.annotations.ApiParam;

/**
 * @autor: zxy@uinpay.cn
 * @desc : ...
 */
public class RegistReqInf {
	@ApiParam(value = "手机号" , defaultValue = "188888888888" , required = true)
	private String mobilePhone = "18616751108";
	
	@ApiParam(value = "密码" , defaultValue = "112233" , required = true)
	private String password;
	
	@ApiParam(value = "验证码" , defaultValue = "1234" , required = true)
	private String captcha;
	
	public String getMobilePhone(){
		return mobilePhone;
	}
	
	public void setMobilePhone(String mobilePhone){
		this.mobilePhone = mobilePhone;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getCaptcha(){
		return captcha;
	}
	
	public void setCaptcha(String captcha){
		this.captcha = captcha;
	}
	
}
