package Course;

public class SortArray {
    public Book[] sort(){
        Book listBook[] = new Book[10];
        //         sắp xếp nổi bọt
        for (int i=0; i<listBook.length-1; i++){
            for (int j=0; j<listBook.length-1; j++ ){
                if(listBook[j].getName().charAt(0) > listBook[j+1].getName().charAt(0)){
                    Book t = listBook[j];
                    listBook[j] = listBook[j+1];
                    listBook[j+1] = t;
                }
            }
        }
        // sắp xếp chèn
        for (int i=1; i<listBook.length; i++){
            int positionFront = i;
            int position = i;
            for (int j=i-1; j>=0; j-- ){
                if(listBook[i].getName().charAt(0) < listBook[j].getName().charAt(0)){
                    positionFront =j;
                }
            }
            Book product = listBook[position];
            for(int k= position; k>positionFront; k--){
                listBook[k] = listBook[k-1];
            }
            listBook[positionFront] = product;
        }
        // sắp xếp chọn
        for (int i=0; i<listBook.length; i++){
            char min = listBook[i].getName().charAt(0);
            int position = i;
            for (int j=i+1; j< listBook.length; j++ ){
                if(min > listBook[j].getName().charAt(0)){
                    min = listBook[j].getName().charAt(0);
                    position = j;
                }
            }
            Book t = listBook[i];
            listBook[i] = listBook[position];
            listBook[position] = t;
        }
        //in lại mảng
        for (int i=0; i<listBook.length; i++) {
            System.out.println(listBook[i].getName()+ " ");
        }
        return listBook;
    }

}
