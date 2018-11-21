package com.cp.service.blogtags;

import com.cp.vo.ServerResponse;
import com.cp.vo.BlogTagsVo;

public interface IBlogTagsService {

    /**
     * 保存描述
     * 方法名：saveBlogTags<br/>
     * 创建人：程程有小棉被啊 <br/>
     * 时间：2018年9月26日-下午7:11:44 <br/>
     * 手机:1564545646464<br/>
     *
     * @return ServerResponse<br/>
     * @throws <br/>
     * @since 1.0.0<br/>
     */
    public ServerResponse saveBlogTags(BlogTagsVo blogtagsVo);

    /**
     * (修改描述)<br/>
     * 方法名：updateBlogTags<br/>
     * 创建人：程程有小棉被啊 <br/>
     * 时间：2018年11月21日 18:00:52 <br/>
     * 手机:1564545646464<br/>
     *
     * @return ServerResponse<br/>
     * @throws <br/>
     * @since 1.0.0<br/>
     */
    public ServerResponse updateBlogTags(BlogTagsVo blogtagsVo);

    /**
     * (根据id删除描述)<br/>
     * 方法名：deleteBlogTagsById<br/>
     * 创建人：程程有小棉被啊 <br/>
     * 时间：2018年11月21日 18:00:52 <br/>
     * 手机:1564545646464<br/>
     *
     * @param id
     * @return ServerResponse<br/>
     * @throws <br/>
     * @since 1.0.0<br/>
     */
    public ServerResponse deleteBlogTagsById(Integer id);

    /**
     * (根据id获取描述)<br/>
     * 方法名：getBlogTagsById<br/>
     * 创建人：程程有小棉被啊 <br/>
     * 时间：2018年11月21日 18:00:52 <br/>
     * 手机:1564545646464<br/>
     *
     * @param id
     * @return ServerResponse<br/>
     * @throws <br/>
     * @since 1.0.0<br/>
     */
    public ServerResponse getBlogTagsById(Integer id);

    /**
     * (查询所有的描述)<br/>
     * 方法名：queryBlogTagsAll<br/>
     * 创建人：程程有小棉被啊 <br/>
     * 时间：2018年11月21日 18:00:52 <br/>
     * 手机:1564545646464<br/>
     *
     * @return ServerResponse<br/>
     * @throws <br/>
     * @since 1.0.0<br/>
     */
    public ServerResponse queryBlogTagsAll(BlogTagsVo blogtagsVo);
}
