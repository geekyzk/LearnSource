package com.em248.controller;

import com.em248.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.xml.transform.Result;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by tian on 2017/5/9.
 */
@RestController
@RequestMapping
public class IndexController {




    @PostMapping("/add")
    public ResponseEntity<?> addUser(@Valid @RequestBody User user, Errors errors){

        Map<String,Object> result = new HashMap<>();

        if(errors.hasErrors()){
            result.put("error",errors.getAllErrors()
            .stream()
            .map(x -> x.getDefaultMessage())
            .collect(Collectors.joining(",")));
            return ResponseEntity.badRequest().body(result);
        }

        result.put("info","success");
        return ResponseEntity.ok(result);
    }
}
