package com.firebase.ui.auth.viewmodel;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class ViewModelBase<T> extends AndroidViewModel {

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f10960c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10961d;

    public ViewModelBase(Application application) {
        super(application);
        this.f10960c = new AtomicBoolean();
    }

    @Override // androidx.lifecycle.a1
    public void d() {
        this.f10960c.set(false);
    }

    public final void f(Object obj) {
        if (this.f10960c.compareAndSet(false, true)) {
            this.f10961d = obj;
            g();
        }
    }

    public void g() {
    }
}
