package com.ssm.service;

import com.ssm.pojo.User;

/**
 * @program: netdisc
 * @description:
 * @author: Mr.Gu
 * @create: 2020-06-15 17:01
 **/
public interface UserService {
    int register(User user);
    User login(User user);
    int existUser(User user);
}
