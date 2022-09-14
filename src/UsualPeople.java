public class UsualPeople implements People{
    String name;
    public UsualPeople(String str){
        name = str;
    }

    @Override
    public void talk() {
        System.out.println(name);
    }
}
