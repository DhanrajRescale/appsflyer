package n5;

import android.net.Uri;
import b5.c0;
import b5.k0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import lp.y1;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f28306a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public c0 f28307b;

    /* renamed from: c, reason: collision with root package name */
    public g f28308c;

    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, kq.e] */
    public static g a(c0 c0Var) {
        String uri;
        byte[] bArr;
        g5.l lVar = new g5.l();
        lVar.f16593b = null;
        Uri uri2 = c0Var.f3236b;
        if (uri2 == null) {
            uri = null;
        } else {
            uri = uri2.toString();
        }
        b0 b0Var = new b0(uri, c0Var.f3240f, lVar);
        y1 it = c0Var.f3237c.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            str.getClass();
            str2.getClass();
            synchronized (((Map) b0Var.f28250e)) {
                ((Map) b0Var.f28250e).put(str, str2);
            }
        }
        HashMap hashMap = new HashMap();
        UUID uuid = b5.l.f3399a;
        ?? obj = new Object();
        UUID uuid2 = c0Var.f3235a;
        com.google.firebase.messaging.m mVar = a0.f28238d;
        uuid2.getClass();
        boolean z10 = c0Var.f3238d;
        boolean z11 = c0Var.f3239e;
        int[] c02 = kp.j.c0(c0Var.f3241g);
        for (int i10 : c02) {
            boolean z12 = true;
            if (i10 != 2 && i10 != 1) {
                z12 = false;
            }
            yk.j.E0(z12);
        }
        g gVar = new g(uuid2, mVar, b0Var, hashMap, z10, (int[]) c02.clone(), z11, obj, 300000L);
        byte[] bArr2 = c0Var.f3242h;
        if (bArr2 != null) {
            bArr = Arrays.copyOf(bArr2, bArr2.length);
        } else {
            bArr = null;
        }
        yk.j.H0(gVar.f28293m.isEmpty());
        gVar.f28302v = 0;
        gVar.f28303w = bArr;
        return gVar;
    }

    public final p b(k0 k0Var) {
        g gVar;
        k0Var.f3390b.getClass();
        c0 c0Var = k0Var.f3390b.f3291c;
        if (c0Var != null && e5.x.f15050a >= 18) {
            synchronized (this.f28306a) {
                try {
                    if (!e5.x.a(c0Var, this.f28307b)) {
                        this.f28307b = c0Var;
                        this.f28308c = a(c0Var);
                    }
                    gVar = this.f28308c;
                    gVar.getClass();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return gVar;
        }
        return p.f28317a;
    }
}
