package com.github.kdlug.builder;

public class Computer {
    // required
    private String RAM;
    private String HDD;
    private String CPU;

    // optional
    private boolean isGraphicCardEnabled;
    private boolean isBluetoothEnabled;

    // private constructor with builder as an argument
    // it will be acessible from Builder build() method
    private Computer(Builder builder) {
        this.HDD = builder.HDD;
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.isGraphicCardEnabled = builder.isGraphicCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    // This class shoud contains only getters without setters
    public String getRAM() {
        return RAM;
    }

    public String getHDD() {
        return HDD;
    }

    public String getCPU() {
        return CPU;
    }

    public boolean isGraphicCardEnabled() {
        return isGraphicCardEnabled;
    }

    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    // builder class - static and nested (we can use private constructor of Computer class
    public static class Builder {
        // required
        private String RAM;
        private String HDD;
        private String CPU;

        // optional
        private boolean isGraphicCardEnabled;
        private boolean isBluetoothEnabled;

        // create constructor for builder with all required parameters
        public Builder(String RAM, String HDD, String CPU) {
            this.RAM = RAM;
            this.HDD = HDD;
            this.CPU = CPU;
        }

        // methods for optional parameters
        // only setters
        // should return an instance of builder

        public Builder setGraphicCardEnabled(boolean graphicCardEnabled) {
            isGraphicCardEnabled = graphicCardEnabled;
            return this;
        }

        public Builder setBluetoothEnabled(boolean bluetoothEnabled) {
            isBluetoothEnabled = bluetoothEnabled;
            return this;
        }

        // method which will get an instance of Computer
        public Computer build() {
            return new Computer(this);
        }

    }
}
