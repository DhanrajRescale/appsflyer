package com.webengage.sdk.android.utils.l;

import android.content.Context;
import com.webengage.sdk.android.utils.l.g;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f12952a;

    /* renamed from: b, reason: collision with root package name */
    private final e f12953b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, String> f12954c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f12955d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12956e;

    /* renamed from: f, reason: collision with root package name */
    private int f12957f;

    /* renamed from: g, reason: collision with root package name */
    private final int f12958g;

    /* renamed from: h, reason: collision with root package name */
    private Context f12959h;

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f12960a;

        /* renamed from: b, reason: collision with root package name */
        private final e f12961b;

        /* renamed from: f, reason: collision with root package name */
        private Context f12965f;

        /* renamed from: c, reason: collision with root package name */
        private Map<String, String> f12962c = null;

        /* renamed from: d, reason: collision with root package name */
        private Object f12963d = null;

        /* renamed from: e, reason: collision with root package name */
        private String f12964e = null;

        /* renamed from: g, reason: collision with root package name */
        private int f12966g = 0;

        /* renamed from: h, reason: collision with root package name */
        private int f12967h = 3;

        public b(String str, e eVar, Context context) {
            this.f12965f = null;
            this.f12960a = str;
            this.f12961b = eVar;
            this.f12965f = context.getApplicationContext();
        }

        public b a(int i10) {
            this.f12967h = i10;
            return this;
        }

        public b a(Object obj) {
            this.f12963d = obj;
            return this;
        }

        public b b(int i10) {
            this.f12966g = i10 | this.f12966g;
            return this;
        }

        public b a(String str) {
            this.f12964e = str;
            return this;
        }

        public b a(Map<String, String> map) {
            this.f12962c = map;
            return this;
        }

        public f a() {
            return new f(this);
        }
    }

    private f(b bVar) {
        this.f12952a = bVar.f12960a;
        this.f12953b = bVar.f12961b;
        this.f12954c = bVar.f12962c;
        this.f12955d = bVar.f12963d;
        this.f12956e = bVar.f12964e;
        this.f12957f = bVar.f12966g;
        this.f12958g = bVar.f12967h;
        this.f12959h = bVar.f12965f;
    }

    public g a() {
        boolean z10;
        List<c> list = com.webengage.sdk.android.utils.l.a.f12931a;
        synchronized (list) {
            try {
                Iterator<c> it = list.iterator();
                z10 = true;
                while (it.hasNext()) {
                    z10 &= it.next().a(this, this.f12959h);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        g a10 = z10 ? new d(this.f12959h, this).a() : null;
        return a10 == null ? new g.b().a() : a10;
    }

    public int b() {
        return this.f12958g;
    }

    public b c() {
        return new b(this.f12952a, this.f12953b, this.f12959h).a(this.f12956e).b(this.f12957f).a(this.f12958g).a(this.f12954c).a(this.f12955d);
    }

    public int d() {
        return this.f12957f;
    }

    public Map<String, String> e() {
        return this.f12954c;
    }

    public Object f() {
        return this.f12955d;
    }

    public e g() {
        return this.f12953b;
    }

    public String h() {
        return this.f12956e;
    }

    public String i() {
        return this.f12952a;
    }
}
