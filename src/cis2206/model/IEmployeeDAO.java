package cis2206.model;

import java.util.List;

/**
 * IEmployeeDAO is the interface for the Employee Data Access Object. The
 * interface defines the methods that will be used in all DAO implementations
 * for this application. This program currently has both file and database DAO
 * implementations. However, the application code does not care which is used as
 * everything is designed to work through this interface.
 *
 * @author John Phillips
 * @version 20151009
 *
 */
public interface IEmployeeDAO {

    void createRecord(Employee employee);

    Employee retrieveRecordById(int id);

    List<Employee> retrieveAllRecords();

    void updateRecord(Employee updatedEmployee);

    void deleteRecord(int id);

    void deleteRecord(Employee employee);

    @Override
    String toString();

}
