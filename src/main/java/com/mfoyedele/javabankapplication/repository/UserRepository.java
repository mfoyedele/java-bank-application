package com.mfoyedele.javabankapplication.repository;

import com.mfoyedele.javabankapplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
