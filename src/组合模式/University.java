package 组合模式;

import java.util.ArrayList;
import java.util.List;

// University就是Composeite 可以管理College
public class University extends OrganizationComponent {

    // 组合的是College
    List<OrganizationComponent> organizationComponents = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponents.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponents.remove(organizationComponent);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }

    // 输出University包含的院校
    @Override
    protected void print() {
        System.out.println("________" + getName() + "_________");
        for (OrganizationComponent org : organizationComponents
             ) {
            org.print();
        }
    }
}
