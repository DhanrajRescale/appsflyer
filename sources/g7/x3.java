package g7;

import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class x3 {

    /* renamed from: a, reason: collision with root package name */
    public final q0.g0 f17126a;

    /* JADX WARN: Type inference failed for: r0v0, types: [q0.g0, java.lang.Object] */
    public x3() {
        w3 callbackInvoker = w3.f17110b;
        Intrinsics.checkNotNullParameter(callbackInvoker, "callbackInvoker");
        ?? obj = new Object();
        obj.f31493c = callbackInvoker;
        obj.f31492b = null;
        obj.f31495e = new ReentrantLock();
        obj.f31494d = new ArrayList();
        this.f17126a = obj;
    }

    public abstract Object a(y3 y3Var);

    public final void b() {
        if (this.f17126a.e() && Log.isLoggable("Paging", 3)) {
            String message = "Invalidated PagingSource " + this;
            Intrinsics.checkNotNullParameter(message, "message");
            Log.d("Paging", message, null);
        }
    }

    public abstract Object c(s3 s3Var, yt.a aVar);
}
