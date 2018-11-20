package com.cp.config;

import org.springframework.web.servlet.view.freemarker.FreeMarkerView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class FreemarkerView extends FreeMarkerView {

	@Override
	protected void exposeHelpers(Map<String, Object> model, HttpServletRequest request) throws Exception {
		String base = RequestUtil.getBasePath(request);
		//如果你要给freemaker的模板定义一些常量可以在这里来添加 然后页面上使用${basePath} 取值
		model.put("basePath", base);
		super.exposeHelpers(model, request);
	}
}
