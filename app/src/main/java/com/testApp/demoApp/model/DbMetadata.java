package com.testApp.demoApp.model;


/**
 * Constants for database metadata
 */

public final class DbMetadata{
    private DbMetadata(){
    }

    public static final String TEST_SCHEMA = "test";
    public static final String TEST_SCHEMA_PREFIX = TEST_SCHEMA + '.';

    /**
     * Tables in the schema
     */
    public static class Tables{
        private Tables(){
        }
        public static final String TABLE_1 = "table_1";
    }
    /**
     * Sequence in the schema
     */
    public static class Sequences{
        private Sequences(){
        }
        public static final String TABLE_1_SEQ = TEST_SCHEMA_PREFIX + "TABLE_1_SEQ";
    }
    /**
     * Sequence in the schema
     */
    public static class Table1Columns{
        private Table1Columns(){
        }
        public static final String ID = "id";
        public static final String FIELD_1 = "field_1";
    }
}