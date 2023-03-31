class Point {
    double x,y;
    Point(){
        this.x=this.y=-1;
    }
    Point(double i,double j){
        this.x=i;
        this.y=j;
    }
    Point(Point p){
        this.x=p.x;
        this.y=p.y;
    }
    double distance(Point p){
        return Math.sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y));

    }
}
public class testpoint {
    public static void main(String [] args) {
        Point A=new Point();
        Point B=new Point(2,3);
        Point C=new Point(A);
        System.out.println("AB= "+A.distance(B));
        System.out.println("AC= "+A.distance(C));
        System.out.println("BC= "+B.distance(C));
    }

}