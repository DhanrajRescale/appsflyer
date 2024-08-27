package com.firebase.ui.auth.ui.phone;

import android.app.Application;
import androidx.fragment.app.j0;
import com.firebase.ui.auth.viewmodel.AuthViewModelBase;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.FirebaseAuth;
import gm.c;
import gm.d;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import zp.p;
import zp.q;

/* loaded from: classes.dex */
public class PhoneNumberVerificationHandler extends AuthViewModelBase<d> {

    /* renamed from: h, reason: collision with root package name */
    public String f10953h;

    /* renamed from: i, reason: collision with root package name */
    public q f10954i;

    public PhoneNumberVerificationHandler(Application application) {
        super(application);
    }

    public final void i(j0 j0Var, String str, boolean z10) {
        q qVar;
        h(am.d.b());
        FirebaseAuth firebaseAuth = (FirebaseAuth) Preconditions.checkNotNull(this.f10958g);
        Long l10 = 120L;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Long valueOf = Long.valueOf(timeUnit.convert(l10.longValue(), timeUnit));
        c cVar = new c(this, str);
        if (z10) {
            qVar = this.f10954i;
        } else {
            qVar = null;
        }
        q qVar2 = qVar;
        Preconditions.checkNotNull(firebaseAuth, "FirebaseAuth instance cannot be null");
        Preconditions.checkNotNull(valueOf, "You must specify an auto-retrieval timeout; please call #setTimeout()");
        Preconditions.checkNotNull(cVar, "You must specify callbacks on your PhoneAuthOptions. Please call #setCallbacks()");
        Executor executor = firebaseAuth.f11650x;
        if (valueOf.longValue() >= 0 && valueOf.longValue() <= 120) {
            Preconditions.checkNotEmpty(str, "The given phoneNumber is empty. Please set a non-empty phone number with #setPhoneNumber()");
            Preconditions.checkArgument(true, "You cannot require sms validation without setting a multi-factor session.");
            Preconditions.checkArgument(true, "A phoneMultiFactorInfo must be set for second factor sign-in.");
            p pVar = new p(firebaseAuth, valueOf, cVar, executor, str, j0Var, qVar2);
            Preconditions.checkNotNull(pVar);
            FirebaseAuth.i(pVar);
            return;
        }
        throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
    }
}
