package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import ek.h0;

/* loaded from: classes2.dex */
public final class e0 extends Binder {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f11741b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final h0 f11742a;

    public e0(h0 h0Var) {
        this.f11742a = h0Var;
    }

    public final void a(f0 f0Var) {
        Task b10;
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            b10 = ((g) this.f11742a.f15593b).b(f0Var.f11744a);
            b10.addOnCompleteListener(new n.a(10), new b3.t(f0Var, 6));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
