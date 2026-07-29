import java.util.*;

class Solution {

    class Person{
        String name;
        int height;

        Person(String name,int height){
            this.name=name;
            this.height=height;
        }
    }

    public String[] sortPeople(String[] names, int[] heights) {

        int n = names.length;

        Person[] persons = new Person[n];

        for(int i=0;i<n;i++){
            persons[i] = new Person(names[i], heights[i]);
        }

        Arrays.sort(persons, (a,b) -> b.height - a.height);

        String[] ans = new String[n];

        for(int i=0;i<n;i++){
            ans[i] = persons[i].name;
        }

        return ans;
    }
}