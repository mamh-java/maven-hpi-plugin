package org.jenkinsci.maven.plugins.hpi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestInsertionMojoTest {

    @Test
    public void legalizePackageName() {
        assertEquals(
                "org.jenkinsci.maven.plugins.hpi",
                TestInsertionMojo.legalizePackageName("org.jenkinsci.maven.plugins.hpi"));
        assertEquals(
                "_123org.jenkinsci.maven.plugins.hpi",
                TestInsertionMojo.legalizePackageName("123org.jenkinsci.maven.plugins.hpi"));
    }
}
