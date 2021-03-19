package com.page.admin.repository;


import com.page.admin.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //이것은 respository라는것을 알려줍니다.
public interface UserRepository extends JpaRepository<User, Long>{ // User라는곳에서 기본키의 형태는 Long이다. {
}
