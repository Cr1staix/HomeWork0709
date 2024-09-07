//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Начало");
        /* System.out.println("Подходим к автомобилю");
        System.out.println("Снимаем с сигнализаци"); Закоментил лишние строки из блок схемы, чтобы не забивать консоль
        Первый вариант решения */
        System.out.println("Садимся за руль");
        System.out.println("Пристёгиваем ремень безопасности");
        boolean isTransmissionNeutral = true;
        if (!isTransmissionNeutral) {
            System.out.println("Включаем нейтральную");
        }
        System.out.println("Заводим двигатель");
        System.out.println("Включаем первую передачу");
        boolean isRoadFree = false;
        if (!isRoadFree) {
            System.out.println("Устуаем дорогу");
        }
        System.out.println("Начинаем движение");
        System.out.println("Конец\n");

//      Второй вариант решения

        System.out.println("Начало");
        System.out.println("Садимся за руль");
        System.out.println("Пристёгиваем ремень безопасности");
        char speedTransmission = 'R';
        if (speedTransmission != 'N') {
            System.out.println("Включаем нейтральную");
        }
        System.out.println("Заводим двигатель");
        System.out.println("Включаем первую передачу");
        String roadFree = "Free";
        if (roadFree.equals("Free")) {
            System.out.println("Начинаем движение");
        } else {
            System.out.println("Уступаем дорогу");
            System.out.println("Начинаем движение");
        }
        System.out.println("Конец\n");

        // Третий вариант решения ( Тут я намудрил и нарушил логику, уверен что так делать не нужно, но это ради тренировки)

        System.out.println("Начало");
        System.out.println("Садимся за руль");
        System.out.println("Пристёгиваем ремень безопасности");
        boolean isTransmissionNeutral1 = false;
        boolean isRoadFree1 = true;
        if (!isTransmissionNeutral1) {
            System.out.println("Включаем нейтральную");
            System.out.println("Заводим двигатель");
            if(isRoadFree1){
                System.out.println("Начинаем движение");
            }else {
                System.out.println("Уступаем дорогу");
                System.out.println("Начинаем движение");
            }
        } else if (isTransmissionNeutral1){
            System.out.println("Заводим двигатель");
            if (isRoadFree1){
                System.out.println("Начинаем движение");
            }else {
                System.out.println("Уступаем дорогу");
                System.out.println("Начинаем движение");
            }
        }
        System.out.println("Конец");
    }
}