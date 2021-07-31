package com.testApp.demoApp.repository;

import java.util.List;

import com.testApp.demoApp.model.DbMetadata;
import com.testApp.demoApp.model.Table1;

import com.testApp.demoApp.model.Table1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.testApp.demoApp.model.Table1;

@Repository
public interface Table1Repository extends JpaRepository<Table1,Long>{
    /*
    @Query(value = " SELECT * FROM " + DbMetadata.TEST_SCHEMA_PREFIX + DbMetadata.Tables.Table1, nativeQuery = true)
    List<Table1> findAllSample();
    @Query(value = " SELECT * FROM " + DbMetadata.TEST_SCHEMA_PREFIX + DbMetadata.Tables.Table1 + " AS t WHERE t." +DbMetadata.Table1Columns.Id + ":id" , nativeQuery = true)
    List<Table1> findAllSampleById(Long id);
     */
}