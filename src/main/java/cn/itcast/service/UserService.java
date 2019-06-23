package cn.itcast.service;

import cn.itcast.mapper.UserMapper;
import cn.itcast.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional  //事务控制
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /*根据id查询用户*/
    public User queryById(Integer id){
        return userMapper.selectByPrimaryKey(id);
    }

    //新增用户
    public void insert(User user){
        userMapper.insert(user);
    }

}
