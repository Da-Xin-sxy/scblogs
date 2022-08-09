package cn.sticki.blink.exception;

import cn.sticki.common.exception.ServiceException;

/**
 * @author 阿杆
 */
public class BlinkException extends ServiceException {

	public BlinkException() {
		super("动态异常");
	}

	public BlinkException(String errorMessage) {
		super(errorMessage);
	}

}
