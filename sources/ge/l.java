package ge;

import android.content.Intent;
import android.view.View;
import com.assetgro.stockgro.ui.chat.helper.search.SearchContactViewModel;
import com.assetgro.stockgro.ui.drawer.about.AppPrivacyPolicyActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17321a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f17322b;

    public /* synthetic */ l(o oVar, int i10) {
        this.f17321a = i10;
        this.f17322b = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f17321a;
        o this$0 = this.f17322b;
        switch (i10) {
            case 0:
                int i11 = o.f17326l;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.c(view);
                this$0.u(view);
                this$0.requireActivity().onBackPressed();
                return;
            case 1:
                int i12 = o.f17326l;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f17331k.a("android.permission.READ_CONTACTS");
                return;
            case 2:
                int i13 = o.f17326l;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.startActivity(new Intent(this$0.requireActivity(), (Class<?>) AppPrivacyPolicyActivity.class));
                return;
            default:
                int i14 = o.f17326l;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                SearchContactViewModel searchContactViewModel = (SearchContactViewModel) this$0.r();
                searchContactViewModel.f9354q = true;
                searchContactViewModel.f9360w.postValue(Boolean.TRUE);
                return;
        }
    }
}
