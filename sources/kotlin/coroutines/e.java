package kotlin.coroutines;

import iu.x;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class e implements CoroutineContext, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext f23364a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineContext.Element f23365b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {HttpUrl.FRAGMENT_ENCODE_SET, "<anonymous parameter 0>", "Lkotlin/coroutines/CoroutineContext$Element;", "element", "a", "(Lkotlin/Unit;Lkotlin/coroutines/CoroutineContext$Element;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a extends iu.k implements Function2<Unit, CoroutineContext.Element, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CoroutineContext[] f23366a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x f23367b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CoroutineContext[] coroutineContextArr, x xVar) {
            super(2);
            this.f23366a = coroutineContextArr;
            this.f23367b = xVar;
        }

        public final void a(Unit unit, CoroutineContext.Element element) {
            Intrinsics.checkNotNullParameter(unit, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(element, "element");
            x xVar = this.f23367b;
            int i10 = xVar.f20558a;
            xVar.f20558a = i10 + 1;
            this.f23366a[i10] = element;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Unit) obj, (CoroutineContext.Element) obj2);
            return Unit.f23355a;
        }
    }

    public e(CoroutineContext left, CoroutineContext.Element element) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.f23364a = left;
        this.f23365b = element;
    }

    private final Object writeReplace() {
        int e10 = e();
        CoroutineContext[] coroutineContextArr = new CoroutineContext[e10];
        x xVar = new x();
        R(Unit.f23355a, new a(coroutineContextArr, xVar));
        if (xVar.f20558a == e10) {
            return new c(coroutineContextArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object R(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(this.f23364a.R(obj, operation), this.f23365b);
    }

    public final int e() {
        int i10 = 2;
        e eVar = this;
        while (true) {
            CoroutineContext coroutineContext = eVar.f23364a;
            if (coroutineContext instanceof e) {
                eVar = (e) coroutineContext;
            } else {
                eVar = null;
            }
            if (eVar == null) {
                return i10;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (eVar.e() == e()) {
                    e eVar2 = this;
                    while (true) {
                        CoroutineContext.Element element = eVar2.f23365b;
                        if (!Intrinsics.a(eVar.g(element.getKey()), element)) {
                            break;
                        }
                        CoroutineContext coroutineContext = eVar2.f23364a;
                        if (coroutineContext instanceof e) {
                            eVar2 = (e) coroutineContext;
                        } else {
                            Intrinsics.d(coroutineContext, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                            CoroutineContext.Element element2 = (CoroutineContext.Element) coroutineContext;
                            if (Intrinsics.a(eVar.g(element2.getKey()), element2)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element g(i key) {
        Intrinsics.checkNotNullParameter(key, "key");
        e eVar = this;
        while (true) {
            CoroutineContext.Element g10 = eVar.f23365b.g(key);
            if (g10 != null) {
                return g10;
            }
            CoroutineContext coroutineContext = eVar.f23364a;
            if (coroutineContext instanceof e) {
                eVar = (e) coroutineContext;
            } else {
                return coroutineContext.g(key);
            }
        }
    }

    public final int hashCode() {
        return this.f23365b.hashCode() + this.f23364a.hashCode();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext l(CoroutineContext coroutineContext) {
        return g.a(this, coroutineContext);
    }

    public final String toString() {
        return nn.d.n(new StringBuilder("["), (String) R(HttpUrl.FRAGMENT_ENCODE_SET, d.f23363a), ']');
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext z(i key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CoroutineContext.Element element = this.f23365b;
        CoroutineContext.Element g10 = element.g(key);
        CoroutineContext coroutineContext = this.f23364a;
        if (g10 != null) {
            return coroutineContext;
        }
        CoroutineContext z10 = coroutineContext.z(key);
        if (z10 == coroutineContext) {
            return this;
        }
        if (z10 != k.f23369a) {
            return new e(z10, element);
        }
        return element;
    }
}
