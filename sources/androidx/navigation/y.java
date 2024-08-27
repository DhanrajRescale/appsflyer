package androidx.navigation;

import android.os.Bundle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f2343b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(int i10, Bundle bundle) {
        super(1);
        this.f2342a = i10;
        this.f2343b = bundle;
    }

    public final Boolean a(String argName) {
        int i10 = this.f2342a;
        Bundle bundle = this.f2343b;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(argName, "argName");
                return Boolean.valueOf(!bundle.containsKey(argName));
            default:
                Intrinsics.checkNotNullParameter(argName, "key");
                return Boolean.valueOf(!bundle.containsKey(argName));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f2342a) {
            case 0:
                return a((String) obj);
            default:
                return a((String) obj);
        }
    }
}
