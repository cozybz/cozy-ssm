package org.cozy.ssm.service;

import java.util.List;
import org.cozy.ssm.pojo.User;

public interface UserService {
	public int insert(User user);

	public int delete(int id);

	public int update(User user);

	public User selectById(int id);

	public User selectByName(String name);

	public List<User> selectByPageASC(int start, int pageSize);

	public List<User> selectByPageDESC(int start, int pageSize);

	public User vertify(String name, String password);
}
