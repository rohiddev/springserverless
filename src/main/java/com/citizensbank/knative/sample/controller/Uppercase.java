package com.citizensbank.knative.sample.controller;
import java.util.function.Function;

import com.citizensbank.knative.sample.model.Model;



public class Uppercase implements Function<Model, Model> {
    @Override 
    public Model apply(Model model) {
    	String upperCase = model.getValue().toUpperCase();
    	model.setValue(upperCase);
        return model;
    }
}