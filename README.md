# REST API
REST API를 공부하면서 배운 부분을 README.md에 적어 보았습니다.


### RequestController
Rest 방식의 데이터 자체를 넘겨준다는 뜻입니다.



### RequestMapping
어떠한 주소를 받을 것인지 설정하는 것입니다.
@RequestMapping("/api") //Localhost:8080/api 까지 주소가 매칭된것입니다.

또한 메소드 타입도 정하고 어떤 주소로 받겠다는 설정도 할 수 있습니다.
@RequestMapping(method = RequestMethod.GET, path="/getMethod") //Localhost:8080/api/getMethod 라는 주소를 호출
다음의 뜻은, requestmapping을 통해서 메소드는 get타입으로 받고, path는 어떠한 주소로 받겠다라는 뜻입니다.



### GetMapping
어노테이션을 통해서 주소를 매칭해줍니다.
이것은 get에대해서 처리해주는 것인데, request매핑과 다른점은, 메소드를 지정하지 않고 주소만 설정하면됩니다.
@GetMapping("/getParameter") //Localhost:8080/api/getParameter?id=1234&password=abcd
하지만 여기서는 주로 로컬변수를 사용하지 않는 편입니다. 왜냐하면 해당값을 주로 주소에서 매핑해서 사용해주고 있기 때문입니다.



### JSON 형식으로 return하기
검색에 대한 변수가 계속 늘어나서 또다른 객체클래스를 만들어서 호출해 주었습니다.
이제 더이상 @RequestParam을 사용하지않고, 클래스 호출하고 클래스안에 인스턴스를 각각 사용해줍니다.
그때 메소드를 String값이 아닌 클래스로 해주고, return값도 클래스로 해줍니다.
요즘에는 JSON형식으로 값을 전달하는것이 표준이 되어있는 상태여서, 기본적으로 JSON형식으로 반환해주는 라이브러리가 저장되어있습니다. 그렇기 떄문에 알아서 JSON형식으로 return 해줍니다.


### @RequestMapping(method = RequestMethod.POST, path ="/postMethod")
### @PostMapping("/postMethod")
이 두개는 같은 뜻입니다.
HTML <Form>태그를 사용하던지, ajax에서 비동기를할때 주로 검색에 사용이 됩니다.



### @PostMapping
HTML <Form>태그를 사용하던지, ajax에서 비동기를할때 주로 검색에 사용이 됩니다.
이렇게 사용되는 이유는, 검색할는 파라미터가 많다는 뜻입니다.
post는 http통신할때, post body에다가 data를 집어넣고 보낸다는 뜻을 가지고 있기 때문에, @RequestBody로 매개변수로 넣어야합니다.



### lombok
lombok을 추가하여 따로 getter setter를 설정하지 않아도 인스턴스를 접근할 수 있도록 만들었습니다.


### AllArgsConstructor
모든 매개변수를 받을수 있는 생성자를 추가했습니다.\
