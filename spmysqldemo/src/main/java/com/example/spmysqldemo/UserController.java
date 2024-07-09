package com.example.spmysqldemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // Esta classe é um controlador
@RequestMapping(path="/users") // A URL começa por /users (após a path da aplicação)

public class UserController {
    @Autowired // Obtem o bean de nome userRepository
            // que é autogerado, para manipulação dos dados    
    private UserRepository userRepository;

    @PostMapping(path="/add") // Mapeia somente pedidos POST
    public @ResponseBody String addNewUser (@RequestParam String name, @RequestParam String email) {
        // @ResponseBody a String retornada é uma respotsa, não uma view
        // @ResquestParam é um parametro do pedido GET ou POST 
        
        User n = new User();
        n.setName(name);
        n.setEmail(email);
        userRepository.save(n);
        
        return "Registo guardado com sucesso";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        // Retorna um JSON ou XML com todos os utilizadores
        return userRepository.findAll();
    }
}
