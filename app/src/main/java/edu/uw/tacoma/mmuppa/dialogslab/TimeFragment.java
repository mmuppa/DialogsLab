package edu.uw.tacoma.mmuppa.dialogslab;


import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 */
public class TimeFragment extends DialogFragment
        implements TimePickerDialog.OnTimeSetListener {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        TimePickerDialog timePickerDialog = new TimePickerDialog(
                getActivity(), this, hour, minute,
                DateFormat.is24HourFormat(getActivity())
        );
        return timePickerDialog;

    }


    @Override
    public void onTimeSet(TimePicker timePicker, int hour, int min) {
        Toast.makeText(getActivity(), hour + ":" + min, Toast.LENGTH_SHORT)
                .show();
    }
}
