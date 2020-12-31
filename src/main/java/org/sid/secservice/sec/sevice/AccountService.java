package org.sid.secservice.sec.sevice;

import org.sid.secservice.sec.entities.AppRole;
import org.sid.secservice.sec.entities.AppUser;

import java.util.List;

public interface AccountService  {
    AppUser addNemUser(AppUser appUser);
    AppRole addNewRole(AppRole appRole);
    void addRoleToUser(String username,String roleName);
    AppUser loadUserByUsername(String username);
    List<AppUser> listUsers();
}
