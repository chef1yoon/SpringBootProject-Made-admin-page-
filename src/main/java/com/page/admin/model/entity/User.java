package com.page.admin.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Data // 객체를 사용할 것이기 때문에 data라는 어노테이션을 붙힙니다.
@AllArgsConstructor // 모든 매개변수를 가지는 생성자까지 추가합니다.
@Entity // Entity를 사용할 것이기 때문에 Entity 어노테이션을 붙힙니다.
@NoArgsConstructor


public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String account;
  private String email;
  private String phoneNumber;
  private LocalDateTime createdAt;
  private String createdBy;
  private LocalDateTime updatedAt;
  private String updatedBy;
}
