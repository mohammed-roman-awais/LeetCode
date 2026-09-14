class OrderedStream {
    String[] stream;
    int ptr;
    public OrderedStream(int n) {
        stream = new String[n + 1];
        ptr = 1;
    }
    public List<String> insert(int idKey, String value) {
        stream[idKey] = value;
        List<String> ans = new ArrayList<>();
        while (ptr < stream.length && stream[ptr] != null) {
            ans.add(stream[ptr]);
            ptr++;
        }
        return ans;
    }
}