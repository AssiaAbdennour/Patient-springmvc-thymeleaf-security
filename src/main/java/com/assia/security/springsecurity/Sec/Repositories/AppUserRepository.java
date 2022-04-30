package com.assia.security.springsecurity.Sec.Repositories;

import com.assia.security.springsecurity.Sec.Entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,String> {
    AppUser findByUsername(String username);
}
