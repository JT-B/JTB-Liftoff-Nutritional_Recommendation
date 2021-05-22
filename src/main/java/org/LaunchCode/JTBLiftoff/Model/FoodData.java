package org.LaunchCode.JTBLiftoff.Model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;


import java.util.ArrayList;

public class FoodData extends AbstractEntity{

    Gson gson = new Gson();

    class MyModel {
        private FoodInfo foodInfo;
        private ArrayList<Nutrient> nutrients = new ArrayList<>();
    }

    class FoodInfo {
        private String text;
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

    MyModel model = gson.fromJson("https://api.edamam.com/api/food-database/v2/parser?ingr=steak&app_id=6558ef1a&app_key=076610da98e992b84c57d7740a258a0d \t", MyModel.class);
}
