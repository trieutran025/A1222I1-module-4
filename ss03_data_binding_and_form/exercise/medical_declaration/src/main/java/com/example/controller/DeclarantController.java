package com.example.controller;

import com.example.service.DeclarantServiceI;
import com.example.service.DeclarantServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("declarant")
public class DeclarantController {
    DeclarantServiceI serviceI = new DeclarantServiceImpl();

    @GetMapping("list")
    public String findAll(){
        return "declarant/list";
    }
    @GetMapping("update")
    public String update(Model model) {
        String id = "1";
        model.addAttribute("declarants", serviceI.findById("1"));
        model.addAttribute("birthYears", getBirthYear());
        model.addAttribute("genders", getGender());
        model.addAttribute("nationality", getNationality());
        model.addAttribute("travels", getTravel());
        model.addAttribute("days", getDay());
        model.addAttribute("months", getMonth());
        model.addAttribute("years", getAddYear());
        model.addAttribute("towns", getTown());
        model.addAttribute("country", getCountry());
        model.addAttribute("wards", getWard());
        model.addAttribute("diseases", getDisease());
        model.addAttribute("historyInfections", getHistoryInfection());
        return "declarant/update";
    }

    List<String> getBirthYear() {
        List<String> birthYears = new ArrayList<>();
        birthYears.add("2003");
        birthYears.add("2002");
        birthYears.add("2022");
        return birthYears;
    }

    List<String> getGender() {
        List<String> genders = new ArrayList<>();
        genders.add("Nam");
        genders.add("Nu");
        genders.add("Khac");
        return genders;
    }

    List<String> getNationality() {
        List<String> nationality = new ArrayList<>();
        nationality.add("Viet Nam");
        nationality.add("Anh");
        nationality.add("My");
        return nationality;
    }

    List<String> getTravel() {
        List<String> travels = new ArrayList<>();
        travels.add("Tau bay");
        travels.add("Tàu Thuyền");
        travels.add("Ô tô");
        travels.add("Khác");
        return travels;
    }

    List<String> getDay() {
        List<String> days = new ArrayList<>();
        days.add("1");
        days.add("2");
        days.add("3");
        days.add("5");
        return days;
    }

    List<String> getMonth() {
        List<String> months = new ArrayList<>();
        months.add("1");
        months.add("2");
        months.add("3");
        months.add("5");
        return months;
    }

    List<String> getAddYear() {
        List<String> years = new ArrayList<>();
        years.add("2022");
        years.add("2023");
        return years;
    }

    List<String> getTown() {
        List<String> towns = new ArrayList<>();
        towns.add("Da Nang");
        towns.add("Gia Lai");
        towns.add("Ha Noi");
        return towns;
    }

    List<String> getCountry() {
        List<String> country = new ArrayList<>();
        country.add("Chuprong");
        country.add("Son Tra");
        country.add("Quan 1");
        return country;
    }

    List<String> getWard() {
        List<String> wards = new ArrayList<>();
        wards.add("Iaphin");
        wards.add("An Hai Dong");
        wards.add("An Hai Bac");
        return wards;
    }

    List<Boolean> getDisease() {
        List<Boolean> diseases = new ArrayList<>();
        diseases.add(true);
        diseases.add(false);
        return diseases;
    }

    List<Boolean> getHistoryInfection() {
        List<Boolean> historyInfections = new ArrayList<>();
        historyInfections.add(true);
        historyInfections.add(false);
        return historyInfections;
    }
}
