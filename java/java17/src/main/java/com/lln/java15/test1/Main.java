package com.lln.java15.test1;

public class Main {
    public static void main(String[] args) {
        String oldStr = "假如生活欺骗了你，\n" +
                        "不要悲伤，不要心急！\n" +
                        "忧郁的日子里须要镇静：\n" +
                        "相信吧，快乐的日子将会来临！\n" +
                        "心儿永远向往着未来；\n" +
                        "现在却常是忧郁。\n" +
                        "一切都是瞬息，一切都将会过去；\n" +
                        "而那过去了的，就会成为亲切的怀恋。\n";
        System.out.println(oldStr);

        // 使用了文本块的字符串
        String newStr = """
                假如生活欺骗了你，
                不要悲伤，不要心急！
                忧郁的日子里须要镇静：
                相信吧，快乐的日子将会来临！
                心儿永远向往着未来
                现在却常是忧郁。
                一切都是瞬息，一切都将会过去；
                而那过去了的，就会成为亲切的怀恋。
                """;
        System.out.println(newStr);

        // 为了更好的支持文本块，字符串添加了一个方法formatted，可以更好的格式化一些信息
        LocationMessage locationMessage = new LocationMessage("北京", 15.2f);
        System.out.println(locationMessage);
    }

    private static class LocationMessage {
        private final String location;
        private final float temperature;

        public LocationMessage(String location, float temperature) {
            this.location = location;
            this.temperature = temperature;
        }

        @Override
        public String toString() {
            return """
                    location=%s
                    temperature=%.2f
                    """.formatted(location, temperature);

        }
    }
}
