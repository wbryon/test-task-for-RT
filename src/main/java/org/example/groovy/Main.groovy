package org.example.groovy

static void main(String[] args) {
  println countNumberOfElements([1, 3, 4, 5, 1, 5, 4])
}

static Map<Integer, Integer> countNumberOfElements(List<Integer> list) {
  Map<Integer, Integer> map = [:]
  list.each { integer ->
    map[integer] = map.getOrDefault(integer, 0) + 1
  }
  return map
}