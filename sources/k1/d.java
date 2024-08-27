package k1;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class d implements w2.b {

    /* renamed from: a, reason: collision with root package name */
    public a f21893a = i.f21898a;

    /* renamed from: b, reason: collision with root package name */
    public g f21894b;

    @Override // w2.b
    public final float Y() {
        return this.f21893a.b().Y();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k1.g] */
    public final g a(Function1 function1) {
        ?? obj = new Object();
        obj.f21896a = function1;
        this.f21894b = obj;
        return obj;
    }

    @Override // w2.b
    public final float b() {
        return this.f21893a.b().b();
    }
}
