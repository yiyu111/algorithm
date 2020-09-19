package practice;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class CombinationSum {
  public static void main(String[] args) throws InterruptedException {
    CombinationSum second = new CombinationSum();
    List<List<Integer>> lists = second.combinationSum(new int[] {1, 2, 3, 4, 5}, 8);
    System.out.println(lists);
  }

  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    List<List<Integer>> res = new ArrayList<>();
    Deque<Integer> temp = new ArrayDeque<>();
    help(0, res, temp, candidates, target, 0);
    return res;
  }

  void help(
      int begin,
      List<List<Integer>> res,
      Deque<Integer> temp,
      int[] candidates,
      int target,
      int sum) {
    if (sum == target) {
      res.add(new ArrayList<>(temp));
      return;
    } else if (sum > target) {
      return;
    }

    for (int i = begin; i < candidates.length; i++) {
      temp.addLast(candidates[i]);
      System.out.println(temp);
      sum += candidates[i];
      help(i, res, temp, candidates, target, sum);
      sum -= temp.removeLast();
      System.out.println(temp);
    }
  }
}
