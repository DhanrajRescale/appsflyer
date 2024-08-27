package h8;

import android.content.Context;
import androidx.work.u;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import m.j;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: f, reason: collision with root package name */
    public static final String f18042f = u.C("ConstraintTracker");

    /* renamed from: a, reason: collision with root package name */
    public final m8.a f18043a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f18044b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f18045c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f18046d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public Object f18047e;

    public d(Context context, m8.a aVar) {
        this.f18044b = context.getApplicationContext();
        this.f18043a = aVar;
    }

    public abstract Object a();

    public final void b(g8.c cVar) {
        synchronized (this.f18045c) {
            try {
                if (this.f18046d.remove(cVar) && this.f18046d.isEmpty()) {
                    e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.f18045c) {
            try {
                Object obj2 = this.f18047e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.f18047e = obj;
                    ((h.c) this.f18043a).B().execute(new j(10, this, new ArrayList(this.f18046d)));
                }
            } finally {
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
