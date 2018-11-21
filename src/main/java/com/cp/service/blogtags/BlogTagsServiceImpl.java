package com.cp.service.blogtags;


import com.cp.mapper.BlogTagsMapper;
import com.cp.pojo.BlogTags;
import com.cp.vo.BlogTagsVo;
import com.cp.vo.ServerResponse;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 
 * todo:描述Service实现类
 * BlogTagsServiceImpl<br/>
 * 作者:程程有小棉被啊<br/>
 * 创建时间：2018年11月21日 18:00:52 <br/>
 * @version 1.0.0<br/>
 *
 */
@Service
public class BlogTagsServiceImpl implements IBlogTagsService  {

	@Autowired
	private BlogTagsMapper blogtagsMapper;
	
	public ServerResponse queryBlogTagsAll(BlogTagsVo blogtagsVo){
		PageHelper.startPage(blogtagsVo.getPageNo(), blogtagsVo.getPageSize());
		List<BlogTags> blogtagss = blogtagsMapper.queryBlogTagsAll(blogtagsVo);
		PageInfo<BlogTags> pageInfo = new PageInfo<>(blogtagss);
		return ServerResponse.createBySuccess(pageInfo);
	}
	
	@Override
	public ServerResponse saveBlogTags(BlogTagsVo blogtagsVo) {
		BlogTags blogtags = new BlogTags();
		BeanUtils.copyProperties(blogtagsVo, blogtags);
		int count = blogtagsMapper.saveBlogTags(blogtags);
		return count>0?ServerResponse.createBySuccess(blogtags):ServerResponse.createByError();
	}

	
	@Override
	public ServerResponse updateBlogTags(BlogTagsVo blogtagsVo) {
		BlogTags blogtags = new BlogTags();
		BeanUtils.copyProperties(blogtagsVo, blogtags);
		int count = blogtagsMapper.updateBlogTags(blogtags);
		return count>0?ServerResponse.createBySuccess(blogtags):ServerResponse.createByError();
	}

	
	@Override
	public ServerResponse deleteBlogTagsById(Integer id) {
		int count = blogtagsMapper.deleteBlogTagsById(id);
		return count>0?ServerResponse.createBySuccess():ServerResponse.createByError();
	}

	
	@Override
	public ServerResponse getBlogTagsById(Integer id) {
		BlogTags blogtags = blogtagsMapper.getBlogTagsById(id);
		return blogtags!=null?ServerResponse.createBySuccess(blogtags):ServerResponse.createByError();
	}
	
	
}
