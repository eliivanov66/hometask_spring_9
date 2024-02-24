package ru.example.hometask_9.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.example.hometask_9.entitys.Task;
import ru.example.hometask_9.entitys.User;
import ru.example.hometask_9.services.EmployerService;
import ru.example.hometask_9.services.TaskService;

import java.util.List;
@Controller
@RequestMapping("/web")
public class TaskWebController {
    private final TaskService taskService;
    private final EmployerService employerService;

    @Autowired
    public TaskWebController(TaskService taskService, EmployerService employerService) {
        this.taskService = taskService;
        this.employerService = employerService;
    }

    @RequestMapping(value = {"","/", "/login"}, method = RequestMethod.GET)
    public String homePage(Model model) {
        return "loginPage";
    }
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String publicPage(Model model) {
        List<Task> tasks = taskService.get();
        model.addAttribute("tasks", tasks);
        return "publicPage";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String home(Model model) {
        List<Task> tasks = taskService.get();
        model.addAttribute("tasks", tasks);
        return "adminPage";
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String deleteTask(@ModelAttribute Task taskDelete, Model model) {
        taskService.deleteById(taskDelete.getId());
        List<Task> tasks = taskService.get();
        model.addAttribute("tasks", tasks);
        home(model);
        return "redirect:/web/admin";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String Create(@ModelAttribute Task taskCreate, Model model) {
        taskService.create(taskCreate.getDescription());
        List<Task> tasks = taskService.get();
        model.addAttribute("tasks", tasks);
        return "redirect:/web/admin";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String Login(@ModelAttribute User taskLogin, Model model) {
        List<Task> tasks = taskService.get();
        model.addAttribute("tasks", tasks);
        home(model);
        return "redirect:/web/admin";
    }
}
