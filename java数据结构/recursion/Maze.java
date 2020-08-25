package recursion;

public class Maze {
	public static void main(String[] args) {
		
		int[][] map = new int[8][7];
		
		//把上下两条设置为墙
		for (int i = 0; i < 7; i++) {
			map[0][i] = 1; //第1行第1-7列
			map[7][i] = 1; 	//第8行第1-7列
		}
		
		//把左右两条设置为墙
		for (int i = 1; i < 8; i++) {
			map[i][0] = 1; //第1-8行第1列
			map[i][6] = 1; //第1-8行第7列
		}
		
		map[3][1] = 1;
		map[3][2] = 1;
		
		setWay(map, 1, 1);
		
		//输出地图
		for (int i = 0 ; i < 8; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * @param map
	 * @param i 从哪里开始
	 * @param j 到那里结束
	 * @return 该路是否为通路 true为通 false不通
	 */
	
	//起点为1，1  终点为6，5（第7行第6列） 规定方向：下-右-上-左
	public static boolean setWay (int[][] map, int i, int j) {
		if (map[6][5] == 2) {
			return true;
		} else {
			if (map[i][j] == 0) {
				map[i][j] = 2; //先假设可以走通
				
				if (setWay(map, i + 1, j)) { //向下
					return true;
				} else if (setWay(map, i, j + 1)) { //向右
					return true;
				} else if (setWay(map, i - 1, j)) { //向下
					return true;
				} else if (setWay(map, i, j - 1)) { //向左
					return true;
				} else { // 说明这个点四方向都走不通
					map[i][j] = 3;
					return false;
				}
			} else {
				return false;
			}
			
		}
	}
	
}











