package Invertinome.com.Invertinome;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class NameController {

    @GetMapping("/reverse-name")
    public String reverseName(@RequestParam String name) {
        return name;
    }

    @PostMapping("/reverse-name")
    public String reverseNamePost(@RequestParam String name) {
        return new StringBuilder(name).reverse().toString();
    }
}
