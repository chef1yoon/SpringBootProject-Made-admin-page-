package com.page.admin.repository;

import com.page.admin.AdminApplicationTests;
import com.page.admin.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Optional;

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

    @Test
    public void read(){
        Optional<User> user = userRepository.findById(2L); //id타입이 2번이다.(뒤에L은 long이다.)

        user.ifPresent(selectUser->{ //selectUser가 user에 들어있으면, 그 값을 꺼내달라는 명령어 입니다.
            System.out.println("user : "+selectUser);
            System.out.println("email : "+selectUser.getEmail());
        });

    }


    @Test
    public void update(){
        Optional<User> user = userRepository.findById(4L);

        user.ifPresent(selectUser->{
            selectUser.setAccount("TestUser04");
            selectUser.setUpdatedAt(LocalDateTime.now());
            selectUser.setUpdatedBy("update method()");

            userRepository.save(selectUser);
        });
    }

    @Test
    public void delete(){
        Optional<User> user = userRepository.findById(4L);

        user.ifPresent(selectUser->{
            userRepository.delete(selectUser);
        });

        //delete는 반환형이 없기때문에 따로 저장하는 설정을 하지 않아도됩니다.
        //하지만 진짜 삭제가되었는지 확인해봅니다.

        Optional<User> deleteUser = userRepository.findById(4L);
        if(deleteUser.isPresent()){
            System.out.println("데이터 존재:"+deleteUser.get());
        }else{
            System.out.println("데이터 없음");
        }
    }
}
