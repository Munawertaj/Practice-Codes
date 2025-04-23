package com.brainstation23.studentApp.dao;

import com.brainstation23.studentApp.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class StudentJdbcRepository {

    private static final String SELECT_ALL = "select * from students";
    private static final String INSERT  = "insert into students (name,age,email,department) VALUES (?,?,?,?)";
    private static final String UPDATE  = "UPDATE students SET name=?, age=?, email=?, department=? WHERE id=?";
    private static final String SELECT_BY_ID= "SELECT * FROM students WHERE id = ?";
    private static final String DELETE  = "DELETE FROM students WHERE id=?";

    private final JdbcTemplate jdbc;

    public StudentJdbcRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public static final class StudentRowMapper implements RowMapper<Student> {
        @Override
        public Student mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
            return new Student(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getInt("age"),
                    resultSet.getString("email"),
                    resultSet.getString("department")
            );
        }
    }

    public List<Student> findAll() {
        return jdbc.query(SELECT_ALL, new StudentRowMapper());
    }

    public void save(Student student) {
        jdbc.update(
                INSERT,
                student.getName(), student.getAge(), student.getEmail(), student.getDepartment());
    }

    public Student findById(int id) {
        return jdbc.queryForObject(SELECT_BY_ID, new StudentRowMapper(), id);
    }

    public void update(Student student) {
        jdbc.update(
                UPDATE,
                student.getName(), student.getAge(), student.getEmail(), student.getDepartment(), student.getId());
    }

    public void deleteById(int id) {
        jdbc.update(DELETE, id);
    }
}
