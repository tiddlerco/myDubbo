package org.consumer.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author tiddler
 * @Date 2023/10/29 22:46
 */
@RestController
@RequestMapping("test/consumer")
public class ConsumerController {


    @GetMapping("/list")
    public List<Integer> list(){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        return list;
    }

}
