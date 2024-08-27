package aq;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.auth.FirebaseAuth;
import h.r0;
import in.juspay.hypersdk.core.PaymentConstants;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name */
    public static final v f2758c = new v();

    /* renamed from: a, reason: collision with root package name */
    public final p f2759a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f2760b;

    public v() {
        p pVar = p.f2749e;
        if (r0.f17734c == null) {
            r0.f17734c = new r0(8);
        }
        r0 r0Var = r0.f17734c;
        this.f2759a = pVar;
        this.f2760b = r0Var;
    }

    public static void b(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.getStatusCode());
        edit.putString("statusMessage", status.getStatusMessage());
        edit.putLong(PaymentConstants.TIMESTAMP, DefaultClock.getInstance().currentTimeMillis());
        edit.commit();
    }

    public static void c(Context context, FirebaseAuth firebaseAuth) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(firebaseAuth);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        pp.g gVar = firebaseAuth.f11627a;
        gVar.a();
        edit.putString("firebaseAppName", gVar.f31272b);
        edit.commit();
    }

    public final void a(Context context) {
        p pVar = this.f2759a;
        pVar.getClass();
        Preconditions.checkNotNull(context);
        p.a(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        pVar.f2750a = null;
        pVar.f2752c = 0L;
    }
}
