/**
 * Created by Qifan on 7/20/25.
 * 读取 foods.csv 文件
 * 统计所有杂货店的萝卜(turnip)数量
 * 但结果是负数，这不对
 */
public class DebugExercise3 {
    public static int countTurnips(In in) {
        int totalTurnips = 0;
        while (!in.isEmpty()) {
            String vendor = in.readString();
            String foodType = in.readString();
            double cost = in.readDouble();
            int numAvailable = in.readInt();
            if (foodType.equals("turnip")) {
                int newTotal = totalTurnips + numAvailable;
                totalTurnips = newTotal;
            }
            in.readLine();
        }
        return totalTurnips;
    }

    public static void main(String[] args) {
        In in = new In("foods.csv");
        System.out.println(countTurnips(in));
    }
}

//通过debug 找到问题了！！！ 设置了条件断点newTotal < 0后发现
//达到某个数据时，newtotal就小于0了
//在.csv中寻找到了这个数据  发现这个数据存在问题！
//第89行：kroger turnip 0.45 -387128732    数据为负数  将它修改一下  成功debug