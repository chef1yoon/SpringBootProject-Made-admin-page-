package com.page.admin.controller;


import com.page.admin.model.SearchParam;
import org.springframework.web.bind.annotation.*;

//Rest 방식의 데이터 자체를 넘겨준다라는 뜻입니다.
@RestController
//어떠한 주소를 받을 것인지 설정하는 것입니다. (api로 받을 예정입니다)
@RequestMapping("/api") //Localhost:8080/api 까지 주소가 매칭된것입니다.
public class GetController {

    //requestmapping을 통해서 메소드는 get타입으로 받고, path는 어떠한 주소로 받겠다라는 뜻입니다.
    @RequestMapping(method = RequestMethod.GET, path="/getMethod") //Localhost:8080/api/getMethod 라는 주소를 호출
    //사용자의 요청이 getRequest메소드로 들어오게 됩니다.
    public String getRequest(){

        return "Hi getMethod";
    }


    //어노테이션을 통해서 주소 매칭을 해줍니다.(request가 아니라 get에대해서 처리해줄겁니다. request매핑과 다르게 메소드를 지정하지 않고 주소만 설정 하면됩니다.)
    @GetMapping("/getParameter") //Localhost:8080/api/getParameter?id=1234&password=abcd
    public String getParameter(@RequestParam String id, @RequestParam String password){ //파라미터를 받기위해서 requestParam을 넣어줍니다. (그럼 각각 id와 password값을 받아옵니다.)

        System.out.println("id : "  +id);
        System.out.println("password : " +password);

        return id+password;
        //하지만 여기서, password나 id값은 각각 변수로 지정해서 받아올 수 있지만, 주로 spring에서 request파라미터로 들어올 수 있는 값들에 대해서는
        //로컬 변수를 사용하지 않는 편입니다. 왜냐하면 해당값을 주로 매핑해서 사용해주기 때문입니다.
    }

    //만약검색에 대한 변수가 계속 늘어나는 상황이라면,
    //ex) localhost:8080/api/multiParameter?account=abcd&email=study@gmail.com&page=10
    //따로 SearchParam이라는 클래스를 만들어보는것도 방법입니다. 그럼 @RequestParam이 아닌, SearchParam클래스의 SearchParam을 들고오는겁니다.
    @GetMapping("/getMultiParameter")
    public SearchParam getMultiParameter(SearchParam searchParam){
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());

        return searchParam;
    }

}
