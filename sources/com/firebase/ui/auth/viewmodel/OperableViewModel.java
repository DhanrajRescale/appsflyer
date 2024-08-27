package com.firebase.ui.auth.viewmodel;

import android.app.Application;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;

/* loaded from: classes.dex */
public abstract class OperableViewModel<I, O> extends ViewModelBase<I> {

    /* renamed from: e, reason: collision with root package name */
    public final e0 f10959e;

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.LiveData, androidx.lifecycle.e0] */
    public OperableViewModel(Application application) {
        super(application);
        this.f10959e = new LiveData();
    }

    public final void h(Object obj) {
        this.f10959e.setValue(obj);
    }
}
