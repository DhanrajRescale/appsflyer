package el;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.facebook.FacebookSdk;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder service) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(service, "service");
        AtomicBoolean atomicBoolean = c.f15640a;
        h hVar = h.f15676a;
        Context context = FacebookSdk.getApplicationContext();
        Object obj = null;
        if (!sl.a.b(h.class)) {
            try {
                Intrinsics.checkNotNullParameter(context, "context");
                obj = h.f15676a.h(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{service});
            } catch (Throwable th2) {
                sl.a.a(h.class, th2);
            }
        }
        c.f15646g = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
    }
}
