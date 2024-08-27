package com.firebase.ui.auth.viewmodel;

import am.d;
import android.app.Application;
import android.content.Intent;
import cm.c;
import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
public abstract class ProviderSignInBase<T> extends OperableViewModel<T, d> {
    public ProviderSignInBase(Application application) {
        super(application);
    }

    public abstract void i(int i10, int i11, Intent intent);

    public abstract void j(FirebaseAuth firebaseAuth, c cVar, String str);
}
