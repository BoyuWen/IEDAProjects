package threadlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dr.Wen on 2017/5/16.
 */
public class ThreadList {
    public static ThreadGroup getRootThreadGroup(){ //返回根线程组
        ThreadGroup root = Thread.currentThread().getThreadGroup();
        while (root.getParent() != null){
            root = root.getParent();
        }
        return root;
    }

    public static List<String> getThreadList(ThreadGroup group){ //返回指定线程组中所有线程名称
        List<String> threadList = new ArrayList<String>();
        Thread[] threads = new Thread[group.activeCount()];
        int count = group.enumerate(threads,false);
        for (int i=0;i<count;i++){
            threadList.add(group.getName()+"线程组："+threads[i].getName());
        }
        return threadList;
    }

    public static List<String> getThreadGroups(ThreadGroup group){ //返回指定线程组中所有线程以及子线程组中线程名
        List<String> threadList = getThreadList(group);
        ThreadGroup[] groups = new ThreadGroup[group.activeGroupCount()];
        int count = group.enumerate(groups,false);
        for (int i=0;i<count;i++){
            threadList.addAll(getThreadList(groups[i]));
        }
        return threadList;
    }

    public static void main(String[] args){
        for (String s:getThreadGroups(getRootThreadGroup())){
            System.out.println(s);
        }
    }
}
