package learncodeonline.in.facedetection;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class ResultDialog extends DialogFragment {

    private Button okBUtton;
    private TextView resultTV;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_resultdialog, container, false);
        String resultText = "";
        okBUtton = view.findViewById(R.id.result_ok_button);
        resultTV = view.findViewById(R.id.result_text_view);
//// so here we get bundle(lot ) of information from  string    so we use bundle
        Bundle bundle = getArguments();
        resultText = bundle.getString(LCOFaceDetection.RESULT_TEXT);

        resultTV.setText(resultText);

        okBUtton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });



        return view;
    }
}
//in this page
//here we inflating layout based on the custom layout
//we grabbing some of the information
//bundle is collecting the information from the firebase and we are setting up in text view
//ok button is use to dismiss the inflate