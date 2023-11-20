package com.lee.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lee.shortlink.admin.dao.entity.UserDO;
import com.lee.shortlink.admin.dto.req.UserLoginReqDTO;
import com.lee.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.lee.shortlink.admin.dto.req.UserUpdateReqDTO;
import com.lee.shortlink.admin.dto.resp.UserLoginRespDTO;
import com.lee.shortlink.admin.dto.resp.UserRespDTO;

/**
 * 用户接口层
 */
public interface UserService extends IService<UserDO> {

    /**
     * 根据用户名查询用户信息
     *
     * @param username 用户名
     * @return 用户返回实体
     */
    UserRespDTO getUserByUsername(String username);

    /**
     * 查询用户名是否存在
     *
     * @param username 用户名
     * @return 用户名存在返回:True,不存在返回:False
     */
    Boolean hasUsername(String username);

    /**
     * 用户注册
     *
     * @param requestParam 用户注册请求参数
     */
    void register(UserRegisterReqDTO requestParam);

    /**
     * 根据用户名修改用户
     *
     * @param requestParam 修改用户请求参数
     */
    void update(UserUpdateReqDTO requestParam);

    /**
     * 用户登陆
     *
     * @param requestParam 用户登陆请求参数
     * @return 用户登陆返回参数
     */
    UserLoginRespDTO login(UserLoginReqDTO requestParam);

    /**
     * 检查用户是否登陆
     *
     * @param username 用户名
     * @param token    用户 token
     * @return 用户是否登陆标识
     */
    Boolean checkLogin(String username, String token);

    /**
     * 退出登录
     *
     * @param username 用户名
     * @param token    用户 token
     */
    void logout(String username, String token);
}
