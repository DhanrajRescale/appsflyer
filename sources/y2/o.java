package y2;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import c2.r1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import t0.v;

/* loaded from: classes.dex */
public final class o extends iu.k implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f41126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f41127b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f41128c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d1.n f41129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f41130e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ View f41131f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context, Function1 function1, t0.p pVar, d1.n nVar, int i10, View view) {
        super(0);
        this.f41126a = context;
        this.f41127b = function1;
        this.f41128c = pVar;
        this.f41129d = nVar;
        this.f41130e = i10;
        this.f41131f = view;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo2invoke() {
        Context context = this.f41126a;
        Function1 function1 = this.f41127b;
        v vVar = this.f41128c;
        d1.n nVar = this.f41129d;
        int i10 = this.f41130e;
        KeyEvent.Callback callback = this.f41131f;
        Intrinsics.d(callback, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        return new q(context, function1, vVar, nVar, i10, (r1) callback).getLayoutNode();
    }
}
