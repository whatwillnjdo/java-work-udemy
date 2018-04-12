package com.zz.otherclasses;

import org.hamcrest.core.Is;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public final class SwitchAroundTest {
    @Test
    public void ShouldReturnAIfFound(){
        SwitchAround switchAround = new SwitchAround();
        String actual = switchAround.methodWithSwitch('A');
        assertThat(actual, Is.is("Value entered is A"));
    }

    @Test
    public void ShouldReturnNotFoundIfOtherThanABCDEIsEntered() {
        SwitchAround switchAround = new SwitchAround();
        String actual = switchAround.methodWithSwitch('W');
        assertThat(actual, Is.is("Not found"));
    }

    @Test
    public void ShouldReturnABCDEIfFound() {
        SwitchAround switchAround = new SwitchAround();
        String actual = switchAround.methodWithSwitch('C');
        assertThat(actual, Is.is("Value entered is C"));
    }
}
