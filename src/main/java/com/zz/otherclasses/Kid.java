package com.zz.otherclasses;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

public final class Kid {
    int age;
    String name;

    public Kid(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Set<String> readyToGetOut(List<Kid> kidList) {
        return kidList.stream()
                .filter(kid -> kid.getAge() <18)
                .map(Kid::getName)
                .collect(toSet());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
