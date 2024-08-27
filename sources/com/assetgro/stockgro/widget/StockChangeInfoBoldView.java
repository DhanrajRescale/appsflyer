package com.assetgro.stockgro.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.databinding.DataBinderMapperImpl;
import ba.kv;
import com.assetgro.stockgro.prod.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m4.d;
import m4.m;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/widget/StockChangeInfoBoldView;", "Landroid/widget/LinearLayout;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class StockChangeInfoBoldView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final kv f10738a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StockChangeInfoBoldView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater from = LayoutInflater.from(context);
        int i10 = kv.f5296w;
        DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
        kv kvVar = (kv) m.g(from, R.layout.layout_stock_change_info_bold, this, true, null);
        Intrinsics.checkNotNullExpressionValue(kvVar, "inflate(...)");
        this.f10738a = kvVar;
    }
}
