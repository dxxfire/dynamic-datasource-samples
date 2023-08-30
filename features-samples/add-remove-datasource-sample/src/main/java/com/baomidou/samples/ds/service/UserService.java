package com.baomidou.samples.ds.service;

import com.baomidou.samples.ds.entity.User;
import java.util.List;

/**
 * @author robin
 */
public interface UserService {

    /**
     * 根据Session里的参数tenantName切换数据源进行查询
     * @return 查到的User集合
     */
    List<User> selectSpelBySession();

    /**
     * 根据Head里的参数tenantName切换数据源进行查询
     * @return 查到的User集合
     */
    List<User> selectSpelByHeader();

    /**
     * 根据传入参数tenantName切换数据源进行查询
     * @param tenantName 指定的数据源
     * @return 查到的User集合
     */
    List<User> selectSpelByKey(String tenantName);

    /**
     * 根据查询条件对象user里的tenantName切换数据源进行查询
     * @param user 查询条件对象
     * @return 查到的User集合
     */
    List<User> selecSpelByTenant(User user);
}
