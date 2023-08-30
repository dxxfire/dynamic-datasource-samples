package com.baomidou.samples.ds.mapper;

import com.baomidou.samples.ds.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * @author robin
 */
@Repository
public interface UserMapper {

    /**
     * 查询User表
     * @return 查到的User集合
     */
    @Select("select * from t_user")
    List<User> selectUsers();
}
