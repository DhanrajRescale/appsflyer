package yt;

import au.d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import ut.m;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0001\u0018\u0000 \u0007*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lyt/c;", "T", "Lyt/a;", "Lau/d;", HttpUrl.FRAGMENT_ENCODE_SET, "result", "Ljava/lang/Object;", "b", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class c<T> implements yt.a<T>, d {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final a f41816b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f41817c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "result");

    /* renamed from: a, reason: collision with root package name */
    public final yt.a f41818a;
    private volatile Object result;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001Rj\u0010\u0005\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lyt/c$a;", HttpUrl.FRAGMENT_ENCODE_SET, "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lyt/c;", "kotlin.jvm.PlatformType", "RESULT", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "getRESULT$annotations", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public c(zt.a aVar, yt.a delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f41818a = delegate;
        this.result = aVar;
    }

    public final Object a() {
        Object obj = this.result;
        zt.a aVar = zt.a.f42824b;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f41817c;
            zt.a aVar2 = zt.a.f42823a;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                if (atomicReferenceFieldUpdater.get(this) != aVar) {
                    obj = this.result;
                }
            }
            return zt.a.f42823a;
        }
        if (obj == zt.a.f42825c) {
            return zt.a.f42823a;
        }
        if (!(obj instanceof m)) {
            return obj;
        }
        throw ((m) obj).f37396a;
    }

    @Override // au.d
    public final d getCallerFrame() {
        yt.a aVar = this.f41818a;
        if (aVar instanceof d) {
            return (d) aVar;
        }
        return null;
    }

    @Override // yt.a
    public final CoroutineContext getContext() {
        return this.f41818a.getContext();
    }

    @Override // yt.a
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            zt.a aVar = zt.a.f42824b;
            if (obj2 == aVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f41817c;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, aVar, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != aVar) {
                        break;
                    }
                }
                return;
            }
            zt.a aVar2 = zt.a.f42823a;
            if (obj2 == aVar2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f41817c;
                zt.a aVar3 = zt.a.f42825c;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, aVar2, aVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != aVar2) {
                        break;
                    }
                }
                this.f41818a.resumeWith(obj);
                return;
            }
            throw new IllegalStateException("Already resumed");
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f41818a;
    }
}
