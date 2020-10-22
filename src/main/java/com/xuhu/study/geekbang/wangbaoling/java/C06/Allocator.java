package com.xuhu.study.geekbang.wangbaoling.java.C06;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author xuhu
 * @date 2020-10-22 19:31
 */
public class Allocator {
    private final List<Account> als = new LinkedList<Account>();

    // 一次性申请所有资源
    public synchronized void apply(Account from, Account to) {
        // 经典写法
        while (als.contains(from) || als.contains(to)) {
            try {
                System.out.println("等待用户 -> " + from.getId() + "_" + to.getId());
                wait();
            } catch (Exception e) {
                //notify + notifyAll 不会来这里
                System.out.println("异常用户 -> " + from.getId() + "_" + to.getId());
                e.printStackTrace();
            }
        }
        als.add(from);
        als.add(to);
    }

    // 归还资源
    public synchronized void free(Account from, Account to) {
        System.out.println("唤醒用户 -> " + from.getId() + "_" + to.getId());
        als.remove(from);
        als.remove(to);
        notifyAll();
    }
}

class Account {
    // actr 应该为单例
    private final Allocator actr;
    //唯一账号
    private final long id;
    //余额
    private int balance;

    public Account(Allocator actr, long id, int balance) {
        this.actr = actr;
        this.id = id;
        this.balance = balance;
    }

    // 转账
    public void transfer(Account target, int amt) {
        // 一次性申请转出账户和转入账户，直到成功
        actr.apply(this, target);
        try {
            //TODO 有了资源管理器，这里的synchronized锁就不需要了吧？！
            if (this.balance > amt) {
                this.balance -= amt;
                target.balance += amt;
            }
            //模拟数据库操作时间
            try {
                Thread.sleep(new Random().nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } finally {
            actr.free(this, target);
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id ^ (id >>> 32));
        return result;
    }

    /**
     * 用于判断两个用户是否一致
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Account other = (Account) obj;
        if (id != other.id)
            return false;
        return true;
    }

    public long getId() {
        return id;
    }
}