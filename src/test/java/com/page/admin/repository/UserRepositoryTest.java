package com.page.admin.repository;

import com.page.admin.AdminApplicationTests;
import com.page.admin.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class UserRepositoryTest extends AdminApplicationTests{
    @Autowired //repository를 이용해서 crud를 테스트할 것이기 때문에 Autowired를 선언해줍니다.
               //DI(Dependency Injection)라고 부르기도 합니다.

    private UserRepository userRepository;

    @Test //테스트이기 때문에 test어노테이션을 꼭 달아줍니다.
    public void create(){
        User user = new User();
        //auto increment 때문에 user.setId();는 선언하지 않습니다.
        //String sql = insert into user (%s, %s, %d) value (account, email, age); 라고 선언하지 않아도 됩니다.
        user.setAccount("TestUser03");
        user.setEmail("TestUser03@gmail.com");
        user.setPhoneNumber("010-4444-2222");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("TestUser3");

        User newUser = userRepository.save(user); //save는 반환하는 성질이 있습니다. User에게 반환시켜줍니다.
        System.out.println("newUser : "+newUser);
    }

    public void reate(){

    }


    public void update(){

    }

    public void delete(){

    }
}
