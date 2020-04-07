package day04.pro1;

/**
 * 存储客户信息的数组
 */
public class customlist {

    private custom[] customs; //用来保存客户信息的数组
    private int total; //客户的总个数，数组的总容量

    /**
     * 初始化custom数组
     *
     * @param totalCustom
     */
    public customlist(int totalCustom) {
        customs = new custom[totalCustom];
    }

    /**
     * 客户数组的信息-数组增加
     *
     * @param custom
     * @return bool
     */
    public boolean addCustom(custom custom) {
        if (total >= customs.length) {
            return false;
        }
        //往数组添加元素，先调用然后++
        customs[total++] = custom;
        return true;
    }

    /**
     * 修改客户信息-数组修改
     *
     * @param custom
     * @return
     */
    public boolean modCustom(int index, custom custom) {
        if (index < 0 || index > total) {
            return false;
        }
        //修改数组
        customs[index] = custom;
        return true;
    }

    /**
     * 删除客户信息-数组删除
     *
     * @param index
     * @return
     */
    public boolean delCustom(int index) {
        if (index < 0 || index > total) {
            return false;
        }
        //放置下标越界
        for (int i = 0; i < total - 1; i++) {
            customs[i] = customs[i + 1];
        }
        //删除1个元素后 数组最后1个为null
        customs[total - 1] = null;
        total--;
        return true;
    }

    /**
     * 遍历客户信息
     *
     * @return
     */
    public custom[] showCustomInfo() {
        custom[] cus = new custom[total];
        for (int i = 0; i < total; i++) {
            cus[i] = customs[i];
        }
        return cus;
    }

    /**
     * 获取指定客户信息
     *
     * @param index
     * @return
     */
    public custom getCustom(int index) {
        if (index < 0 || index > total) {
            return null;
        }
        return customs[index];
    }

    /**
     * 客户总数
     *
     * @return
     */
    public int getTotal() {
        return total;
    }
}
