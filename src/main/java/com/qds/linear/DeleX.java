package com.qds.linear;

import java.util.StringJoiner;

/**
 * @author kong
 */
public class DeleX {


    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.addHead("4");
        list.addHead("3");
        list.addHead("2");
        list.addHead("1");
        System.out.println(list);
        list.delete("1");
        System.out.println(list);
    }


    private static class LinkList {
        /**
         * 头结点
         */
        private Node head;

        public boolean delete(String value) {
            if (head == null) {
                System.out.println("没有元素删除");
                return false;
            }

            if (head.data.equals(value)) {
                head = head.next;
                return true;
            }

            for (Node node = head; node != null; node = node.next) {
                if (node.next.data.equals(value)) {
                    node.next = node.next.next;
                    return true;
                }
            }
            return false;
        }

        public void addHead(String value) {
            if (head == null) {
                head = new Node(value, null);
                return;
            }
            head = new Node(value, head);
        }

        @Override
        public String toString() {
            if (head == null) {
                return null;
            }
            StringJoiner joiner = new StringJoiner(",");
            for (Node node = head; node != null; node = node.next) {
                joiner.add(node.data);
            }
            return joiner.toString();
        }
    }

    /**
     * 节点
     */
    private static class Node {
        /**
         * 数据域
         */
        String data;
        /**
         * 指针域
         */
        Node next;

        Node(String data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

}
