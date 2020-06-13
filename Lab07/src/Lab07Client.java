import java.util.List;
import java.util.ArrayList;

/**
* The class <code>Lab07Client</code> provides practice with using
* some of the interfaces and classes of the Java Collection Framework.
*
* @author Charley Sheaffer
* @version March 4, 2019
*/
public class Lab07Client
{

    /**
    * The first method typically executed within a Lab07Client object.
    * This method calls helper methods to practice using some of the
    * interfaces (that is, abstract data types) in the Java Collection Framework.
    */
    private void useJCF() 
    {
        useArrayListStringElement();
        useArrayListClassificationElement();
    }

    /** A class to be an element of a collection */
    private class Classification
    {
        /** the genus of the organism */
        private String genus;

        /** the species of the organism */
        private String species;

        /** the constructor */
        public Classification(String genus, String species)
        {
            this.genus = genus;
            this.species = species;
        }

        @Override
        public int hashCode() {
            int hash = 17;
            hash = hash * 29 + genus.hashCode();
            hash = hash * 29 + species.hashCode();
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
          if (this == obj) return true;
          if (obj == null) return false;
          if (getClass() != obj.getClass()) return false;
          Classification c = (Classification) obj;
          return genus.equals(c.genus) && species.equals(c.species);
        }

        @Override
        public String toString()
        {
            return "(" + this.genus + ", " + this.species + ")";
        }
    }

    /** A client for the ArrayList collection interface that has the
    * element in the collection being of type String.
    */
    private void useArrayListStringElement()
    {
    	
    	List<String> list01 = new ArrayList<String>() ;
    	 System.out.println(list01.isEmpty());
    	 list01.add("Red");
    	 list01.add("Blue");
    	 list01.add("White");
    	 
    	 
    	 
    	System.out.println(list01.toString());
    	list01.add(1, "Orange");
    	list01.add(3, "Green");
    	list01.add(5, "Yellow");
    	System.out.println(list01.toString());
    	
    	System.out.println(list01.get(0));
    	System.out.println(list01.get(list01.size()-1));
    	System.out.println(list01.isEmpty());
    	System.out.println(list01.indexOf("Orange"));
    	list01.remove("White");
    	System.out.println(list01.toString());
    	list01.remove(2);
    	System.out.println(list01.toString());
    	list01.remove(0);
    	System.out.println(list01.toString());
    	list01.remove(list01.size()-1);
    	System.out.println(list01.toString());
    	list01.clear();
    	System.out.println(list01.toString());
    	System.out.println(list01.isEmpty());
    	
    }


    /** A client for the ArrayList collection interface that has the
    * element in the collection being of type Classification.
    */
    private void useArrayListClassificationElement()
    {
       
    	List<Classification> list01 = new ArrayList<Classification>() ;
    
    	Classification input1 = new Classification("Homo","sapiens");
    	Classification input2 = new Classification("Malus","domestica");
    	
    	list01.add(input1);
    	list01.add(input2);
    	System.out.println(list01.toString());
    	list01.remove(input2);
    	list01.add(input1);
    	
        
    }

    /** 
     * Provides the entry point for this application.  This method creates
     * a <code>Lab07Client</code> and executes the
     * useJCF() method.
     *
     * @param args Unused.
    */
    public static void main(String[] args) 
    {
        Lab07Client client = new Lab07Client();
        client.useJCF();
    }
}

