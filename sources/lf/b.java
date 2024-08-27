package lf;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.databinding.DataBinderMapperImpl;
import ba.kg;
import com.assetgro.stockgro.prod.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llf/b;", "Landroidx/fragment/app/t;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b extends androidx.fragment.app.t {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f24642b = 0;

    /* renamed from: a, reason: collision with root package name */
    public kg f24643a;

    @Override // androidx.fragment.app.t
    public final int getTheme() {
        return R.style.DarkTransparentBgDialog;
    }

    @Override // androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        int i10 = kg.f5241t;
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        kg kgVar = (kg) m4.m.g(inflater, R.layout.fragment_center_popup_dialog, viewGroup, false, null);
        Intrinsics.checkNotNullExpressionValue(kgVar, "inflate(...)");
        this.f24643a = kgVar;
        if (kgVar != null) {
            View view = kgVar.f27491e;
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
        kg kgVar = this.f24643a;
        if (kgVar != null) {
            a aVar = new a(this, 1);
            Object obj = b1.d.f3079a;
            kgVar.f5242s.setContent(new b1.c(aVar, true, 2004297910));
            return;
        }
        Intrinsics.k("binding");
        throw null;
    }
}
