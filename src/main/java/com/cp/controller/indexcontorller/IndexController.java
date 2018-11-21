package com.cp.controller.indexcontorller;

import com.cp.service.blog.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by 程程有小棉被啊 on 2018/11/16.
 */
@Controller
public class IndexController {

    @Autowired
    private IBlogService blogService;


//    通过Freemark 渲染
//    @GetMapping("/index")
//    public String blogquery(@RequestParam(value = "pageNo",defaultValue = "1") int pageNo,
//                            @RequestParam(value = "pageSize",defaultValue = "10") int pageSize,Model model) {
//        ServerResponse serverResponse = blogService.queryBlog(pageNo, pageSize);
//        model.addAttribute("pageInfo",serverResponse);
//        return "blog/index";
//    }
    @GetMapping("/index")
    public String blogquery() {
        return "blog/index";
    }

    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Integer id){
        return "detail";
    }



}
