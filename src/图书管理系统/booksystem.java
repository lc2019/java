package 图书管理系统;

import java.util.*;

/**
 * 1.定义书本类
 * 2.定义集合存储书籍
 * 3.图书操作方法
 */
public class booksystem {
    /**
     * 存储图书的容器 map（String,list<book>） 图书信息
     * key-书籍类型  list书籍的信息
     * <p>
     * 仙侠
     * 遮天   90.0 辰东
     * 玄幻
     * 诛仙   80.0  萧鼎
     *
     * @param 书籍类型
     */
    // type1={x,x,x} type2={y,y,y}
    public static final Map<String, List<book>> BOOK_STORE = new HashMap<>();
    public static final Scanner SC = new Scanner(System.in);

    public static void main(String[] args) {
        showCommand();
    }

    public static void showCommand() {
        /**
         * 1.查看书籍
         * 2.添加书籍
         * 3.删除书籍
         * 4.修改书籍
         * 5.退出系统
         */
        System.out.println("===========图书管理系统===========");
        System.out.println("            1.查看书籍");
        System.out.println("            2.添加书籍");
        System.out.println("            3.修改书籍");
        System.out.println("            4.删除书籍");
        System.out.println("            5.退出");
        System.out.println("请输入操作命令：");

        String str = SC.nextLine();
        switch (str) {
            case "1":
                queryBooks();
                break;
            case "2":
                addBook();
                break;
            case "3":
                modifiBooks();
                break;
            case "4":
                delBooks();
                break;
            case "5":
                System.out.println("退出");
                System.exit(0);
                break;
            default:
                System.out.println("输入错误");
                break;
        }
        //回调自己
        showCommand();
    }

    /**
     * 添加书籍
     */
    public static void addBook() {
        System.out.println("==========");
        System.out.println("添加书籍类型");
        String type = SC.nextLine();
        List<book> books = null;
        if (BOOK_STORE.containsKey(type)) {
            books = BOOK_STORE.get(type);
        } else {
            //先创建书籍
            books = new ArrayList<>();
            //存储到图书馆
            BOOK_STORE.put(type, books);
        }
        //创建书籍
        System.out.println("书籍的名称");
        String name = SC.nextLine();
        System.out.println("书籍的价格");
        String price = SC.nextLine();
        System.out.println("书籍的作者");
        String author = SC.nextLine();
        //定义书本对象封装输入的书本信息
        book book = new book(name, Double.valueOf(price), author);
        //添加到类型里面
        books.add(book);
    }

    /**
     * 查询书籍
     */
    public static void queryBooks() {
        System.out.println("类型\t\t\t\t书名\t\t\t\t\t价格\t\t\t作者");
        BOOK_STORE.forEach((type, books) -> {
            /**
             * 书籍的类型
             */
            System.out.println(type);
            //书籍的详细信息
            for (book b : books) {
                System.out.println(b.getName() + b.getPrice() + b.getAuthor());
            }
        });
    }

    /**
     * 修改书籍
     */
    public static void modifiBooks() {
        System.out.println("请输入要修改的书籍类型");
        String type = SC.nextLine();
        if (BOOK_STORE.size() == 0) {
            System.out.println("没有书籍类型");
        } else {
            while (true) {
                if (BOOK_STORE.containsKey(type)) {
                    //输入要修改的书名
                    System.out.println("请输入要修改的书籍名称");
                    String name = SC.nextLine();
                    book bk = getBookByType(type, name);
                    if (bk == null) {
                        System.out.println("书籍不存在");
                    } else {
                        //创建书籍
                        System.out.println("书籍的名称");
                        String newname = SC.nextLine();
                        System.out.println("书籍的价格");
                        String newprice = SC.nextLine();
                        System.out.println("书籍的作者");
                        String newauthor = SC.nextLine();
                        //修改书籍
                        bk.setName(newname);
                        bk.setPrice(Double.valueOf(newprice));
                        bk.setAuthor(newauthor);

                        //结束修改
                        return;
                    }
                } else {
                    System.out.println("输入的书籍类型不存在");
                }
            }
        }
    }

    /**
     * 删除书籍，栏目保留
     */
    public static void delBooks() {
        System.out.println("删除书籍的类型");
        String type = SC.nextLine();
        if (BOOK_STORE.containsKey(type)) {
            //存在书籍类型， 书籍类型下是否有书籍
            System.out.println("输入要删除的书籍名称");
            String name = SC.nextLine();
            book bk = getBookByType(type, name);
            if (getBookByType(type, name) == null) {
                //书籍不存在
                System.out.println("没有这本书");
            } else {
                //书籍存在
                List<book> books = BOOK_STORE.get(type);
                books.remove(bk);
            }
        } else {
            System.out.println("没有此类型的书籍");
        }
    }

    /**
     * @param type 类型
     * @param name 书名
     * @return 书籍对象
     */
    public static book getBookByType(String type, String name) {
        //先查看此类型的书籍
        List<book> books = BOOK_STORE.get(type);
        for (book book : books) {
            //如果书名一样
            if (book.getName().equals(name)) {
                return book;
            }
        }
        //没找到
        return null;
    }


}
