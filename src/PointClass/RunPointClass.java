package PointClass;

public class RunPointClass {
    public static void main(String[] args){
        Point2D newPoint2d = new Point2D(12.3f, 14.8f);
        Point3D newPoint3d = new Point3D(105.4f );
        System.out.println("Location of XY in 2D scale: ");
        for (float element: newPoint2d.getXY()
             ) {
            System.out.print(element+ " ");
        }
        System.out.println();
        System.out.println("Location of XYZ in 3D scale: ");
        for (float element: newPoint3d.getXYZ()
        ) {
            System.out.print(element+ " ");
        }
        System.out.println();

//        System.out.println(newPoint2d.toString());
//        System.out.println(newPoint3d.toString());
    }
}
