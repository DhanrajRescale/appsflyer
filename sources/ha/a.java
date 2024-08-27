package ha;

import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.databinding.DataBinderMapperImpl;
import ba.yg;
import com.assetgro.stockgro.prod.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lha/a;", "Landroidx/fragment/app/t;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class a extends androidx.fragment.app.t {

    /* renamed from: a, reason: collision with root package name */
    public yg f18064a;

    @Override // androidx.fragment.app.t, androidx.fragment.app.g0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.CustomDialogStyle);
    }

    @Override // androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        int i10 = yg.f6728t;
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        yg ygVar = (yg) m4.m.g(inflater, R.layout.fragment_dialog_breakeven_chart, viewGroup, false, null);
        Intrinsics.checkNotNullExpressionValue(ygVar, "inflate(...)");
        this.f18064a = ygVar;
        if (ygVar != null) {
            View view = ygVar.f27491e;
            Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
            return view;
        }
        Intrinsics.k("binding");
        throw null;
    }

    @Override // androidx.fragment.app.t, androidx.fragment.app.g0
    public final void onStart() {
        Window window;
        super.onStart();
        int i10 = kj.f.f23221a;
        Intrinsics.checkNotNullParameter(this, "<this>");
        float f10 = 100;
        float f11 = f10 / f10;
        float f12 = 60 / f10;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        Rect rect = new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        float width = rect.width() * f11;
        float height = rect.height() * f12;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout((int) width, (int) height);
        }
    }

    @Override // androidx.fragment.app.g0
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        yg ygVar = this.f18064a;
        if (ygVar != null) {
            ygVar.f6729s.setContent(d.f18076a);
        } else {
            Intrinsics.k("binding");
            throw null;
        }
    }
}
