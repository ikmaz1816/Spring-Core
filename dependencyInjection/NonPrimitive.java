package com.spring.dependencyInjection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class NonPrimitive {
	private List<String> list;
	private Set<String> set;
	private Map<Integer,String> map;
	private Properties prop;
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public Map<Integer, String> getMap() {
		return map;
	}
	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	
	
}
