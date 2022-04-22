import java.util.*;

public class Ex11_1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);  //ArrayList 타입의 객체를 만들었는데, 뒤에는 생성자이기 때문에 기본생성자를 사용해서 생성했음
        list1.add(new Integer(5)); // list1은 ArrayList의 객체이므로 메서드 add 를 사용해서 객체를 저장할 수 있음. new를 왜 넣었는지 모르겠음 //배열 객체 생성인가?
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1,4));   //이렇게도 된단 말야? 어떤 생성자를 쓴거지? sublist 메서드는 from-to 즉 1-4 인텍스 사이에 저장된 객체를 반환하는 메서드
        print(list1, list2);    //list2는 list1의 1-4 인덱스 사이에 저장된 객체가 저장되어 있는 리스트임

        //list1과 2를 정렬  <- ArrayList 타입의 객체로 조상인터페이스(Collection)의 메서드?를 사용할 수 있음?  //sort는 list인터페이스인듯? 근데 왜 Collections로 했지?
        //Collections는 클래스 -> 그럼 ArrayList 조상 클래스의 메서드를 쓴거군
        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);

        System.out.println("list1.containsAll(list2): " + list1.containsAll(list2));  //list1이 list2의 모든 요소를 포함하고 있는지 비교

        // 마지막에 객체(B,C) 추가
        list2.add("B");
        list2.add("C");
        print(list1, list2);

        //인덱스가 3인 곳에 "A"를 추가
        list2.add(3, "A");
        print(list1, list2);

        //인덱스가 3인 곳을 "AA"로 변경
        list2.set(3, "AA");
        print(list1, list2);

        System.out.println("list1.retainAll(list2): " + list1.retainAll(list2));   //주어진 컬렉션과 공통된 것만 남기고 제거하는 메서드. list1에 list2랑 동일한 것만 남긴다.
        print(list1, list2);

        for(int i = list2.size()-1; i>=0; i--) {   //size() ArrayList에 저장된 객체의 갯수를 반환
            if(list1.contains(list2.get(i)))    //contains(o) o가 arrayList에 포함되어 있는지 확인
                list2.remove(i);                //포함되어 있으면 i 위치에 있는 객체를 제거
       }
        print(list1, list2);
    }  //main의 끝

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println();
    }
} //class
