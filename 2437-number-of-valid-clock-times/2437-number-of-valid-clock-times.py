class Solution:
    def countTime(self, time: str) -> int:
        h1, h2 = time[0], time[1]
        m1, m2 = time[3], time[4]

        if h1 == '?' and h2 == '?':
            hours = 24
        elif h1 == '?':
            if h2 <= '3':
                hours = 3  
            else:
                hours = 2  
        elif h2 == '?':
            if h1 == '2':
                hours = 4  
            else:
                hours = 10
        else:
            hours = 1

        if m1 == '?' and m2 == '?':
            minutes = 60
        elif m1 == '?':
            minutes = 6 
        elif m2 == '?':
            minutes = 10
        else:
            minutes = 1

        return hours * minutes