package m;

import android.content.Context;
import android.view.View;
import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class h extends l.a0 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f25528m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n f25529n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n nVar, Context context, l.o oVar, l lVar) {
        super(R.attr.actionOverflowMenuStyle, 0, context, lVar, oVar, true);
        this.f25529n = nVar;
        this.f23552g = 8388613;
        hr.c cVar = nVar.f25654x;
        this.f23554i = cVar;
        l.x xVar = this.f23555j;
        if (xVar != null) {
            xVar.i(cVar);
        }
    }

    @Override // l.a0
    public final void c() {
        int i10 = this.f25528m;
        n nVar = this.f25529n;
        switch (i10) {
            case 0:
                nVar.f25651u = null;
                nVar.f25655y = 0;
                super.c();
                return;
            default:
                l.o oVar = nVar.f25633c;
                if (oVar != null) {
                    oVar.c(true);
                }
                nVar.f25650t = null;
                super.c();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n nVar, Context context, l.i0 i0Var, View view) {
        super(R.attr.actionOverflowMenuStyle, 0, context, view, i0Var, false);
        this.f25529n = nVar;
        if (!i0Var.A.f()) {
            View view2 = nVar.f25640j;
            this.f23551f = view2 == null ? (View) nVar.f25638h : view2;
        }
        hr.c cVar = nVar.f25654x;
        this.f23554i = cVar;
        l.x xVar = this.f23555j;
        if (xVar != null) {
            xVar.i(cVar);
        }
    }
}
