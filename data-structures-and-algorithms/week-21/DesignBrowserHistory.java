public class DesignBrowserHistory {
    public class Node {
        String url;
        Node prev, next;

        public Node(String url) {
            this.url = url;
            this.prev= null;
            this.next = null;

        }
    }

        public Node current;

        public DesignBrowserHistory(String homepage) {
            current = new Node(homepage);
    }

        public String visit(String url) {
            Node newUrl = new Node(url);
            current.next = newUrl;
            current = newUrl;
        }

        public String back(int steps) {
            for (; current.prev != null && steps>0; steps--) {
                current = current.prev;
            }

            return current.url;
        }

        public String forward(int steps) {
            for (; current.next != null && steps>0; steps--) {
                current  = current.next;

            }

            return current.url;
        }
    }
