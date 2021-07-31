package com.testApp.demoApp.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import static javax.persistence.GenerationType.SEQUENCE;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

import static com.testApp.demoApp.model.DbMetadata.TEST_SCHEMA;
import static com.testApp.demoApp.model.DbMetadata.Table1Columns;
import static com.testApp.demoApp.model.DbMetadata.Sequences.TABLE_1_SEQ;
import static com.testApp.demoApp.model.DbMetadata.Tables.TABLE_1;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = TEST_SCHEMA, name = TABLE_1)
public class Table1 {
    @Id
    @GeneratedValue( strategy = SEQUENCE, generator = TABLE_1_SEQ)
    @SequenceGenerator( name = TABLE_1_SEQ, sequenceName = TABLE_1_SEQ, allocationSize = 1)
    @Column(name = Table1Columns.ID, nullable = false)
    private Long id;

    @Column(name = Table1Columns.FIELD_1, nullable = false)
    private String field1;

    /*
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = Table2.ID, nullable = false)
    private List<Table2> table2 = new ArrayList<>();
    */
    /*
    For table 2 :
    public Table2(String column1){
        this.column1 = column1;
    }
     */
}