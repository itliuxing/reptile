/**
 * Copyright (C) 2014 上海高恒通信技术有限公司
 *  @version 1.0
 */
package com.reptile.common.framework.util.net.exception;

import com.reptile.common.framework.util.net.AppResponseMessage;

/**
 * @className:CustomAppExceptionHandle.java
 * @classDescription: 异常处理工具
 * @author: hugx
 * @createTime:2014-8-12 下午5:18:59
 * @updateAuthor:
 * @updateTime:
 * @updateDescription:
 * @version V1.0
 */
public class CustomAppExceptionHandle {

	public static AppResponseMessage handle(Exception e) {
		AppResponseMessage appErrorMessage = null;

		if (e == null) {
			appErrorMessage = null;
		} else if (e instanceof AppHttpParseHeadException) {
			appErrorMessage = ((AppHttpParseHeadException) e).getAppResponseMessage();
		} else if (e instanceof AppCommandFactoryException) {
			appErrorMessage = ((AppCommandFactoryException) e).getAppResponseMessage();
		} else if (e instanceof AppCommandException) {
			appErrorMessage = ((AppCommandException) e).getAppResponseMessage();
		} else if (e instanceof AppHttpParseBodyException) {
			appErrorMessage = ((AppHttpParseBodyException) e).getAppResponseMessage();

		} else if (e instanceof AppServiceException) {
			appErrorMessage = ((AppServiceException) e).getAppResponseMessage();
		}
		
		
		return appErrorMessage;

	}
}
