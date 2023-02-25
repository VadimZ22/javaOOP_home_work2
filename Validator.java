package Home_Work2;

public interface Validator {
//    Person p;

//    public Validator(Person p) {
//        this.p = p;
//    }

    public default Person ancestorSet(Person p, Person ancestor) {

        if (ancestor.age <= p.getAge()){
            System.out.println("Error!");
            return null;
        }
        else return ancestor;
    }
}

