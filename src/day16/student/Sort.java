package day16.student;

public class Sort {
    void sortAge(Student[] array){
        for(int i = 0; i < array.length; ++i){
            for (int j = 0; j < array.length - 1 -i; ++j){
                if(array[j].age > array[j + 1].age){
                    int temp = array[j].age;
                    array[j].age = array[j + 1].age;
                    array[j + 1].age = temp;
                }
            }
        }
        System.out.println();
        for(int i = 0; i < array.length; ++i){
            System.out.print(array[i].age + " ");
        }
    }
    void sortWeight(Student[] array){
        for(int i = 0; i < array.length; ++i){
            for (int j = 0; j < array.length - 1 -i; ++j){
                if(array[j].weight > array[j + 1].weight){
                    int temp = array[j].weight;
                    array[j].weight = array[j + 1].weight;
                    array[j + 1].weight = temp;
                }
            }
        }
        System.out.println();
        for(int i = 0; i < array.length; ++i){
            System.out.print(array[i].weight+" ");
        }
    }
    void sortName(Student[] array){
        for(int i = 0; i < array.length; ++i){
            for (int j = 0; j < array.length - 1 -i; ++j){
                if(array[j].name.compareTo(array[j + 1].name) > 0){
                    String temp = array[j].name;
                    array[j].name = array[j + 1].name;
                    array[j + 1].name = temp;
                }
            }
        }
        System.out.println();
        for(int i = 0; i < array.length; ++i){
            System.out.print(array[i].name+" ");
        }
    }
}
