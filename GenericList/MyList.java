package GenericList;

import java.util.Arrays;
public class MyList<T> {
   private T[] array;
   

    public MyList(){
        this.array = (T[]) new Object[10];
    }

    public MyList(int capacity){
        this.array = (T[]) new Object[capacity];
    }

    public void add(T data){
        array[size()] = data;
        if(size()==getCapacity()){
            reArray(this.array);
        }
    }

    public int size(){
        int size = 0;
        for(T i : array){
            if (i!=null){
                size++;
            }
        }
        return size;
    }

    public int getCapacity(){
        int capacity = this.array.length;
        return capacity;
    }

    public void reArray(T[] firstArray){
        T[] temporaryArray = (T[])new Object[size()*2];
        for(int i = 0; i < this.array.length; i++){
            temporaryArray[i] = this.array[i];
        }
        this.array = temporaryArray;
    }

    public T get(int index){
        if (index>=getCapacity()){
            return null;
        } else {
            return this.array[index];
        }
    }

    public T remove(int index){
        if (index>=getCapacity()){
            return null;
        } else {
            for(int i = index; i<size(); i++){
                this.array[i] = this.array[i+1];
            }
            return this.array[index];
        }
    }

    public T set(int index, T data) {
        if (index>=getCapacity()){
            return null;
        } else {
            this.array[index] = data;
            return this.array[index];
        }
    }

    @Override
    public String toString(){
        return Arrays.toString(this.array);
    }

    public int indexOf(T data){
        for(int i = 0; i<size(); i++){
            if(this.array[i] == data) {
                return i;
            } else {
                return -1;
            }
        }
        return 0;
    }

    public int lastIndexOf(T data){
        int lastIndex = -1;
        for(int i = 0; i<size(); i++){
            if(this.array[i] == data) {
                lastIndex = i;
            } 
        }
        return lastIndex;
    }

    public boolean isEmpty(){
        if (size() == 0){
            return true;
        } else {
            return false;
        }
    }

    public T[] toArray(){
        return this.array;
    }

    public MyList<T> subList(int start,int finish){
        MyList<T> list = new MyList<>(finish-start+1);
        for (int i = start; i <= finish; i++) {
            list.add(this.array[i]);
        }
        return list;
    } 

    public boolean contains(T data){
        for(int i = 0; i<size(); i++){
            if (this.array[i]==data){
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public void clear(){
        this.array = (T[]) new Object[getCapacity()];
    }



}
