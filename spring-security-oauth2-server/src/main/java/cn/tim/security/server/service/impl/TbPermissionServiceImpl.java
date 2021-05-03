package cn.tim.security.server.service.impl;

import cn.tim.security.server.domain.TbPermission;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import cn.tim.security.server.mapper.TbPermissionMapper;
import cn.tim.security.server.service.TbPermissionService;

import java.util.List;

@Service
public class TbPermissionServiceImpl implements TbPermissionService{

    @Resource
    private TbPermissionMapper tbPermissionMapper;

    @Override
    public List<TbPermission> selectPermissionsByUserId(Long userId) {
        return tbPermissionMapper.selectPermissionsByUserId(userId);
    }
}
