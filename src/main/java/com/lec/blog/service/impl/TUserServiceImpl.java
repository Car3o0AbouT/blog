package com.lec.blog.service.impl;

import com.lec.blog.entity.TUser;
import com.lec.blog.mapper.TUserMapper;
import com.lec.blog.service.ITUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lec
 * @since 2019-06-20
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

}
