package com.training.an.grow.factory;

public interface Configuration {
    Class getImpl(Class clazz);
}
