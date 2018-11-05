package com.alevel;

import com.sun.istack.internal.NotNull;

import java.util.Optional;

public class Opionals {
    public static void main(@NotNull String[] args) {
        Optional<String>  opt = Optional.empty();
        opt.orElse("default");
    }
}
