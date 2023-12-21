package com.poja.exam.endpoint.rest.controller.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class BigSumController {

    @GetMapping("/big-sum")
    public String getBigSum(
            @RequestParam(name = "a") String a,
            @RequestParam(name = "b") String b) {

        try {
            BigInteger bigA = new BigInteger(a);
            BigInteger bigB = new BigInteger(b);
            BigInteger result = bigA.add(bigB);

            return result.toString();
        } catch (NumberFormatException e) {
            return "Les paramètres 'a' et 'b' doivent être des nombres valides.";
        } catch (Exception e) {g
            return "Une erreur s'est produite lors du calcul de la somme.";
        }
    }
}
