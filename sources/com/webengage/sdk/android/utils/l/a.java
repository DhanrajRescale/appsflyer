package com.webengage.sdk.android.utils.l;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final List<c> f12931a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    protected Context f12932b;

    /* renamed from: c, reason: collision with root package name */
    protected f f12933c;

    public a(Context context, f fVar) {
        this.f12932b = context.getApplicationContext();
        this.f12933c = fVar;
    }

    public g a() {
        try {
            switch (this.f12933c.b()) {
                case 1:
                    g c10 = c();
                    return c10.n() ? c10 : a(c10);
                case 2:
                    if (!f()) {
                        return c();
                    }
                    if (e()) {
                        return a((g) null);
                    }
                    g g10 = g();
                    if (!g10.n()) {
                        return a(g10);
                    }
                    b();
                    return g10;
                case 3:
                    return c();
                case 4:
                    return a((g) null);
                case 5:
                    if (!f()) {
                        return c();
                    }
                    if (e()) {
                        return a((g) null);
                    }
                    g g11 = g();
                    if (g11.n()) {
                        b();
                        return g11;
                    }
                    if (g11.e() == null && g11.f() == null) {
                        if (!g11.o()) {
                            return a(g11);
                        }
                        b();
                        return g11;
                    }
                    b();
                    return g11;
                case 6:
                    return f() ? a((g) null) : c();
                default:
                    return null;
            }
        } catch (Exception unused) {
            return null;
        }
    }

    public abstract g a(g gVar);

    public void b() {
        g d10 = d();
        if (d10 != null) {
            d10.a();
            d10.b();
        }
    }

    public abstract g c();

    public abstract g d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract g g();

    public static void a(c cVar) {
        List<c> list = f12931a;
        synchronized (list) {
            list.add(cVar);
        }
    }
}
