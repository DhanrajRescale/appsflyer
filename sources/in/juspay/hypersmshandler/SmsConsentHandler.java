package in.juspay.hypersmshandler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public abstract class SmsConsentHandler extends BroadcastReceiver {

    /* renamed from: e */
    public static final ExecutorService f20392e = Executors.newSingleThreadExecutor();

    /* renamed from: a */
    public Intent f20393a;

    /* renamed from: b */
    @NonNull
    public final SmsComponents f20394b;

    /* renamed from: c */
    @NonNull
    public final Context f20395c;

    /* renamed from: d */
    public Runnable f20396d;

    public SmsConsentHandler(@NonNull SmsComponents smsComponents) {
        this.f20394b = smsComponents;
        this.f20395c = smsComponents.getContext();
        f20392e.execute(new b(this, 0));
    }

    public abstract void c();

    public final void d() {
        Tracker tracker = this.f20394b.getTracker();
        Task<Void> startSmsUserConsent = com.google.android.gms.auth.api.phone.SmsRetriever.getClient(this.f20395c).startSmsUserConsent(null);
        startSmsUserConsent.addOnSuccessListener(new a(tracker, 0));
        startSmsUserConsent.addOnFailureListener(new a(tracker, 1));
    }

    public final void e() {
        f20392e.execute(new b(this, 1));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (com.google.android.gms.auth.api.phone.SmsRetriever.SMS_RETRIEVED_ACTION.equals(intent.getAction()) && (extras = intent.getExtras()) != null) {
            Status status = (Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
            int statusCode = status != null ? status.getStatusCode() : 16;
            if (statusCode != 0) {
                if (statusCode != 15) {
                    return;
                }
                c();
            } else {
                this.f20393a = (Intent) extras.getParcelable(com.google.android.gms.auth.api.phone.SmsRetriever.EXTRA_CONSENT_INTENT);
                Runnable runnable = this.f20396d;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    public /* synthetic */ void a() {
        d();
        IntentFilter intentFilter = new IntentFilter(com.google.android.gms.auth.api.phone.SmsRetriever.SMS_RETRIEVED_ACTION);
        if (Build.VERSION.SDK_INT >= 33) {
            this.f20395c.registerReceiver(this, intentFilter, 2);
        } else {
            this.f20395c.registerReceiver(this, intentFilter);
        }
    }

    public /* synthetic */ void b() {
        try {
            this.f20395c.unregisterReceiver(this);
        } catch (Exception unused) {
        }
    }
}
