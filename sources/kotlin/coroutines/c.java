package kotlin.coroutines;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u0000 \u00052\u00060\u0001j\u0002`\u0002:\u0001\u0006J\b\u0010\u0004\u001a\u00020\u0003H\u0002¨\u0006\u0007"}, d2 = {"Lkotlin/coroutines/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", HttpUrl.FRAGMENT_ENCODE_SET, "readResolve", "b", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
final class c implements Serializable {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineContext[] f23362a;

    public c(CoroutineContext[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f23362a = elements;
    }

    private final Object readResolve() {
        CoroutineContext coroutineContext = k.f23369a;
        for (CoroutineContext coroutineContext2 : this.f23362a) {
            coroutineContext = coroutineContext.l(coroutineContext2);
        }
        return coroutineContext;
    }
}
