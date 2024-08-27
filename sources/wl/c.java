package wl;

import android.content.ComponentName;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c extends q.g {

    /* renamed from: b, reason: collision with root package name */
    public static com.google.firebase.messaging.t f39158b;

    /* renamed from: c, reason: collision with root package name */
    public static q.h f39159c;

    /* renamed from: d, reason: collision with root package name */
    public static final ReentrantLock f39160d = new ReentrantLock();

    @Override // q.g
    public final void a(ComponentName name, com.google.firebase.messaging.t newClient) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(newClient, "newClient");
        newClient.y();
        f39158b = newClient;
        ll.e.o();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "componentName");
    }
}
