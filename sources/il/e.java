package il;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final CountDownLatch f20104a = new CountDownLatch(1);

    /* renamed from: b, reason: collision with root package name */
    public IBinder f20105b;

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f20104a.countDown();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder serviceBinder) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceBinder, "serviceBinder");
        this.f20105b = serviceBinder;
        this.f20104a.countDown();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
    }
}
