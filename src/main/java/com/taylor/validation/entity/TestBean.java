package com.taylor.validation.entity;

import java.io.Serializable;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestBean implements Serializable {

	private static final long serialVersionUID = -8291854654742185199L;
	private Integer id;
	@NotNull(message = "name不能为空")
	private String name;
	@Min(value = 10, message = "不能小于10")
	@Max(value = 100, message = "不能大于100")
	private Integer age;
}
