package c2;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class s0 implements a2.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7834b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f7835c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f7836d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1 f7837e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u0 f7838f;

    public s0(int i10, int i11, Map map, Function1 function1, u0 u0Var) {
        this.f7833a = i10;
        this.f7834b = i11;
        this.f7835c = map;
        this.f7837e = function1;
        this.f7838f = u0Var;
    }

    @Override // a2.n0
    public final int a() {
        return this.f7834b;
    }

    @Override // a2.n0
    public final int b() {
        return this.f7833a;
    }

    @Override // a2.n0
    public final Map c() {
        return this.f7835c;
    }

    @Override // a2.n0
    public final void d() {
        this.f7837e.invoke(this.f7838f.f7853h);
    }

    @Override // a2.n0
    public final Function1 e() {
        return this.f7836d;
    }
}
