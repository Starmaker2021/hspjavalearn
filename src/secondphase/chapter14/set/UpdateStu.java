package secondphase.chapter14.set;

import java.util.Iterator;
import java.util.TreeSet;

public class UpdateStu implements Comparable {
    String name;
    int id;

    public UpdateStu(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Object o) {
        UpdateStu stu = (UpdateStu) o;
        int result = id>stu.id?1:(id==stu.id?0:-1);
        return result;
    }

    public static void main(String[] args) {
        UpdateStu stu1 = new UpdateStu("li", 26);
        UpdateStu stu2 = new UpdateStu("wang", 24);
        UpdateStu stu3 = new UpdateStu("lou", 19);
        UpdateStu stu4 = new UpdateStu("kang", 25);
        TreeSet tree = new TreeSet();
        tree.add(stu1);
        tree.add(stu2);
        tree.add(stu3);
        tree.add(stu4);
        Iterator it = tree.iterator();
        while (it.hasNext()) {
            UpdateStu next = (UpdateStu) it.next();
            System.out.println(next.getId() + " " + next.getName());
        }

    }
}

