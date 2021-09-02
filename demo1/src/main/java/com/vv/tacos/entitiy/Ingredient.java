package com.vv.tacos.entitiy;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @author wlj
 * @date 2021/09/02 15:13
 **/
@Data
@RequiredArgsConstructor
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
