import java.util.ArrayList;

/**
 * A steel factory (an implementation of an enterprise)
 * represented by its name and list of employees.
 *
 * @author AlgoDat team
 */
public class SteelFactory implements Enterprise {

    /**
     * Name of the factory
     */
    private String name;
    /**
     * List of workers
     */
    private ArrayList<Worker> workers;

    /**
     * Creates a new steel factory with a given name
     *
     * @param name Name of the factory
     */
    public SteelFactory(String name) {
        this.name = name;
        workers = new ArrayList<>();
    }

    @Override
    public void addWorker(String firstName, String lastName) {
        Worker worker = new Worker(firstName, lastName);
        workers.add(worker);
    }

    @Override
    public String getName() {
        return this.name;


    }

    @Override
    public int compareTo(Enterprise o) {
        return this.getWorkerCount() -o.getWorkerCount() ;
        // oder :
        //if(getWorkerCount()==o.getWorkerCount()) {
          //  return 0;
        //} else if ( getWorkerCount() > o.getWorkerCount()) {
         //   return 1;
        //} else {
         //   return -1;
       // }
    }

    @Override
    public int getWorkerCount() {
        return workers.size();
     /*   int i;
        for (i = 0; i < workers.size(); i++) {
            workers.get(i);
        }
        return i;*/
    }

}


