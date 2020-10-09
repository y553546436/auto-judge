# for f in $(ls | grep log); do echo $f; if grep -q "MAY_BE" $f;then grep "MAY_BE" $f; head -4 $f | tail -1; fi; done > summary

vic="VICTIM"
pol="POLLUTER"
def readline(linel, cur):
    while vic in linel[cur] or pol in linel[cur]:
        cur += 1
    return cur
with open("summary", "r") as fin:
    lines = fin.readlines()
    i = 0
    both=[]
    v=[]
    p=[]
    while i < len(lines):
        if vic in  lines[i] and pol in lines[i+1]:
            i = readline(lines, i)
            both.append(lines[i])
            i += 1
        elif pol in lines[i] and vic in  lines[i+1]:
            i = readline(lines, i)
            both.append(lines[i])
            i += 1
        elif vic in lines[i]:
            v.append(lines[i+1])
            i += 2
        elif pol in  lines[i]:
            p.append(lines[i+1])
            i += 2
        else:
            assert "log" in lines[i], lines[i]
            i += 1
    print("BOTH")
    for item in both:
        print(item, end='')
    print("V")
    for item in v:
        print(item, end='')
    print("P")
    for item in p:
        print(item, end='')
