package com.mainacad;

import com.mainacad.service.NumberManipulationService;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class ApplicationRunner {

    private static final Logger LOGGER = Logger.getLogger(ApplicationRunner.class.getName());

    public static void main(String[] args) {

        System.out.println("Input number");

        String input = "";

        Scanner scanner = new Scanner(System.in);

        input = scanner.nextLine();

        LOGGER.info("Input: " + input);

        String testText = " abc1de 2fg3h i4jkl5mn";

        String modifiedText = testText.trim();
        String[] words = modifiedText.split(" ");

        LOGGER.info("Original: " + testText);
        LOGGER.info("Trimmed: " + modifiedText);
        LOGGER.info("Words: " + StringUtils.join(words, ", "));

        String name = "\"Alex\"";
        int age = 37;

        LOGGER.info(
                String.format(
                        "My name is %s, I'm %d years old.",
                        name, age));


        modifiedText = modifiedText.replaceAll("[a-zA-Z]", "");
        LOGGER.info("Modified: " + modifiedText);

//
//
//        StringBuilder stringBuilder =
//                new StringBuilder("some text for string builder");
//        stringBuilder.append(" , add some new text");
//        LOGGER.info(stringBuilder.toString());
//
//        StringBuffer stringBuffer =
//                new StringBuffer("some text for string buffer");
//        stringBuffer.append(" , add some new text");
//        LOGGER.info(stringBuffer.toString());
//
//        LOGGER.info(stringBuffer.reverse().toString());

    }
}
