package ej;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import ba.p6;
import com.assetgro.stockgro.prod.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lej/r0;", "Lao/g;", "<init>", "()V", "mt/p", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class r0 extends ao.g {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f15534d = 0;

    /* renamed from: b, reason: collision with root package name */
    public p6 f15535b;

    /* renamed from: c, reason: collision with root package name */
    public final ut.g f15536c = ut.h.a(new ag.b(this, 29));

    @Override // androidx.fragment.app.t, androidx.fragment.app.g0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.AppBottomSheetDialogTheme);
    }

    @Override // androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        int i10 = p6.f5723u;
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        p6 p6Var = (p6) m4.m.g(inflater, R.layout.bottom_sheet_subscription_upi_auto_pay_pre_confirmation, viewGroup, false, null);
        Intrinsics.checkNotNullExpressionValue(p6Var, "inflate(...)");
        Intrinsics.checkNotNullParameter(p6Var, "<set-?>");
        this.f15535b = p6Var;
        if (p6Var != null) {
            View view = p6Var.f27491e;
            Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
            return view;
        }
        Intrinsics.k("binding");
        throw null;
    }

    @Override // androidx.fragment.app.g0
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            p6 p6Var = this.f15535b;
            if (p6Var != null) {
                p6Var.f5725t.setText(Html.fromHtml(arguments.getString("DATA")));
                p6 p6Var2 = this.f15535b;
                if (p6Var2 != null) {
                    p6Var2.f5724s.setText(arguments.getString("TITLE"));
                } else {
                    Intrinsics.k("binding");
                    throw null;
                }
            } else {
                Intrinsics.k("binding");
                throw null;
            }
        }
        p6 p6Var3 = this.f15535b;
        if (p6Var3 != null) {
            p6Var3.f5724s.setOnClickListener(new ph.a(this, 17));
        } else {
            Intrinsics.k("binding");
            throw null;
        }
    }
}
