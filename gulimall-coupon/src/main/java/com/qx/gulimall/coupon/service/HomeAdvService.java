package com.qx.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qx.common.utils.PageUtils;
import com.qx.gulimall.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author qx
 * @email 1375257663@qq.com
 * @date 2020-07-06 19:54:16
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

