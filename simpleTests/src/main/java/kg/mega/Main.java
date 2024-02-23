package kg.mega;

public class Main {
    public static void main(String[] args) {
      //простой массив программа выводящяя схожие числа! и количество повторений
        int[] nums = {1, 3, 4, 5, 5, 4, 66, 77, 87, 66, 4};
        for (int i = 0; i < nums.length; i++) {
            int quantityCiphers = 0;  // Сбрасываем количество повторений для каждого числа
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    quantityCiphers++;
                }
            }
            if (quantityCiphers > 0) {
                System.out.println("Повторяющееся число " + nums[i] + ", количество повторений: " + (quantityCiphers + 1));
            }

        }
    }
}