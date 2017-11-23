package com.aoyang.health.admin.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.aoyang.health.admin.entity.User;
import com.aoyang.health.admin.service.UserService;

public class ShiroDbRealm extends AuthorizingRealm {
	
	@Autowired
	private UserService userService;

	/*
	 * 授权
	 * (non-Javadoc)
	 * @see org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache.shiro.subject.PrincipalCollection)
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String username = (String) principals.getPrimaryPrincipal(); //获取用户名
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
//        authorizationInfo.setRoles(userService.getRoles(username));
//        authorizationInfo.setStringPermissions(userService.getPermissions(username));
        return authorizationInfo;
	}

	/*
	 * 认证
	 * (non-Javadoc)
	 * @see org.apache.shiro.realm.AuthenticatingRealm#doGetAuthenticationInfo(org.apache.shiro.authc.AuthenticationToken)
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
		User userLogin = tokenToUser((UsernamePasswordToken)authcToken);
		//判断用户是否可以登录的逻辑，这里只是演示
		User userDb = userService.findByName(userLogin.getName());
		if (userDb != null) {
			AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(userDb.getName(), userDb.getPassword(), this.getName());
			return authcInfo;
		}
		return null;
	}
	
    private User tokenToUser(UsernamePasswordToken authcToken) {  
        User user = new User();  
        user.setName(authcToken.getUsername());
        user.setPassword(String.valueOf(authcToken.getPassword()));
        return user;  
    }

}
