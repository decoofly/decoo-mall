package com.decoo.mall.user.service.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.decoo.mall.common.bean.UmsMember;
import com.decoo.mall.common.bean.UmsMemberReceiveAddress;
import com.decoo.mall.service.UserService;
import com.decoo.mall.user.mapper.UmsMemberReceiveAddressMapper;
import com.decoo.mall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Service
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    public List<UmsMember> getAllUser() {
        return userMapper.selectAll();
    }

    public List<UmsMemberReceiveAddress> getReceivedAddressByMemberId(String memberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        return umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
    }
}
