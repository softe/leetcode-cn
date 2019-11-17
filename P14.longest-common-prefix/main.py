from typing import List


class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        r = [len(set(c)) == 1 for c in zip(*strs)] + [False]
        return strs[0][:r.index(False)] if strs else ''


def main():
    # todo MAIN function code
    print('this is main')
    print(__name__)


if __name__ == '__main__':
    main()
    # test case try zip *
    # how * work?
    strs = ["flower", "flow", "flight"]
    L = zip(*strs)

    print([len(set(c)) == 1 for c in L] + [False])
    print([len(set(c)) == 1 for c in zip(*strs)] + [False])

    for i in L:
        print('already run for once,so nothing here')
        print(i)
    Z = zip(strs, strs)
    for i in Z:
        print(i)
    print(__name__)

    # what is True?
    print(True == 1)
    print(False == 0)
    if 2:
        print(True == 2)
        print(True)
        print(1)
