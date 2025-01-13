package com.saurabh.SpringJDBCex.repository;

import com.saurabh.SpringJDBCex.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class StudentRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student s){
        String sql = "insert into student(rollNo, name, marks) values (?,?,?)";

        int rows = jdbc.update(sql, s.getRollNo(), s.getName(), s.getMarks());
        System.out.println(rows + " effected");
    }

    public List<Student> findAll(){
        String sql  = "select * from student";
        return jdbc.query(sql,(rs,rowNum) ->{
            Student s = new Student();
            s.setRollNo(rs.getInt("rollNo"));
            s.setName(rs.getString("name"));
            s.setMarks(rs.getInt("marks"));

            return s;
        });
    }

}
