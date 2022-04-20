package com.assia.security.springsecurity.Sec.Repositories;

import com.assia.security.springsecurity.Sec.Entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,Long> {
    AppRole findByRoleName(Long RoleName);
}
