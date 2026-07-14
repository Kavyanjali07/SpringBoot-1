package com.kavyanjali.demo.Portfolio;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class MyPortfolio {
    @GetMapping("/mySelf")
    public String Myself(){
        return """
                <h1> Kavyanjali</h1>
                <p>Final year student at LPU</p>
                <ul>
                <li> GITHUB: https://github.com/Kavyanjali07 </li>
                <li> LeetCode: </li>
                </ul>
                """;
    }
    @GetMapping("/skills")
    public String Skills(){
        return """
                <h1>TECHNICAL SKILLS: </h1>
                <h2>Programming languages: Java, Python</h2>
                <h2>Tools/Platforms: Linux, Git, Github, Nmap, Wireshark</h2>
                
                <h1> SOFT SKILLS:</h1>
                <h2>Attention to details, Proactive, Resilient</h2>
                """;
    }

    @GetMapping("/education")
    public String Education(){
        return """
                
                """;
    }

    @GetMapping("/project")
    public String Projects(){
        return """
                <h1></h1>
                """;
    }
}
