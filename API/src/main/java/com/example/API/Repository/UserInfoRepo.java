package com.example.API.Repository;

import com.example.API.Entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepo extends JpaRepository<UserInfo, Long> {
}
