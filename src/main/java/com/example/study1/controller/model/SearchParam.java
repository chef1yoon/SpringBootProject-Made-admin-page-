package com.example.study1.controller.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor //모든 매개변수를 받을수있는 생성자가 추가가 됩니다.
public class SearchParam {

    private String account;
    private String email;
    private int page;

}
