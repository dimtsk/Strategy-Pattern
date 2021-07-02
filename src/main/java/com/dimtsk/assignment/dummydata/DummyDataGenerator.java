package com.dimtsk.assignment.dummydata;

import com.dimtsk.assignment3.model.Color;
import com.dimtsk.assignment3.model.Fabric;
import com.dimtsk.assignment3.model.Size;
import java.util.Random;

public class DummyDataGenerator {

    public DummyDataGenerator() {
    }

    public Color randomColor() {
        Random random = new Random();//ganarates random integer

        Color randomColor;

        randomColor = Color.values()[random.nextInt(
                Color.values().length)];

        return randomColor;
    }

    public Size randomSize() {
        Random random = new Random();

        Size randomSize;

        randomSize = Size.values()[random.nextInt(
                Size.values().length)];

        return randomSize;
    }

    public Fabric randomFabric() {
        Random random = new Random();

        Fabric randomFabric;

        randomFabric = Fabric.values()[random.nextInt(
                Fabric.values().length)];

        return randomFabric;
    }

}
