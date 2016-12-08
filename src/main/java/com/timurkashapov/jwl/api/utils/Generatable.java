package com.timurkashapov.jwl.api.utils;

import java.util.Random;

/**
 * Generate members for all.
 * Генерация сущностей.
 * Created by Timur Kashapov on 04.12.2016.
 */
public interface Generatable {

    /**
     * Random.
     */
    Random RANDOM = new Random(System.currentTimeMillis());

    /**
     * Regex pattern.
     */
    String PATTERN = "^[A-Z][A-Z0-9]*(_[A-Z0-9]+)*$";

    /**
     * Generate.
     */
    void generate();
}
