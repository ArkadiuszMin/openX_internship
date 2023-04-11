package org.source;

public class NodeUtils {

    private NodeUtils() {
    }

    public static int countLeafs(Node node) {
        int res = 0;

        if (node.getRight() == null && node.getLeft() == null) return 1;

        if (node.getRight() != null) res += countLeafs(node.getRight());

        if (node.getLeft() != null) res += countLeafs(node.getLeft());

        return res;
    }

    public static int longestPath(Node node) {
        if (node.getRight() == null && node.getLeft() == null) {
            return 0;
        }
        int left = 0;
        int right = 0;
        if (node.getRight() != null) {
            left = 1 + longestPath(node.getRight());
        }
        if (node.getLeft() != null) {
            right = 1 + longestPath(node.getLeft());
        }
        return Math.max(right, left);
    }

    public static boolean structureEquals(Node node1, Node node2) {
        if (node1 == null && node2 == null) return true;

        if ((node1 == null && node2 != null) || (node1 != null && node2 == null)) return false;

        return structureEquals(node1.getRight(), node2.getRight()) && structureEquals(node1.getLeft(), node2.getLeft());
    }
}
