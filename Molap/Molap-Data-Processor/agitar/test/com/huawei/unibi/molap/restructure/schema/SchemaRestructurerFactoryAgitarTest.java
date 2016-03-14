/**
 * Generated by Agitar build: AgitarOne Version 5.3.0.000022 (Build date: Jan 04, 2012) [5.3.0.000022]
 * JDK Version: 1.6.0_14
 *
 * Generated on Jul 31, 2013 6:23:01 PM
 * Time to generate: 00:08.971 seconds
 *
 */

package com.huawei.unibi.molap.restructure.schema;

import com.agitar.lib.junit.AgitarTestCase;
import com.huawei.unibi.molap.restructure.schema.model.CubeBean;

public class SchemaRestructurerFactoryAgitarTest extends AgitarTestCase {
    
    public Class getTargetClass()  {
        return SchemaRestructurerFactory.class;
    }
    
    public void testConstructor() throws Throwable {
        new SchemaRestructurerFactory();
        assertTrue("Test call resulted in expected outcome", true);
    }
    
    public void testGetSchemaRestructurer() throws Throwable {
        CubeBean[] cubes = new CubeBean[0];
        SchemaRestructurer result = SchemaRestructurerFactory.getSchemaRestructurer(null, cubes);
        assertNull("result", result);
    }
    
    public void testGetSchemaRestructurerThrowsNoClassDefFoundError() throws Throwable {
        CubeBean[] cubes = new CubeBean[0];
        try {
            SchemaRestructurerFactory.getSchemaRestructurer(StoreType.INMEMORY, cubes);
            fail("Expected NoClassDefFoundError to be thrown");
        } catch (NoClassDefFoundError ex) {
            assertEquals("ex.getMessage()", "com/huawei/unibi/molap/keygenerator/KeyGenException", ex.getMessage());
            assertThrownBy(Class.class, ex);
        }
    }
}
