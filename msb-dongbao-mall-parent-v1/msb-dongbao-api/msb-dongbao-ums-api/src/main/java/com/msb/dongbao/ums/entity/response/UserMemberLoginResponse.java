package com.msb.dongbao.ums.entity.response;

import com.msb.dongbao.ums.entity.UmsMember;
import lombok.Data;

/**
 * @Author HeJie
 * @Date 2022/4/30
 * @Time 15:16
 */
@Data
public class UserMemberLoginResponse {

    private String token;

    private UmsMember umsMember;

}
