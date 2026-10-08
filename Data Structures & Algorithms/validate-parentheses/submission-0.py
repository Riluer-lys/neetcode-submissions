class Solution:
    def isValid(self, s: str) -> bool:

        if s == "":
            return True

        stack = []
        closeToOpen = {
            ")" : "(",
            "]" : "[",
            "}" : "{"
        }

        for c in s:
            if c in closeToOpen: #if char is a key in dict
                if stack and stack[-1] == closeToOpen[c]: #if stack not empty and 
                    stack.pop()
                else:
                    return False
            else:
                stack.append(c)
            
        
        return True if not stack else False