package d2;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class w1 implements d1.n {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f13658a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d1.n f13659b;

    public w1(d1.p pVar, i0.p0 p0Var) {
        this.f13658a = p0Var;
        this.f13659b = pVar;
    }

    @Override // d1.n
    public final boolean a(Object obj) {
        return this.f13659b.a(obj);
    }

    @Override // d1.n
    public final Map b() {
        return this.f13659b.b();
    }

    @Override // d1.n
    public final Object c(String str) {
        return this.f13659b.c(str);
    }

    @Override // d1.n
    public final d1.m d(String str, Function0 function0) {
        return this.f13659b.d(str, function0);
    }
}
