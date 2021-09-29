package projects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int newStart;
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите название должности(Бухгалтер/Инженер/Юрист):");
        String s = reader.readLine();
        System.out.println("Где хочет работать сотрудник (Дом/Офис):");
        String s2 = reader.readLine();
        System.out.println("Введите час, в котором хочетят начинать работать сотрудники (Например, 7):");
        try {
            int newStart1 = Integer.parseInt(reader.readLine());
            newStart = newStart1;
        }
        catch (NumberFormatException e){
            System.out.println("Вы ввели некорректное число");
        }
        System.out.println("Разрешает ли компания это делать (Да/Нет):");
        String s3 = reader.readLine();
        Company company = new Company();
        if ((s.equals(("Бухгалтер")  ) && s2.equals("Офис") && s3.equals("Да")) ){
            company.printPreference(Preference.WORK_EARLIER_PEFERENCE_ACC);
        }
        else if ((s.equals(("Бухгалтер")  ) && s2.equals("Офис") && s3.equals("Нет")) ){
            company.printPreference(Preference.WORK_EARLIER_PEFERENCE_NO_ACC);
        }
        else if ((s.equals(("Бухгалтер")  ) && s2.equals("Дом") && s3.equals("Да")) ){
            company.printPreference(Preference.WORK_FROM_HOME_PREFERENCE_ACC);
        }
        else if ((s.equals(("Инженер")  ) && s2.equals("Офис") && s3.equals("Да")) ){
            company.printPreference(Preference.WORK_EARLIER_PEFERENCE_ENG);
        }
        else if ((s.equals(("Инженер")  ) && s2.equals("Офис") && s3.equals("Нет")) ){
            company.printPreference(Preference.WORK_EARLIER_PEFERENCE_NO_ENG);
        }
        else if ((s.equals(("Инженер")  ) && s2.equals("Дом") && s3.equals("Да")) ){
            company.printPreference(Preference.WORK_FROM_HOME_PREFERENCE_ENG);
        }
        else if ((s.equals(("Юрист")  ) && s2.equals("Офис") && s3.equals("Да")) ){
            company.printPreference(Preference.WORK_EARLIER_PEFERENCE_LAW);
        }
        else if ((s.equals(("Юрист")  ) && s2.equals("Офис") && s3.equals("Нет")) ){
            company.printPreference(Preference.WORK_EARLIER_PEFERENCE_NO_LAW);
        }
        else if ((s.equals(("Юрист")  ) && s2.equals("Дом") && s3.equals("Да")) ){
            company.printPreference(Preference.WORK_FROM_HOME_PREFERENCE_LAW);
        }
        else if ((s2.equals("Дом") && s3.equals("Нет")) ){
            company.printPreference(Preference.WORK_STANDART);
        }

        else
            System.out.println("Введите корректные данные");

    }
}
