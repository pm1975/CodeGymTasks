package com.codegym.task.mytasks.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringWriter;

public class main {
    public static void main(String[] args) throws IOException
    {
        // Create an object to be serialized into JSON
        Cat cat = new Cat();
        cat.name = "Missy";
        cat.age = 5;
        cat.weight = 4;

        // Write the result of the serialization to a StringWriter
        StringWriter writer = new StringWriter();

        // This is the Jackson object that performs the serialization
        ObjectMapper mapper = new ObjectMapper();

        // And here's the serialization itself: the first argument is where, and the second is what
        mapper.writeValue(writer, cat);

        // Convert everything written to the StringWriter into a String
        String result = writer.toString();
        System.out.println(result);
    }
}
