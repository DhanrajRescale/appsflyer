package vu;

import java.lang.reflect.Constructor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38384a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Constructor f38385b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Constructor constructor, int i10) {
        super(1);
        this.f38384a = i10;
        this.f38385b = constructor;
    }

    public final Throwable a(Throwable th2) {
        int i10 = this.f38384a;
        Constructor constructor = this.f38385b;
        switch (i10) {
            case 0:
                Object newInstance = constructor.newInstance(th2.getMessage(), th2);
                Intrinsics.d(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                return (Throwable) newInstance;
            case 1:
                Object newInstance2 = constructor.newInstance(th2.getMessage());
                Intrinsics.d(newInstance2, "null cannot be cast to non-null type kotlin.Throwable");
                Throwable th3 = (Throwable) newInstance2;
                th3.initCause(th2);
                return th3;
            case 2:
                Object newInstance3 = constructor.newInstance(th2);
                Intrinsics.d(newInstance3, "null cannot be cast to non-null type kotlin.Throwable");
                return (Throwable) newInstance3;
            default:
                Object newInstance4 = constructor.newInstance(new Object[0]);
                Intrinsics.d(newInstance4, "null cannot be cast to non-null type kotlin.Throwable");
                Throwable th4 = (Throwable) newInstance4;
                th4.initCause(th2);
                return th4;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f38384a) {
            case 0:
                return a((Throwable) obj);
            case 1:
                return a((Throwable) obj);
            case 2:
                return a((Throwable) obj);
            default:
                return a((Throwable) obj);
        }
    }
}
