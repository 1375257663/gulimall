package com.qx.gulimall.member.dao;

import com.qx.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author qx
 * @email 1375257663@qq.com
 * @date 2020-07-06 19:59:42
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
