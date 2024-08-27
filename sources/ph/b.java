package ph;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import androidx.databinding.DataBinderMapperImpl;
import ba.r9;
import ba.uf;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.bottomsheet.ReusedBottomSheetViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import m4.m;
import vt.i0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lph/b;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/bottomsheet/ReusedBottomSheetViewModel;", "Lba/uf;", "<init>", "()V", "yk/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b extends gd.h<ReusedBottomSheetViewModel, uf> {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f31085j = 0;

    /* renamed from: i, reason: collision with root package name */
    public List f31086i = i0.f38321a;

    @Override // gd.h
    public final void u(da.a bottomSheetDialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragmentComponent, "bottomSheetDialogFragmentComponent");
        this.f17270b = bottomSheetDialogFragmentComponent.k();
        FirebaseAnalytics d10 = bottomSheetDialogFragmentComponent.f14246a.d();
        yk.g.i(d10);
        this.f17273e = d10;
        Analytics o10 = bottomSheetDialogFragmentComponent.f14246a.o();
        yk.g.i(o10);
        this.f17274f = o10;
        n0 h10 = bottomSheetDialogFragmentComponent.f14246a.h();
        yk.g.i(h10);
        this.f17275g = h10;
    }

    @Override // gd.h
    public final int x() {
        return R.layout.fragment_bottom_sheet_alert;
    }

    @Override // gd.h
    public final void z(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        List<String> list = this.f31086i;
        ((uf) r()).f6292s.setVisibility(0);
        if (list != null) {
            ((uf) r()).f6292s.setVisibility(0);
            int i10 = 0;
            for (String str : list) {
                i10++;
                LayoutInflater layoutInflater = getLayoutInflater();
                int i11 = r9.f5940u;
                DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
                r9 r9Var = (r9) m.g(layoutInflater, R.layout.cell_league_rule, null, false, null);
                Intrinsics.checkNotNullExpressionValue(r9Var, "inflate(...)");
                r9Var.f5941s.setText(String.valueOf(i10));
                r9Var.f5942t.setText(Html.fromHtml(str));
                ((uf) r()).f6294u.addView(r9Var.f27491e);
            }
        }
        ((uf) r()).f6293t.setOnClickListener(new a(this, 0));
    }
}
