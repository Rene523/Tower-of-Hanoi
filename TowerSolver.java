
public class TowerSolver {
    private TowerModel model;

    public TowerSolver()
    {
        // Nothing to do here
    }

    public void solve(TowerModel model)
    {
        this.model = model;
        model.print();
        model.solve(model.height(),0,2,1);
        // Call the missing solve method (not this one)
    }

    // Create an overloaded solve(...) method
    // This new method will be recursive (call itself)
    //
    // [ solve method here]
    //
    public void solve(int n, int source, int destination, int temporary){
       if(n==1){
        //base case
        model.move(source, destination);
        model.print();
        return;
       }
       solve(n-1, source, destination, temporary);

       //intermediate
       model.move(source, destination);
       model.print();
       solve(n-1, source, destination, temporary);
    }


}
