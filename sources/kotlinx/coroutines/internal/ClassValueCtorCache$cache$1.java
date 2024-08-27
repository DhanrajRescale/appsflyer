package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import vu.l;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002j\u0002`\u00040\u0001J(\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002j\u0002`\u00042\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0005H\u0014¨\u0006\b"}, d2 = {"kotlinx/coroutines/internal/ClassValueCtorCache$cache$1", "Ljava/lang/ClassValue;", "Lkotlin/Function1;", HttpUrl.FRAGMENT_ENCODE_SET, "Lkotlinx/coroutines/internal/Ctor;", "Ljava/lang/Class;", "type", "computeValue", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class ClassValueCtorCache$cache$1 extends ClassValue<Function1<? super Throwable, ? extends Throwable>> {
    @Override // java.lang.ClassValue
    public final /* bridge */ /* synthetic */ Function1<? super Throwable, ? extends Throwable> computeValue(Class cls) {
        return computeValue2((Class<?>) cls);
    }

    @Override // java.lang.ClassValue
    @NotNull
    /* renamed from: computeValue, reason: avoid collision after fix types in other method */
    public Function1<? super Throwable, ? extends Throwable> computeValue2(Class<?> type) {
        Intrinsics.d(type, "null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
        return l.a(type);
    }
}
