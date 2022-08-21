package com.springboot.controller;

import com.springboot.request.PostCreate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@RestController
public class PostController {
    // http Method로는 GET, POST, PUT, PATCH, DELETE, OPTIONS, HEAD, TRACE, CONNECT가 있다
    // 글 등록으로는 POST Method 사용

    @GetMapping("/posts")
    public String post(@RequestBody @Valid PostCreate params){
        /*  -- 데이터를 검증하는 이유
        *  1. client 개발자가 깜박할 수 있고 실수로 값을 누락되는 경우도 있다.
        *  2. 외부에 트랙커가 값을 임의로 조작해서 보낼 수 있다.
        *  3. DB에 값을 저장할 때 의도치 않은 오류가 발생할 수 있다.
        * */
        log.info("params={}", params.toString());
        return "Hellow Spring Boot";
    }
//    parameters을 Map으로 한번에 받을 수도 있고
//    public String post(@RequestParam Map<String, String> params){
//        log.info("params={}", params);
//        return "Hellow Spring Boot";
//    }


//    parameters을 별도로 받을 수 있다
//    public String post(@RequestParam String title, @RequestParam String content){
//            log.info("title={}, content={}", params.title, params.content);
//        return "Hellow Spring Boot";
//}
}
