package com.projectone.util;

import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ResponseMapper {
	
	private static ObjectMapper om = new ObjectMapper();

	public static void convertAndAttach(Object obj, HttpServletResponse resp) throws IOException {
		String json = om.writeValueAsString(obj);
		resp.getWriter().write(json);
	}
}
