package cn.tim.security.server.service;

import cn.tim.security.server.domain.TbUser;

public interface TbUserService{
    TbUser getUserByUserName(String userName);
}
