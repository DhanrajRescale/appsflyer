package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class g extends e.h {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m f852i;

    public g(m mVar) {
        this.f852i = mVar;
    }

    @Override // e.h
    public final void b(int i10, f.a aVar, Object obj) {
        Bundle bundle;
        m mVar = this.f852i;
        t9.c b10 = aVar.b(mVar, obj);
        if (b10 != null) {
            new Handler(Looper.getMainLooper()).post(new b.d(this, i10, b10, 1));
            return;
        }
        Intent a10 = aVar.a(mVar, obj);
        if (a10.getExtras() != null && a10.getExtras().getClassLoader() == null) {
            a10.setExtrasClassLoader(mVar.getClassLoader());
        }
        if (a10.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = a10.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a10.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a10.getAction())) {
            String[] stringArrayExtra = a10.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            q3.h.a(mVar, stringArrayExtra, i10);
            return;
        }
        if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a10.getAction())) {
            e.k kVar = (e.k) a10.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                IntentSender intentSender = kVar.f14636a;
                Intent intent = kVar.f14637b;
                int i11 = kVar.f14638c;
                int i12 = kVar.f14639d;
                int i13 = q3.h.f31615a;
                q3.a.c(mVar, intentSender, i10, intent, i11, i12, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e10) {
                new Handler(Looper.getMainLooper()).post(new b.d(this, i10, e10, 2));
                return;
            }
        }
        int i14 = q3.h.f31615a;
        q3.a.b(mVar, a10, i10, bundle);
    }
}
