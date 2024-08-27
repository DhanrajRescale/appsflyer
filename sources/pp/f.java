package pp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class f extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f31267b = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final Context f31268a;

    public f(Context context) {
        this.f31268a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (g.f31269j) {
            try {
                Iterator it = ((t.e) g.f31270k.values()).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f31268a.unregisterReceiver(this);
    }
}
