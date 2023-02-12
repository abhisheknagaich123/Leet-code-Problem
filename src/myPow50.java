public class myPow50 {
    public double myPow(double x, int n) {
        if (n<0){
            return negativenumber(x,n);
        }
        else {
            return postive(x,n);
        }
    }
    double postive(double x,int n){
        if (n==0){
            return 1;
        }
        double smalloutput=myPow(x,n/2);
        if (n%2==0){
            return smalloutput * smalloutput;
        }
        else {
            return x * smalloutput * smalloutput;
        }

    }
    double negativenumber(double x, int n){

        if (n==-1){
            return 1/x;
        }
        double smalloutput=myPow(x,n/2);
        if (n%2==0){
            return smalloutput * smalloutput;
        }
        else {
            return (1/x) * smalloutput * smalloutput;
        }
    }
}
