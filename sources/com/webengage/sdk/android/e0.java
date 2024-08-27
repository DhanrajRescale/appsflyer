package com.webengage.sdk.android;

import android.content.Context;
import com.webengage.sdk.android.utils.WebEngageConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

/* loaded from: classes2.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    Context f12545a;

    /* renamed from: b, reason: collision with root package name */
    f f12546b;

    public e0(f fVar, Context context) {
        this.f12546b = fVar;
        this.f12545a = context.getApplicationContext();
    }

    public void a() {
        HashMap hashMap = new HashMap();
        hashMap.put("session_type", "background");
        try {
            h0.a(this.f12545a).a(j0.f12598b, l.b("visitor_new_session", hashMap, null, null, this.f12545a));
        } catch (Exception e10) {
            try {
                h0.a(this.f12545a).a(j0.f12603g, e10);
            } catch (Exception unused) {
            }
        }
    }

    public void b() {
        HashMap hashMap = new HashMap();
        hashMap.put("session_type", "online");
        try {
            h0.a(this.f12545a).a(j0.f12598b, l.b("visitor_new_session", hashMap, null, null, this.f12545a));
            i.a(this.f12545a).onNewSessionStarted();
        } catch (Exception e10) {
            try {
                h0.a(this.f12545a).a(j0.f12603g, e10);
            } catch (Exception unused) {
            }
        }
    }

    public void c() {
        try {
            h0.a(this.f12545a).a(j0.f12598b, l.b("visitor_session_close", null, null, null, this.f12545a));
        } catch (Exception e10) {
            try {
                h0.a(this.f12545a).a(j0.f12603g, e10);
            } catch (Exception unused) {
            }
        }
    }

    public void d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(WebEngageConstant.c.PAGE_RULE);
        try {
            h0.a(this.f12545a).a(j0.f12607k, arrayList);
        } catch (Exception e10) {
            try {
                h0.a(this.f12545a).a(j0.f12603g, e10);
            } catch (Exception unused) {
            }
        }
    }

    public void e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(WebEngageConstant.c.SESSION_RULE);
        arrayList.add(WebEngageConstant.c.PAGE_RULE);
        try {
            h0.a(this.f12545a).a(j0.f12607k, arrayList);
        } catch (Exception e10) {
            try {
                h0.a(this.f12545a).a(j0.f12603g, e10);
            } catch (Exception unused) {
            }
        }
    }

    public void f() {
        this.f12546b.l(new UUID(System.currentTimeMillis(), UUID.randomUUID().getLeastSignificantBits()).toString());
    }

    public void g() {
        WebEngage.startService(q.a(j0.f12598b, l.b("visitor_session_close", null, null, null, this.f12545a), this.f12545a), this.f12545a);
    }

    public void h() {
        HashMap hashMap = new HashMap();
        hashMap.put("session_type", "background");
        WebEngage.startService(q.a(j0.f12598b, l.b("visitor_new_session", hashMap, null, null, this.f12545a), this.f12545a), this.f12545a);
    }

    public void a(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put("time_spent", Long.valueOf(j10));
        try {
            h0.a(this.f12545a).a(j0.f12598b, l.b("user_increment", hashMap, null, null, this.f12545a));
        } catch (Exception e10) {
            try {
                h0.a(this.f12545a).a(j0.f12603g, e10);
            } catch (Exception unused) {
            }
        }
    }
}
