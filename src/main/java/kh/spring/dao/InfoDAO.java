package kh.spring.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kh.spring.dto.ColScheduleDTO;
import kh.spring.dto.InfoBoardDTO;
import kh.spring.dto.TakingClassDTO;

@Repository
public class InfoDAO {
	
	@Autowired
	private SqlSession db;

	public int login(String id, String pw) {
		Map<String, String> param = new HashMap<>();
		param.put("id",id);
		param.put("pw",pw);
		return db.selectOne("Info.login", param);
	}

	public String getName(String id, String pw) {
		Map<String, String> param = new HashMap<>();
		param.put("id",id);
		param.put("pw",pw);
		return db.selectOne("Info.getName", param);
	}

	public String getMajor(String id, String pw) {
		Map<String, String> param = new HashMap<>();
		param.put("id",id);
		param.put("pw",pw);
		return db.selectOne("Info.getMajor", param);
	}

	public List<InfoBoardDTO> getRecentStd() {
		return db.selectList("Info.recentStd");
	}

	public List<InfoBoardDTO> getRecentScholar() {
		return db.selectList("Info.recentScholar");
	}

	public List<InfoBoardDTO> getRecentEnter() {
		return db.selectList("Info.recentEnter");
	}

	public List<TakingClassDTO> takingClass(String id, Date tocharDate) {
		Map<String, Object> param = new HashMap<>();
		param.put("id",id);
		param.put("classRegDate",tocharDate);
		return db.selectList("Info.takingClass_std", param);
	}

	public List<TakingClassDTO> takingClass(String id, String semester, Date tocharDate) {
		Map<String, Object> param = new HashMap<>();
		param.put("id",id);
		param.put("semester",semester);
		param.put("classOpenDate",tocharDate);
		return db.selectList("Info.takingClass_pro", param);
	}

	public List<TakingClassDTO> classSche(String id, Date tocharDate) {
		Map<String, Object> param = new HashMap<>();
		param.put("id",id);
		param.put("classRegDate",tocharDate);
		return db.selectList("Info.takingClass_std", param);
	}

	public List<TakingClassDTO> classSche(String id, String semester, Date tocharDate) {
		Map<String, Object> param = new HashMap<>();
		param.put("id",id);
		param.put("semester",semester);
		param.put("classOpenDate",tocharDate);
		return db.selectList("Info.takingClass_pro", param);
	}

	public List<ColScheduleDTO> getColSchedule(Date tocharDate) {
		return db.selectList("Info.getColSchedule",tocharDate);
	}

	public List<ColScheduleDTO> get4ColSchedule(Date mainLogin4_date) {
		return db.selectList("Info.get4ColSchedule",mainLogin4_date);
	}
	
	public List<ColScheduleDTO> getMainSchedule(Date mainDate) {
		return db.selectList("Info.getColSchedule", mainDate);
	}

	public String findIDPW(Map<String, String> parm) {
		return db.selectOne("Info.findIDPW", parm);
	}

	public int changePW(Map<String, String> parm) {
		return db.update("Info.changePW", parm);
	}

	public int getUnreadMailNum(String id) {
		return db.selectOne("Info.getUnreadMailNum",id);
	}
}
