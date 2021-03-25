package com.boilerplate.dev.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boilerplate.dev.model.UserDto;
import com.boilerplate.dev.service.DevService;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class DevController {

	@Value("${spring.profiles}")
	private String profiles;
	
	@NonNull
	private DevService devService;

	@GetMapping("")
	public List<UserDto> users() {
		System.out.println(devService.devTest());
		System.out.println(profiles);
		Map<String, Object> result = new HashMap<>();
		List<UserDto> users = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			users.add(UserDto.builder().userId("userId"+i).build());
		}
		
		result.put("users", users);
		return users;
	}
	@GetMapping("/test")
	public String test() {
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filiaa", "filipa"};
		String[] completion = {"marina", "josipa", "nikola", "filipa", "vinko"};
		
		return this.solution2(participant, completion);
	}
	public String solution2(String[] participant, String[] completion){
		String answer = "";
        String temp = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        int i = 0;
        
        while(i < completion.length){
        	System.out.println("completion["+i+"] : "+ completion[i]+ "participant["+i+"] : "+ participant[i]);
            if(!completion[i].equals(participant[i])){
                temp = participant[i];
                break;
            }else{
                i++;
            }
        }
        
        if(!temp.equals("")){
            answer = temp;
        }else{
            answer = participant[participant.length-1];
        }
        System.out.println(answer);
        return answer;
	}
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        Map<String,String> tt = new HashMap<String, String>();
        ArrayList<String> completions = new ArrayList<String>(Arrays.asList(completion));
        for(String str : participant) {
        	System.out.println(str);
        	System.out.println(completions.indexOf(str));
        	if(completions.contains(str)) {
        		completions.remove(str);
        		continue;
        	}
        	answer += str;
        }
        return answer;
    }
	
	@PostMapping("/{userId}")
	public UserDto user(
			@PathVariable(name = "userId") String userId
			,@RequestBody UserDto userDto
			) {
		System.out.println("path userId : "+ userId);
		System.out.println("userDto : "+userDto.getUserId());
		return UserDto.builder().userId(userId).build();
	}
}
