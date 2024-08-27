package com.google.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f11950c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final b1 f11951a = new b1(16);

    /* renamed from: b, reason: collision with root package name */
    public boolean f11952b;

    static {
        new o(0);
    }

    public o() {
    }

    public static void b(j jVar, z1 z1Var, int i10, Object obj) {
        if (z1Var == z1.f12007e) {
            jVar.G(i10, 3);
            ((b) obj).i(jVar);
            jVar.G(i10, 4);
            return;
        }
        jVar.G(i10, z1Var.f12010b);
        switch (z1Var.ordinal()) {
            case 0:
                jVar.D(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                jVar.B(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                jVar.J(((Long) obj).longValue());
                return;
            case 3:
                jVar.J(((Long) obj).longValue());
                return;
            case 4:
                jVar.E(((Integer) obj).intValue());
                return;
            case 5:
                jVar.D(((Long) obj).longValue());
                return;
            case 6:
                jVar.B(((Integer) obj).intValue());
                return;
            case 7:
                jVar.x(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (obj instanceof h) {
                    jVar.z((h) obj);
                    return;
                } else {
                    jVar.F((String) obj);
                    return;
                }
            case 9:
                ((b) obj).i(jVar);
                return;
            case 10:
                b bVar = (b) obj;
                jVar.H(((t) bVar).h(null));
                bVar.i(jVar);
                return;
            case 11:
                if (obj instanceof h) {
                    jVar.z((h) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                jVar.H(length);
                jVar.y(bArr, 0, length);
                return;
            case 12:
                jVar.H(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof v) {
                    jVar.E(((gr.i) ((v) obj)).f17548a);
                    return;
                } else {
                    jVar.E(((Integer) obj).intValue());
                    return;
                }
            case 14:
                jVar.B(((Integer) obj).intValue());
                return;
            case 15:
                jVar.D(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                jVar.H((intValue >> 31) ^ (intValue << 1));
                return;
            case 17:
                long longValue = ((Long) obj).longValue();
                jVar.J((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public final void a() {
        b1 b1Var;
        Map unmodifiableMap;
        Map unmodifiableMap2;
        if (this.f11952b) {
            return;
        }
        int i10 = 0;
        while (true) {
            b1Var = this.f11951a;
            if (i10 >= b1Var.f11892b.size()) {
                break;
            }
            Map.Entry h10 = b1Var.h(i10);
            if (h10.getValue() instanceof t) {
                t tVar = (t) h10.getValue();
                tVar.getClass();
                w0 w0Var = w0.f11993c;
                w0Var.getClass();
                w0Var.a(tVar.getClass()).b(tVar);
                tVar.r();
            }
            i10++;
        }
        if (!b1Var.f11894d) {
            if (b1Var.f11892b.size() <= 0) {
                Iterator it = b1Var.i().iterator();
                if (it.hasNext()) {
                    a3.a.u(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            } else {
                a3.a.u(b1Var.h(0).getKey());
                throw null;
            }
        }
        if (!b1Var.f11894d) {
            if (b1Var.f11893c.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(b1Var.f11893c);
            }
            b1Var.f11893c = unmodifiableMap;
            if (b1Var.f11896f.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(b1Var.f11896f);
            }
            b1Var.f11896f = unmodifiableMap2;
            b1Var.f11894d = true;
        }
        this.f11952b = true;
    }

    public final Object clone() {
        o oVar = new o();
        b1 b1Var = this.f11951a;
        if (b1Var.f11892b.size() <= 0) {
            Iterator it = b1Var.i().iterator();
            if (!it.hasNext()) {
                return oVar;
            }
            Map.Entry entry = (Map.Entry) it.next();
            a3.a.u(entry.getKey());
            entry.getValue();
            throw null;
        }
        Map.Entry h10 = b1Var.h(0);
        a3.a.u(h10.getKey());
        h10.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        return this.f11951a.equals(((o) obj).f11951a);
    }

    public final int hashCode() {
        return this.f11951a.hashCode();
    }

    public o(int i10) {
        a();
        a();
    }
}
