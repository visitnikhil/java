import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MeanMedianMode 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        double mean = calculateMean(numbers);
        System.out.println("Mean: " + mean);
        double median = calculateMedian(numbers);
        System.out.println("Median: " + median);
        int mode = calculateMode(numbers);
        System.out.println("Mode: " + mode);

        scanner.close();
    }
    public static double calculateMean(int[] numbers) 
    {
        int sum = 0;
        for (int num : numbers) 
        {
            sum += num;
        }
        return (double) sum / numbers.length;
    }
    public static double calculateMedian(int[] numbers) 
    {
        Arrays.sort(numbers);
        int n = numbers.length;
        if (n % 2 == 0) 
        {
            return (double) (numbers[n / 2 - 1] + numbers[n / 2]) / 2;
        } 
        else 
        {
            return (double) numbers[n / 2];
        }
    }
    public static int calculateMode(int[] numbers) 
    {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : numbers) 
        {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int maxFrequency = 0;
        int mode = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) 
        {
            if (entry.getValue() > maxFrequency || (entry.getValue() == maxFrequency && entry.getKey() < mode)) 
            {
                maxFrequency = entry.getValue();
                mode = entry.getKey();
            }
        }
        return mode;
    }
}
