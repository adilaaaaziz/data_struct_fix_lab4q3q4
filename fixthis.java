
//////////////////////////// Q U E S T I O N  3 //////////////////////////

    public ArrayBag<T> intersection(ArrayBag<T> aBag) {
        ArrayBag<T> newBag = new ArrayBag();
        ArrayBag<T> bagA = new ArrayBag();
        ArrayBag<T> bagB = new ArrayBag();
        
        //Copy items from the original bag to another bag
        for(int i=0; i<numberOfEntries; i++) {
            bagA.add(bag[i]);
        }        
        for(int i=0; i<aBag.numberOfEntries; i++) {
            bagB.add(aBag.bag[i]);
        }
        
        int i = 0;
        while(i<bagA.numberOfEntries) {
            int j =0;
            while(j<bagB.numberOfEntries) {
                if(bagA.bag[i]==bagB.bag[j]) {
                    newBag.add(bagA.bag[i]);
                    bagA.remove(bagA.bag[i]);
                    bagB.remove(bagA.bag[i]);
                    break;
                } else j++;
            }
            if(j==bagB.numberOfEntries) {
                i++;
            }
        }       
        return newBag;
    }
    
//////////////////////////// Q U E S T I O N  4 //////////////////////////

    public ArrayBag<T> difference(ArrayBag<T> aBag) {

        ArrayBag<T> newBag = new ArrayBag();
        ArrayBag<T> bagA = new ArrayBag();
        ArrayBag<T> bagB = new ArrayBag();
        
        //Copy items from the original bag to another bag
        for(int i=0; i<numberOfEntries; i++) {
            bagA.add(bag[i]);
        }      
        for(int i=0; i<aBag.numberOfEntries; i++) {
            bagB.add(aBag.bag[i]);
        }
        
        //Processs
        int i = 0;
        while(i<bagA.numberOfEntries) {
            int j =0;
            while(j<bagB.numberOfEntries) {
                if(bagA.bag[i]==bagB.bag[j]) {
                    bagA.remove(bagA.bag[i]);
                    bagB.remove(bagA.bag[i]);
                    break;
                } else j++;
            }
            if(j==bagB.numberOfEntries) {
                i++;
            }
          
        }
        for(int k=0;k<bagA.numberOfEntries;k++) {
            newBag.add(bagA.bag[k]);
        }
        return newBag;
    }
