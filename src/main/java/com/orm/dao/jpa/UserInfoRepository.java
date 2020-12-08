//package com.orm.dao.jpa;
//
//import com.orm.dao.jpa.support.JpaSupportRepository;
//import com.orm.domain.UserInfo;
//import org.springframework.data.jpa.repository.EntityGraph;
//
//import java.util.List;
//
//public interface UserInfoRepository extends JpaSupportRepository<UserInfo, Long> {
//
//
//    @Override
//    @EntityGraph(value = "UserInfo.addressList", type = EntityGraph.EntityGraphType.FETCH)
//    List<UserInfo> findAll();
//}
