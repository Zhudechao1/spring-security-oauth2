package cn.tim.security.server.service.impl;

import cn.tim.security.server.domain.TbUser;
import lombok.val;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.tim.security.server.mapper.TbUserMapper;
import cn.tim.security.server.service.TbUserService;
import tk.mybatis.mapper.entity.Example;

@Service
public class TbUserServiceImpl implements TbUserService{

    @Resource
    private TbUserMapper tbUserMapper;

    @Override
    public TbUser getUserByUserName(String userName) {
        val example = new Example(TbUser.class);
        example.createCriteria().andEqualTo("username", userName);
        return tbUserMapper.selectOneByExample(example);
    }
}
