package com.taylor.validation.action;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taylor.validation.common.ResultBase;
import com.taylor.validation.entity.TestBean;

@Controller
@RequestMapping("/index")
public class IndexController {
	@RequestMapping("/test")
	@ResponseBody
	public ResultBase<TestBean> test(@Valid TestBean testBean) {
		return ResultBase.getResult(testBean, true);
	}
}
