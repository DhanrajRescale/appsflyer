package q;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.firebase.messaging.t;

/* loaded from: classes.dex */
public abstract class g implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public Context f31448a;

    public abstract void a(ComponentName componentName, t tVar);

    /* JADX WARN: Type inference failed for: r1v3, types: [a.c, java.lang.Object] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        a.e eVar;
        if (this.f31448a != null) {
            int i10 = a.d.f5a;
            if (iBinder == null) {
                eVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
                if (queryLocalInterface != null && (queryLocalInterface instanceof a.e)) {
                    eVar = (a.e) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.f4a = iBinder;
                    eVar = obj;
                }
            }
            a(componentName, new t(this, eVar, componentName, this.f31448a));
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
}
