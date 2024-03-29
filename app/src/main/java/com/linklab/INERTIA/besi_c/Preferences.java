package com.linklab.INERTIA.besi_c;

import android.os.Environment;

@SuppressWarnings("ALL")    // Service wide suppression for the Errors.
public class Preferences        // System wide one stop place to set all settings for a particular individual
{
    /* ------------------------------------------------------------------------------- Settings for Deployment, Read Notes Carefully ------------------------------------------------------------------------------*/

    // There should be **NO CHARACTERS OTHER THAN LETTERS, NUMBERS, - or _ ** in file or directory names!
    public String DeviceID = "CG2";        // Internal ID of Device assigned to Dyad
    public String DeploymentID = "Dep5";      // Deployment ID
    public String Role = "CG";         // Role of user wearing the watch; CG for Caregiver or PT for Patient
    public String Directory = Environment.getExternalStorageDirectory() + "/BESI-C/";        // Directory on the watch where all files are saved

    // Settings for General Watch Features | Time is in ms |
    public int ThreadUpdater = 5000;        // This is how often the main thread is run
    public int UIUpdate = 30;       // This is how ofthen the User Interface is updated (TIME IN SECONDS)
    public int HapticFeedback = 20;           // How should the system vibrate when a button is clicked
    public int ActivityBeginning = 1000;          // How the system vibrates when an activity begins
    public int ActivityReminder = 1000;          // How the system vibrates when an activity reminds the person to continue survey

    // Settings for Pain EMA | Time is in ms |
    public int PainEMAReminderDelay = 0;        // How long to give the user before starting the timer to remind user to complete the ema
    public int PainEMAReminderInterval = 5 * 60 * 1000;         // How long to wait between each ping reminding user to complete ema
    public int PainEMAReminderNumber = 2;       // How many times to remind the wearer to complete ema

    // Settings for Follow-up EMA | Time is in ms |
    public int FollowUpEMATimer = 30 * 60 * 1000;       // How long to wait after PainEMA submitted to prompt follow-up ema
    public int FollowupEMAReminderDelay = 0;        // How long to give the user before starting the timer to remind user to complete the ema
    public int FollowUpEMAReminderNumber = 3;       // How many times to remind the wearer to complete the follow-up ema
    public int FollowUpEMAReminderInterval = 5 * 60 * 1000;         // How long to wait between each ping reminding user to complete ema

    // Settings for Daily EMA | Time is in ms unless specified otherwise |
    public long EoDPrompt_TimeOut = 15 * 60 * 1000;         // Delay before snoozing and eventually dismissing daily ema
    public long EoDEMA_Timer_Delay = 10 * 60 * 1000;        // This is how often the timer waits before firing again
    public long EoDEMA_Period = 24 * 60 * 60 * 1000;      // This is how often the timer waits before firing again
    public int EoDEMAReminderDelay = 0;         // How long to give the user before starting the timer to remind user to complete the ema
    public int EoDEMAReminderInterval = 5 * 60 * 1000;      // How long to wait between each ping reminding user to complete ema
    public int EoDEMAReminderNumber = 2;        // How many times to remind the wearer to complete ema
    /* The times should be exactly on the time you want it to come on */
    public int EoDEMA_Time_Hour = 21;       // Hour at which the automatic daily ema should start
    public int EoDEMA_Time_Minute = 00;      // Minute of hour at which the automatic daily ema should start
    public int EoDEMA_Time_Second = 00;      // Second of minute at which the automatic daily ema should start
    /* The start time should always be on the exact time that you want them to start */
    public int EoDEMA_ManualStart_Hour = 17;       // Hour at which the automatic daily ema should start
    public int EoDEMA_ManualStart_Minute = 00;      // Minute of hour at which the automatic daily ema should start
    public int EoDEMA_ManualStart_Second = 00;      // Second of minute at which the automatic daily ema should start
    /* The end time should always be one second off from desired mark. */
    public int EoDEMA_ManualEnd_Hour = 20;       // Hour at which the automatic daily ema should stop
    public int EoDEMA_ManualEnd_Minute = 59;      // Minute of hour at which the automatic daily ema should stop
    public int EoDEMA_ManualEnd_Second = 59;      // Second of minute at which the automatic daily ema should stop

    // Settings for Heart Rate Monitoring | Time is in ms |
    public long HRSampleDuration = 30 * 1000;           // How long should heart rate be measured each time?
    public long HRMeasurementInterval = 5 * 60 * 1000;          // Every how often should a measurement be taken?

    // Settings for Estimote | Time is in ms |
    public long ESSampleDuration = 15 * 1000;           // How long should estimote be measured each time?
    public long ESMeasurementInterval = 15 * 60 * 100;          // Every how often should a measurement be taken?
    public int MaxActivityCycleCount = 5;       // How many cycles of estimote service running with no step activity before estimote doesn't run.

    // Settings for the Accelerometer Sensor
    public int AccelDataCount = 400;     // How many data do you want to check for.

    // Settings for Low Battery | Time in ms |
    public int LowBatPercent = 15;      // Battery percentage at which to trigger low battery warning.
    public int LowBatBuzzDuration = 0;       // How long to vibrate for to alert user that battery is low.
    public int LowBatteryAlert = 10 * 60;        // This is how often the low battery screen should be called if enabled. (TIME IS IN SECONDS!!)
    /* The start time should always be on the exact time that you want them to start */
    public int LowBattery_ManualStart_Hour = 00;       // Hour at which the automatic LowBattery should stop
    public int LowBattery_ManualStart_Minute = 00;      // Minute of hour at which the automatic LowBattery should stop
    public int LowBattery_ManualStart_Second = 00;      // Second of minute at which the automatic LowBattery should stop
    /* The end time should always be one second off from desired mark. */
    public int LowBattery_ManualEnd_Hour = 07;       // Hour at which the automatic LowBattery should start
    public int LowBattery_ManualEnd_Minute = 59;      // Minute of hour at which the automatic LowBattery should start
    public int LowBattery_ManualEnd_Second = 59;      // Second of minute at which the automatic LowBattery should start

