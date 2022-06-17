public class ProjectTest {
    public static void main(String[] args){
        Project proj1 = new Project();
        Project proj2 = new Project("TSM"); 
        Project proj3 = new Project("ASM", "this project sucks!");
        proj1.setName("Cloud");
        proj1.setDescription("It is going to move to Arizona!");
        proj2.setDescription("It costs a lot of money!");
        String name2 = proj2.getName();
        String name3 = proj3.getName();
        String name1 = proj1.getName();
        String desc1 = proj1.getDescription();
        System.out.println("The 1st project named as " + name1 + " description: " + desc1);
    }
}
