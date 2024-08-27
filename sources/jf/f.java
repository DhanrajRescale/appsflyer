package jf;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.g0;
import ba.ao;
import com.assetgro.stockgro.prod.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m4.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljf/f;", "Landroidx/fragment/app/g0;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class f extends g0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f21349b = 0;

    /* renamed from: a, reason: collision with root package name */
    public ao f21350a;

    @Override // androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        int i10 = ao.f4213t;
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        ao aoVar = (ao) m.g(inflater, R.layout.fragment_stock_gyan, viewGroup, false, null);
        this.f21350a = aoVar;
        Intrinsics.c(aoVar);
        View view = aoVar.f27491e;
        Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.g0
    public final void onDestroyView() {
        super.onDestroyView();
        this.f21350a = null;
    }

    @Override // androidx.fragment.app.g0
    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("DATA")) != null) {
            ao aoVar = this.f21350a;
            Intrinsics.c(aoVar);
            com.bumptech.glide.g m10 = com.bumptech.glide.b.f(aoVar.f4214s).m(string);
            ao aoVar2 = this.f21350a;
            Intrinsics.c(aoVar2);
            m10.z(aoVar2.f4214s);
        }
    }
}