    /* Settings for Changing Individual File Name <----------------------------------------- This is where you change the file names, it updates everywhere */
    public String Accelerometer = "Accelerometer_Data";     // This is the Accelerometer File (DO NOT ADD .CSV here as the accelerometer data are saved differently)
    public String Battery = "Battery_Activity.csv";        // This is the Battery Information File
    public String Estimote = "Estimote_Data.csv";      // This is the Estimote File
    public String Pedometer = "Pedometer_Data.csv";        // This is the Pedometer File
    public String Pain_Activity = "Pain_EMA_Activity.csv";     // This is the Pain EMA Activity File
    public String Pain_Results = "Pain_EMA_Results.csv";       // This is the Pain EMA Response File
    public String Followup_Activity = "Followup_EMA_Activity.csv";     // This is the Followup EMA Activity File
    public String Followup_Results = "Followup_EMA_Results.csv";     // This is the Folloup EMA Response File
    public String EndOfDay_Activity = "EndOfDay_EMA_Activity.csv";       // This is the system file for the End of Day Activity
    public String EndOfDay_Results = "EndOfDay_EMA_Results.csv";        // This is the system file for the End of Day Results
    public String Sensors = "Sensor_Activity.csv";     // This is the Sensor Activity File
    public String Steps = "Step_Activity";     // This is the Step Activity File
    public String EODEMA_Date = "EODEMA_DailyActivity";      // This is the Daily EMA time logger file
    public String System = "System_Activity.csv";      // This is the System Activity File
    public String Heart_Rate = "Heart_Rate_Data.csv";           // This is the system file for the Heart Rate Sensor

    /* Settings for Changing the Subdirectories in the Main Directory */
    public String Subdirectory_Accelerometer = "Accelerometer";        // This is where the accelerometer data is kept
    public String Subdirectory_HeartRate = "Heart_Rate";        // This is where the Heartrate data is kept
    public String Subdirectory_Estimote = "Estimote";      // This is where the estimote is kept
    public String Subdirectory_EMAActivities = "EMA_Activities";        // This is where the EMA activity data are kept
    public String Subdirectory_EMAResults = "EMA_Results";          // This is where the EMA responses data are kept
    public String Subdirectory_DeviceActivities = "Device_Updater";     // This is where the device data that is used to update something in the app is kept
    public String Subdirectory_DeviceLogs = "Device_Activity";        // This is where all the system logs and data are kept.

    /* Headers to individual files that are being logged to <--------------------------------------------- This is the order that the headers will appear in */
    public String EndOfDay_EMA_Activity_Headers = "Date --- Time, EMA Type, Question Number, Answer Picked";       // Column Headers for EndOfDay_EMA_Activity
    public String EndOfDay_EMA_Results_Headers = "Date --- Time, Question 1 Answer, Question 2 Answer, Question 3 Answer, Question 4 Answer, Question 5 Answer, Question 6 Answer, Question 7 Answer, Question 8" +
                                                 "Answer, Question 9 Answer, Question 10 Answer, Question 11 Answer, Question 12 Answer, EMA Duration (Hours:Minutes:Seconds)";  // Column Headers for EndOfDay_EMA_Results
    public String Pain_EMA_Activity_Headers = "Date --- Time, EMA Type, Question Number, Answer Picked";       // Column Headers for Pain_EMA_Activity
    public String Pain_EMA_Results_Headers = "Date --- Time, Question 1 Answer, Question 2 Answer, Question 3 Answer, Question 4 Answer, Question 5 Answer, " +
                                             "Question 6 Answer, Question 7 Answer, EMA Duration (Hours:Minutes:Seconds)";       // Column Headers for Pain_EMA_Results
    public String Followup_EMA_Activity_Headers = "Date --- Time, EMA Type, Question Number, Answer Picked";       // Column Headers for Followup_EMA_Activity
    public String Followup_EMA_Results_Headers = "Date --- Time, Question 1 Answer, Question 2 Answer, Question 3 Answer, Question 4 Answer, Question 5 Answer, " +
                                                 "Question 6 Answer, Question 7 Answer, EMA Duration (Hours:Minutes:Seconds)";        // Column Headers for Followup_EMA_Results
    public String Heart_Rate_Data_Headers = "Date --- Time, Heart Rate Value, Confidence Level";         // Column Headers for Heart_Rate_Data
    public String Accelerometer_Data_Headers = "Date --- Time, X-Value, Y-Value, Z-Value";      // Column Headers for Accelerometer_Data
    public String Pedometer_Data_Headers = "Date --- Time, Number of Steps, Confidence Level";      // Column Headers for Pedometer_Data
    public String Estimote_Data_Headers = "Estimote ID, RSSI, Calculated Distance, Date --- Time";       // Column Headers for Estimote_Data
    public String Battery_Data_Headers = "Date --- Time, Charging State, Battery Level";       // Column Headers for the Battery.
    public String Sensor_Data_Headers = "Screen, Action, Date --- Time";       // Column Headers for the Sensor Logs.
    public String System_Data_Headers = "Screen, Action, Date --- Time";       // Column Headers for the System Logs.
    public String Step_Data_Headers = "yes";        // Column Headers for Steps.
    public String EODEMA_Date_Headers = "Date";     // Column Header for the EODEMA daily.
}
