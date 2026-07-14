package com.kavyanjali.demo.Portfolio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyPortfolio {

    @GetMapping("/")
    public String home() {
        return """
                <!DOCTYPE html>
                <html>
                <head>
                    <title>Kavyanjali | Portfolio</title>

                    <style>
                        body {
                            font-family: Arial, sans-serif;
                            margin: 40px;
                        }

                        ul, ol {
                            padding-left: 20px;
                        }

                        a {
                            text-decoration: none;
                            margin-right: 15px;
                        }
                    </style>
                </head>

                <body>

                    <h1>Kavyanjali</h1>

                    <p>
                        Final Year B.Tech Computer Science student at
                        Lovely Professional University.
                    </p>

                    <hr>

                    <h2>Portfolio</h2>

                    <p>
                        <a href="/mySelf">About Me</a> |
                        <a href="/skills">Skills</a> |
                        <a href="/education">Education</a> |
                        <a href="/project">Projects</a>
                    </p>

                </body>
                </html>
                """;
    }

    @GetMapping("/mySelf")
    public String myself() {
        return """
                <html>
                <body>

                    <h1>About Me</h1>

                    <p>
                        Hello! I'm <b>Kavyanjali</b>, a Final Year
                        Computer Science student with interests in
                        Backend Development, Cybersecurity,
                        and Software Engineering.
                    </p>

                    <h2>Profiles</h2>

                    <ul>
                        <li><b>GitHub:</b> https://github.com/Kavyanjali07</li>
                        <li><b>LeetCode:</b> https://leetcode.com/</li>
                    </ul>

                    <hr>

                    <a href="/">← Back to Home</a>

                </body>
                </html>
                """;
    }

    @GetMapping("/skills")
    public String skills() {
        return """
                <html>
                <body>

                    <h1>Skills</h1>

                    <h2>Technical Skills</h2>

                    <ul>
                        <li>Programming Languages: Java, Python</li>
                        <li>Backend: Spring Boot (Learning)</li>
                        <li>Operating System: Linux</li>
                        <li>Version Control: Git & GitHub</li>
                        <li>Networking Tools: Nmap, Wireshark</li>
                    </ul>

                    <h2>Soft Skills</h2>

                    <ul>
                        <li>Problem Solving</li>
                        <li>Attention to Detail</li>
                        <li>Adaptability</li>
                        <li>Resilience</li>
                    </ul>

                    <hr>

                    <a href="/">← Back to Home</a>

                </body>
                </html>
                """;
    }

    @GetMapping("/education")
    public String education() {
        return """
                <html>
                <body>

                    <h1>Education</h1>

                    <ol>
                        <li>
                            <b>Lovely Professional University</b>

                            <ul>
                                <li>B.Tech - Computer Science & Engineering</li>
                                <li>CGPA: 7.40</li>
                            </ul>
                        </li>
                    </ol>

                    <hr>

                    <a href="/">← Back to Home</a>

                </body>
                </html>
                """;
    }

    @GetMapping("/project")
    public String projects() {
        return """
                <html>
                <body>

                    <h1>Projects</h1>

                    <ol>

                        <li>
                            <b>Dynamic Firewall Rule Generator</b>

                            <ul>
                                <li>Tech Stack: Python, nftables</li>
                                <li>
                                    Generates firewall rules dynamically
                                    based on user-defined requirements.
                                </li>
                            </ul>
                        </li>

                        <br>

                        <li>
                            <b>ClarityBot</b>

                            <ul>
                                <li>Tech Stack: Python, OpenRouter API, DeepSeek-v3</li>
                                <li>
                                    AI-powered chatbot for answering
                                    academic and technical queries.
                                </li>
                            </ul>
                        </li>

                    </ol>

                    <hr>

                    <a href="/">← Back to Home</a>

                </body>
                </html>
                """;
    }
}