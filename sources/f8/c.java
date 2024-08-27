package f8;

import android.content.Context;
import androidx.work.u;
import h8.f;
import h8.h;
import java.util.ArrayList;
import java.util.Collection;

/* loaded from: classes.dex */
public final class c implements g8.b {

    /* renamed from: d, reason: collision with root package name */
    public static final String f15983d = u.C("WorkConstraintsTracker");

    /* renamed from: a, reason: collision with root package name */
    public final b f15984a;

    /* renamed from: b, reason: collision with root package name */
    public final g8.c[] f15985b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f15986c;

    public c(Context context, m8.a aVar, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f15984a = bVar;
        this.f15985b = new g8.c[]{new g8.a(applicationContext, aVar, 0), new g8.a(applicationContext, aVar, 1), new g8.a(applicationContext, aVar, 4), new g8.a(applicationContext, aVar, 2), new g8.a(applicationContext, aVar, 3), new g8.c((f) h.h(applicationContext, aVar).f18058d), new g8.c((f) h.h(applicationContext, aVar).f18058d)};
        this.f15986c = new Object();
    }

    public final boolean a(String str) {
        synchronized (this.f15986c) {
            try {
                for (g8.c cVar : this.f15985b) {
                    Object obj = cVar.f17169b;
                    if (obj != null && cVar.b(obj) && cVar.f17168a.contains(str)) {
                        u.w().u(f15983d, String.format("Work %s constrained by %s", str, cVar.getClass().getSimpleName()), new Throwable[0]);
                        return false;
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(Collection collection) {
        synchronized (this.f15986c) {
            try {
                for (g8.c cVar : this.f15985b) {
                    if (cVar.f17171d != null) {
                        cVar.f17171d = null;
                        cVar.d(null, cVar.f17169b);
                    }
                }
                for (g8.c cVar2 : this.f15985b) {
                    cVar2.c(collection);
                }
                for (g8.c cVar3 : this.f15985b) {
                    if (cVar3.f17171d != this) {
                        cVar3.f17171d = this;
                        cVar3.d(this, cVar3.f17169b);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() {
        synchronized (this.f15986c) {
            try {
                for (g8.c cVar : this.f15985b) {
                    ArrayList arrayList = cVar.f17168a;
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        cVar.f17170c.b(cVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
