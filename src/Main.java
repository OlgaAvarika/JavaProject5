public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 47; // Вес в кг
        double height = 1.6; // Рост в метрах
        double index = service.calculate(weight, height); // Индекс массы тела = Вес (кг) / (Рост (м) * Рост (м))
        System.out.println("Индекс массы тела:");
        System.out.println(index);
    }
}
