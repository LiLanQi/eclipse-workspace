package com.xt.util.db;

import java.sql.ResultSet;

public interface IRowMapper<E> {

	E RowMapper(ResultSet resultSet);
}