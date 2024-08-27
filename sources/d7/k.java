package d7;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import b5.a1;
import com.assetgro.stockgro.prod.R;
import java.util.List;
import k7.y1;
import lp.j1;

/* loaded from: classes.dex */
public final class k extends v {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14060g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x f14061h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(x xVar, int i10) {
        super(xVar);
        this.f14060g = i10;
        this.f14061h = xVar;
    }

    @Override // k7.z0
    public final /* bridge */ /* synthetic */ void h(y1 y1Var, int i10) {
        switch (this.f14060g) {
            case 1:
                r((s) y1Var, i10);
                return;
            default:
                r((s) y1Var, i10);
                return;
        }
    }

    @Override // d7.v
    public final void r(s sVar, int i10) {
        int i11;
        switch (this.f14060g) {
            case 1:
                super.r(sVar, i10);
                if (i10 > 0) {
                    t tVar = (t) ((List) this.f14128e).get(i10 - 1);
                    if (tVar.f14113a.f3555e[tVar.f14114b]) {
                        i11 = 0;
                    } else {
                        i11 = 4;
                    }
                    sVar.f14111v.setVisibility(i11);
                    return;
                }
                return;
            default:
                super.r(sVar, i10);
                return;
        }
    }

    @Override // d7.v
    public final void s(s sVar) {
        View view = sVar.f22629a;
        View view2 = sVar.f14111v;
        TextView textView = sVar.f14110u;
        int i10 = 4;
        int i11 = 0;
        switch (this.f14060g) {
            case 0:
                textView.setText(R.string.exo_track_selection_auto);
                a1 a1Var = this.f14061h.f14174y0;
                a1Var.getClass();
                if (!v(((i5.g0) a1Var).D())) {
                    i10 = 0;
                }
                view2.setVisibility(i10);
                view.setOnClickListener(new j(this, i11));
                return;
            default:
                textView.setText(R.string.exo_track_selection_none);
                int i12 = 0;
                while (true) {
                    if (i12 < ((List) this.f14128e).size()) {
                        t tVar = (t) ((List) this.f14128e).get(i12);
                        if (!tVar.f14113a.f3555e[tVar.f14114b]) {
                            i12++;
                        }
                    } else {
                        i10 = 0;
                    }
                }
                view2.setVisibility(i10);
                view.setOnClickListener(new j(this, 2));
                return;
        }
    }

    @Override // d7.v
    public final void t(String str) {
        switch (this.f14060g) {
            case 0:
                this.f14061h.f14136f.f14107e[1] = str;
                return;
            default:
                return;
        }
    }

    public final boolean v(u5.i iVar) {
        for (int i10 = 0; i10 < ((List) this.f14128e).size(); i10++) {
            if (iVar.f3487y.containsKey(((t) ((List) this.f14128e).get(i10)).f14113a.f3552b)) {
                return true;
            }
        }
        return false;
    }

    public final void w(j1 j1Var) {
        Drawable drawable;
        String str;
        int i10 = this.f14060g;
        x xVar = this.f14061h;
        int i11 = 0;
        switch (i10) {
            case 0:
                this.f14128e = j1Var;
                a1 a1Var = xVar.f14174y0;
                a1Var.getClass();
                u5.i D = ((i5.g0) a1Var).D();
                boolean isEmpty = j1Var.isEmpty();
                r rVar = xVar.f14136f;
                if (isEmpty) {
                    rVar.f14107e[1] = xVar.getResources().getString(R.string.exo_track_selection_none);
                    return;
                } else {
                    if (!v(D)) {
                        rVar.f14107e[1] = xVar.getResources().getString(R.string.exo_track_selection_auto);
                        return;
                    }
                    while (i11 < j1Var.f25000d) {
                        t tVar = (t) j1Var.get(i11);
                        if (tVar.f14113a.f3555e[tVar.f14114b]) {
                            rVar.f14107e[1] = tVar.f14115c;
                            return;
                        }
                        i11++;
                    }
                    return;
                }
            default:
                int i12 = 0;
                while (true) {
                    if (i12 < j1Var.f25000d) {
                        t tVar2 = (t) j1Var.get(i12);
                        if (tVar2.f14113a.f3555e[tVar2.f14114b]) {
                            i11 = 1;
                        } else {
                            i12++;
                        }
                    }
                }
                ImageView imageView = xVar.f14169w;
                if (imageView != null) {
                    if (i11 != 0) {
                        drawable = xVar.f14158q0;
                    } else {
                        drawable = xVar.f14160r0;
                    }
                    imageView.setImageDrawable(drawable);
                    if (i11 != 0) {
                        str = xVar.f14162s0;
                    } else {
                        str = xVar.f14164t0;
                    }
                    xVar.f14169w.setContentDescription(str);
                }
                this.f14128e = j1Var;
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(x xVar, int i10, int i11) {
        this(xVar, 0);
        this.f14060g = i10;
        int i12 = 1;
        if (i10 != 1) {
        } else {
            this(xVar, i12);
        }
    }
}
