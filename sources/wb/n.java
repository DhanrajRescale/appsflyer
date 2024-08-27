package wb;

import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t0.g1;

/* loaded from: classes.dex */
public final class n implements rs.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function0 f38971a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f38972b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f38973c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f38974d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f38975e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f38976f;

    public n(Function0 function0, g1 g1Var, g1 g1Var2, Function2 function2, String str, g1 g1Var3) {
        this.f38971a = function0;
        this.f38972b = g1Var;
        this.f38973c = g1Var2;
        this.f38974d = function2;
        this.f38975e = str;
        this.f38976f = g1Var3;
    }

    @Override // rs.b
    public final void a(View fullscreenView, hj.b exitFullscreen) {
        Intrinsics.checkNotNullParameter(fullscreenView, "fullscreenView");
        Intrinsics.checkNotNullParameter(exitFullscreen, "exitFullscreen");
        this.f38972b.setValue(fullscreenView);
        this.f38973c.setValue(Boolean.TRUE);
        this.f38971a.mo2invoke();
    }

    @Override // rs.b
    public final void b() {
        this.f38973c.setValue(Boolean.FALSE);
        qs.e eVar = (qs.e) this.f38976f.getValue();
        if (eVar != null) {
            us.g gVar = (us.g) eVar;
            gVar.a(gVar.f37378a, "playVideo", new Object[0]);
        }
        Function2 function2 = this.f38974d;
        if (function2 != null) {
            function2.invoke(Boolean.TRUE, this.f38975e);
        }
    }
}
