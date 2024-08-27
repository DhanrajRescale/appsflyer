package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "acc", "Lkotlin/coroutines/CoroutineContext$Element;", "element", "a", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext$Element;)Lkotlin/coroutines/CoroutineContext;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class j extends iu.k implements Function2<CoroutineContext, CoroutineContext.Element, CoroutineContext> {

    /* renamed from: a, reason: collision with root package name */
    public static final j f23368a = new iu.k(2);

    public j() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CoroutineContext invoke(CoroutineContext acc, CoroutineContext.Element element) {
        e eVar;
        Intrinsics.checkNotNullParameter(acc, "acc");
        Intrinsics.checkNotNullParameter(element, "element");
        CoroutineContext z10 = acc.z(element.getKey());
        k kVar = k.f23369a;
        if (z10 != kVar) {
            yt.b bVar = f.O;
            f fVar = (f) z10.g(bVar);
            if (fVar == null) {
                eVar = new e(z10, element);
            } else {
                CoroutineContext z11 = z10.z(bVar);
                if (z11 == kVar) {
                    return new e(element, fVar);
                }
                eVar = new e(new e(z11, element), fVar);
            }
            return eVar;
        }
        return element;
    }
}
