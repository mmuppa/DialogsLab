package edu.uw.tacoma.mmuppa.dialogslab;


import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.DialogInterface;
import android.os.Bundle;

/**
 * A simple {@link Fragment} subclass.
 */
public class FireMissilesDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.fire_missiles_title)
                .setMessage(R.string.dialog_fire_missiles)

                .setPositiveButton(R.string.fire, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int id) {

                        dismiss();

                    }

                })

                .setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int id) {

                        // User cancelled the dialog

                    }

                });

        // Create the AlertDialog object and return it

        return builder.create();

    }

    public FireMissilesDialogFragment() {
        // Required empty public constructor
    }


}
