package com.gazprom.controller;

import com.gazprom.domain.*;
import com.gazprom.repo.*;
import lombok.AllArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping
public class GazpromController {

    private GazpromRepo gazpromRepo;
    private SecondRepo secondRepo;
    private ThirdRepo thirdRepo;
    private FourthRepo fourthRepo;
    private FifthRepo fifthRepo;

    @CrossOrigin
    @GetMapping("{id}")
    public List<Gazprom> getId(@PathVariable Long id) {

        return gazpromRepo.findById(id);

    }

    @CrossOrigin
    @GetMapping("{id}/{id}")
    public List<Second> getId2(@PathVariable Long id) {

        return secondRepo.findById(id);

    }

    @CrossOrigin
    @GetMapping("{id}/{id}/{id}")
    public List<Third> getId3(@PathVariable Long id) {

        return thirdRepo.findById(id);

    }

    @CrossOrigin
    @GetMapping("{id}/{id}/{id}/{id}")
    public List<Fourth> getId1_4(@PathVariable Long id) {

        return fourthRepo.findById(id);

    }

    @CrossOrigin
    @GetMapping("{id}/{id}/{id}/{id}/{id}")
    public List<Fifth> getId1_5(@PathVariable Long id) {

        return fifthRepo.findById(id);

    }

    @GetMapping("/main")
    public String map (@RequestParam(required = false) String filter, Model model) {
        Iterable <Gazprom> messages = null;
        if (filter !=null && !filter.isEmpty()){
            messages = gazpromRepo.findByPersonalAccount(filter);
        } else {

            gazpromRepo.findByPersonalAccount(filter);
        }
        model.addAttribute("messages", messages);
        model.addAttribute("filter", filter);

        return "main";
    }

    @GetMapping("/fio")
    public String fio (@RequestParam(required = false) String fio, Model model) {
        Iterable <Gazprom> messages = null;
        if (fio !=null && !fio.isEmpty()){
            messages = gazpromRepo.findByCustomerIgnoreCaseContaining(fio);
        } else {

            gazpromRepo.findByCustomerIgnoreCaseContaining(fio);
        }
        model.addAttribute("messages", messages);
        model.addAttribute("fio", fio);

        return "main";
    }

    @GetMapping("/street")
    public String street (@RequestParam(required = false) String street, Model model) {
        Iterable <Gazprom> messages = null;
        if (street !=null && !street.isEmpty()){
            messages = gazpromRepo.findByStreetIgnoreCaseContaining(street);
        } else {

            gazpromRepo.findByStreetIgnoreCaseContaining(street);
        }
        model.addAttribute("messages", messages);
        model.addAttribute("fio", street);

        return "main";
    }


    @GetMapping("/edit/{id}")
    public String editId(@PathVariable Long id, Model model ) {
        Iterable <Gazprom> messages = gazpromRepo.findById(id);

        model.addAttribute("id", messages);
        model.addAttribute("personalAccount", messages);
        model.addAttribute("customer", messages);
        model.addAttribute("gasReading", messages);
        model.addAttribute("gasReadingDate", messages);
        model.addAttribute("gasReadingNew", messages);

        model.addAttribute("division", messages);
        model.addAttribute("region", messages);
        model.addAttribute("district", messages);
        model.addAttribute("locality", messages);
        model.addAttribute("street", messages);
        model.addAttribute("flat", messages);
        model.addAttribute("phone", messages);
        model.addAttribute("mobPhone", messages);
        model.addAttribute("house", messages);



        return "edit";
    }

    @PostMapping("/update")
    public String update (@RequestParam (value = "id", required = false) Long id,
                          @ModelAttribute Gazprom message){
        gazpromRepo.findById(id);
        gazpromRepo.save(message);

        return "main";
    }

}