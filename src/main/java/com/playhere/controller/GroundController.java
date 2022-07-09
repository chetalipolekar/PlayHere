package com.playhere.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.playhere.beans.Ground;
import com.playhere.beans.GroundDto;
import com.playhere.service.GroundService;

@RestController    //@ResponseBody + @Controller
@RequestMapping("/ground")
public class GroundController {
	@Autowired
	GroundService groundService;
	//@RequestMapping(method=ResponseMethod.GET)
	@GetMapping
	public List<Ground> getAll(){
		return groundService.displayAll();
	}
	
	@PostMapping("/{userId}")
	public void addGround(@RequestBody Ground ground, @PathVariable("userId") Long userId) {
		groundService.addGround(ground, userId);
	}
	
	@GetMapping("/{location}/{sport}/{time}")
	public List<GroundDto> searchGround(@PathVariable String location,@PathVariable String sport,@PathVariable String time ) {
		return groundService.searchGround(location,sport,time);
		
	}
	
	@GetMapping("/{id}")
		public Ground getById(@PathVariable Long id) {
			return groundService.getById(id);
		}
	
	@PutMapping("/{id}")
	public void updateById(@PathVariable Long id,@RequestBody Ground g) {
		Ground ground= getById(id);
		ground.setGroundName(g.getGroundName());
		ground.setGroundType(g.getGroundType());
		ground.setLocation(g.getLocation());
		ground.setSport(g.getSport());
		 groundService.updateById(ground);
	}
	
	@DeleteMapping("{id}")
	@RequestMapping(value="/{id}" ,method=RequestMethod.DELETE)
	public void deleteById(@PathVariable Long id) {
		groundService.deleteById(id);
	}
}
