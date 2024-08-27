package fv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vt.g0;
import vt.p0;
import vt.y;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public f f16295a;

    /* renamed from: b, reason: collision with root package name */
    public i f16296b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f16297c;

    /* renamed from: d, reason: collision with root package name */
    public String f16298d;

    /* renamed from: e, reason: collision with root package name */
    public String f16299e;

    /* renamed from: f, reason: collision with root package name */
    public final e f16300f;

    /* renamed from: g, reason: collision with root package name */
    public final String f16301g;

    /* renamed from: h, reason: collision with root package name */
    public final Map f16302h;

    /* renamed from: i, reason: collision with root package name */
    public long f16303i;

    public g(e channel, String str, Map payload, long j10) {
        Intrinsics.e(channel, "channel");
        Intrinsics.e(payload, "payload");
        this.f16300f = channel;
        this.f16301g = str;
        this.f16302h = payload;
        this.f16303i = j10;
        this.f16297c = new HashMap();
    }

    public final void a(String str, Function1 function1) {
        ArrayList c10;
        String str2;
        f fVar = this.f16295a;
        if (fVar != null) {
            if (fVar != null) {
                str2 = fVar.e();
            } else {
                str2 = null;
            }
            if (Intrinsics.a(str2, str)) {
                function1.invoke(fVar);
            }
        }
        HashMap hashMap = this.f16297c;
        List list = (List) hashMap.get(str);
        if (list != null) {
            c10 = g0.J(function1, list);
        } else {
            c10 = y.c(function1);
        }
        hashMap.put(str, c10);
    }

    public final void b() {
        String str;
        f fVar = this.f16295a;
        if (fVar != null) {
            str = fVar.e();
        } else {
            str = null;
        }
        if (Intrinsics.a(str, "timeout")) {
            return;
        }
        c();
        e eVar = this.f16300f;
        eVar.f16289j.e(eVar.f16288i, this.f16301g, this.f16298d, eVar.f16285f.f16298d, this.f16302h);
    }

    public final void c() {
        int i10;
        i iVar = this.f16296b;
        if (iVar != null && !iVar.f16305a.isCancelled()) {
            i iVar2 = this.f16296b;
            if (iVar2 != null) {
                iVar2.f16305a.cancel(true);
            }
            this.f16296b = null;
        }
        e eVar = this.f16300f;
        m mVar = eVar.f16289j;
        int i11 = mVar.f16328m;
        if (i11 == Integer.MAX_VALUE) {
            i10 = 0;
        } else {
            i10 = 1 + i11;
        }
        mVar.f16328m = i10;
        String ref = String.valueOf(i10);
        Intrinsics.e(ref, "ref");
        String concat = "chan_reply_".concat(ref);
        this.f16298d = ref;
        this.f16299e = concat;
        eVar.d(concat, new qg.a(this, 28));
        this.f16296b = eVar.f16289j.f16323h.a(this.f16303i, TimeUnit.MILLISECONDS, new hj.b(this, 4));
    }

    public final void d(String str, HashMap hashMap) {
        String str2 = this.f16299e;
        if (str2 != null) {
            LinkedHashMap m10 = p0.m(hashMap);
            m10.put("status", str);
            e.i(this.f16300f, str2, m10, 12);
        }
    }

    public /* synthetic */ g(e eVar, long j10) {
        this(eVar, "phx_leave", p0.d(), j10);
    }
}
