package Home_Work2;

import java.io.FileWriter;
import java.io.IOException;

public interface Info {

    public default void printInfo(Person p){

        try {
            System.out.println(p.toString());
        }
        catch (NullPointerException e){};

        try {
            System.out.println("Mother "+p.getMother().toString());
        }
        catch (NullPointerException e){}

        try {
            System.out.println("Father "+p.getFather().toString());
        }
        catch (NullPointerException e){}

        try {
            System.out.println("Grandmother "+p.getMother().getMother().toString());
        }
        catch (NullPointerException e){}

        try {
            System.out.println("Grandmother "+p.getFather().getMother().toString());
        }
        catch (NullPointerException e){}

        try {
            System.out.println("Grandfather "+p.getFather().getFather().toString());
        }
        catch (NullPointerException e){}

        try {
            System.out.println("Grandfather "+p.getMother().getFather().toString());
        }
        catch (NullPointerException e){}


        if (p.getChildren().size()>0){
            System.out.println("Children:");
            for (Person h: p.getChildren()){
                System.out.println(h.toString());
            }
        }

        if (p.getSisAndBro().size()>0){
            System.out.println("Sisters and Brothers:");
            for (Person h : p.getSisAndBro()){
                System.out.println(h.toString());
            }
        }

    }

    public default void toFile(Person p){
        try {
            FileWriter writer = new FileWriter("File.txt", true);
            writer.write(p.toString());
            writer.write("\nMother "+p.getMother().toString());
            writer.write("\nFather "+p.getFather().toString());
            writer.write("\nGrandmother "+p.getMother().getMother().toString());
            writer.write("\nGrandmother "+p.getFather().getMother().toString());
            writer.write("\nGrandfather "+p.getFather().getFather().toString());
            writer.write("\nGrandfather "+p.getMother().getFather().toString());

            writer.write("\nChildren:");
            for (Person h : p.getChildren()){
                writer.write("\n"+h.toString());
            }
            writer.write("\nSisters and Brothers:");
            for (Person h : p.getSisAndBro()){
                writer.write("\n"+h.toString());
            }
            writer.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
