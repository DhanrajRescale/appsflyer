package ea;

import com.assetgro.stockgro.di.modules.DoubleGsonAdapter;
import com.google.gson.Gson;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r0 implements xs.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15269a;

    /* renamed from: b, reason: collision with root package name */
    public final p0 f15270b;

    public /* synthetic */ r0(p0 p0Var, int i10) {
        this.f15269a = i10;
        this.f15270b = p0Var;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i10 = this.f15269a;
        p0 p0Var = this.f15270b;
        switch (i10) {
            case 0:
                p0Var.getClass();
                Gson create = new Gson().newBuilder().registerTypeAdapter(Double.TYPE, new DoubleGsonAdapter()).create();
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                yk.g.j(create);
                return create;
            default:
                p0Var.getClass();
                Object obj = new Object();
                Intrinsics.checkNotNullExpressionValue(obj, "create(...)");
                return obj;
        }
    }
}
