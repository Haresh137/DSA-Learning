public class CustomStack<Generic> {
        private Object[] data;
        private int size=0;
        CustomStack(){

                data=new Object[10];
        }
        public void push(Generic value){
                if(size>=data.length) {
                        Object[] copy = new Object[size];
                        for (int i = 0; i < size; i++) {
                                copy[i] = data[i];
                        }
                        data = new Object[size + 10];
                        for(int j=0;j<size;j++) {
                                data[j] = copy[j];
                        }
                }
                data[size]=value;
                size++;
        }
        public Generic pop(){
                if(isEmpty()){
                        return null;
                }
                size--;
                return (Generic)data[size];

        }
        public Generic peek(){
                if(isEmpty()){
                        return null;
                }
                return (Generic)data[size-1];

        }
        public int size(){
                return size;
        }
        public boolean isEmpty(){
                return size==0;
        }
        @Override
        public String toString(){
                String set="[";
                for(int i=0;i<size;i++){
                        if (i==size-1){
                                set=set+data[i];
                        }
                        else{
                                set=set+data[i]+','+" ";
                        }

                }
                return set+"]";

        }
        public void clear(){
                size=0;
                data=new Object[10];
        }
}

