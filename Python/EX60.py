def is_leap(year):
    return (year % 100 != 0) and (year %4 == 0) or year % 400 == 0

year=input('input a year >> ')

if is_leap(year):
    print 'leap year'
else:
    print 'not leap year'
