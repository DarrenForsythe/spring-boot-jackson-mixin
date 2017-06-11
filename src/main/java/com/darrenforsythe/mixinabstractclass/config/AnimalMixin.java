package com.darrenforsythe.mixinabstractclass.config;

import com.darrenforsythe.mixinabstractclass.model.Cat;
import com.darrenforsythe.mixinabstractclass.model.Dog;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({ @Type(value = Cat.class, name = "cat"), @Type(value = Dog.class, name = "dog") })
public abstract class AnimalMixin {

}