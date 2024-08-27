package nl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class d extends BroadcastReceiver {

    /* renamed from: b */
    public static d f28845b;

    /* renamed from: a */
    public final Context f28846a;

    public d(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
        this.f28846a = applicationContext;
    }

    public static final /* synthetic */ d a() {
        if (sl.a.b(d.class)) {
            return null;
        }
        try {
            return f28845b;
        } catch (Throwable th2) {
            sl.a.a(d.class, th2);
            return null;
        }
    }

    public final void finalize() {
        if (sl.a.b(this)) {
            return;
        }
        try {
            if (!sl.a.b(this)) {
                try {
                    a5.b a10 = a5.b.a(this.f28846a);
                    Intrinsics.checkNotNullExpressionValue(a10, "getInstance(applicationContext)");
                    a10.d(this);
                } catch (Throwable th2) {
                    sl.a.a(this, th2);
                }
            }
        } catch (Throwable th3) {
            sl.a.a(this, th3);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        Bundle bundleExtra;
        if (sl.a.b(this)) {
            return;
        }
        try {
            Set<String> set = null;
            yk.m loggerImpl = new yk.m(context, (String) null);
            Intrinsics.checkNotNullParameter(loggerImpl, "loggerImpl");
            if (intent == null) {
                stringExtra = null;
            } else {
                stringExtra = intent.getStringExtra("event_name");
            }
            String i10 = Intrinsics.i(stringExtra, "bf_");
            if (intent == null) {
                bundleExtra = null;
            } else {
                bundleExtra = intent.getBundleExtra("event_args");
            }
            Bundle bundle = new Bundle();
            if (bundleExtra != null) {
                set = bundleExtra.keySet();
            }
            if (set != null) {
                for (String key : set) {
                    Intrinsics.checkNotNullExpressionValue(key, "key");
                    bundle.putString(new Regex("[ -]*$").replace(new Regex("^[ -]*").replace(new Regex("[^0-9a-zA-Z _-]").replace(key, "-"), HttpUrl.FRAGMENT_ENCODE_SET), HttpUrl.FRAGMENT_ENCODE_SET), (String) bundleExtra.get(key));
                }
            }
            if (FacebookSdk.getAutoLogAppEventsEnabled()) {
                loggerImpl.d(i10, bundle);
            }
        } catch (Throwable th2) {
            sl.a.a(this, th2);
        }
    }
}
