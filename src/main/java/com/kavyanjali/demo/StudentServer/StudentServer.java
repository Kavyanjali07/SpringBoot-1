package com.kavyanjali.demo.StudentServer;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentServer {
    // 1.  store the student - POST
    @PostMapping("/create")
    public String storeStudent(){
        return """
                id:1
                name:kavya
                department: CSE
                age:22
                """;
    }
    // 2. read the student with id - GET

    // 3. update the student information - PUT,PATCH
    // 4. delete the student information  - DELETE

}
