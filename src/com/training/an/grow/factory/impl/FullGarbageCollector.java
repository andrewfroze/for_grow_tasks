package com.training.an.grow.factory.impl;

import com.training.an.grow.factory.GarbageCollector;

public class FullGarbageCollector implements GarbageCollector {
    @Override
    public void clean() {
        System.out.println("Full cleaning...");
    }
}
