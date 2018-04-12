package com.zz.otherclasses;

public final class SwitchAround {
    public String methodWithSwitch(char switchvariable) {
        switch (switchvariable) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                return "Value entered is "+switchvariable;
            default:
                return "Not found";
        }
    }
}
