package package1215;

 class PrintinOrder {
     private  int  i=0;
     public synchronized void first(){
         if(i==0) {
             System.out.println("one");
             i=1;
         }
     }
     public synchronized void second(){
         if(i==1) {
             System.out.println("two");
             i=2;
         }
     }
     public synchronized void third(){
         if(i==2) {
             System.out.println("three");
             i=0;
         }
     }
     private static class printOne extends Thread{
         PrintinOrder object;
         public printOne(PrintinOrder object) {
             this.object = object;
         }

         @Override
         public void run() {
             while(true){
                 object.first();
             }
         }
     }
     private static class printTwo extends Thread{
         PrintinOrder object;
         public printTwo(PrintinOrder object) {
             this.object = object;
         }

         @Override
         public void run() {
             while(true){
                 object.second();
             }
         }
     }
     private static class printThree extends Thread{
         PrintinOrder object;
         public printThree(PrintinOrder object) {
             this.object = object;
         }

         @Override
         public void run() {
             while(true){
                 object.third();
             }
         }
     }
     public static void main(String[] args) {
         PrintinOrder object=new PrintinOrder();
         Thread t1=new printOne(object);
         Thread t2=new printTwo(object);
         Thread t3=new printThree(object);
         t1.start();
         t2.start();
         t3.start();

     }
}

