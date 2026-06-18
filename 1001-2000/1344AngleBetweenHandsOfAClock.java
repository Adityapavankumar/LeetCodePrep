class Solution {
    public double angleClock(int hour, int minutes) {
        // total angle is 360 degrees
        // 1 hour is 30 degrees
        // 1 minute is 6 degrees
        // 3:30 means, 30 minute -> 30*6 -> 180 degree, 3 hour -> 3.5*30 -> 105, diff is 75

        // calculate angle for minutes
        int minuteAngle = minutes*6;

        // calculate angle for hour
        hour = hour%12; // to eliminate cases of 12 hour
        double effectiveHourValue = hour + (minutes/60.0);
        double hourAngle = effectiveHourValue * 30;

        if(minuteAngle>hourAngle){

            return (minuteAngle-hourAngle)>180? 360-(minuteAngle-hourAngle):minuteAngle-hourAngle;
        } else {
            return (hourAngle-minuteAngle)>180? 360-(hourAngle-minuteAngle):hourAngle-minuteAngle;
        }
    }
}