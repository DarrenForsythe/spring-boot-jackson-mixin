# MixIn example #

MixIn's allow applying Jackson annotations/configuration to classes you can't edit directly.

## AnimalMixIn ##

Contains the Jackson annotations used to configure how a `Dog` or `Cat` should be read to the `Animal` class. 

## Animal ##

Abstract class which `Dog` and `Cat` inherit.

## MinabstractclassApplication ##

Configures Jackson, more specifically, the `ObjectMapper` at it's heart to use the `AnimalMixin.class` to deserialise or serialise the `Cat` or `Dog` to an `Animal`

## ControllerTest ##

Posts a `Cat`, and `Dog` to the `Controller` via a POST mapped to `/`. Logs the animal class and returns the animal in a `ResponseEntity` with an http status of `200`/`OK`

As this is a `@WebMvcTest` slice test we have to import the jackson configuration as the slice tests only reads from the main application class.