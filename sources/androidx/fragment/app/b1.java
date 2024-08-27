package androidx.fragment.app;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b1 implements a1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f1598a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1599b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1600c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d1 f1601d;

    public b1(d1 d1Var, String str, int i10, int i11) {
        this.f1601d = d1Var;
        this.f1598a = str;
        this.f1599b = i10;
        this.f1600c = i11;
    }

    @Override // androidx.fragment.app.a1
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        g0 g0Var = this.f1601d.f1668y;
        if (g0Var != null && this.f1599b < 0 && this.f1598a == null && g0Var.getChildFragmentManager().P()) {
            return false;
        }
        return this.f1601d.R(arrayList, arrayList2, this.f1598a, this.f1599b, this.f1600c);
    }
}
