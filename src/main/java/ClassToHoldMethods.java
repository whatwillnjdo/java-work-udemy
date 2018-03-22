import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public final class ClassToHoldMethods<T> {

    final String delimiter = ",|\n";

    public int calculate(String input) throws Exception {
        String[] numbers = input.split(delimiter);

        if (input.isEmpty()) {
            return 0;
        }
        else if(input.length()==1)
        {
            return transformToInt(input);
        }
        else{
            return getSum(numbers);
        }
    }

    private int getSum(String[] numbers) throws Exception {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
           if(transformToInt(numbers[i])<0){
               throw new Exception("Entered Negative Number!!");
           }
           if(transformToInt(numbers[i])>1000){
               continue;
           }
           sum +=transformToInt(numbers[i]);
        }
        return sum;
    }

    private int transformToInt(String input) {
        return Integer.parseInt(input);
    }

    public List<String> transformToUpper(List<String> collection) {
        List<String> coll = new ArrayList<>();
        for (String element : collection){
            coll.add(element.toUpperCase());
        }
        return coll;
    }

    public List<String> transformToUpperCaseUsingStreams(List<String> collection){
        return collection.stream()
                .map(String::toUpperCase)
                .collect(toList());
    }

    public List<String> transformWhoDat(List<String> collection) {
        return collection.stream()
                .filter(value -> value.length() < 4)
                .map(String::toUpperCase)
                .collect(toList());
    }

    public List<Integer> methodToGetOnlyRecordsGreaterThanFive(List<Integer> collection) {
        return collection.stream()
                .filter((value -> value >5))
                .collect(toList());
    }

    public List<String> transformMultiDimensionCollection(List<List<String>> multiDCollection) {
        return multiDCollection.stream()
                .flatMap(value -> value.stream())
                .map(String::toUpperCase)
                .collect(toList());
    }

    public Integer sumOfRecords(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0,(total, number) -> total + number);
    }
}
