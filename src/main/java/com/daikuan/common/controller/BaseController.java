package com.daikuan.common.controller;

import org.springframework.stereotype.Controller;
import com.daikuan.common.utils.ShiroUtils;
import com.daikuan.system.domain.UserDO;

@Controller
public class BaseController {
	public UserDO getUser() {
		return ShiroUtils.getUser();
	}

	public Long getUserId() {
		return getUser().getUserId();
	}

	public String getUsername() {
		return getUser().getUsername();
	}
}