package cn.tim.security.server.mapper;

import cn.tim.security.server.domain.TbPermission;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.MyMapper;

import java.util.List;

public interface TbPermissionMapper extends MyMapper<TbPermission> {
    List<TbPermission> selectPermissionsByUserId(@Param("userId") Long userId);
}