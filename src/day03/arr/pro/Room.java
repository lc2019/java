package day03.arr.pro;

import java.util.Objects;

public class Room {
    /**
     * 房间号，房间类型（标准间单人间），是否被预定
     * 房间编号 101,102,10x，20x
     */
    private int no;
    private String type;
    private boolean status;

    public Room() {
    }

    public Room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "[" + no + "," + type + (status ? "空闲" : "占用") + "] ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Room arr_pro = (Room) o;
        return no == arr_pro.no &&
                status == arr_pro.status &&
                Objects.equals(type, arr_pro.type);
    }


}
