package org.example.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.pojo.User;

@Mapper
public interface UserDao extends BaseMapper<User> {

}
