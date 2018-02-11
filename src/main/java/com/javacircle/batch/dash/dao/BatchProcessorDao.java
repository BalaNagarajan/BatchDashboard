package com.javacircle.batch.dash.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.javacircle.batch.domain.StudDept;

@Repository
public class BatchProcessorDao {

	private final String FETCH_SQL = "SELECT COUNT(*) AS STUD_COUNT,DEPT_NAME FROM TEST.stud_dept GROUP BY DEPT_NAME";

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<StudDept> findStudentByDepartment() {
		return jdbcTemplate.query(FETCH_SQL, new StudDeptMapper());
	}

	class StudDeptMapper implements RowMapper {

		@Override
		public StudDept mapRow(ResultSet rs, int rowNum) throws SQLException {
			StudDept studDeptObj = new StudDept();
			studDeptObj.setStudCount(rs.getString("STUD_COUNT"));
			studDeptObj.setDeptName(rs.getString("DEPT_NAME"));
			return studDeptObj;
		}

	}
}
