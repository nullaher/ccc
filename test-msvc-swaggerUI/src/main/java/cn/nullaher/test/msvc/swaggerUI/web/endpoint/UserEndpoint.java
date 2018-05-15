/**
 * Copyright ©2018 simon.zeng All Rights Reserved cn.uinpay.msvc.demo.TestEndpoint.java
 * nullaher@gmail.com 2018年5月11日
 */
package cn.nullaher.test.msvc.swaggerUI.web.endpoint;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.nullaher.test.msvc.swaggerUI.web.model.RegistReqInf;
import cn.nullaher.test.msvc.swaggerUI.web.model.RegistRspInf;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author simon
 * @note ...
 */
@RestController
@Api(tags = {"用户操作接口"})
@RequestMapping("/user")
public class UserEndpoint {
	
	@ApiOperation(value = "注册用户信息接口" , notes = "提供一些基本的用户信息")
	@PostMapping("/regist")
	public RegistRspInf save(RegistReqInf registInf){
		RegistRspInf userRsp = new RegistRspInf();
		userRsp.setMobilePhone(registInf.getMobilePhone());
		return userRsp;
	}
}
