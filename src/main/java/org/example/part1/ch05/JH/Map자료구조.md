### Map 자료구조 

```
Map<String,Integer> map= new HashMap<>();
map.put("Carol",23);
map.put("Alice",27");
map.put("Dave" ,19);
map.remove("Carol");
map.put("Erin",31);
map.put("Erin",21); // 이미 존재한다면 덮어씌웁니다. 

map.containsKey("Alice");

```

* HashMap 
해시 테이블을 기반으로 한다. null 저장이 가능하고 key 의 순서가 보장되지 않는다. 
* TreeMap 
null 저장이 불가하고. key 의 순서가 보장된다. 