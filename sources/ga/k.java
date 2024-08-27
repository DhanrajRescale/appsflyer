package ga;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import ba.xx;
import com.assetgro.stockgro.prod.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m4.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lga/k;", "Lao/g;", "<init>", "()V", "mt/p", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class k extends ao.g {

    /* renamed from: b, reason: collision with root package name */
    public xx f17195b;

    @Override // androidx.fragment.app.t, androidx.fragment.app.g0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.AppBottomSheetDialogTheme);
    }

    @Override // androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        int i10 = xx.f6699t;
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        xx xxVar = (xx) m.g(inflater, R.layout.understaring_option_bottom_sheet, viewGroup, false, null);
        Intrinsics.checkNotNullExpressionValue(xxVar, "inflate(...)");
        Intrinsics.checkNotNullParameter(xxVar, "<set-?>");
        this.f17195b = xxVar;
        if (xxVar != null) {
            View view = xxVar.f27491e;
            Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
            return view;
        }
        Intrinsics.k("binding");
        throw null;
    }

    @Override // androidx.fragment.app.g0
    public final void onViewCreated(View view, Bundle bundle) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            bool = Boolean.valueOf(arguments.getBoolean("is_put_call_boolean", false));
        } else {
            bool = null;
        }
        xx xxVar = this.f17195b;
        if (xxVar != null) {
            i iVar = new i(bool, 0);
            Object obj = b1.d.f3079a;
            xxVar.f6700s.setContent(new b1.c(iVar, true, -936844639));
            view.getViewTreeObserver().addOnGlobalLayoutListener(new j(view, 0));
            return;
        }
        Intrinsics.k("binding");
        throw null;
    }
}
