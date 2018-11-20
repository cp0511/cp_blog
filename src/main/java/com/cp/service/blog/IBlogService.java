package com.cp.service.blog;

import com.cp.vo.ServerResponse;
import com.cp.vo.BlogVo;

public interface IBlogService {

    /**
     * 保存描述
     * 方法名：saveBlog<br/>
     * 创建人：程程有小棉被啊 <br/>
     * 时间：2018年9月26日-下午7:11:44 <br/>
     * 手机:1564545646464<br/>
     *
     * @return ServerResponse<br/>
     * @throws <br/>
     * @since 1.0.0<br/>
     */
    public ServerResponse saveBlog(BlogVo blogVo);

    /**
     * (修改描述)<br/>
     * 方法名：updateBlog<br/>
     * 创建人：程程有小棉被啊 <br/>
     * 时间：2018年11月20日 17:51:51 <br/>
     * 手机:1564545646464<br/>
     *
     * @return ServerResponse<br/>
     * @throws <br/>
     * @since 1.0.0<br/>
     */
    public ServerResponse updateBlog(BlogVo blogVo);

    /**
     * (根据id删除描述)<br/>
     * 方法名：deleteBlogById<br/>
     * 创建人：程程有小棉被啊 <br/>
     * 时间：2018年11月20日 17:51:51 <br/>
     * 手机:1564545646464<br/>
     *
     * @param id
     * @return ServerResponse<br/>
     * @throws <br/>
     * @since 1.0.0<br/>
     */
    public ServerResponse deleteBlogById(Integer id);

    /**
     * (根据id获取描述)<br/>
     * 方法名：getBlogById<br/>
     * 创建人：程程有小棉被啊 <br/>
     * 时间：2018年11月20日 17:51:51 <br/>
     * 手机:1564545646464<br/>
     *
     * @param id
     * @return ServerResponse<br/>
     * @throws <br/>
     * @since 1.0.0<br/>
     */
    public ServerResponse getBlogById(Integer id);

    /**
     * (查询所有的描述)<br/>
     * 方法名：queryBlogAll<br/>
     * 创建人：程程有小棉被啊 <br/>
     * 时间：2018年11月20日 17:51:51 <br/>
     * 手机:1564545646464<br/>
     *
     * @return ServerResponse<br/>
     * @throws <br/>
     * @since 1.0.0<br/>
     */
    public ServerResponse queryBlogAll(BlogVo blogVo);

    /**
     * 查询
     * @param pageNo
     * @param pageSize
     * @return
     */
    public ServerResponse queryBlog(int pageNo,int pageSize);












}
