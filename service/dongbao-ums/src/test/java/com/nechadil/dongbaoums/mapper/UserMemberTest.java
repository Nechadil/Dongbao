package com.nechadil.dongbaoums.mapper;

import com.nechadil.dongbaoums.entity.UmsMember;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Nehcadil
 * @datetime 2021/3/8 10:07
 */
@SpringBootTest
public class UserMemberTest {
	@Autowired
	UmsMemberMapper umsMemberMapper;

	@Test
	void testInsertThenDelete() {
		UmsMember member = new UmsMember();
		member.setUsername("toto");
		umsMemberMapper.insert(member);
		umsMemberMapper.deleteById(61);
	}
}
