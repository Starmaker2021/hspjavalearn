package secondphase.chapter14.collection;

import java.util.ArrayList;

public class Book {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Book1("红楼梦", 15, "曹雪芹"));
        list.add(new Book1("红楼梦", 15, "曹雪芹"));
        list.add(new Book1("水浒传", 36, "施耐庵"));
        list.add(new Book1("西游记", 25, "吴承恩"));
        list.add(new Book1("三国演", 18, "罗贯中"));
        bubbleSort(list);
        for (Object o :list) {
            System.out.println(o.toString());
        }


    }

    public static void bubbleSort(ArrayList list) {
        for (int i = 0; i < list.size() - 1; i++) {//控制比较轮次，一共 n-1 趟
            for (int j = 0; j < list.size() - 1 - i; j++) {//控制两个挨着的元素进行比较
                Book1 book1 = (Book1) list.get(j);
                Book1 book2 = (Book1) list.get(j + 1);
                if (book1.price > book2.price) {
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }
    }

}

class Book1 {
    String name;
    int price;
    String writer;

    public Book1(String name, int price, String writer) {
        this.name = name;
        this.price = price;
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "Book1{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", writer='" + writer + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getWriter() {
        return writer;
    }
}
