package be.thomasmore.graduaten.voorbeeld.backend.controller;

import be.thomasmore.graduaten.voorbeeld.backend.entity.Kaart;
import be.thomasmore.graduaten.voorbeeld.backend.entity.Klas;
import be.thomasmore.graduaten.voorbeeld.backend.entity.Student;
import be.thomasmore.graduaten.voorbeeld.backend.service.KaartService;
import be.thomasmore.graduaten.voorbeeld.backend.service.KlasService;
import be.thomasmore.graduaten.voorbeeld.backend.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    KlasService klasService;

    @Autowired
    StudentService studentService;

    @Autowired
    KaartService kaartService;

    @RequestMapping("/")

    public String index() {
        return "index";
    }

    @RequestMapping("/data-single")
    public String dataSingle(HttpServletRequest request, Model model) {
        Long id = Long.parseLong(request.getParameter("id"));
        Klas klas = klasService.getKlasById(id);
        model.addAttribute("klas", klas);
        return "data-single";
    }

    @RequestMapping("/data-multiple")
    public String dataMultiple(Model model) {
        List<Klas> klassen = klasService.getKlassen();
        model.addAttribute("klassen", klassen);
        return "data-multiple";
    }

    @RequestMapping("/data-add")
    public String dataAdd() {
        return "data-add";
    }

    @RequestMapping("/data-add-result")
    public String dataAddResult(HttpServletRequest request) {
        String naam = request.getParameter("naam");
        Klas klas = new Klas(naam);
        klasService.addKlas(klas);
        return "index";
    }

    @RequestMapping("/data-many-to-one")
    public String dataManyToOne(HttpServletRequest request, Model model) {
        Long id = Long.parseLong(request.getParameter("id"));
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "data-many-to-one";
    }

    @RequestMapping("/data-one-to-one")
    public String dataOneToOne(Model model) {
        List<Kaart> kaarten = kaartService.getKaarten();
        model.addAttribute("kaarten", kaarten);
        return "data-one-to-one";
    }


}
