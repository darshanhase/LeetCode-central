class Solution {

    class Pair{
        String word;
        int val;

        Pair(String s, int v){
            this.word = s;
            this.val = v;
        }
        
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int n = wordList.size();
        
        HashMap<String, Integer> map = new HashMap<>();
        for(String word : wordList){
            map.put(word,1);
        }

        if(!map.containsKey(beginWord)){
            map.put(beginWord, 1);
        }

        if(!map.containsKey(endWord)){
            return 0;
        }

        Queue<Pair> q = new ArrayDeque<>(); 

       q.offer(new Pair(beginWord, 1));
map.remove(beginWord);

while (!q.isEmpty()) {

    Pair p = q.poll();

    StringBuilder s = new StringBuilder(p.word);
    int v = p.val;

    if (p.word.equals(endWord)) {
        return v;
    }

    for (int i = 0; i < s.length(); i++) {

        char original = s.charAt(i);

        for (char c = 'a'; c <= 'z'; c++) {

            if (c == original) {
                continue;
            }

            s.setCharAt(i, c);

            String newWord = s.toString();

            if (map.containsKey(newWord)) {
                q.offer(new Pair(newWord, v + 1));
                map.remove(newWord);
            }
        }

        s.setCharAt(i, original);
    }
}
        return 0;
    }
}