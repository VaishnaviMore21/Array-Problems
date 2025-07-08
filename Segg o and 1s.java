int n=arr.length;
        int type0=0;
        int type1=n-1;
        int temp;
        while(type0<type1)
        {
            if(arr[type0]==1)
            {
                temp=arr[type0];
                arr[type0]=arr[type1];
                arr[type1]=temp;
                type1--;
            }
            else
            {
                type0++;
            }
        }
    }
