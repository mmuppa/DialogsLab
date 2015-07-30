package edu.uw.tacoma.mmuppa.dialogslab;


import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListDialogFragment extends DialogFragment {


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.pick_a_color)
                .setItems(R.array.colors,  new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // The 'which' argument contains the index position
                        // of the selected item
                        Resources res = getActivity().getResources();
                        String[] colors = res.getStringArray(R.array.colors);
                        Toast.makeText(getActivity(), "You chose " + colors[which], Toast.LENGTH_LONG)
                                .show();
                    }
                });
        return builder.create();

    }
}
