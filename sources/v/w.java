package v;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import w.u1;
import w.v1;

/* loaded from: classes.dex */
public final class w extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37627a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u1 f37628b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(u1 u1Var, int i10) {
        super(1);
        this.f37627a = i10;
        this.f37628b = u1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        u1 u1Var = this.f37628b;
        int i10 = this.f37627a;
        switch (i10) {
            case 0:
                return Boolean.valueOf(!Intrinsics.a(obj, u1Var.f38689c.getValue()));
            case 1:
                switch (i10) {
                    case 1:
                        return new v1(u1Var, 0);
                    default:
                        return new v1(u1Var, 1);
                }
            default:
                switch (i10) {
                    case 1:
                        return new v1(u1Var, 0);
                    default:
                        return new v1(u1Var, 1);
                }
        }
    }
}
