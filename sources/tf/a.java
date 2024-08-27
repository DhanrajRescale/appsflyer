package tf;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import ba.x5;
import ba.y5;
import com.assetgro.stockgro.data.model.portfolio.WithdrawPreCheckData;
import com.assetgro.stockgro.prod.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m4.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltf/a;", "Lao/g;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class a extends ao.g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f36006c = 0;

    /* renamed from: b, reason: collision with root package name */
    public x5 f36007b;

    @Override // androidx.fragment.app.t, androidx.fragment.app.g0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.AppBottomSheetDialogTheme);
    }

    @Override // androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        int i10 = x5.f6608v;
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        x5 x5Var = (x5) m.g(inflater, R.layout.bottom_sheet_market_know_your_withdraw_limit, viewGroup, false, null);
        Intrinsics.checkNotNullExpressionValue(x5Var, "inflate(...)");
        Intrinsics.checkNotNullParameter(x5Var, "<set-?>");
        this.f36007b = x5Var;
        if (x5Var != null) {
            View view = x5Var.f27491e;
            Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
            return view;
        }
        Intrinsics.k("binding");
        throw null;
    }

    @Override // androidx.fragment.app.g0
    public final void onViewCreated(View view, Bundle bundle) {
        WithdrawPreCheckData withdrawPreCheckData;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            withdrawPreCheckData = (WithdrawPreCheckData) arguments.getParcelable("DATA");
        } else {
            withdrawPreCheckData = null;
        }
        if (!(withdrawPreCheckData instanceof WithdrawPreCheckData)) {
            withdrawPreCheckData = null;
        }
        if (withdrawPreCheckData != null) {
            x5 x5Var = this.f36007b;
            if (x5Var != null) {
                y5 y5Var = (y5) x5Var;
                y5Var.f6611u = withdrawPreCheckData;
                synchronized (y5Var) {
                    y5Var.f6709w |= 1;
                }
                y5Var.a(6);
                y5Var.m();
            } else {
                Intrinsics.k("binding");
                throw null;
            }
        }
        x5 x5Var2 = this.f36007b;
        if (x5Var2 != null) {
            x5Var2.f6609s.setOnClickListener(new p004if.c(this, 7));
        } else {
            Intrinsics.k("binding");
            throw null;
        }
    }
}
