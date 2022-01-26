package com.bariekly.javadicoding.accesmodifier.package2;

import com.bariekly.javadicoding.accesmodifier.package1.KelasA;

public class KelasB extends KelasA {

    @Override

    protected void methodC(){
        super.methodC();

        System.out.println("Contoh pemanggilan method dari luar package");
    }


}
