package c0;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class g implements d0.q {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f7496a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f7497b;

    /* renamed from: c, reason: collision with root package name */
    public final hu.d f7498c;

    public g(Function1 function1, Function1 function12, b1.c cVar) {
        this.f7496a = function1;
        this.f7497b = function12;
        this.f7498c = cVar;
    }

    @Override // d0.q
    public final Function1 a() {
        return this.f7497b;
    }

    @Override // d0.q
    public final Function1 getKey() {
        return this.f7496a;
    }
}
