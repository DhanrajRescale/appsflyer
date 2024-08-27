package aj;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import ao.g;
import ba.a6;
import ba.z5;
import com.assetgro.stockgro.prod.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m4.d;
import m4.m;
import zi.k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Laj/c;", "Lao/g;", "<init>", "()V", "ni/g", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class c extends g {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f442c = 0;

    /* renamed from: b, reason: collision with root package name */
    public z5 f443b;

    @Override // androidx.fragment.app.t, androidx.fragment.app.g0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.AppBottomSheetDialogTheme);
    }

    @Override // androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        int i10 = z5.f6805w;
        DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
        z5 z5Var = (z5) m.g(inflater, R.layout.bottom_sheet_market_section_narration, viewGroup, false, null);
        Intrinsics.checkNotNullExpressionValue(z5Var, "inflate(...)");
        Intrinsics.checkNotNullParameter(z5Var, "<set-?>");
        this.f443b = z5Var;
        if (z5Var != null) {
            View view = z5Var.f27491e;
            Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
            return view;
        }
        Intrinsics.k("binding");
        throw null;
    }

    @Override // androidx.fragment.app.g0
    public final void onViewCreated(View view, Bundle bundle) {
        k kVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            kVar = (k) arguments.getParcelable("DATA");
        } else {
            kVar = null;
        }
        if (!(kVar instanceof k)) {
            kVar = null;
        }
        if (kVar != null) {
            z5 z5Var = this.f443b;
            if (z5Var != null) {
                a6 a6Var = (a6) z5Var;
                a6Var.f6809v = kVar;
                synchronized (a6Var) {
                    a6Var.f4168x |= 1;
                }
                a6Var.a(6);
                a6Var.m();
            } else {
                Intrinsics.k("binding");
                throw null;
            }
        }
        z5 z5Var2 = this.f443b;
        if (z5Var2 != null) {
            z5Var2.f6806s.setOnClickListener(new ph.a(this, 12));
        } else {
            Intrinsics.k("binding");
            throw null;
        }
    }
}
