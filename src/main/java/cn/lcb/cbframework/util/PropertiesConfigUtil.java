package cn.lcb.cbframework.util;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import cn.lcb.cbframework.util.StringCodingUtil;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;


public class PropertiesConfigUtil extends PropertyPlaceholderConfigurer {


	private static Map<String, String> configs = new HashMap<String, String>();

	@Override
	protected void loadProperties(Properties props) throws IOException {
		super.loadProperties(props);

		Enumeration<?> propertyNames = props.propertyNames();
		while (propertyNames.hasMoreElements()) {
			String propertyName = (String) propertyNames.nextElement();
			String propertyValue = props.getProperty(propertyName);
			configs.put(propertyName, propertyValue);
		}
	}

	/**
	 * 获取string配置值
	 * 
	 * @param configKey
	 * @return
	 */
	public static String getStringValue(String configKey) {
		if(configs.containsKey(configKey)) {
			return configs.get(configKey);
		}
		return "";
	}

	public static Integer getIntValue(String configKey) {
		String value = configs.get(configKey);
		if (!StringCodingUtil.isNullOrBlank(value)) {
			return Integer.parseInt(value);
		}
		return -1;
	}
	
	public static Integer getInteger(String configKey) {
		String value = configs.get(configKey);
		if (!StringCodingUtil.isNullOrBlank(value)) {
			return Integer.parseInt(value);
		}
		return null;
	}
	
}
