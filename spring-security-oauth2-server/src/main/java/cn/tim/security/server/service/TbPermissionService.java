package cn.tim.security.server.service;

import cn.tim.security.server.domain.TbPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbPermissionService{
    List<TbPermission> selectPermissionsByUserId(Long userId);
}
