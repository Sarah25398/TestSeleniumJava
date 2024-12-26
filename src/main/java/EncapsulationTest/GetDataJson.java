package EncapsulationTest;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class GetDataJson {

    private static Map<String,Object> testData;
    static{
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            testData =  objectMapper.readValue(new File("C:\\Users\\vela.os010\\IdeaProjects\\untitled\\JsonUserData.json"), Map.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static Map<String,String> getLoginData(String userType){
        return (Map<String, String>) ((Map<String,Object>) testData.get("login")).get(userType);
    }
    public static void main(String[] args){
        Map<String,String> validUser = getLoginData("validUser");
        String userName = validUser.get("username");
        String Password = validUser.get("password");
        System.out.println(userName);
        System.out.println(Password);

    }




}
