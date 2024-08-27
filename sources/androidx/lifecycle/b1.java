package androidx.lifecycle;

import androidx.fragment.app.z1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b1 implements ut.g {

    /* renamed from: a, reason: collision with root package name */
    public final ou.b f1885a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f1886b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f1887c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f1888d;

    /* renamed from: e, reason: collision with root package name */
    public a1 f1889e;

    public b1(iu.e viewModelClass, z1 storeProducer, Function0 factoryProducer, ad.f extrasProducer) {
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(factoryProducer, "factoryProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        this.f1885a = viewModelClass;
        this.f1886b = storeProducer;
        this.f1887c = factoryProducer;
        this.f1888d = extrasProducer;
    }

    @Override // ut.g
    public final Object getValue() {
        a1 a1Var = this.f1889e;
        if (a1Var == null) {
            h1 store = (h1) this.f1886b.mo2invoke();
            d1 factory = (d1) this.f1887c.mo2invoke();
            y4.c extras = (y4.c) this.f1888d.mo2invoke();
            Intrinsics.checkNotNullParameter(store, "store");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(extras, "extras");
            a1 b10 = new g1(store, factory, extras).b(this.f1885a);
            this.f1889e = b10;
            return b10;
        }
        return a1Var;
    }
}
