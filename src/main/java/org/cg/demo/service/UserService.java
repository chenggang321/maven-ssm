package org.cg.demo.service;

import java.util.List;

import org.cg.demo.bean.EasyUIPage;
import org.cg.demo.pojo.User;

public interface UserService {

	public EasyUIPage queryPage();
	public List<User> queryAllUser();
}
