package m5;

import b5.v;
import e5.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import lp.o0;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public final v f27564a;

    /* renamed from: b, reason: collision with root package name */
    public final o0 f27565b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27566c;

    /* renamed from: d, reason: collision with root package name */
    public final List f27567d;

    /* renamed from: e, reason: collision with root package name */
    public final List f27568e;

    /* renamed from: f, reason: collision with root package name */
    public final List f27569f;

    /* renamed from: g, reason: collision with root package name */
    public final j f27570g;

    public m(v vVar, o0 o0Var, s sVar, ArrayList arrayList, List list, List list2) {
        yk.j.E0(!o0Var.isEmpty());
        this.f27564a = vVar;
        this.f27565b = o0.q(o0Var);
        this.f27567d = Collections.unmodifiableList(arrayList);
        this.f27568e = list;
        this.f27569f = list2;
        this.f27570g = sVar.a(this);
        this.f27566c = x.L(sVar.f27587c, 1000000L, sVar.f27586b);
    }

    public abstract String a();

    public abstract l5.i c();

    public abstract j d();
}
