package qu;

import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final Object f32259a;

    /* renamed from: b, reason: collision with root package name */
    public final g f32260b;

    /* renamed from: c, reason: collision with root package name */
    public final Function1 f32261c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f32262d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f32263e;

    public s(Object obj, g gVar, Function1 function1, Object obj2, Throwable th2) {
        this.f32259a = obj;
        this.f32260b = gVar;
        this.f32261c = function1;
        this.f32262d = obj2;
        this.f32263e = th2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Throwable] */
    public static s a(s sVar, g gVar, CancellationException cancellationException, int i10) {
        Object obj;
        Function1 function1;
        Object obj2 = null;
        if ((i10 & 1) != 0) {
            obj = sVar.f32259a;
        } else {
            obj = null;
        }
        if ((i10 & 2) != 0) {
            gVar = sVar.f32260b;
        }
        g gVar2 = gVar;
        if ((i10 & 4) != 0) {
            function1 = sVar.f32261c;
        } else {
            function1 = null;
        }
        if ((i10 & 8) != 0) {
            obj2 = sVar.f32262d;
        }
        Object obj3 = obj2;
        CancellationException cancellationException2 = cancellationException;
        if ((i10 & 16) != 0) {
            cancellationException2 = sVar.f32263e;
        }
        sVar.getClass();
        return new s(obj, gVar2, function1, obj3, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return Intrinsics.a(this.f32259a, sVar.f32259a) && Intrinsics.a(this.f32260b, sVar.f32260b) && Intrinsics.a(this.f32261c, sVar.f32261c) && Intrinsics.a(this.f32262d, sVar.f32262d) && Intrinsics.a(this.f32263e, sVar.f32263e);
    }

    public final int hashCode() {
        Object obj = this.f32259a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        g gVar = this.f32260b;
        int hashCode2 = (hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        Function1 function1 = this.f32261c;
        int hashCode3 = (hashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Object obj2 = this.f32262d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f32263e;
        return hashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f32259a + ", cancelHandler=" + this.f32260b + ", onCancellation=" + this.f32261c + ", idempotentResume=" + this.f32262d + ", cancelCause=" + this.f32263e + ')';
    }

    public /* synthetic */ s(Object obj, g gVar, Function1 function1, CancellationException cancellationException, int i10) {
        this(obj, (i10 & 2) != 0 ? null : gVar, (i10 & 4) != 0 ? null : function1, (Object) null, (i10 & 16) != 0 ? null : cancellationException);
    }
}
