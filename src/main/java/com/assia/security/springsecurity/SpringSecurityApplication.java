package com.assia.security.springsecurity;

import com.assia.security.springsecurity.Entities.Patient;
import com.assia.security.springsecurity.Repositories.PatientRepository;
import com.assia.security.springsecurity.Sec.Service.SecurityService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;

@SpringBootApplication
public class SpringSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class, args);
    }
    @Bean
    PasswordEncoder passwordEncoder(){

        return new BCryptPasswordEncoder();
    }
    //@Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            patientRepository.save(
                    new Patient(null,"assia",new Date(),false,200,true,true)
            );
            patientRepository.save(
                    new Patient(null,"imane",new Date(),true,250,false,true)
            );
            patientRepository.save(
                    new Patient(null,"Hicham",new Date(),false,290,false,false)
            );
            patientRepository.save(
                    new Patient(null,"Asmaa",new Date(),true,190,true,false)
            );
            patientRepository.save(
                    new Patient(null,"Anas",new Date(),false,310,false,true)
            );
            patientRepository.findAll().forEach(p ->{
                System.out.println(p.getNom());
            } );
        };
    }
    //@Bean
    CommandLineRunner saveUsers(SecurityService securityService){
        return args -> {
            securityService.saveNewUser("assia","1234","1234");
            securityService.saveNewUser("Anas","1234","1234");
            securityService.saveNewUser("imane","1234","1234");

            securityService.saveNewRole("USER","");
            securityService.saveNewRole("ADMIN","");

            securityService.addRoleToUser("Anas","USER");
            securityService.addRoleToUser("Anas","ADMIN");
            securityService.addRoleToUser("assia","USER");
            securityService.addRoleToUser("imane","USER");
        };
    }
}
