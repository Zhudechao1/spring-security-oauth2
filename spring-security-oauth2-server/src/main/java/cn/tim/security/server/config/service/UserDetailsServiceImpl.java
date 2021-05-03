package cn.tim.security.server.config.service;

import cn.tim.security.server.domain.TbUser;
import cn.tim.security.server.service.TbPermissionService;
import cn.tim.security.server.service.TbUserService;
import org.assertj.core.util.Lists;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Resource
    private TbUserService tbUserService;

    @Resource
    private TbPermissionService tbPermissionService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        TbUser tbUser = tbUserService.getUserByUserName(userName);
        List<GrantedAuthority> grantedAuthorityList = Lists.newArrayList();
        if(tbUser != null){
            tbPermissionService
                    .selectPermissionsByUserId(tbUser.getId())
                    .forEach(tbPermission -> grantedAuthorityList.add(new SimpleGrantedAuthority(tbPermission.getEnname())));
            return new User(tbUser.getUsername(), tbUser.getPassword(), grantedAuthorityList);
        }
        return null;
    }
}
