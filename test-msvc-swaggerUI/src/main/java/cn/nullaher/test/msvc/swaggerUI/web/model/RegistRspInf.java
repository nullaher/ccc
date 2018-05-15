/**
 * Copyright ©2018 simon.zeng All Rights Reserved
 * cn.nullaher.test.msvc.swaggerUI.web.model.RegistRspInf.java nullaher@gmail.com 2018年5月14日
 */
package cn.nullaher.test.msvc.swaggerUI.web.model;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;
import cn.nullaher.test.msvc.swaggerUI.model.UserInf;

/**
 * @autor: zxy@uinpay.cn
 * @desc : ...
 */
public class RegistRspInf extends UserInf {
	
	@Override
	@JsonIgnore
	public Date getBirthday(){
		return super.getBirthday();
	}
	
	@JsonIgnore
	public String getPassword(){
		return super.getPassword();
	}
	
}
