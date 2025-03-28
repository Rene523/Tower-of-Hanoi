
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
        solve(model.height(),0,2);
        // Call the missing solve method (not this one)
    }

    // Create an overloaded solve(...) method
    // This new method will be recursive (call itself)
    //
    // [ solve method here]
    //
    public void solve(int n, int source, int destination){
       if(n==1){
        //base case
        model.move(source, destination);
        model.print();
        return;
       }
       solve(n-1, source, destination-1);

       //intermediate
       model.move(source, destination);
       model.print();
       solve(n-1, source+1, destination);
    }


}
