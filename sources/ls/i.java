package ls;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final HashMap f25223d = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final h f25224a = new h(this);

    /* renamed from: b, reason: collision with root package name */
    public final Context f25225b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f25226c;

    public i(Context context) {
        this.f25225b = context;
        this.f25226c = d0.a(context);
        new Thread(new gs.a(c(), 1)).start();
    }

    public static void a(i iVar, String str) {
        iVar.getClass();
        el.l.T0("MixpanelAPI.Messages", str + " (Thread " + Thread.currentThread().getId() + ")");
    }

    public static void b(i iVar, String str, Exception exc) {
        iVar.getClass();
        el.l.U0("MixpanelAPI.Messages", str + " (Thread " + Thread.currentThread().getId() + ")", exc);
    }

    public static ll.e c() {
        return new ll.e(24);
    }
}
