package com.cp.controller.blog;

import com.cp.service.blog.IBlogService;
import com.cp.vo.BlogVo;
import com.cp.vo.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * todo:描述Controller控制器类
 * BlogController<br/>
 * 作者:程程有小棉被啊<br/>
 * 创建时间：2018年11月20日 17:51:51 <br/>
 *
 * @version 1.0.0<br/>
 */
@Controller
public class BlogController {

    @Autowired
    private IBlogService blogService;

    @GetMapping("/blog/query")
    @ResponseBody
    public ServerResponse queryBlog(@RequestParam(value = "pageNo",defaultValue = "1")int pageNo,
                                    @RequestParam(value = "pageSize",defaultValue = "10")int pageSize) {
        ServerResponse serverResponse = blogService.queryBlog(pageNo, pageSize);
        return serverResponse;
    }

    /**
     * 方法名：blogdetail<br/>
     * 创建人：程程有小棉被啊 <br/>
     * 时间：2018年11月20日 17:51:51 <br/>
     * 手机:132xxxx1385<br/>
     *
     * @param id
     * @param map
     * @return String<br/>
     * @throws <br/>
     * @since 1.0.0<br/>
     */
    @GetMapping("/blog/{id}")
    public String blogdetail(@PathVariable("id") Integer id, ModelMap map) {
        map.addAttribute("id", id);
        return "blog/detail";
    }


    /**
     * 模板方法，提供给分页使用
     * 方法名：template<br/>
     * 创建人：程程有小棉被啊 <br/>
     * 时间：2018年11月20日 17:51:51 <br/>
     * 手机:132xxxx1385<br/>
     *
     * @param map
     * @return String<br/>
     * @throws <br/>
     * @since 1.0.0<br/>
     */
    @PostMapping("/blog/template")
    public String template(BlogVo blogVo, ModelMap map) {
        ServerResponse serverResponse = blogService.queryBlogAll(blogVo);
        map.addAttribute("pages", serverResponse.getData());
        return "blog/template";
    }


    /**
     * 根据id查询信息
     * 方法名：getBlog<br/>
     * 创建人：程程有小棉被啊 <br/>
     * 时间：2018年11月20日 17:51:51 <br/>
     * 手机:132xxxx1385<br/>
     *
     * @param id
     * @return ServerResponse<br/>
     * @throws <br/>
     * @since 1.0.0<br/>
     */
    @ResponseBody
    @GetMapping("/blog/get/{id}")
    public ServerResponse getBlog(@PathVariable("id") Integer id) {
        return blogService.getBlogById(id);
    }


    /**
     * 保存
     * 方法名：saveBlog<br/>
     * 创建人：程程有小棉被啊 <br/>
     * 时间：2018年11月20日 17:51:51<br/>
     * 手机:132xxxx1385<br/>
     *
     * @param blogVo
     * @return ServerResponse<br/>
     * @throws <br/>
     * @since 1.0.0<br/>
     */
    @ResponseBody
    @PostMapping("/blog/save")
    public ServerResponse saveBlog(@Valid BlogVo blogVo) {
        return blogService.saveBlog(blogVo);
    }

    /**
     * 修改
     * 方法名：updateBlog<br/>
     * 创建人：程程有小棉被啊 <br/>
     * 时间：2018年11月20日 17:51:51 <br/>
     * 手机:132xxxx1385<br/>
     *
     * @param blogVo
     * @return ServerResponse<br/>
     * @throws <br/>
     * @since 1.0.0<br/>
     */
    @ResponseBody
    @PostMapping("/blog/update")
    public ServerResponse updateBlog(@Valid BlogVo blogVo) {
        return blogService.updateBlog(blogVo);
    }


    /**
     * 删除
     * 方法名：deleteBlog<br/>
     * 创建人：程程有小棉被啊 <br/>
     * 时间：2018年11月20日 17:51:51 <br/>
     * 手机:132xxxx1385<br/>
     *
     * @param id
     * @return ServerResponse<br/>
     * @throws <br/>
     * @since 1.0.0<br/>
     */
    @ResponseBody
    @PostMapping("/blog/delete/{id}")
    public ServerResponse deleteBlog(@PathVariable("id") Integer id) {
        return blogService.deleteBlogById(id);
    }





}
