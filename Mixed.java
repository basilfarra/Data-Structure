public static void mixedQ()
    {
        Stack s = new Stack();
        LinkedList ls = new LinkedList();
        int n = 3;
        System.out.println("Stack Pushed: ");
        while(!s.isfull())
        {
            s.push(n);
            n++;
        }
        while(!s.isempty())
            ls.insert(ls,s.pop());
    }

