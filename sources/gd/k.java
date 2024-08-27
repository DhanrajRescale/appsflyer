package gd;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.t;
import com.assetgro.stockgro.StockGroApplication;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.base.BaseDialogViewModel;
import ea.g0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgd/k;", "Lcom/assetgro/stockgro/ui/base/BaseDialogViewModel;", "VM", "Landroidx/fragment/app/t;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class k<VM extends BaseDialogViewModel> extends t {

    /* renamed from: a, reason: collision with root package name */
    public BaseDialogViewModel f17279a;

    /* renamed from: b, reason: collision with root package name */
    public View f17280b;

    @Override // androidx.fragment.app.t, androidx.fragment.app.g0
    public final void onCreate(Bundle bundle) {
        da.d dVar = new da.d((com.google.android.gms.internal.p002firebaseauthapi.a) null);
        Context applicationContext = requireContext().getApplicationContext();
        Intrinsics.d(applicationContext, "null cannot be cast to non-null type com.assetgro.stockgro.StockGroApplication");
        dVar.f14277c = ((StockGroApplication) applicationContext).a();
        dVar.f14276b = new g0(this);
        yk.g.g(da.b.class, (da.b) dVar.f14277c);
        da.a aVar = new da.a((g0) dVar.f14276b, (da.b) dVar.f14277c);
        Intrinsics.checkNotNullExpressionValue(aVar, "buildBottomSheetDialogFragmentComponent(...)");
        q(aVar);
        super.onCreate(bundle);
        BaseDialogViewModel baseDialogViewModel = this.f17279a;
        if (baseDialogViewModel != null) {
            baseDialogViewModel.f9073d.observe(this, new eb.c(26, new j(this, 0)));
            BaseDialogViewModel baseDialogViewModel2 = this.f17279a;
            if (baseDialogViewModel2 != null) {
                baseDialogViewModel2.f9072c.observe(this, new eb.c(26, new j(this, 1)));
                if (this.f17279a != null) {
                    return;
                }
                Intrinsics.k("viewModel");
                throw null;
            }
            Intrinsics.k("viewModel");
            throw null;
        }
        Intrinsics.k("viewModel");
        throw null;
    }

    @Override // androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(r(), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        Intrinsics.checkNotNullParameter(inflate, "<set-?>");
        this.f17280b = inflate;
        if (inflate != null) {
            return inflate;
        }
        Intrinsics.k("dialogView");
        throw null;
    }

    @Override // androidx.fragment.app.g0
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        s(view);
    }

    public abstract void q(da.a aVar);

    public abstract int r();

    public abstract void s(View view);

    public final Unit t(String text) {
        Intrinsics.checkNotNullParameter(text, "message");
        Context context = getContext();
        if (context == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        if (text.length() != 0) {
            Toast makeText = Toast.makeText(context, HttpUrl.FRAGMENT_ENCODE_SET, 1);
            Object systemService = context.getSystemService("layout_inflater");
            Intrinsics.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            View inflate = ((LayoutInflater) systemService).inflate(R.layout.background_custom_toast_message, (ViewGroup) null);
            w.k.c(text, (TextView) inflate.findViewById(R.id.message), makeText, inflate);
        }
        return Unit.f23355a;
    }
}
