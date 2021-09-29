package projects;

public class Company {
    public Company company;
    Main acc = new Main();
    int standartStart = 8;
    int standartFinish = 17;
    int dinner = 1;
    double efficiency = 0.2;
    double efficiencyFromHome = 0.1;


    public void printPreference(Preference preference){
        switch(preference){
            case WORK_EARLIER_PEFERENCE_ACC:
                System.out.println("Эффективность должности "+ AccountingDepartment.nameAccounting+" составит: "+(AccountingDepartment.numOfAccaunting*(Math.abs(standartStart-acc.newStart))*efficiency)+" часов/рабочий");
                System.out.println("Заработок компании составит: "+(AccountingDepartment.numOfAccaunting*(Math.abs(standartStart-acc.newStart))*efficiency*AccountingDepartment.earningsPerWorker)+" долларов");
                break;
            case WORK_EARLIER_PEFERENCE_NO_ACC:
                System.out.println("Эффективность должности "+ AccountingDepartment.nameAccounting+" упадет на: "+(AccountingDepartment.numOfAccaunting*(Math.abs(standartStart-acc.newStart))*efficiency)+" часов/рабочий");
                System.out.println("Убыток компании составит: "+(AccountingDepartment.numOfAccaunting*(Math.abs(standartStart-acc.newStart))*efficiency*AccountingDepartment.earningsPerWorker)+" долларов");
                break;
            case WORK_STANDART:
                System.out.println("Эффективность не изменится");
                System.out.println("Доход/убыток компании не изменится");
                break;
            case WORK_FROM_HOME_PREFERENCE_ACC:
               System.out.println("Эффективность должности "+ AccountingDepartment.nameAccounting+" составит: "+(AccountingDepartment.numOfAccaunting*efficiencyFromHome)+" часов/рабочий");
               System.out.println("Заработок компании составит: "+((AccountingDepartment.numOfAccaunting*efficiencyFromHome)*AccountingDepartment.earningsPerWorker)+" долларов");
                break;
            case WORK_EARLIER_PEFERENCE_ENG:
                System.out.println("Эффективность должности "+ EngineerDepartment.nameEngineer+" составит: "+(EngineerDepartment.numOfEngineer*(Math.abs(standartStart-acc.newStart))*efficiency)+" часов/рабочий");
                System.out.println("Заработок компании составит: "+(EngineerDepartment.numOfEngineer*(Math.abs(standartStart-acc.newStart))*efficiency*EngineerDepartment.earningsPerWorker)+" долларов");
                break;
            case WORK_EARLIER_PEFERENCE_NO_ENG:
                System.out.println("Эффективность должности "+ EngineerDepartment.nameEngineer+" упадет на: "+(EngineerDepartment.numOfEngineer*(Math.abs(standartStart-acc.newStart))*efficiency)+" часов/рабочий");
                System.out.println("Убыток компании составит: "+(EngineerDepartment.numOfEngineer*(Math.abs(standartStart-acc.newStart))*efficiency*EngineerDepartment.earningsPerWorker)+" долларов");
                break;
            case WORK_FROM_HOME_PREFERENCE_ENG:
                System.out.println("Эффективность должности "+ EngineerDepartment.nameEngineer+" составит: "+(EngineerDepartment.numOfEngineer*efficiencyFromHome)+" часов/рабочий");
                System.out.println("Заработок компании составит: "+((EngineerDepartment.numOfEngineer*efficiencyFromHome)*EngineerDepartment.earningsPerWorker)+" долларов");
                break;
            case WORK_EARLIER_PEFERENCE_LAW:
                System.out.println("Эффективность должности "+ LawyerDepartment.nameLawyer+" составит: "+(LawyerDepartment.numOfLawyer*(Math.abs(standartStart-acc.newStart))*efficiency)+" часов/рабочий");
                System.out.println("Заработок компании составит: "+(LawyerDepartment.numOfLawyer*(Math.abs(standartStart-acc.newStart))*efficiency*EngineerDepartment.earningsPerWorker)+" долларов");
                break;
            case WORK_EARLIER_PEFERENCE_NO_LAW:
                System.out.println("Эффективность должности "+ LawyerDepartment.nameLawyer+" упадет на: "+(LawyerDepartment.numOfLawyer*(Math.abs(standartStart-acc.newStart))*efficiency)+" часов/рабочий");
                System.out.println("Убыток компании составит: "+(EngineerDepartment.numOfEngineer*(Math.abs(standartStart-acc.newStart))*efficiency*EngineerDepartment.earningsPerWorker)+" долларов");
                break;
            case WORK_FROM_HOME_PREFERENCE_LAW:
                System.out.println("Эффективность должности "+ LawyerDepartment.nameLawyer+" составит: "+(LawyerDepartment.numOfLawyer*efficiencyFromHome)+" часов/рабочий");
                System.out.println("Заработок компании составит: "+((LawyerDepartment.numOfLawyer*efficiencyFromHome)*LawyerDepartment.earningsPerWorker)+" долларов");
                break;
        }
    }
    public class AccountingDepartment{
        public AccountingDepartment accounting;
        public static String nameAccounting = "бухгалтер";
        public static int numOfAccaunting = 10;
        public static int earningsPerWorker = 20;
    }
    public class EngineerDepartment{
        public EngineerDepartment engineer;
        public static String nameEngineer = "инженер";
        public static int numOfEngineer = 20;
        public static int earningsPerWorker = 20;
    }
    public class LawyerDepartment{
        public LawyerDepartment lawyer;
        public static String nameLawyer = "юрист";
        public static int numOfLawyer = 2;
        public static int earningsPerWorker = 40;
    }

}
class Role {
    public Role accounting1;
    public Role accounting2;
    public Role engineer1;
    public Role engineer2;
}
class Employee {

}


