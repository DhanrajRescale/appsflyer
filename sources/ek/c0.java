package ek;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: e, reason: collision with root package name */
    public static final h f15572e;

    /* renamed from: f, reason: collision with root package name */
    public static final i f15573f;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f15574a;

    /* renamed from: b, reason: collision with root package name */
    public final h f15575b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f15576c;

    /* renamed from: d, reason: collision with root package name */
    public final c4.e f15577d;

    static {
        int i10 = 1;
        f15572e = new h(i10);
        f15573f = new i(i10);
    }

    public c0(c4.e eVar) {
        h hVar = f15572e;
        this.f15574a = new ArrayList();
        this.f15576c = new HashSet();
        this.f15577d = eVar;
        this.f15575b = hVar;
    }

    public final synchronized w a(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f15574a.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                b0 b0Var = (b0) it.next();
                if (this.f15576c.contains(b0Var)) {
                    z10 = true;
                } else if (b0Var.f15569a.isAssignableFrom(cls) && b0Var.f15570b.isAssignableFrom(cls2)) {
                    this.f15576c.add(b0Var);
                    w f10 = b0Var.f15571c.f(this);
                    al.d.V(f10);
                    arrayList.add(f10);
                    this.f15576c.remove(b0Var);
                }
            }
            if (arrayList.size() > 1) {
                h hVar = this.f15575b;
                c4.e eVar = this.f15577d;
                hVar.getClass();
                return new a0(arrayList, eVar);
            }
            if (arrayList.size() == 1) {
                return (w) arrayList.get(0);
            }
            if (z10) {
                return f15573f;
            }
            throw new RuntimeException("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th2) {
            this.f15576c.clear();
            throw th2;
        }
    }

    public final synchronized ArrayList b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f15574a.iterator();
            while (it.hasNext()) {
                b0 b0Var = (b0) it.next();
                if (!this.f15576c.contains(b0Var) && b0Var.f15569a.isAssignableFrom(cls)) {
                    this.f15576c.add(b0Var);
                    w f10 = b0Var.f15571c.f(this);
                    al.d.V(f10);
                    arrayList.add(f10);
                    this.f15576c.remove(b0Var);
                }
            }
        } catch (Throwable th2) {
            this.f15576c.clear();
            throw th2;
        }
        return arrayList;
    }

    public final synchronized ArrayList c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f15574a.iterator();
        while (it.hasNext()) {
            b0 b0Var = (b0) it.next();
            if (!arrayList.contains(b0Var.f15570b) && b0Var.f15569a.isAssignableFrom(cls)) {
                arrayList.add(b0Var.f15570b);
            }
        }
        return arrayList;
    }
}
