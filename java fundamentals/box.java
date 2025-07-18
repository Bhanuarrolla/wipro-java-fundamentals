class Box{
    void volume(int width,int height,int depth){
        int vol=width*height*depth;
        System.out.println(vol);
    }
    public static void main(String[] args){
        Box myBox = new Box();
        myBox.volume(10,20,30);
        myBox.volume(5,15,25);

    }
}