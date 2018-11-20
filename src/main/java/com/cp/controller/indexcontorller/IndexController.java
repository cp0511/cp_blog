package com.cp.controller.indexcontorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by 程程有小棉被啊 on 2018/11/16.
 */
@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id){
        return "detail";
    }



}
