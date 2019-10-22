package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // create a `counter`
        Integer counter = 0;
        // while `counter` is less than length of array
        while (counter < personArray.length) {
            // begin loop

            // use `counter` to identify the `current Person` in the array
            Person currentPerson = personArray[counter];
            // get `string Representation` of `currentPerson`
            String representation = currentPerson.toString();
            // append `stringRepresentation` to `result` variable
            result += representation;

            // end loop
            counter ++;
        }
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        //int counter = 0;

        // identify terminal condition
        // Condition = (counter < personArray.length;)

        // identify increment
        // counter++;

        // use the above clauses to declare for-loop signature
        // begin loop
        for (int counter = 0; counter < personArray.length; counter++) {
            // use `counter` to identify the `current Person` in the array
            Person currentPerson = personArray[counter];
            // get `string Representation` of `currentPerson`
            String representation = currentPerson.toString();
            // append `stringRepresentation` to `result` variable
            result += representation;
            // end loop
        }

        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // personArray

        // identify array's variable-name
        // currentPerson = "";

        // use the above discoveries to declare for-each-loop signature
        // begin loop
        for (Person currentPerson : personArray) {
            // get `string Representation` of `currentPerson`
            String representation = currentPerson.toString();
            // append `stringRepresentation` to `result` variable
            result += representation;
            // end loop
        }

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
