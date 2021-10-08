package com.footballersAPI.footballlegends.repository;

import com.footballersAPI.footballlegends.entity.Legend;

import java.util.ArrayList;
import java.util.List;

public class LegendRepository {
    //mocking the database
    private List<Legend> legendDatabase = new ArrayList<Legend>(List.of(
            new Legend(1, "Johan Cruyff", "Dutch", 1947),
            new Legend(2, "Diego Armando Maradona", "Argentinian", 1960),
            new Legend(3, "Ronaldinho Gáucho", "Brazilian", 1980)
    ));

    public List<Legend> findAllLegends() {
        return legendDatabase;
    }

    public Legend findLegendById(int id) {
        Legend selectedLegendById = legendDatabase.stream()
                .filter((legend) -> legend.getId() == id)
                .findFirst()
                .orElse(null);
        return selectedLegendById;
    }

    public void addLegend(Legend newLegend) {
        legendDatabase.add(newLegend);
    }
}
