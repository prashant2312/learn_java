package com.company;

import java.util.Optional;

public class OptionalClass {
    public static Optional<String> getName(){
        String name="Prashant";
        return Optional.ofNullable(name);
    }
    public static void main(String[] args) {
        String str = null;
        Optional<String> optional = Optional.ofNullable(str);
//        System.out.println(optional.stream());
//        System.out.println(optional.orElse("No value in this object"));

        Optional<String> name = getName();
        System.out.println(name.orElse("Null return"));

    }
}
