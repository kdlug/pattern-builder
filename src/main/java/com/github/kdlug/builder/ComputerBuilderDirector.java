package com.github.kdlug.builder;

public class ComputerBuilderDirector {
    public Computer getBasicComputer() {
        return new Computer.Builder("16GB", "2TB", "Intel i7")
                .build();
    }

    public Computer getGraphicsCardEnabledBasicComputer() {
        return new Computer.Builder("16GB", "2TB", "Intel i7")
                .setGraphicCardEnabled(true)
                .build();
    }
}
