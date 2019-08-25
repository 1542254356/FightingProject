package WebIGo.admin.Dao;

import java.util.List;

import WebIGo.admin.Bean.User;

public interface UsersMapper {
    int addUser(User user);
	List<User> listUsers();
	List<User> listFrozenUsers(User user);
	int addUser2(User user);
    int deleteUser(User User);
	void updateUser(User user);
    User find(User user);
    User findByName(User user);
    User existUname(String Uname);
    User existUphone(String Uphone);
}
