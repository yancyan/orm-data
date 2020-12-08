//package com.orm.domain;
//
//import javax.persistence.*;
//import java.util.List;
//
///**
// * 解决N+1问题, 不推荐 oneToMany 外键映射
// */
//@NamedEntityGraph(
//        name = "UserInfo.addressList",
//        attributeNodes = {
//                @NamedAttributeNode("addresses")
//        }
//)
//@Table("user_info")
//@Entity
//public class UserInfo {
//
//    private String name;
//
//    @OneToMany(fetch = FetchType.LAZY)
//    @JoinColumn(name = "address_id", referencedColumnName = "id")
//    private List<Address> addresses;
//}
