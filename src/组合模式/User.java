package 组合模式;

public class User {

    public static void main(String[] args) {

        // 从大到小创建对象
        // 1. 创建学校
        OrganizationComponent university = new University("哈佛",
                "世界第一");

        // 2. 创建学院
        OrganizationComponent collegeComputer = new College("计算机","世界第一");
        OrganizationComponent collegeInfoEnginee = new College("信息工程学院", "世界第一");


        // 3. 创建各个学院下的系 专业
        collegeComputer.add(new Department("软件工程", "软件工程不错"));
        collegeComputer.add(new Department("网络工程", "网络工程不错"));
        collegeComputer.add(new Department("计算机科学与技术", "老牌专业"));

        collegeComputer.add(new Department("通信工程", "通信工程不好学"));
        collegeComputer.add(new Department("信息工程", "信息工程好学"));

        // 归属学校跟院系的关系
        university.add(collegeComputer);
        university.add(collegeInfoEnginee);

        // _____________ 具体的业务 _____________
        // 获取学校的整个信息
        university.print();

        // 获得院系的信息
        collegeComputer.print();
    }
}
