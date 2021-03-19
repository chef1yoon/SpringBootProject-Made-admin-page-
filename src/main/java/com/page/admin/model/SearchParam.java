package com.page.admin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor //모든 매개변수를 받을수있는 생성자가 추가가 됩니다.
@Getter
@Setter
public class SearchParam {

    private String account;
    private String email;
    private int page;

}
