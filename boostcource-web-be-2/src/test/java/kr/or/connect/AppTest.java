package kr.or.connect;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Test;

public class AppTest extends TestCase {

    public AppTest( String testName ) {
        super(testName);
    }

    public static Test suite(){
        return new TestSuite(AppTest.class);
    }

    public void testApp(){
        assertTrue(true);
    }
}
