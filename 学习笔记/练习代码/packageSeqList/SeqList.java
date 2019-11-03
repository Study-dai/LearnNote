package packageSeqList;

public class SeqList {
    //创建一个类，要先考虑这个类要支持哪些操作（分析需求）(增删改查）
    //结合这些操作来考虑要把保存什么样的数据
    private int [] arr=new int [10];
    //这个数组最大容量是10，初始情况下，这10个元素并不都是有效元素
    private int size=0;
    //size表示当前数组中有多少个有效元素
    public void display(){
        //System.out.println(Arrays.toString(arr));
        System.out.print("[");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
            if(i!=size-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    //在pos位置新增元素 ,pos表示把元素放到哪个下标上，data表示插入的元素是啥
    public void add(int pos,int data){
        //pos==size也允许插入,此时相当于尾插
        if(pos<0||pos>size){
            //pos位置无效
            return;
        }
        //判定是否数组下标越界，超过10个数字的话
        if(this.size>=this.arr.length){
            //这表示当前容量不够了，需要扩容
            //申请一块更大的内存空间，把原有数据拷贝过去
            realloc();
            //创建一个扩容的方法
        }
        if(pos==size){
            //尾插情况，直接把新元素放到size下标的位置上
            this.arr[pos]=data;
            this.size++;
            return;
        }
        //处理插入在中间位置的情况，进行搬运，把后面的元素依次往后挪
        for(int i=size;i>pos;i--){
            this.arr[i]=this.arr[i-1];
        }
        this.arr[pos]=data;
        this.size++;
    }
    private void realloc (){
        //由于这个方法的作用是为了给内存扩容，不需要给调用者使用
        //所以将这个方法封装在SeqList类中
        int [] newArr=new int [this.arr.length*2];
        //扩容的策略很灵活，根据实际问题场景的特点
        //来决定是具体是线性增长还是指数增长还是其他方式
        //原则是扩容是比较大的开销。此处采用扩容两倍
        //尽量根据实际场景，让扩容的次数尽量少
        for(int i=0;i<this.arr.length;i++){
            newArr[i]=this.arr[i];
        }
        this.arr=newArr;
        //从这里之后旧的数组就不用了，开始使用新的数组
        //旧数组会自动被垃圾回收机制回收，不需要释放内存
    }
    //判定是否包含某个元素
    public boolean contains(int toFind){
        return this.search(toFind)!=-1;
    }
    public int search(int toFind){
        for(int i=0;i<this.size;i++){
            if(arr[i]==toFind){
                return i;
            }
        }
        return -1;//找不到返回-1；
    }
    //获取pos位置的元素
    public int getPos(int pos){
        return this.arr[pos];
    }
    //给pos位置的元素设为 value
    public int setPos(int pos,int value){
        return this.arr[pos]=value;
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove){
        //要按值删除，得先找到这个值对应的下标，还得转换成按位置删除
        //这里可以直接调用上面的search方法来操作
        int pos=search(toRemove);
        if(pos==-1){//如果条件成立，使用search方法没找到，说明这个值不存在，不必删除
            return;
        }
        if(pos==this.size-1){
            //如果是最后一个元素，直接size--就行
            this.size--;
            return;
        }
        //如果删除的是一个普通位置的元素，需要进行搬运，
        //前面往后面搬运 直到搬运到最后一个元素位置上
        for(int i=pos;i<size-1;i++){//注意这里的边界值
            this.arr[i]=this.arr[i+1];
        }
        this.size--;
    }
    //获取顺序表的长度
    public int size(){
        return size;
    }
    //清空顺序表
    public void claer(){
        this.size=0;
    }

}

