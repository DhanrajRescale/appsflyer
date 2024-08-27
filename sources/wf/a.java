package wf;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import ba.t6;
import ba.u6;
import com.assetgro.stockgro.data.model.portfolio.WalletCta;
import com.assetgro.stockgro.prod.R;
import iu.z;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m4.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lwf/a;", "Lao/g;", "<init>", "()V", "de/d", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class a extends ao.g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f39037c = 0;

    /* renamed from: b, reason: collision with root package name */
    public t6 f39038b;

    @Override // androidx.fragment.app.t, androidx.fragment.app.g0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.AppBottomSheetDialogTheme);
    }

    @Override // androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        int i10 = t6.f6158x;
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        t6 t6Var = (t6) m.g(inflater, R.layout.bottom_sheet_wallet_announcement_action, viewGroup, false, null);
        Intrinsics.checkNotNullExpressionValue(t6Var, "inflate(...)");
        Intrinsics.checkNotNullParameter(t6Var, "<set-?>");
        this.f39038b = t6Var;
        if (t6Var != null) {
            View view = t6Var.f27491e;
            Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
            return view;
        }
        Intrinsics.k("binding");
        throw null;
    }

    @Override // androidx.fragment.app.g0
    public final void onViewCreated(View view, Bundle bundle) {
        WalletCta walletCta;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        z zVar = new z();
        Bundle arguments = getArguments();
        if (arguments != null) {
            walletCta = (WalletCta) arguments.getParcelable("DATA");
        } else {
            walletCta = null;
        }
        if (!(walletCta instanceof WalletCta)) {
            walletCta = null;
        }
        if (walletCta != null) {
            zVar.f20560a = walletCta;
            t6 t6Var = this.f39038b;
            if (t6Var != null) {
                u6 u6Var = (u6) t6Var;
                u6Var.f6163w = walletCta;
                synchronized (u6Var) {
                    u6Var.f6276y |= 1;
                }
                u6Var.a(6);
                u6Var.m();
            } else {
                Intrinsics.k("binding");
                throw null;
            }
        }
        t6 t6Var2 = this.f39038b;
        if (t6Var2 != null) {
            t6Var2.f6159s.setOnClickListener(new bb.a(13, zVar, this));
            t6 t6Var3 = this.f39038b;
            if (t6Var3 != null) {
                t6Var3.f6160t.setOnClickListener(new p004if.c(this, 8));
                return;
            } else {
                Intrinsics.k("binding");
                throw null;
            }
        }
        Intrinsics.k("binding");
        throw null;
    }
}
