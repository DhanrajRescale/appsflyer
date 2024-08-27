package q;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.firebase.messaging.t;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f31443a;

    /* renamed from: b, reason: collision with root package name */
    public final t f31444b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f31445c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f31446d;

    public e() {
        this.f31443a = new Intent("android.intent.action.VIEW");
        this.f31444b = new t(1);
        this.f31446d = true;
    }

    public final f a() {
        Bundle bundle;
        Intent intent = this.f31443a;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle2 = new Bundle();
            y3.e.b(bundle2, "android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle2);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f31446d);
        t tVar = this.f31444b;
        Integer num = (Integer) tVar.f11782b;
        Integer num2 = (Integer) tVar.f11783c;
        Integer num3 = (Integer) tVar.f11784d;
        Integer num4 = (Integer) tVar.f11785e;
        Bundle bundle3 = new Bundle();
        if (num != null) {
            bundle3.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        if (num2 != null) {
            bundle3.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        if (num3 != null) {
            bundle3.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        if (num4 != null) {
            bundle3.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        intent.putExtras(bundle3);
        Bundle bundle4 = this.f31445c;
        if (bundle4 != null) {
            intent.putExtras(bundle4);
        }
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        String a10 = d.a();
        if (!TextUtils.isEmpty(a10)) {
            if (intent.hasExtra("com.android.browser.headers")) {
                bundle = intent.getBundleExtra("com.android.browser.headers");
            } else {
                bundle = new Bundle();
            }
            if (!bundle.containsKey("Accept-Language")) {
                bundle.putString("Accept-Language", a10);
                intent.putExtra("com.android.browser.headers", bundle);
            }
        }
        return new f(intent);
    }

    public e(h hVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.f31443a = intent;
        this.f31444b = new t(1);
        this.f31446d = true;
        if (hVar != null) {
            intent.setPackage(((ComponentName) hVar.f31453e).getPackageName());
            IBinder asBinder = ((a.b) hVar.f31452d).asBinder();
            PendingIntent pendingIntent = (PendingIntent) hVar.f31454f;
            Bundle bundle = new Bundle();
            y3.e.b(bundle, "android.support.customtabs.extra.SESSION", asBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            intent.putExtras(bundle);
        }
    }
}
