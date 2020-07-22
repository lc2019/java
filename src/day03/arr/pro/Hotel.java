package day03.arr.pro;

public class Hotel {
    private Room[][] rooms;

    public Hotel() {
        rooms = new Room[3][10];

        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (i == 0) {
                    //1楼
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "单人间", true);
                } else if (i == 1) {
                    //2楼
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "双人间", true);
                } else if (i == 2) {
                    //3楼
                    rooms[i][j] = new Room((i + 1) * 100 + j + 1, "总统套房", true);
                }
            }
        }
    }

    public void printR() {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                Room room = rooms[i][j];
                System.out.print(room);
            }
            System.out.println();
        }
    }

    /**
     * 订房 房间编号 101,102,10x
     *
     * @param roomNo
     */
    public void order(int roomNo) {
        Room room = rooms[roomNo / 100 - 1][roomNo % 100 - 1];
        room.setStatus(false);
    }

    /**
     * 退房
     *
     * @param roomNo
     */
    public void exit(int roomNo) {
        Room room = rooms[roomNo / 100 - 1][roomNo % 100 - 1];
        room.setStatus(true);
    }
}
