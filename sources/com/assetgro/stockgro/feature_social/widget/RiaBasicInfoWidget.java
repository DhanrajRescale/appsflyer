package com.assetgro.stockgro.feature_social.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import ba.hy;
import com.assetgro.stockgro.prod.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m4.d;
import m4.m;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/feature_social/widget/RiaBasicInfoWidget;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RiaBasicInfoWidget extends ConstraintLayout {

    /* renamed from: s, reason: collision with root package name */
    public final Context f8850s;

    /* renamed from: t, reason: collision with root package name */
    public final hy f8851t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RiaBasicInfoWidget(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater from = LayoutInflater.from(context);
        int i10 = hy.f4986t;
        DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
        hy hyVar = (hy) m.g(from, R.layout.widget_ria_basic_info, this, true, null);
        Intrinsics.checkNotNullExpressionValue(hyVar, "inflate(...)");
        this.f8851t = hyVar;
        this.f8850s = context;
    }
}
