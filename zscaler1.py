# Problem statement :

'''There are some groups of devils and they splitted into people to kill them. Devils make People to them left as their group and at last the group with maximum length will be killed. Two types of devils are there namely “@” and “$”
People is represented as a string “P”'''

#Input Format:
#First line with the string for input

#Output Format:
#Number of groups that can be formed.

#Constraints:
#2<=Length of string<=10^9

#Input string
#PPPPPP@PPP@PP$PP

#Output
#7

#Explanation
'''4 groups can be formed
PPPPPP@
PPP@
PP$
PP'''

#Most people in the group lie in group 1 with 7 members.

s = input("Input String : ")
s = s.replace("@", " ").replace("$", " ")
s = s.split()
ans = []
for i in s:
    ans.append(len(i) + 1)
ans[-1] -= 1
print(max(ans))
