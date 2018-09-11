package org.cg.demo.bean;

import java.util.List;

/**
 *     查询分页显示数据格式化
 * Copyright © 2018Company. All rightsreserved.
 *
 * @Title: EasyUIPage.java
 * @Prject: maven-ssm
 * @Package: org.cg.demo.bean
 * @Description: TODO
 * @author: Android  
 * @date: 2018年9月10日 下午5:27:20
 * @version: V1.0
 */
public class EasyUIPage {
	/**
	 * PageInf.getTotal 为Long
	 */
	private Long total;
	private List<?> rows;
	
	public EasyUIPage() {
	}
	
	public EasyUIPage(Long total, List<?> rows) {
		this.total = total;
		this.rows = rows;
	}

	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public List<?> getRows() {
		return rows;
	}
	public void setRows(List<?> rows) {
		this.rows = rows;
	}

	@Override
	public String toString() {
		return "EasyUIPage [total=" + total + ", rows=" + rows + "]";
	}
}
