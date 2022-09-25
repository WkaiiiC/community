package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

//给AlphaDaoHibernateImpl起名为alphaHibernate
@Repository("alphaHibernate")
public class AlphaDaoHibernateImpl implements AlphaDao{

    @Override
    public String select() {
        return "Hibernate";
    }
}
