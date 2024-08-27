package com.firebase.ui.auth.viewmodel;

import android.app.Application;
import aq.d0;
import com.firebase.ui.auth.FirebaseAuthAnonymousUpgradeException;
import zl.d;
import zp.e;

/* loaded from: classes.dex */
public abstract class SignInViewModelBase extends AuthViewModelBase<d> {
    public SignInViewModelBase(Application application) {
        super(application);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [q0.g0, java.lang.Object] */
    public final void i(zp.d dVar) {
        ?? obj = new Object();
        obj.f31493c = dVar;
        h(am.d.a(new FirebaseAuthAnonymousUpgradeException(obj.a())));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [q0.g0, java.lang.Object] */
    public final void j(d dVar, e eVar) {
        if (dVar.f()) {
            ?? obj = new Object();
            obj.f31492b = dVar.f42563a;
            obj.f31494d = dVar.f42565c;
            obj.f31495e = dVar.f42566d;
            obj.f31491a = dVar.f42567e;
            obj.f31493c = dVar.f42564b;
            obj.f31491a = ((d0) eVar).f2699b.f2692c;
            h(am.d.c(obj.a()));
            return;
        }
        throw new IllegalStateException("Cannot mutate an unsuccessful response.");
    }
}
