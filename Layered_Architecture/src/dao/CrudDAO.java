package dao;

import db.DBConnection;
import model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CrudDAO<T,ID> {
     ArrayList<T> getAll() throws SQLException, ClassNotFoundException;
    //save customer
     boolean save(T dto) throws SQLException, ClassNotFoundException;

     boolean update(T dto) throws SQLException, ClassNotFoundException;

    T search(ID id)throws SQLException,ClassNotFoundException;

     boolean exist(ID id) throws SQLException, ClassNotFoundException;

     boolean delete(ID id) throws SQLException, ClassNotFoundException;

     String generateNewID() throws SQLException, ClassNotFoundException;

}

