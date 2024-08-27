package u5;

import b5.o1;
import e5.x;
import i5.h1;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f36847a;

    /* renamed from: b, reason: collision with root package name */
    public final h1[] f36848b;

    /* renamed from: c, reason: collision with root package name */
    public final s[] f36849c;

    /* renamed from: d, reason: collision with root package name */
    public final o1 f36850d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f36851e;

    public w(h1[] h1VarArr, s[] sVarArr, o1 o1Var, u uVar) {
        this.f36848b = h1VarArr;
        this.f36849c = (s[]) sVarArr.clone();
        this.f36850d = o1Var;
        this.f36851e = uVar;
        this.f36847a = h1VarArr.length;
    }

    public final boolean a(w wVar, int i10) {
        if (wVar == null || !x.a(this.f36848b[i10], wVar.f36848b[i10]) || !x.a(this.f36849c[i10], wVar.f36849c[i10])) {
            return false;
        }
        return true;
    }

    public final boolean b(int i10) {
        if (this.f36848b[i10] != null) {
            return true;
        }
        return false;
    }
}
