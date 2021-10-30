package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        task 1
        String firstName ="Ivanov";
        String middleName ="Ivan";
        String lastName ="Ivanovich";
        String fullName =firstName+" "+middleName+" "+lastName;
        System.out.println("ФИО сотрудника — "+fullName);
        //task 2
        String fullNameFor = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullNameFor);

        //task 3
        String fullNameForAdm = fullName.replace(" ", ";");
        System.out.println("Данные ФИО сотрудника для административного отдела —"+fullNameForAdm);

        //task 4
        String middleName2 = "Semёn";
        String lastName2 = "Semёnovich";
        String[] Split = fullName.split(" ");
        String fullNameForYe = Split[0]+" "+middleName2+" "+lastName2;
        fullNameForYe = fullNameForYe.replace("ё","e");
        System.out.println("Данные ФИО сотрудника —"+fullNameForYe);

        //task 5

        char[] letters = fullName.toCharArray();
        StringBuilder notFullName = new StringBuilder(fullName);
        char prob=' ';
        String secondName="";
        String secondFamilyName="";
        //String lastFamilyName="";
        int j=0;

        for(int i=0;i<letters.length;i++){
            if(letters[i]==prob){
                if (secondFamilyName.isEmpty()) {
                    secondFamilyName=fullName.substring(0, i);
                    System.out.println("Фамилия сотрудника — "+secondFamilyName);
                    j=i;
                    notFullName.delete(0, i +1 );

                }else {
                    if(secondName.isEmpty()){
                        System.out.println(notFullName);



                        secondName=notFullName.substring(0,i-j);
                        System.out.println("Имя сотрудника — "+secondName);
                        notFullName = notFullName.delete(0, i-j);
                        System.out.println("Отчество сотрудника — "+notFullName);
                    }
                }
            }

        }
        //task 6

        String fullNameWithDownRegister = "ivanov ivan ivanovich";
        char[] letters2 = fullNameWithDownRegister.toCharArray();
        String fullNameWithUppRegister="";
        String element;
        boolean upper = true;
        for(char let:letters2){
            element=""+let;
            if(upper){
                element=element.toUpperCase();
                upper=false;
            }
            fullNameWithUppRegister+=element;
            if(let ==' '){
                upper=true;
            }

        }
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — "+fullNameWithUppRegister);

        //task 7
        //Соберите из двух строк одну, содержащую данные "123456".

        StringBuilder one = new StringBuilder("135");
        StringBuilder two = new StringBuilder("246");
        one.append(two);
        one.setCharAt(1, '2');
        one.setCharAt(2, '3');
        one.setCharAt(3, '4');
        one.setCharAt(4, '5');
        System.out.println("Данные строки — " + one);

        //task 8
        String str ="aabccddefgghiijjkk";
        char[] lets = str.toCharArray();
        String lette="";
        String print="";
        StringBuilder word = new StringBuilder(str);
//        for(int i=0;i<lets.length;i++){
//            for(int m=1;m<lets.length;m++){
//                if(lets[i]==lets[m]){
//                    lette =""+lets[i];
//                    print+=lette;
//                    //i++;
//                    //m++;
//                    break;
//                }
//            }
//
//        }
        for(int k=1;k<lets.length;k++){
            if(lets[k]==lets[k-1]){
                lette =""+lets[k];
                print+=lette;//acdgijk

            }

        }
        System.out.println(print);

    }
}
