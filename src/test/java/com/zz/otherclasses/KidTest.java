package com.zz.otherclasses;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;

public final class KidTest {
    @Test
    public void ShouldReturnOnlyPeopleUnder18() throws Exception {
        final Kid kid1 = new Kid("Kiaan", 1);
        final Kid kid2 = new Kid("Amit", 9);
        final Kid kid3 = new Kid("Nunu", 20);
        final List<Kid> actual = asList(kid1, kid2, kid3);
        //assertThat(com.zz.otherclasses.Kid.readyToGetOut(actual)).contains(kid3);
    }
}
