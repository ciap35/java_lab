package com.java.laboratory.practices.structures.dataTypes.nonLinear.GraphExample;

import org.junit.Test;
import org.junit.Assert;

import java.util.List;

public class DeliveryAreaTest {
    @Test
    public void test() {
        int[][] matrix = {
                {1, 1, 2}, {1, 0, 1}, {0, 1, 1}
        };

        DeliveryArea area = new DeliveryArea(matrix);

        List<Cell> pathToDestination = area.findRoute();
        List<Cell> expectedPath = List.of(
                new Cell(0, 0),
                new Cell(0, 1),
                new Cell(0, 2)
        );
        Assert.assertEquals(expectedPath, pathToDestination);
    }
}
