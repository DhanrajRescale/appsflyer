package h8;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.u;
import h.a0;

/* loaded from: classes.dex */
public abstract class c extends d {

    /* renamed from: h, reason: collision with root package name */
    public static final String f18040h = u.C("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g, reason: collision with root package name */
    public final a0 f18041g;

    public c(Context context, m8.a aVar) {
        super(context, aVar);
        this.f18041g = new a0(this, 4);
    }

    @Override // h8.d
    public final void d() {
        u.w().u(f18040h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f18044b.registerReceiver(this.f18041g, f());
    }

    @Override // h8.d
    public final void e() {
        u.w().u(f18040h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f18044b.unregisterReceiver(this.f18041g);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
