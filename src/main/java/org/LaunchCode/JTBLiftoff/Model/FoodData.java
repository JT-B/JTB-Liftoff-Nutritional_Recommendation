package org.LaunchCode.JTBLiftoff.Model;
import org.LaunchCode.JTBLiftoff.Controllers.FoodController;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Objects;

@Entity
public class FoodData{

    @Id
    @GeneratedValue
    private int id;

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoodData that = (FoodData) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    Gson gson = new Gson();
    MyModel foodModel = gson.fromJson("https://api.edamam.com/api/food-database/v2/parser?ingr=steak&app_id=6558ef1a&app_key=076610da98e992b84c57d7740a258a0d \t", MyModel.class);


    class MyModel {
        private FoodInfo foodInfo;
        private ArrayList<Nutrient> nutrients = new ArrayList<>();
    }

    class FoodInfo {
        @SerializedName("text")
        private String foodName;
        private String image;
    }

    class Nutrient {

        @SerializedName("ENERC_KCAL")
        private Integer calories;

        @SerializedName("PROCNT")
        private Integer protein;

        private Integer FAT;

        @SerializedName("CHOCDF")
        private Integer carbs;

        @SerializedName("FIBTG")
        private Integer fiber;
    }


}
