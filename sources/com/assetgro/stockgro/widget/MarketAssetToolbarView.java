package com.assetgro.stockgro.widget;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import ba.gs;
import ba.kv;
import com.assetgro.stockgro.data.model.ChangeDto;
import com.assetgro.stockgro.prod.R;
import com.bumptech.glide.b;
import com.bumptech.glide.g;
import ij.h;
import kj.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.s;
import m4.d;
import m4.m;
import org.jetbrains.annotations.NotNull;
import r3.k;
import zq.f;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/assetgro/stockgro/widget/MarketAssetToolbarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MarketAssetToolbarView extends ConstraintLayout {

    /* renamed from: s, reason: collision with root package name */
    public final gs f10646s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketAssetToolbarView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater from = LayoutInflater.from(context);
        int i10 = gs.f4858y;
        DataBinderMapperImpl dataBinderMapperImpl = d.f27474a;
        gs gsVar = (gs) m.g(from, R.layout.layout_market_asset_toolbar_view, this, true, null);
        Intrinsics.checkNotNullExpressionValue(gsVar, "inflate(...)");
        this.f10646s = gsVar;
    }

    public final void m(double d10, String name, String iconUrl) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(iconUrl, "iconUrl");
        SpannableString spannableString = new SpannableString(name);
        spannableString.setSpan(new StyleSpan(1), 0, name.length(), -16777216);
        String m10 = h.m(h.f20067a, d10);
        SpannableString spannableString2 = new SpannableString(m10);
        spannableString2.setSpan(new StyleSpan(1), 0, m10.length(), -16777216);
        gs gsVar = this.f10646s;
        gsVar.f4862v.setText(spannableString);
        gsVar.f4863w.setText(spannableString2);
        ((g) ((g) b.e(getContext()).m(iconUrl).b()).l(R.drawable.ic_placeholder_stock)).z(gsVar.f4861u);
        boolean z10 = a.f23207b;
        TextView textView = gsVar.f4859s;
        if (z10) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    public final void n(ChangeDto changeDto) {
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(changeDto, "changeDto");
        StockChangeInfoBoldView stockChangeInfoBoldView = this.f10646s.f4860t;
        kv kvVar = stockChangeInfoBoldView.f10738a;
        if (changeDto != null) {
            kvVar.f5298t.setText(h.m(h.f20067a, changeDto.getValue()));
            kvVar.f5297s.setText(h.t(String.valueOf(changeDto.getPercentage())));
            if (changeDto.getValue() == 0.0d && changeDto.getPercentage() == 0.0d) {
                View view = kvVar.f27491e;
                Intrinsics.checkNotNullExpressionValue(view, "getRoot(...)");
                f.M(view);
            }
            if (changeDto.getPercentage() == 0.0d) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            ImageView imageView = kvVar.f5299u;
            imageView.setVisibility(i10);
            String type = changeDto.getType();
            if (!TextUtils.isEmpty(type) && s.j(type, "POSITIVE", false)) {
                i11 = R.drawable.ic_stock_up_arrow;
            } else {
                i11 = R.drawable.ic_stock_down_arrow;
            }
            imageView.setImageDrawable(k.getDrawable(stockChangeInfoBoldView.getContext(), i11));
            return;
        }
        View separator = kvVar.f5300v;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        f.M(separator);
        TextView changePrice = kvVar.f5298t;
        Intrinsics.checkNotNullExpressionValue(changePrice, "changePrice");
        f.M(changePrice);
        TextView changePercentage = kvVar.f5297s;
        Intrinsics.checkNotNullExpressionValue(changePercentage, "changePercentage");
        f.M(changePercentage);
    }
}
