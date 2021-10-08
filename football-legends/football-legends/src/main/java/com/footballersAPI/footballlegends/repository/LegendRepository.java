package com.footballersAPI.footballlegends.repository;

import com.footballersAPI.footballlegends.entity.Legend;

import java.util.ArrayList;
import java.util.List;

public class LegendRepository {
    private List<Legend> legendDatabase = new ArrayList<Legend>(List.of(
            new Legend(1, "Johan Cruyff", "Dutch", 1947),
            new Legend(1, "Diego Armando Maradona", "Argentinian", 1960),
            new Legend(1, "Ronaldinho Gáucho", "Brazilian", 1980)
    ));

    public List<Legend> findAllLegends() {
        return legendDatabase;
    }
}
