package com.page.admin.controller;


import com.page.admin.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {

    // HTML <Form>태그를 사용하던지, ajax에서 비동기를할때 주로 검색에 사용이 됩니다.
    // 이렇게 사용되는 이유는, 검색할는 파라미터가 많다는 뜻입니다.
    // post는 http통신할때, post body에다가 data를 집어넣고 보낸다는 뜻을 가지고 있기 때문에, @RequestBody로 매개변수로 넣어야합니다.
    // 보내는방식은 json,xml,multipart-form/text-plain 등 다양합니다.
    @PostMapping("/postMethod")
    public SearchParam postMethod(@RequestBody SearchParam searchParam){
        return searchParam;
    }


    @PutMapping("/putMethod")
    public void put(){

    }

    @PatchMapping("/patchMethod")
    public void patch(){

    }
}
