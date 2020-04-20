package com.logan.yinkai.service.impl;

import com.logan.yinkai.dao.UserInfo;
import com.logan.yinkai.mapper.UserInfoMapper;
import com.logan.yinkai.service.UserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 学生信息表 服务实现类
 * </p>
 *
 * @author yuan
 * @since 2020-04-03
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
