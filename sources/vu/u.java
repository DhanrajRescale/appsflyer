package vu;

import java.util.Iterator;
import java.util.List;
import qu.b2;

/* loaded from: classes2.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final b2 f38408a;

    static {
        String str;
        Object next;
        int i10 = b0.f38357a;
        b2 b2Var = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        List i11 = pu.p.i(pu.m.b(v.e.z()));
        Iterator it = i11.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                int c10 = ((t) next).c();
                do {
                    Object next2 = it.next();
                    int c11 = ((t) next2).c();
                    if (c10 < c11) {
                        next = next2;
                        c10 = c11;
                    }
                } while (it.hasNext());
            }
        }
        t tVar = (t) next;
        if (tVar != null) {
            try {
                b2Var = tVar.b(i11);
            } catch (Throwable unused2) {
                tVar.a();
            }
            if (b2Var != null) {
                f38408a = b2Var;
                return;
            }
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
