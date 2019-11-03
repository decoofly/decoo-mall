package com.decoo.mall.service;


import com.decoo.mall.common.bean.UmsMember;
import com.decoo.mall.common.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceivedAddressByMemberId(String memberId);
}
