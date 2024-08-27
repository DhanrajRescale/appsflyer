package wb;

import androidx.lifecycle.t;
import kotlin.jvm.functions.Function2;
import t0.n0;

/* loaded from: classes.dex */
public final class r implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f38990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38991b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f38992c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.r f38993d;

    public r(Function2 function2, String str, t tVar, d4.t tVar2) {
        this.f38990a = function2;
        this.f38991b = str;
        this.f38992c = tVar;
        this.f38993d = tVar2;
    }

    @Override // t0.n0
    public final void a() {
        Function2 function2 = this.f38990a;
        if (function2 != null) {
            function2.invoke(Boolean.FALSE, this.f38991b);
        }
        this.f38992c.getLifecycle().c(this.f38993d);
    }
}
