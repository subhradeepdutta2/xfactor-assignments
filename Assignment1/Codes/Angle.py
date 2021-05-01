hh,mm = input('Enter time in format "hh:mm": ').split(':')
hh=int(hh)
mm=int(mm)
if hh==12:
    hh=0
hneedle = hh*5      #minutes corresponding to hour needle
frac=mm/2     #mm/60*30
mdeg=mm*6     #6 degree for each minute
hdeg=hneedle*6
f_hdeg=hdeg+frac
if abs(mdeg-f_hdeg) <= 180:
    angle=abs(mdeg-f_hdeg)
else:
    high=min([mdeg,f_hdeg]) + 360
    low=max([mdeg,f_hdeg])
    angle=high - low
print("Clock angle is:",angle,"degrees")