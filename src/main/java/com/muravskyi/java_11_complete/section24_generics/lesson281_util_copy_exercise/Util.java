package com.muravskyi.java_11_complete.section24_generics.lesson281_util_copy_exercise;

import com.muravskyi.java_11_complete.section24_generics.lesson271_simple_hierarchy.hierarchy.Mammal;
import com.muravskyi.java_11_complete.section24_generics.lesson276_array.Array;

public class Util {

    public static void copy(Array<? extends Mammal> scr, Array<? super Mammal> dest) {
        for (int i = 0; i < scr.size(); i++) {
            dest.add(scr.getIndex(i));
        }
    }

}
