package org.LaunchCode.JTBLiftoff.Controllers;

import org.LaunchCode.JTBLiftoff.Model.FoodData;
import org.LaunchCode.JTBLiftoff.Model.data.FoodDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("Food")
public class FoodController {

    @Autowired
    private FoodDataRepository foodDataRepository;

    @GetMapping("addFood")
    public String displayAddFoodForm(Model model) {

        model.addAttribute(new FoodData());
        return "Food/addFood";
    }

    @PostMapping("addFood")
    public String processAddFoodForm(@ModelAttribute @Valid FoodData newFoodData, Errors errors, Model model) {

        if (errors.hasErrors()) {
            return "Food/addFood";
        }
        foodDataRepository.save(newFoodData);
        return "redirect";
    }

}
