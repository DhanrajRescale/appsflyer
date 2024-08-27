package za;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.g0;
import ba.gi;
import com.assetgro.stockgro.data.model.IntroModel;
import com.assetgro.stockgro.prod.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m4.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lza/d;", "Landroidx/fragment/app/g0;", "<init>", "()V", "kq/e", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class d extends g0 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f42213b = 0;

    /* renamed from: a, reason: collision with root package name */
    public gi f42214a;

    @Override // androidx.fragment.app.g0
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        int i10 = gi.f4815v;
        DataBinderMapperImpl dataBinderMapperImpl = m4.d.f27474a;
        gi giVar = (gi) m.g(inflater, R.layout.fragment_intro_template, viewGroup, false, null);
        Intrinsics.checkNotNullExpressionValue(giVar, "inflate(...)");
        Intrinsics.checkNotNullParameter(giVar, "<set-?>");
        this.f42214a = giVar;
        if (giVar != null) {
            View view = giVar.f27491e;
            Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
            return view;
        }
        Intrinsics.k("binding");
        throw null;
    }

    @Override // androidx.fragment.app.g0
    public final void onViewCreated(View view, Bundle bundle) {
        IntroModel introModel;
        Parcelable parcelable;
        Object parcelable2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("INTRO_DATA", IntroModel.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = arguments.getParcelable("INTRO_DATA");
                if (!(parcelable3 instanceof IntroModel)) {
                    parcelable3 = null;
                }
                parcelable = (IntroModel) parcelable3;
            }
            introModel = (IntroModel) parcelable;
        } else {
            introModel = null;
        }
        if (introModel != null) {
            gi giVar = this.f42214a;
            if (giVar != null) {
                giVar.f4816s.setImageResource(introModel.getImage());
            } else {
                Intrinsics.k("binding");
                throw null;
            }
        }
        if (introModel != null) {
            gi giVar2 = this.f42214a;
            if (giVar2 != null) {
                giVar2.f4818u.setText(introModel.getText());
            } else {
                Intrinsics.k("binding");
                throw null;
            }
        }
        if (introModel != null) {
            gi giVar3 = this.f42214a;
            if (giVar3 != null) {
                giVar3.f4817t.setText(introModel.getSubtext());
            } else {
                Intrinsics.k("binding");
                throw null;
            }
        }
    }
}
