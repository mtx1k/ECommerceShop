package dci.j24e01.ECommerceShop.controllers;

import dci.j24e01.ECommerceShop.models.Category;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CategoryController {

    @GetMapping("/categories/add")
    public String add() {
        return "categories_add";
    }

    @PostMapping("/categories/add")
    public String postAdd(@ModelAttribute Category category) {
        //model.addAttribute();
        return "redirect:/categories/add";
    }

}
