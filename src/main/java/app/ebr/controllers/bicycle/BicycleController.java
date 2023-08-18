package app.ebr.controllers.bicycle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import app.ebr.domains.models.Bicycle;
import app.ebr.domains.models.User;
import app.ebr.repositories.BicycleRepository;
import app.ebr.services.UserService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@RestController
@RequestMapping(value = "/api/bicycles")
public class BicycleController {

    @Autowired
    private BicycleRepository bicycleRepository;

    @Autowired
    private UserService userService;

    @GetMapping(value = "/")
    public ResponseEntity<List<Bicycle>> getAll() {
        Iterable<Bicycle> bicycles = bicycleRepository.findAll();
        List<Bicycle> _bicycles = new ArrayList<>();
        for (Bicycle bicycle : bicycles) {
            _bicycles.add(bicycle);
        }
        return new ResponseEntity<List<Bicycle>>(_bicycles, HttpStatus.OK);
    }

}