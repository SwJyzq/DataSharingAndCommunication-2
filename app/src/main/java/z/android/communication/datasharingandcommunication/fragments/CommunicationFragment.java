package z.android.communication.datasharingandcommunication.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import z.android.communication.datasharingandcommunication.R;
import z.android.communication.datasharingandcommunication.transport.TranObject;

public class CommunicationFragment extends MyFragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.commnication,container,false);
    }

    @Override
    public void getMessage(TranObject msg) {

    }
}
