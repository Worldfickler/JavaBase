package org.example.day06.iterator;

/**
 * @author Fickler
 * @date 2024/4/22 16:52
 */
public class FilmMenu implements TelevisionMenu {

    static final int MAX_ITEMS = 5;
    MenuItem[] menuItems;
    int numberOfItems = 0;

    public FilmMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem(1, "绝世天劫", "这是布鲁斯威利斯主演的...");
        addItem(2, "达芬奇密码", "这是我最喜欢的电影之一...");
        addItem(3, "黑客帝国123", "不知道你能够看懂不???");
        addItem(4, "我的女友是机器人", "一部我不反感的经典爱情电影...");
        addItem(5, "肖申克的救赎", "自由，幸福，离你有多远");
    }

    @Override
    public void addItem(int channel, String name, String description) {
        MenuItem menuItem = new MenuItem(name, description, channel);
        if (numberOfItems > MAX_ITEMS) {
            System.out.println("不好意思，菜单满了...");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems ++ ;
        }
    }

    @Override
    public Iterator createIterator() {
        return new FilmMenuIterator(menuItems);
    }
}
