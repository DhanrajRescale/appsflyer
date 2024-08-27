package com.webengage.sdk.android;

import android.content.Context;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class a extends h {

    /* renamed from: com.webengage.sdk.android.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class RunnableC0002a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        Map<String, Object> f12231a;

        public RunnableC0002a(Map<String, Object> map) {
            this.f12231a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a aVar = a.this;
                aVar.e(aVar.d(aVar.d(this.f12231a)));
            } catch (Exception e10) {
                Logger.e("WebEngage", e10.getMessage());
            }
        }
    }

    public a(Context context) {
        super(context);
    }

    public i a(Context context) {
        return i.a(context.getApplicationContext());
    }

    public void b(Object obj) {
        WebEngage.startService(q.a(j0.f12603g, obj, this.f12552b), this.f12552b);
    }

    public void c(Object obj) {
        WebEngage.startService(q.a(j0.f12606j, new g0(g(), obj), this.f12552b), this.f12552b);
    }

    public abstract Object d(Object obj);

    public abstract Object d(Map<String, Object> map);

    public abstract void e(Object obj);

    public void a(Object obj) {
        WebEngage.startService(q.a(j0.f12598b, obj, this.f12552b), this.f12552b);
    }

    public void b(Map<String, Object> map) {
        com.webengage.sdk.android.utils.a.a(new RunnableC0002a(map));
    }

    public void c(Map<String, Object> map) {
        e(d(d(map)));
    }
}
