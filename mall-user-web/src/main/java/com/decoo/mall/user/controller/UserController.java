package com.decoo.mall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.decoo.mall.common.bean.UmsMember;
import com.decoo.mall.common.bean.UmsMemberReceiveAddress;
import com.decoo.mall.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mall/user")
public class UserController {
    @Reference
    private UserService userService;

    @GetMapping("/all")
    public List<UmsMember> getAllUser() {

        return userService.getAllUser();
    }
    @GetMapping("/address/{id}")
    public List<UmsMemberReceiveAddress> getAddressByMemberId(@PathVariable("id") String memberId) {
        return userService.getReceivedAddressByMemberId(memberId);
    }

}
