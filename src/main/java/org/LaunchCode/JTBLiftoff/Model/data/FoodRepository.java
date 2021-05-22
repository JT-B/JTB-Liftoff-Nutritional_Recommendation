package org.LaunchCode.JTBLiftoff.Model.data;

import org.LaunchCode.JTBLiftoff.Model.FoodData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends CrudRepository<FoodData, Integer> {
}
