package com.jeethu.hospital;

import com.jeethu.hospital.model.Inquiry;
import com.jeethu.hospital.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("inquiry",new Inquiry());
        return "index";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/doctor")
    public String doctor(Model model){
        model.addAttribute("doctors", homeService.getDoctors());
        return "doctor";
    }

    @PostMapping("/doctor")
    public String searchDoctor(Model model, @ModelAttribute Inquiry inquiry){

        String doctorName = inquiry.getSearchString();

        model.addAttribute("doctors", homeService.searchedDoctors(doctorName));

        return "doctor";
    }
}
