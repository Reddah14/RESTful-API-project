package com.footballersAPI.footballlegends.repository;

import com.footballersAPI.footballlegends.entity.Legend;

import java.util.List;

 public interface ILegendRepository {
    public List<Legend> findAllLegends();
    public Legend findLegendById(int id);
    public Boolean addLegend(Legend newLegend);
    public Legend editLegendById(int id, Legend updatedLegend);
    public Boolean removeLegendById(int id);
}
