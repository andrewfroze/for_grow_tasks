package com.training.an.grow.factory.impl;

import com.training.an.grow.factory.Configuration;
import com.training.an.grow.factory.GarbageCollector;
import com.training.an.grow.factory.Speaker;

import java.util.HashMap;
import java.util.Map;

public class AppConfiguration implements Configuration {
    private Map<Class, Class> interfaceToClass = new HashMap<>();

    public AppConfiguration() {
        interfaceToClass.put(GarbageCollector.class, FullGarbageCollector.class);
        interfaceToClass.put(Speaker.class, LoudSpeaker.class);
    }

    @Override
    public Class getImpl(Class clazz) {
        return interfaceToClass.get(clazz);
    }
}
