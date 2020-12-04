package utils;

import racingcar.Car;

import java.util.Arrays;

public class InputValidator {
    private InputValidator(){}

    public static void checkValidCarName(String name){
        if(!isValidLength(name, Car.MIN_NAME_LEN,  Car.MAX_NAME_LEN)){
            throw new IllegalArgumentException("적절하지 않은 길이의 자동차 이름");
        }
    }

    private static boolean isValidLength(String input, int min, int max){
        if(input.length() < min || input.length() > max){
            return false;
        }
        return true;
    }

    public static void checkDuplicatedCarName(String[] name){
        if(hasDuplicatedValue(name)){
            throw new IllegalArgumentException("중복된 이름을 포함할 수 없습니다.");
        }
    }

    private static boolean hasDuplicatedValue(String[] input){
        if(Arrays.stream(input).distinct().count() != input.length){
            return true;
        }
        return false;
    }
}
