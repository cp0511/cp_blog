package com.cp.controller.blogtags;

import com.cp.service.blogtags.IBlogTagsService;
import com.cp.vo.BlogTagsVo;
import com.cp.vo.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * todo:描述Controller控制器类
 * BlogTagsController<br/>
 * 作者:程程有小棉被啊<br/>
 * 创建时间：2018年11月21日 18:00:52 <br/>
 *
 * @version 1.0.0<br/>
 */
@Controller
public class BlogTagsController {

    @Autowired
    private IBlogTagsService blogtagsService;


    /**
     * 方法名：blogtagsdetail<br/>
     * 创建人：程程有小棉被啊 <br/>
     * 时间：2018年11月21日 18:00:52 <br/>
     * 手机:132xxxx1385<br/>
     *
     * @param id
     * @param map
     * @return String<br/>
     * @throws <br/>
     * @since 1.0.0<br/>
     */
    @GetMapping("/blogtags/{id}")
    public String blogtagsdetail(@PathVariable("id") Integer id, ModelMap map) {
        map.addAttribute("id", id);
        return "blogtags/detail";
    }


    /**
     * 查询所有标签
     * 方法名：queryAllTags<br/>
     * 创建人：程程有小棉被啊 <br/>
     * 时间：2018年11月21日 18:00:52 <br/>
     * 手机:132xxxx1385<br/>
     * @return String<br/>
     * @throws <br/>
     * @since 1.0.0<br/>
     */
    @GetMapping("/blogtags/queryAllTags")
    @ResponseBody
    public ServerResponse queryAllTags(BlogTagsVo blogtagsVo) {
        ServerResponse serverResponse = blogtagsService.queryBlogTagsAll(blogtagsVo);
        return serverResponse;
    }


    /**
     * 根据id查询信息
     * 方法名：getBlogTags<br/>
     * 创建人：程程有小棉被啊 <br/>
     * 时间：2018年11月21日 18:00:52 <br/>
     * 手机:132xxxx1385<br/>
     *
     * @param id
     * @return ServerResponse<br/>
     * @throws <br/>
     * @since 1.0.0<br/>
     */
    @ResponseBody
    @GetMapping("/blogtags/get/{id}")
    public ServerResponse getBlogTags(@PathVariable("id") Integer id) {
        return blogtagsService.getBlogTagsById(id);
    }


    /**
     * 保存
     * 方法名：saveBlogTags<br/>
     * 创建人：程程有小棉被啊 <br/>
     * 时间：2018年11月21日 18:00:52<br/>
     * 手机:132xxxx1385<br/>
     *
     * @param blogtagsVo
     * @return ServerResponse<br/>
     * @throws <br/>
     * @since 1.0.0<br/>
     */
    @ResponseBody
    @PostMapping("/blogtags/save")
    public ServerResponse saveBlogTags(@Valid BlogTagsVo blogtagsVo) {
        return blogtagsService.saveBlogTags(blogtagsVo);
    }

    /**
     * 修改
     * 方法名：updateBlogTags<br/>
     * 创建人：程程有小棉被啊 <br/>
     * 时间：2018年11月21日 18:00:52 <br/>
     * 手机:132xxxx1385<br/>
     *
     * @param blogtagsVo
     * @return ServerResponse<br/>
     * @throws <br/>
     * @since 1.0.0<br/>
     */
    @ResponseBody
    @PostMapping("/blogtags/update")
    public ServerResponse updateBlogTags(@Valid BlogTagsVo blogtagsVo) {
        return blogtagsService.updateBlogTags(blogtagsVo);
    }


    /**
     * 删除
     * 方法名：deleteBlogTags<br/>
     * 创建人：程程有小棉被啊 <br/>
     * 时间：2018年11月21日 18:00:52 <br/>
     * 手机:132xxxx1385<br/>
     *
     * @param id
     * @return ServerResponse<br/>
     * @throws <br/>
     * @since 1.0.0<br/>
     */
    @ResponseBody
    @PostMapping("/blogtags/delete/{id}")
    public ServerResponse deleteBlogTags(@PathVariable("id") Integer id) {
        return blogtagsService.deleteBlogTagsById(id);
    }

}
