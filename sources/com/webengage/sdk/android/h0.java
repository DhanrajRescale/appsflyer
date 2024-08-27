package com.webengage.sdk.android;

import android.content.Context;
import com.webengage.sdk.android.f0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile h0 f12553a;

    /* renamed from: b, reason: collision with root package name */
    Map<j0, LinkedHashSet<f0>> f12554b;

    /* renamed from: c, reason: collision with root package name */
    private Context f12555c;

    /* renamed from: d, reason: collision with root package name */
    private List<k0> f12556d = null;

    private h0(Context context) {
        this.f12554b = null;
        this.f12555c = null;
        this.f12555c = context.getApplicationContext();
        this.f12554b = new HashMap();
        a();
    }

    public static h0 a(Context context) {
        if (f12553a == null) {
            synchronized (h0.class) {
                try {
                    if (f12553a == null) {
                        f12553a = new h0(context);
                    }
                } finally {
                }
            }
        }
        return f12553a;
    }

    public List<k0> b() {
        return this.f12556d;
    }

    public LinkedHashSet<f0> a(j0 j0Var) {
        return this.f12554b.get(j0Var);
    }

    public boolean b(j0 j0Var, Object obj, List<k0> list) {
        boolean z10;
        if (list == null) {
            return true;
        }
        while (true) {
            for (k0 k0Var : list) {
                z10 = z10 && k0Var.b(j0Var, obj);
            }
            return z10;
        }
    }

    private LinkedHashSet<f0> a(f0.a[] aVarArr) {
        LinkedHashSet<f0> linkedHashSet = new LinkedHashSet<>();
        if (aVarArr != null) {
            for (f0.a aVar : aVarArr) {
                if (aVar != null) {
                    linkedHashSet.add(aVar.a(this.f12555c));
                }
            }
        }
        return linkedHashSet;
    }

    private void a() {
        for (j0 j0Var : j0.values()) {
            this.f12554b.put(j0Var, a(j0Var.a()));
        }
    }

    public void a(j0 j0Var, Object obj) {
        List<k0> b10 = a(this.f12555c).b();
        if (b(j0Var, obj, b10)) {
            LinkedHashSet<f0> a10 = a(this.f12555c).a(j0Var);
            if (a10 != null) {
                Iterator<f0> it = a10.iterator();
                while (it.hasNext()) {
                    it.next().a(j0Var, obj);
                }
            }
            a(j0Var, obj, b10);
        }
    }

    public void a(j0 j0Var, Object obj, List<k0> list) {
        if (list != null) {
            Iterator<k0> it = list.iterator();
            while (it.hasNext()) {
                it.next().a(j0Var, obj);
            }
        }
    }

    public void a(k0 k0Var) {
        if (this.f12556d == null) {
            this.f12556d = new ArrayList();
        }
        this.f12556d.add(k0Var);
    }
}
