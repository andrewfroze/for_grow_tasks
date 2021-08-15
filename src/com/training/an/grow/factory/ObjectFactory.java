package com.training.an.grow.factory;

import com.training.an.grow.factory.impl.AppConfiguration;

public enum ObjectFactory {
    INSTANCE;
    private Configuration configuration = new AppConfiguration();

    public <T> T createClass(Class<T> clazz) throws InstantiationException, IllegalAccessException {
        Class implementation = null;
        if (clazz.isInterface()) {
            implementation = configuration.getImpl(clazz);
        }
        return (T) implementation.newInstance();
    }
}
