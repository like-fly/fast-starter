package com.twowin.admin.mapper;

import com.twowin.admin.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by ckl on 2017/12/1.
 */
@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> selectUsers();

    @Select("select * from user where id=#{id}")
    User selectUserById(int id);

}
