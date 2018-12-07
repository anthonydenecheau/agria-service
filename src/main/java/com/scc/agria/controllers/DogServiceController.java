package com.scc.agria.controllers;

import com.scc.agria.services.DogService;
import com.scc.agria.template.DogObject;
import com.scc.agria.template.ResponseObjectList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping(value="v1/dogs")
public class DogServiceController {
   
	@Autowired
    private DogService dogService;

    @RequestMapping(value="/{dogId}",method = RequestMethod.GET)
    public DogObject getDog( @PathVariable("dogId") int dogId) {
        return dogService.getDogById(dogId);
    }
    
    @RequestMapping(value="/identifiant/{search}",method = RequestMethod.GET)
    public ResponseObjectList<DogObject> getDogByIdentifiant( @PathVariable("search") String search) {
        return dogService.getDogByIdentifiant(search);
    }    

    @RequestMapping(value="{dogId}",method = RequestMethod.PUT)
    public String updateDog( @PathVariable("dogId") String dogId) {
        return String.format("This is the put");
    }

    @RequestMapping(value="{dogId}",method = RequestMethod.POST)
    public String saveDog( @PathVariable("dogId") String dogId) {
        return String.format("This is the post");
    }

    @RequestMapping(value="{dogId}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteDog( @PathVariable("dogId") String dogId) {
        return String.format("This is the Delete");
    }
}
