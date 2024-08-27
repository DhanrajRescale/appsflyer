package i0;

import android.content.Context;
import android.content.res.Configuration;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.databinding.DataBinderMapperImpl;
import ba.vt;
import ba.vu;
import ba.xt;
import ba.zt;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.social.domain.model.CommentMetaData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19049a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0.g1 f19050b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(t0.g1 g1Var, int i10) {
        super(1);
        this.f19049a = i10;
        this.f19050b = g1Var;
    }

    public final View a(Context context) {
        int i10 = this.f19049a;
        t0.g1 g1Var = this.f19050b;
        switch (i10) {
            case 21:
                Intrinsics.checkNotNullParameter(context, "context");
                LayoutInflater from = LayoutInflater.from(context);
                int i11 = vt.f6469u;
                DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
                g1Var.setValue((vt) m4.m.g(from, R.layout.layout_portfolio_balance, null, false, null));
                vt vtVar = (vt) g1Var.getValue();
                Intrinsics.c(vtVar);
                return vtVar.f27491e;
            case 22:
                Intrinsics.checkNotNullParameter(context, "context");
                LayoutInflater from2 = LayoutInflater.from(context);
                int i12 = xt.f6680w;
                DataBinderMapperImpl dataBinderMapperImpl2 = m4.d.f27474a;
                g1Var.setValue((xt) m4.m.g(from2, R.layout.layout_portfolio_data_league, null, false, null));
                xt xtVar = (xt) g1Var.getValue();
                Intrinsics.c(xtVar);
                return xtVar.f27491e;
            case 23:
                Intrinsics.checkNotNullParameter(context, "ctx");
                LayoutInflater from3 = LayoutInflater.from(context);
                int i13 = zt.f6883y;
                DataBinderMapperImpl dataBinderMapperImpl3 = m4.d.f27474a;
                g1Var.setValue((zt) m4.m.g(from3, R.layout.layout_portfolio_fno_value, null, false, null));
                zt ztVar = (zt) g1Var.getValue();
                Intrinsics.c(ztVar);
                return ztVar.f27491e;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                LayoutInflater from4 = LayoutInflater.from(context);
                int i14 = vu.B;
                DataBinderMapperImpl dataBinderMapperImpl4 = m4.d.f27474a;
                g1Var.setValue((vu) m4.m.g(from4, R.layout.layout_profit_container, null, false, null));
                vu vuVar = (vu) g1Var.getValue();
                Intrinsics.c(vuVar);
                return vuVar.f27491e;
        }
    }

    public final void d(a2.u coordinates) {
        int i10 = this.f19049a;
        t0.g1 g1Var = this.f19050b;
        switch (i10) {
            case 14:
                Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                g1Var.setValue(Integer.valueOf(kj.f.i((int) (coordinates.q() >> 32))));
                return;
            default:
                Intrinsics.checkNotNullParameter(coordinates, "coordinates");
                g1Var.setValue(Integer.valueOf(kj.f.i((int) (coordinates.q() >> 32))));
                return;
        }
    }

    public final void e(j2.e0 it) {
        int i10 = this.f19049a;
        t0.g1 g1Var = this.f19050b;
        switch (i10) {
            case 9:
                Intrinsics.checkNotNullParameter(it, "it");
                g1Var.setValue(it);
                return;
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                g1Var.setValue(new w2.j(it.f20705c));
                return;
            case 11:
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                g1Var.setValue(new w2.j(it.f20705c));
                return;
            case 12:
                Intrinsics.checkNotNullParameter(it, "it");
                g1Var.setValue(it);
                return;
        }
    }

    public final void f(String it) {
        int i10 = this.f19049a;
        t0.g1 g1Var = this.f19050b;
        switch (i10) {
            case 7:
                Intrinsics.checkNotNullParameter(it, "it");
                g1Var.setValue(it);
                return;
            case 16:
                Intrinsics.checkNotNullParameter(it, "it");
                g1Var.setValue(it);
                return;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                g1Var.setValue(kotlin.text.y.a0(30, it));
                return;
        }
    }

    public final void i(boolean z10) {
        int i10 = this.f19049a;
        t0.g1 g1Var = this.f19050b;
        switch (i10) {
            case 3:
                g1Var.setValue(Boolean.valueOf(z10));
                return;
            case 4:
                g1Var.setValue(Boolean.valueOf(z10));
                return;
            case 5:
                g1Var.setValue(Boolean.valueOf(z10));
                return;
            case 17:
                g1Var.setValue(Boolean.valueOf(z10));
                return;
            case 19:
                g1Var.setValue(Boolean.valueOf(z10));
                return;
            default:
                g1Var.setValue(Boolean.valueOf(z10));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        j2.e eVar;
        int i10 = this.f19049a;
        t0.g1 g1Var = this.f19050b;
        switch (i10) {
            case 0:
                k0.f fVar = (k0.f) obj;
                if (fVar.f21855c) {
                    eVar = fVar.f21854b;
                } else {
                    eVar = fVar.f21853a;
                }
                g1Var.setValue(eVar);
                return Unit.f23355a;
            case 1:
                List list = (List) obj;
                if (g1Var != null) {
                    g1Var.setValue(list);
                }
                return Unit.f23355a;
            case 2:
                Configuration configuration = new Configuration((Configuration) obj);
                t0.p0 p0Var = AndroidCompositionLocals_androidKt.f1427a;
                g1Var.setValue(configuration);
                return Unit.f23355a;
            case 3:
                i(((Boolean) obj).booleanValue());
                return Unit.f23355a;
            case 4:
                i(((Boolean) obj).booleanValue());
                return Unit.f23355a;
            case 5:
                i(((Boolean) obj).booleanValue());
                return Unit.f23355a;
            case 6:
                CommentMetaData it = (CommentMetaData) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                g1Var.setValue(it);
                return Unit.f23355a;
            case 7:
                f((String) obj);
                return Unit.f23355a;
            case 8:
                hb.u it2 = (hb.u) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                g1Var.setValue(it2);
                return Unit.f23355a;
            case 9:
                e((j2.e0) obj);
                return Unit.f23355a;
            case 10:
                e((j2.e0) obj);
                return Unit.f23355a;
            case 11:
                FrameLayout fullScreenView = (FrameLayout) obj;
                Intrinsics.checkNotNullParameter(fullScreenView, "fullScreenView");
                fullScreenView.addView((View) g1Var.getValue());
                return Unit.f23355a;
            case 12:
                e((j2.e0) obj);
                return Unit.f23355a;
            case 13:
                e((j2.e0) obj);
                return Unit.f23355a;
            case 14:
                d((a2.u) obj);
                return Unit.f23355a;
            case 15:
                d((a2.u) obj);
                return Unit.f23355a;
            case 16:
                f((String) obj);
                return Unit.f23355a;
            case 17:
                i(((Boolean) obj).booleanValue());
                return Unit.f23355a;
            case 18:
                f((String) obj);
                return Unit.f23355a;
            case 19:
                i(((Boolean) obj).booleanValue());
                return Unit.f23355a;
            case 20:
                int intValue = ((Number) obj).intValue();
                switch (i10) {
                    case 20:
                        g1Var.setValue(Integer.valueOf(intValue));
                        break;
                    default:
                        g1Var.setValue(Integer.valueOf(intValue));
                        break;
                }
                return Unit.f23355a;
            case 21:
                return a((Context) obj);
            case 22:
                return a((Context) obj);
            case 23:
                return a((Context) obj);
            case 24:
                return a((Context) obj);
            case 25:
                i(((Boolean) obj).booleanValue());
                return Unit.f23355a;
            default:
                int intValue2 = ((Number) obj).intValue();
                switch (i10) {
                    case 20:
                        g1Var.setValue(Integer.valueOf(intValue2));
                        break;
                    default:
                        g1Var.setValue(Integer.valueOf(intValue2));
                        break;
                }
                return Unit.f23355a;
        }
    }
}
