package member;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired private MemberDAO dao;
	
	@Override
	public boolean member_insert(MemberVO vo) {

		return false;
	}

	@Override
	public MemberVO member_login(HashMap<String, String> map) {
		System.out.println(map.get("pwd"));
		return dao.member_login(map);
	}

	@Override
	public boolean member_update(MemberVO vo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean member_delete(String userid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean member_id_check(String userid) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
}
