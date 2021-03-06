package com.huangyingsheng.web.service;

import com.huangyingsheng.web.entity.BlogsDO;
import com.huangyingsheng.web.model.request.BlogsRequestVO;
import com.huangyingsheng.web.model.request.GetBlogMDUrlRequestVO;
import com.huangyingsheng.web.model.response.BaseResponse;
import com.huangyingsheng.web.model.response.BlogsResponseVO;
import com.huangyingsheng.web.model.response.GetFrindsResponseVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BlogService {

    BaseResponse<List<BlogsResponseVO>> getBlogs(BlogsRequestVO request);

    BaseResponse<BlogsDO> getBlogMDUrl(GetBlogMDUrlRequestVO request);

    BaseResponse<List<GetFrindsResponseVO>> getFrinds();

}
