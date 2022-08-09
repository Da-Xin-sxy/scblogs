package cn.sticki.common.web.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 * @author 阿杆
 */
public class ResponseUtils {

	private final static String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";

	public static void objectToJson(HttpServletResponse response, Object object) throws IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		response.setStatus(HttpServletResponse.SC_OK);
		ObjectMapper mapper = new ObjectMapper();
		// todo 注释上说这是线程不安全的，可能需要修改
		mapper.setDateFormat(new SimpleDateFormat(DATE_FORMAT));
		mapper.writeValue(response.getWriter(), object);
	}

}
