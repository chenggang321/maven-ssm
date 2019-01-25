package org.cg.demo.service.impl;

import java.util.List;

import org.cg.demo.bean.EasyUIPage;
import org.cg.demo.mapper.UserMapper;
import org.cg.demo.pojo.User;
import org.cg.demo.pojo.UserExample;
import org.cg.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public EasyUIPage queryPage() {
		//分页查询
		PageHelper.startPage(1, 2);
		List<User> users = this.userMapper.selectByExample(new UserExample());
		//获取分页信息
		PageInfo<User> page = new PageInfo<User>(users);
		return new EasyUIPage(page.getTotal(),page.getList());
	}

	@Override
	public List<User> queryAllUser() {
		return this.userMapper.selectByExample(new UserExample());
	}

}
