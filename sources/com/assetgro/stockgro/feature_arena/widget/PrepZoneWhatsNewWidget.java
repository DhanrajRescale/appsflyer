package com.assetgro.stockgro.feature_arena.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import ba.pu;
import com.assetgro.stockgro.prod.R;
import d7.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m4.d;
import m4.m;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/feature_arena/widget/PrepZoneWhatsNewWidget;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class PrepZoneWhatsNewWidget extends ConstraintLayout {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f8576u = 0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8577s;

    /* renamed from: t, reason: collision with root package name */
    public final pu f8578t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrepZoneWhatsNewWidget(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f8577s = true;
        LayoutInflater from = LayoutInflater.from(context);
        int i10 = pu.f5806v;
        DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
        pu puVar = (pu) m.g(from, R.layout.layout_prepzone_whats_new, this, true, null);
        Intrinsics.checkNotNullExpressionValue(puVar, "inflate(...)");
        this.f8578t = puVar;
        puVar.f5808t.setOnClickListener(new j(this, 3));
        puVar.f5807s.setVisibility(8);
    }
}
