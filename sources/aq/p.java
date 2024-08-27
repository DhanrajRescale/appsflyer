package aq;

import android.content.SharedPreferences;
import com.google.android.gms.internal.p002firebaseauthapi.zzam;
import com.google.android.gms.tasks.Task;
import in.juspay.hypersdk.core.PaymentConstants;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    public static final zzam f2748d = zzam.zzj("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", PaymentConstants.TIMESTAMP);

    /* renamed from: e, reason: collision with root package name */
    public static final p f2749e;

    /* renamed from: a, reason: collision with root package name */
    public Task f2750a;

    /* renamed from: b, reason: collision with root package name */
    public Task f2751b;

    /* renamed from: c, reason: collision with root package name */
    public long f2752c;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, aq.p] */
    static {
        ?? obj = new Object();
        obj.f2752c = 0L;
        f2749e = obj;
    }

    public static final void a(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        zzam zzamVar = f2748d;
        int size = zzamVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            edit.remove((String) zzamVar.get(i10));
        }
        edit.commit();
    }
}
