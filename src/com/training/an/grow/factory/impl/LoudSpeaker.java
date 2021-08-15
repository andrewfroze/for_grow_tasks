package com.training.an.grow.factory.impl;

import com.training.an.grow.factory.Speaker;

public class LoudSpeaker implements Speaker {
    @Override
    public void speak(String message) {
        System.out.println(message);
    }
}
