package com.spring.common;

import java.io.Serializable;


/**
 * 返回基类
 * @author zengcong
 * @date 2018年10月16日
 */
public class BaseResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8199695705932920985L;

	/**
	 * 应答码
	 */
	private Integer code;

	/**
	 * 描述
	 */
	private String message;

	public BaseResponse() {
	}

	public BaseResponse(Integer code, String message) {
		this.code = code;
		this.message = message;
	}


	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
