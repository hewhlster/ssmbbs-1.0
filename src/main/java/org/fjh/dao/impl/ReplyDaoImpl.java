package org.fjh.dao.impl;

import java.util.List;

import org.fjh.entity.*;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//@Repository
public class ReplyDaoImpl {
	@Autowired
	private SqlSessionTemplate session;
	
	public List<Reply> getById(Integer topicid) {
		return session.selectList("sreplybytid", topicid);
	}

	public Integer insert(Reply reply) {
		return  session.insert("insertreply", reply);
	}

}
