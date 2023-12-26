import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ZTC {
    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("张三", "男", "语文"));
        teachers.add(new Teacher("张三2", "女", "数学"));
        teachers.add(new Teacher("张三3", "男", "英语"));
        teachers.add(new Teacher("张三4", "女", "语文"));
        for (int i = 0; i < teachers.size(); i++) {
            Teacher teacher = teachers.get(i);
            if(teacher.name.equals("张三2")){
                System.out.println(i);
            }
        }
        int num=0;
        for(Teacher sdsd:teachers){
            if(sdsd.name.equals("张三2")){
                System.out.println(num);
            }
                num++;
        }


    }

}