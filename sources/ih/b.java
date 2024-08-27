package ih;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.h1;
import ba.wg;
import com.assetgro.stockgro.data.repository.UserRepository;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.profile.self.DeleteAccountViewModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.webengage.sdk.android.Analytics;
import ea.f0;
import iu.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ls.n0;
import okhttp3.HttpUrl;
import qu.i0;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Lih/b;", "Lgd/h;", "Lcom/assetgro/stockgro/ui/profile/self/DeleteAccountViewModel;", "Lba/wg;", "<init>", "()V", HttpUrl.FRAGMENT_ENCODE_SET, "showDialog", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b extends gd.h<DeleteAccountViewModel, wg> {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f19987i = 0;

    @Override // gd.h, androidx.fragment.app.g0
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnShowListener(new ha.s(5));
        }
    }

    @Override // gd.h
    public final void u(da.a bottomSheetDialogFragmentComponent) {
        Intrinsics.checkNotNullParameter(bottomSheetDialogFragmentComponent, "bottomSheetDialogFragmentComponent");
        f0 f0Var = (f0) bottomSheetDialogFragmentComponent.f14247b;
        kq.e schedulerProvider = bottomSheetDialogFragmentComponent.f14246a.k();
        ct.a compositeDisposable = bottomSheetDialogFragmentComponent.f14246a.c();
        UserRepository userRepository = bottomSheetDialogFragmentComponent.f14246a.m();
        yk.g.i(userRepository);
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        ca.c factory = new ca.c(a0.a(DeleteAccountViewModel.class), new ea.c(schedulerProvider, compositeDisposable, userRepository, 21));
        gd.h hVar = f0Var.f15153a;
        h1 d10 = com.google.android.gms.internal.p002firebaseauthapi.a.d(hVar, "owner", factory, "factory");
        y4.c defaultCreationExtras = com.google.android.gms.internal.p002firebaseauthapi.a.n(hVar, "owner", d10, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        h.c h10 = com.google.android.gms.internal.p002firebaseauthapi.a.h(d10, factory, defaultCreationExtras, DeleteAccountViewModel.class, "modelClass");
        iu.e b10 = a3.a.b(DeleteAccountViewModel.class, "<this>", DeleteAccountViewModel.class, "modelClass", "modelClass");
        String s7 = i0.s(b10);
        if (s7 != null) {
            DeleteAccountViewModel deleteAccountViewModel = (DeleteAccountViewModel) h10.G(b10, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(s7));
            yk.g.j(deleteAccountViewModel);
            this.f17270b = deleteAccountViewModel;
            FirebaseAnalytics d11 = bottomSheetDialogFragmentComponent.f14246a.d();
            yk.g.i(d11);
            this.f17273e = d11;
            Analytics o10 = bottomSheetDialogFragmentComponent.f14246a.o();
            yk.g.i(o10);
            this.f17274f = o10;
            n0 h11 = bottomSheetDialogFragmentComponent.f14246a.h();
            yk.g.i(h11);
            this.f17275g = h11;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    @Override // gd.h
    public final int x() {
        return R.layout.fragment_delete_account_bottom_sheet;
    }

    @Override // gd.h
    public final void y() {
        ((DeleteAccountViewModel) t()).f10026j.observe(this, new ch.c(7, new a(this, 0)));
        ((DeleteAccountViewModel) t()).f10027k.observe(this, new ch.c(7, new a(this, 1)));
        ((DeleteAccountViewModel) t()).f9070f.observe(this, new ch.c(7, new a(this, 2)));
    }

    @Override // gd.h
    public final void z(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        wg wgVar = (wg) r();
        be.b bVar = new be.b(this, 14);
        Object obj = b1.d.f3079a;
        wgVar.f6531s.setContent(new b1.c(bVar, true, -1923963523));
    }
}
