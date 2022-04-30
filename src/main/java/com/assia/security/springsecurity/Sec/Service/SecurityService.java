package com.assia.security.springsecurity.Sec.Service;

import com.assia.security.springsecurity.Sec.Entities.AppRole;
import com.assia.security.springsecurity.Sec.Entities.AppUser;

public interface SecurityService {
    AppUser saveNewUser(String username,String password,String rePassword);
    AppRole saveNewRole(String roleName,String description);
    void addRoleToUser(String username,String roleName);
    void removeRoleFromUser(String username,String roleName);
    AppUser LoadUserByUserName(String username);       //Chercher
}
