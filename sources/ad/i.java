package ad;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import ba.j9;
import ba.v6;
import com.assetgro.stockgro.data.model.KycMessage;
import com.assetgro.stockgro.prod.R;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m4.m;
import vt.y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lad/i;", "Lao/g;", "<init>", "()V", "bl/j", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class i extends ao.g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f371c = 0;

    /* renamed from: b, reason: collision with root package name */
    public v6 f372b;

    @Override // androidx.fragment.app.t, androidx.fragment.app.g0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.AppBottomSheetDialogTheme);
    }

    @Override // androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        int i10 = v6.f6391u;
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        v6 v6Var = (v6) m.g(inflater, R.layout.bottom_sheet_winner_declared, viewGroup, false, null);
        Intrinsics.checkNotNullExpressionValue(v6Var, "inflate(...)");
        Intrinsics.checkNotNullParameter(v6Var, "<set-?>");
        this.f372b = v6Var;
        String string = getString(R.string.winner_declared_message_one);
        Boolean bool = Boolean.TRUE;
        ArrayList<KycMessage> c10 = y.c(new KycMessage(string, bool), new KycMessage(getString(R.string.winner_declared_message_two), bool));
        r().f6393t.setVisibility(0);
        r().f6393t.removeAllViews();
        for (KycMessage kycMessage : c10) {
            LayoutInflater layoutInflater = getLayoutInflater();
            v6 r10 = r();
            int i11 = j9.f5120u;
            DataBinderMapperImpl dataBinderMapperImpl2 = m4.d.f27474a;
            j9 j9Var = (j9) m.g(layoutInflater, R.layout.cell_kyc_message, r10.f6393t, false, null);
            Intrinsics.checkNotNullExpressionValue(j9Var, "inflate(...)");
            if (Intrinsics.a(kycMessage.isSuccess(), Boolean.TRUE)) {
                j9Var.f5122t.setImageResource(R.drawable.ic_kyc_message_success);
            } else {
                j9Var.f5122t.setImageResource(R.drawable.ic_kyc_message_failure);
            }
            j9Var.f5121s.setText(kycMessage.getMessage());
            r().f6393t.addView(j9Var.f27491e);
        }
        v6 r11 = r();
        r11.f6392s.setOnClickListener(new d7.j(this, 28));
        View view = r().f27491e;
        Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
        return view;
    }

    public final v6 r() {
        v6 v6Var = this.f372b;
        if (v6Var != null) {
            return v6Var;
        }
        Intrinsics.k("binding");
        throw null;
    }
}
