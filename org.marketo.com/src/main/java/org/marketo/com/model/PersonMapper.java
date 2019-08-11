package org.marketo.com.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

//For fetching data from database we need to implement interface RowMapper. This interface has only one method mapRow(ResultSet resultSet, int i), which will return one instance of our model class (i.e. Person).

public class PersonMapper implements RowMapper<Person> {

	public Person mapRow(ResultSet resultSet, int i) throws SQLException {

		Person person = new Person();
		person.setId(resultSet.getLong("id"));
		person.setFirstName(resultSet.getString("first_name"));
		person.setLastName(resultSet.getString("last_name"));
		person.setAge(resultSet.getInt("age"));
		return person;
	}

}
