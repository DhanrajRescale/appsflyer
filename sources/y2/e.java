package y2;

import c2.r1;
import d2.a0;
import d2.t;
import d4.n1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class e extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41073a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f41074b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.node.a f41075c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(k kVar, androidx.compose.ui.node.a aVar, int i10) {
        super(1);
        this.f41073a = i10;
        this.f41074b = kVar;
        this.f41075c = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        a0 a0Var;
        int i10 = this.f41073a;
        androidx.compose.ui.node.a aVar = this.f41075c;
        k kVar = this.f41074b;
        switch (i10) {
            case 0:
                r1 r1Var = (r1) obj;
                if (r1Var instanceof a0) {
                    a0Var = (a0) r1Var;
                } else {
                    a0Var = null;
                }
                if (a0Var != null) {
                    a0Var.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(kVar, aVar);
                    a0Var.getAndroidViewsHandler$ui_release().addView(kVar);
                    a0Var.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(aVar, kVar);
                    kVar.setImportantForAccessibility(1);
                    n1.n(kVar, new t(a0Var, aVar, a0Var));
                }
                if (kVar.getView().getParent() != kVar) {
                    kVar.addView(kVar.getView());
                }
                return Unit.f23355a;
            case 1:
                m.c(kVar, aVar);
                return Unit.f23355a;
            default:
                m.c(kVar, aVar);
                return Unit.f23355a;
        }
    }
}
